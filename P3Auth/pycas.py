# WARNING!! THIS IS A CORRUPTED VERSION OF PYCAS!
# This is not the originial version of pycas.py --- it is a copy of 
# there work modified to be used by PPBottleApp.py (NOT CGI).


#!/usr/bin/python

#  Debug
## import os
## print "Content-type: text/html\n"
## import sys
## sys.stderr = sys.stdout

#  Copyright 2011 Jon Rifkin
# 
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
# 
#      http://www.apache.org/licenses/LICENSE-2.0
# 
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.




#-----------------------------------------------------------------------
#  Usage
#-----------------------------------------------------------------------
#
#  Purpose
#      Authenticate users against a CAS server from your python cgi scripts.
#
#  Using in your script
#
#      import pycas
#      status, id, cookie = pycas.login(CAS_SERVER,THIS_SCRIPT)
#
#  Required Parameters
#
#      - CAS_SERVER : the url of your CAS server 
#                     (for example, https://login.yoursite.edu).
#      - THIS_SCRIPT: the url of the calling python cgi script.
#
#  Returned Values
#
#      - status:  return code, 0 for success.
#      - id    :  the user name returned by cas.
#      - cookie:  when non-blank, send this cookie to the client's 
#                 browser so it can authenticate for the rest of the
#                 session.
#
#  Optional Parmaters:
#      - lifetime:  lifetime of the cookie in seconds, enforced by pycas. 
#                   Default is 0, meaning unlimited lifetime.
#      - path:      Authentication cookie applies for all urls under 'path'. 
#                   Defaults to "/" (all urls).
#      - protocol:  CAS protocol version.  Default is 2.  Can be set to 1.
#      - secure:    Default is 1, which authenticates for https connections only.
#      - opt:       set to 'renew' or 'gateway' for these CAS options.
#
#        Examples:
#          status, id, cookie = pycas.login(CAS_SERVER,THIS_SCRIPT,protocol=1,secure=0)
#          status, id, cookie = pycas.login(CAS_SERVER,THIS_SCRIPT,path="/cgi-bin/accts")
#
#   Status Codes are listed below.
#

#-----------------------------------------------------------------------
#  Constants
#-----------------------------------------------------------------------
#
#  Secret used to produce hash.   This can be any string.  Hackers
#  who know this string can forge this script's authentication cookie.
import requests
import os
import pprint
import logging
#from PricesPaidGUI.ppGuiConfig import CAS_GROUP_AGY_GSA_FAS_PRICESPAID_REQUIRED,CAS_GROUP, CAS_USER_CLASSIFICATION
CAS_GROUP_AGY_GSA_FAS_PRICESPAID_REQUIRED = 'T'
CAS_GROUP = 'AGY-GSA-FAS.PRICESPAID'
CAS_P3_GROUP = 'AGY-GSA-FAS.PRICESPAID.ADMIN'
#Sprint-4 changes
CAS_USER_CLASSIFICATION = 'FEDERAL'


#  Name field for pycas cookie
PYCAS_NAME = "pycas"

#  CAS Staus Codes:  returned to calling program by login() function.
CAS_OK               = 0  #  CAS authentication successful.
CAS_COOKIE_EXPIRED   = 1  #  PYCAS cookie exceeded its lifetime.
CAS_COOKIE_INVALID   = 2  #  PYCAS cookie is invalid (probably corrupted).
CAS_TICKET_INVALID   = 3  #  CAS server ticket invalid.
CAS_GATEWAY          = 4  #  CAS server returned without ticket while in gateway mode.


#  Status codes returned internally by function get_cookie_status().
COOKIE_AUTH    = 0        #  PYCAS cookie is valid.
COOKIE_NONE    = 1        #  No PYCAS cookie found.
COOKIE_GATEWAY = 2        #  PYCAS gateway cookie found.
COOKIE_INVALID = 3        #  Invalid PYCAS cookie found.

#  Status codes returned internally by function get_ticket_status().
TICKET_OK      = 0        #  Valid CAS server ticket found.
TICKET_NONE    = 1        #  No CAS server ticket found.
TICKET_INVALID = 2        #  Invalid CAS server ticket found.
TICKET_NOPIV   = 3        #  No CAS server ticket found.

CAS_MSG = (
"CAS authentication successful.",
"PYCAS cookie exceeded its lifetime.",
"PYCAS cookie is invalid (probably corrupted).",
"CAS server ticket invalid.",
"CAS server returned without ticket while in gateway mode.",
)

###Optional log file for debugging
#LOG_FILE="/tmp/cas.log"


#-----------------------------------------------------------------------
#  Imports
#-----------------------------------------------------------------------
import os
import cgi
#import md5
import hashlib
import time
import urllib
import urlparse


#-----------------------------------------------------------------------
#  Functions
#-----------------------------------------------------------------------

#  For debugging.
logger = logging.getLogger('CasLogger')
hdlr = logging.FileHandler('../logs/cas.log')
formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
hdlr.setFormatter(formatter)
logger.addHandler(hdlr)
logger.setLevel(logging.INFO)

failedlogger = logging.getLogger('FailedCasLogger')
hdlr = logging.FileHandler('../logs/failed-cas.log')
formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
hdlr.setFormatter(formatter)
failedlogger.addHandler(hdlr)
failedlogger.setLevel(logging.INFO)

#def writelog(msg):
#	f = open(LOG_FILE,"a")
#	timestr = time.strftime("%Y-%m-%d %H:%M:%S ");
#        try:
#	    f.write(timestr + msg + "\n");
#        except IOError:
#	    print 'Write failed-prem'
#	f.close()

#  Used for parsing xml.  Search str for first occurance of
#  <tag>.....</tag> and return text (striped of leading and
#  trailing whitespace) between tags.  Return "" if tag not
#  found.
def parse_tag(str,tag):
   tag1_pos1 = str.find("<" + tag)
   #  No tag found, return empty string.
   if tag1_pos1==-1: return ""
   tag1_pos2 = str.find(">",tag1_pos1)
   if tag1_pos2==-1: return ""
   tag2_pos1 = str.find("</" + tag,tag1_pos2)
   if tag2_pos1==-1: return ""
   return str[tag1_pos2+1:tag2_pos1].strip()


#  Split string in exactly two pieces, return '' for missing pieces.
def split2(str,sep):
	parts = str.split(sep,1) + ["",""]
	return parts[0], parts[1]

#  Use hash and secret to encrypt string.
def makehash(str,secret):
	#m = md5.new()
        m = hashlib.sha1()
	m.update(str)
	m.update(secret)
	return m.hexdigest()[0:8]
	
	
#  Form cookie
def make_pycas_cookie(val, domain, path, secure, expires=None):
	cookie = "Set-Cookie: %s=%s;domain=%s;path=%s" % (PYCAS_NAME, val, domain, path)
	if secure:
		cookie += ";secure"
	if expires:
		cookie += ";expires=" + expires
	return cookie

#  Send redirect to client.  This function does not return, i.e. it teminates this script.
def do_redirect(cas_host, service_url, opt, secure):
	cas_url  = cas_host + "/cas/login?service=" + service_url
	if opt in ("renew","gateway"):
		cas_url += "&%s=true" % opt
	#  Print redirect page to browser
	print "Refresh: 0; url=%s" % cas_url
	print "Content-type: text/html"
	if opt=="gateway":
		domain,path = urlparse.urlparse(service_url)[1:3]
		print make_pycas_cookie("gateway", domain, path, secure)
	print """
If your browser does not redirect you, then please follow <a href="%s">this link</a>.
""" % (cas_url)
	raise SystemExit

#  Send redirect to client.  This function does not return, i.e. it teminates this script.
def get_url_redirect_as_string(cas_host, service_url, opt, secure):
	cas_url  = cas_host + "/cas/login?service=" + service_url
	if opt in ("renew","gateway"):
		cas_url += "&%s=true" % opt
	#  Print redirect page to browser

        return cas_url

def get_cookie_as_string(cas_host, service_url, opt, secure):
	if opt=="gateway":
		domain,path = urlparse.urlparse(service_url)[1:3]
		return make_pycas_cookie("gateway", domain, path, secure)
# I'm not sure what the Else should be---it would have been clearer if
# this were functional rather than imperative.

	



#  Retrieve id from pycas cookie and test data for validity 
# (to prevent mailicious users from falsely authenticating).
#  Return status and id (id will be empty string if unknown).
def decode_cookie(cookie_vals,cas_secret,lifetime=None):

	#  Test for now cookies
	if cookie_vals==None:
		return COOKIE_NONE, ""

	#  Test each cookie value
	cookie_attrs = []
	for cookie_val in cookie_vals:
		#  Remove trailing ;
		if cookie_val and cookie_val[-1]==";":
			cookie_val = cookie_val[0:-1]

		#  Test for pycas gateway cookie
		if cookie_val=="gateway":
			cookie_attrs.append(COOKIE_GATEWAY)

		#  Test for valid pycas authentication cookie.
		else:
			# Separate cookie parts
			oldhash     = cookie_val[0:8]
			timestr, id = split2(cookie_val[8:],":")
			#  Verify hash
			newhash=makehash(timestr + ":" + id,cas_secret)
			if oldhash==makehash(timestr + ":" + id,cas_secret):
				#  Check lifetime
				if lifetime:
					if str(int(time.time()+int(lifetime)))<timestr:
						#  OK:  Cookie still valid.
						cookie_attrs.append(COOKIE_AUTH)
					else:
						# ERROR:  Cookie exceeded lifetime
						cookie_attrs.append(COOKIE_EXPIRED)
				else:
					#  OK:  Cookie valid (it has no lifetime)
					cookie_attrs.append(COOKIE_AUTH)
					
			else:
				#  ERROR:  Cookie value are not consistent
				cookie_attrs.append(COOKIE_INVALID)

	#  Return status according to attribute values

	#  Valid authentication cookie takes precedence
	if COOKIE_AUTH in cookie_attrs:
		return COOKIE_AUTH, id
	#  Gateway cookie takes next precedence
	if COOKIE_GATEWAY in cookie_attrs:
		return COOKIE_GATEWAY, ""
	#  If we've gotten here, there should be only one attribute left.
	return cookie_attrs[0], ""


#  Validate ticket using cas 1.0 protocol
def validate_cas_1(cas_host, service_url, ticket):
	#  Second Call to CAS server: Ticket found, verify it.
	cas_validate = cas_host + "/cas/validate?ticket=" + ticket + "&service=" + service_url
	f_validate   = urllib.urlopen(cas_validate)
	#  Get first line - should be yes or no
	response = f_validate.readline()
	#  Ticket does not validate, return error
	if response=="no\n":
		f_validate.close()
		return TICKET_INVALID, ""
	#  Ticket validates
	else:
		#  Get id
		id = f_validate.readline()
		f_validate.close()
		id = id.strip()
		return TICKET_OK, id



#  Validate ticket using cas 2.0 protocol
#    The 2.0 protocol allows the use of the mutually exclusive "renew" and "gateway" options.
def validate_cas_2(cas_host, service_url, ticket, opt):
	#  Second Call to CAS server: Ticket found, verify it.
	cas_validate = cas_host + "/cas/serviceValidate?ticket=" + ticket + "&service=" + service_url
	if opt:
		cas_validate += "&%s=true" % opt
	f_validate   = urllib.urlopen(cas_validate)
	#  Get first line - should be yes or no
	response = f_validate.read()
	id = parse_tag(response,"cas:user")
	#  Ticket does not validate, return error
	if id=="":
		return TICKET_INVALID, ""
	#  Ticket validates
	else:
		return TICKET_OK, id


#  Validate ticket using cas 2.0 protocol
#    The 2.0 protocol allows the use of the mutually exclusive "renew" and "gateway" options.
def validate_cas_2x_urllib(cas_host, cas_proxy, service_url, ticket, opt):

	#  Second Call to CAS server: Ticket found, verify it.
	cas_validate = cas_host + "/cas/serviceValidate?ticket=" + ticket + "&service=" + service_url
	if opt:
		cas_validate += "&%s=true" % opt
        logger.info("cas_validate = "+cas_validate)
	f_validate   = urllib.urlopen(cas_validate)
	#  Get first line - should be yes or no
	response = f_validate.read()
        logger.info("response = "+response)
	id = parse_tag(response,"cas:user")
	#  Ticket does not validate, return error
	if id=="":
		return TICKET_INVALID, "", "", ""
	#  Ticket validates
	else:
                logger.info("validate response = "+response)
                pivcard = parse_tag(response,"maxAttribute:samlAuthenticationStatementAuthMethod")
                agencyThatRequired = parse_tag(response,"maxAttribute:EAuth-LOA")
                logger.info("pivcard = "+pivcard)
                logger.info("agencyThatRequired = "+agencyThatRequired)
		return TICKET_OK, id, pivcard, agencyThatRequired

def validate_cas_2x(cas_host, cas_proxy, service_url, ticket, opt):

        check_group = CAS_GROUP_AGY_GSA_FAS_PRICESPAID_REQUIRED
        cas_group = CAS_GROUP
        cas_user_classification = CAS_USER_CLASSIFICATION
	#  Second Call to CAS server: Ticket found, verify it.
	cas_validate = cas_host + "/cas/serviceValidate?ticket=" + ticket + "&service=" + service_url
	if opt:
		cas_validate += "&%s=true" % opt
        logger.info("cas_validate = "+cas_validate)
#   f_validate   = urllib.urlopen(cas_validate)
	#  Get first line - should be yes or no
#	response = f_validate.read()
        #writelog("response = "+response)
 	r = requests.get(cas_validate,proxies=cas_proxy,verify=False)
 	response = r.text
        #logger.info("response = "+response)
	id = parse_tag(response,"cas:user")
	#  Ticket does not validate, return error
        logger.info('CAS USER = ' + parse_tag(response,"cas:user"))
        logger.info('SAML AUTH = ' + parse_tag(response,"maxAttribute:samlAuthenticationStatementAuthMethod"))
        logger.info('USER CLASS = ' + parse_tag(response,"maxAttribute:User-Classification"))
        logger.info('GROUPS = ' + parse_tag(response,"maxAttribute:MAXAuthenticationGroups"))
        logger.info('ORG-AGENCY-NAME = ' + parse_tag(response,"maxAttribute:Org-Agency-Name"))
        logger.info('PHONE = ' + parse_tag(response,"maxAttribute:Phone"))
        logger.info('ORG-BUREAU-CODE = ' + parse_tag(response,"maxAttribute:Org-Bureau-Code"))
        logger.info('USER-STATUS = ' + parse_tag(response,"maxAttribute:User-Status"))
        logger.info('ORG-BUREAU-NAME = ' + parse_tag(response,"maxAttribute:Org-Bureau-Name"))
        logger.info('MIDDLE-NAME = ' + parse_tag(response,"maxAttribute:Middle-Name"))
        logger.info('EAUTHLOA = ' + parse_tag(response,"maxAttribute:EAuthLOA"))
        logger.info('ORG-TAG = ' + parse_tag(response,"maxAttribute:Org-Tag"))
        logger.info('MAX-ID = ' + parse_tag(response,"maxAttribute:MAX-ID"))
        logger.info('ORG-AGENCY-CODE = ' + parse_tag(response,"maxAttribute:Org-Agency-Code"))
        logger.info('GROUP-LIST = ' + parse_tag(response,"maxAttribute:GroupList"))
        logger.info('EMAIL = ' + parse_tag(response,"maxAttribute:Email-Address"))
        logger.info('LAST-NAME = ' + parse_tag(response,"maxAttribute:Last-Name"))
        logger.info('FIRST-NAME = ' + parse_tag(response,"maxAttribute:First-Name"))
        
	if id=="":
		logger.info('prem')
		return TICKET_INVALID, "", "", ""
        elif check_group=="T":
		logger.info('prem-1')
                logger.info("CAS_GROUP_AGY_GSA_FAS_PRICESPAID_REQUIRED="+check_group) 
		group = parse_tag(response,"maxAttribute:GroupList")
		user_classification = parse_tag(response,"maxAttribute:User-Classification")
                logger.info("GroupList from CAS Response:" +group)
		logger.info("Userclassification from CAS Response = "+user_classification)
                if cas_group in group or cas_user_classification in user_classification or CAS_P3_GROUP in group:
                	logger.info("User="+id +" is in group"  +cas_group)
                	pivcard = parse_tag(response,"maxAttribute:samlAuthenticationStatementAuthMethod")
                	agencyThatRequired = parse_tag(response,"maxAttribute:EAuth-LOA")
                 	logger.info("pivcard = "+pivcard)
                	logger.info("agencyThatRequired = "+agencyThatRequired)
                	return TICKET_OK, id, pivcard, agencyThatRequired
                else:
			failedlogger.info('**** USER TRYING TO LOGIN ****')
			failedlogger.info('CAS USER = ' + parse_tag(response,"cas:user"))
			failedlogger.info('SAML AUTH = ' + parse_tag(response,"maxAttribute:samlAuthenticationStatementAuthMethod"))
			failedlogger.info('USER CLASS = ' + parse_tag(response,"maxAttribute:User-Classification"))
			failedlogger.info('GROUPS = ' + parse_tag(response,"maxAttribute:MAXAuthenticationGroups"))
			failedlogger.info('ORG-AGENCY-NAME = ' + parse_tag(response,"maxAttribute:Org-Agency-Name"))
			failedlogger.info('PHONE = ' + parse_tag(response,"maxAttribute:Phone"))
			failedlogger.info('ORG-BUREAU-CODE = ' + parse_tag(response,"maxAttribute:Org-Bureau-Code"))
			failedlogger.info('USER-STATUS = ' + parse_tag(response,"maxAttribute:User-Status"))
			failedlogger.info('ORG-BUREAU-NAME = ' + parse_tag(response,"maxAttribute:Org-Bureau-Name"))
			failedlogger.info('MIDDLE-NAME = ' + parse_tag(response,"maxAttribute:Middle-Name"))
			failedlogger.info('EAUTHLOA = ' + parse_tag(response,"maxAttribute:EAuthLOA"))
			failedlogger.info('ORG-TAG = ' + parse_tag(response,"maxAttribute:Org-Tag"))
			failedlogger.info('MAX-ID = ' + parse_tag(response,"maxAttribute:MAX-ID"))
			failedlogger.info('ORG-AGENCY-CODE = ' + parse_tag(response,"maxAttribute:Org-Agency-Code"))
			failedlogger.info('GROUP-LIST = ' + parse_tag(response,"maxAttribute:GroupList"))
			failedlogger.info('EMAIL = ' + parse_tag(response,"maxAttribute:Email-Address"))
			failedlogger.info('LAST-NAME = ' + parse_tag(response,"maxAttribute:Last-Name"))
			failedlogger.info('FIRST-NAME = ' + parse_tag(response,"maxAttribute:First-Name"))
                        return TICKET_INVALID, "", "", ""
	#  Ticket validates
	else:
                logger.info("validate response 2x = "+response)
                pivcard = parse_tag(response,"maxAttribute:samlAuthenticationStatementAuthMethod")
                agencyThatRequired = parse_tag(response,"maxAttribute:EAuth-LOA")
                logger.info("pivcard = "+pivcard)
                logger.info("agencyThatRequired = "+agencyThatRequired)
		return TICKET_OK, id, pivcard, agencyThatRequired


#  Read cookies from env variable HTTP_COOKIE.
def get_cookies():
	#  Read all cookie pairs
	try:
		cookie_pairs = os.getenv("HTTP_COOKIE").split()
	except AttributeError:
		cookie_pairs = []
	cookies = {}
	for cookie_pair in cookie_pairs:
		key,val = split2(cookie_pair.strip(),"=")
		if cookies.has_key(key):
			cookies[key].append(val)
		else:
			cookies[key] = [val,]
	return cookies


#  Check pycas cookie
def get_cookie_status(cas_secret):
	cookies = get_cookies()
	return decode_cookie(cookies.get(PYCAS_NAME),cas_secret)


def get_ticket_status(cas_host,service_url,protocol,opt):
	if cgi.FieldStorage().has_key("ticket"):
		ticket = cgi.FieldStorage()["ticket"].value
                return get_ticket_status_from_ticket(ticket,cas_host,service_url,protocol,opt)
	else:
                logger.info("returning TICKET_NONE ")
		return TICKET_NONE, ""

def get_ticket_status_from_ticket(ticket,cas_host,service_url,protocol,opt):
        if protocol==1:
                ticket_status, id = validate_cas_1(cas_host, service_url, ticket, opt)
        else:
                ticket_status, id = validate_cas_2(cas_host, service_url, ticket, opt)

        logger.info("ticket status"+repr(ticket_status))
        #  Make cookie and return id
        if ticket_status==TICKET_OK:
                return TICKET_OK, id
        #  Return error status
        else:
                return ticket_status, ""

def get_ticket_status_from_ticket_piv_required(assurancelevel_p,ticket,cas_host,cas_proxy,service_url,protocol,opt):
        if protocol==1:
                ticket_status, id = validate_cas_1(cas_host, service_url, ticket, opt)
        else:
                ticket_status, id,piv,pivx = validate_cas_2x(cas_host, cas_proxy, service_url, ticket, opt)

        logger.info("ticket status"+repr(ticket_status))
        logger.info("piv status"+repr(piv))
        logger.info("pivx status"+repr(pivx))
        #  Make cookie and return id
        # MAX is actually returning a value here (in pivx), I think I need
        # to search for "assurancelevel3", because it is sending 
        # "assurance2" when there is no PIV card!
#        if ticket_status==TICKET_OK and (piv == "urn:max:fips-201-pivcard" or  (assurancelevel_p(pivx))):

        # This is supposed to be a simple boolean!  But...
        # it is returning a set containing a boolean!  I know not why.
        if ticket_status==TICKET_OK and (True in assurancelevel_p(pivx,piv)):
                return TICKET_OK, id
        #  Return error status
        else:
                if ticket_status==TICKET_OK:
                        return TICKET_NOPIV, ""
                else:
                        return TICKET_NONE, ""


#-----------------------------------------------------------------------
#  Exported functions
#-----------------------------------------------------------------------

# This function should be merged with the above function "login"
def check_authenticated_p(assurance_level_p,ticket,cas_host,cas_proxy,cas_secret,service_url, lifetime=None, secure=1, protocol=2, path="/", opt=""):

        logger.info("login begun")
	#  Check cookie for previous pycas state, with is either
	#     COOKIE_AUTH    - client already authenticated by pycas.
	#     COOKIE_GATEWAY - client returning from CAS_SERVER with gateway option set.
	#  Other cookie status are 
	#     COOKIE_NONE    - no cookie found.
	#     COOKIE_INVALID - invalid cookie found.
	cookie_status, id = get_cookie_status(cas_secret)

        logger.info("got cookie status")

	if cookie_status==COOKIE_AUTH:
                logger.info("CAS_OK")
		return CAS_OK, id, ""

	if cookie_status==COOKIE_INVALID:
		return CAS_COOKIE_INVALID, "", ""

	#  Check ticket ticket returned by CAS server, ticket status can be
	#     TICKET_OK      - a valid authentication ticket from CAS server
	#     TICKET_INVALID - an invalid authentication ticket.
	#     TICKET_NONE    - no ticket found.
	#  If ticket is ok, then user has authenticated, return id and 
	#  a pycas cookie for calling program to send to web browser.

        logger.info("getting cookie status")

	ticket_status, id = get_ticket_status_from_ticket_piv_required(assurance_level_p,ticket,cas_host,cas_proxy,service_url,protocol,opt)

	if ticket_status==TICKET_OK:
		timestr     = str(int(time.time()))
		hash        = makehash(timestr + ":" + id,cas_secret)
		cookie_val  = hash + timestr + ":" + id
		domain      = urlparse.urlparse(service_url)[1]
		return CAS_OK, id, make_pycas_cookie(cookie_val, domain, path, secure)

	elif ticket_status==TICKET_INVALID:
		return CAS_TICKET_INVALID, "", ""


	#  If unathenticated and in gateway mode, return gateway status and clear
	#  pycas cookie (which was set to gateway by do_redirect()).
	if opt=="gateway":
		if cookie_status==COOKIE_GATEWAY:
			domain,path = urlparse.urlparse(service_url)[1:3]
			#  Set cookie expiration in the past to clear the cookie.
			past_date = time.strftime("%a, %d-%b-%Y %H:%M:%S %Z",time.localtime(time.time()-48*60*60))
			return CAS_GATEWAY, "", make_pycas_cookie("",domain,path,secure,past_date)
        return CAS_TICKET_INVALID, "", ""


