import logging

logger = logging.getLogger('ActivityLogger')
hdlr = logging.FileHandler('../logs/Activity.log')
formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
hdlr.setFormatter(formatter)
logger.addHandler(hdlr) 
logger.setLevel(logging.INFO)

# would I'm not loggin the password attempt as it might be 
# close to a real password, allowing someone to guess it 
def logBadCredentials(username, ipaddress):
    logger.info("Bad AuthenticationAttempt :  " +username+ ":" + ipaddress)

def logTooManyLoginAttempts(username, ipaddress):
    logger.info("TooManyLoginAttempts : " +username + ":" +  ipaddress)

def logMissingSession(session_id, ipaddress):
    logger.info("Session id missing : " +session_id+ ":" + ipaddress)

def logTimeout(session_id,ipaddress):
    logger.info("Session id timed out : " +session_id+ ":" + ipaddress)

def logFeedback(session_id,ipaddress):
    logger.info("Feedback submitted : " +session_id+ ":" + ipaddress)

def logSessionBegin(username,session_id,ipaddress):
    logger.info("SessionBegins : "+username+" : "+session_id + ":" + ipaddress)

def logPageTurn(session_id,page,ipaddress):
    logger.info("PageTurn : "+session_id+" : "+page + ":" + ipaddress)

def logSearchBegun(session_id,psc_pattern,search_string, ipaddress):
    logger.info("SearchBegun : "+session_id+" : "+str(psc_pattern)+" : "+str(search_string) + ":" + ipaddress)

def logSearchDone(session_id,psc_pattern,search_string, ipaddress):
    logger.info("SearchDone  : "+session_id+" : "+str(psc_pattern)+" : "+str(search_string) + ":" + ipaddress)

def logDebugInfo(info):
    logger.info("Debug Info : "+info)
