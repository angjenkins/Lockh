BottlePortNumber = 8080
BottleHostname = 'localhost'

#URLToPPSearchApiSolr = "https://10.172.0.10/apisolr"
#URLToSolr = 'http://localhost:8983/solr'

RelativePathToHashesFile = "../configuration/p3api.hashes.txt"

TokenTimeout = 1200

LIMIT_NUMBER_BAD_LOGINS = 5

CAS_SERVER = 'https://login.max.gov'

#CAS_RETURN_SERVICE_URL = 'https://p3-dev.fas.gsa.gov/gui/ReturnLoginViaMax'

#CAS_CREATE_SESSION_IF_AUTHENTICATED = 'https://p3-dev.fas.gsa.gov/apisolr/ReturnSessionViaMax'

CAS_PROXY =  {
#   "https": "ftp-proxy.fss.gsa.gov:3128",
}

CAS_LEVEL_OF_ASSURANCE = "assurancelevel3"

CAS_LEVEL_OF_ASSURANCE_PREDICATE_LOA3 = lambda loa,piv: {
    ("http://idmanagement.gov/icam/2009/12/saml_2.0_profile/assurancelevel3" == loa)
}
CAS_LEVEL_OF_ASSURANCE_PREDICATE_LOA2 = lambda loa,piv: {
    ("http://idmanagement.gov/icam/2009/12/saml_2.0_profile/assurancelevel2" == loa)
    or
    ("http://idmanagement.gov/icam/2009/12/saml_2.0_profile/assurancelevel3" == loa)

}

CAS_LEVEL_OF_ASSURANCE_PREDICATE_LOA2_AND_PIV = lambda loa,piv: {
    (("http://idmanagement.gov/icam/2009/12/saml_2.0_profile/assurancelevel2" == loa)
    or
    ("http://idmanagement.gov/icam/2009/12/saml_2.0_profile/assurancelevel3" == loa))
    and
    ("urn:max:fips-201-pivcard" == piv)

}

CAS_PIV_CARD = lambda loa,piv: {
   ("urn:max:fips-201-pivcard" == piv)
}

CAS_PASSWORD_OR_PIV = lambda loa, piv: {
   ("urn:max:fips-201-pivcard" == piv)
   or
   ("urn:oasis:names:tc:SAML:1.0:am:password" == piv)
}
CAS_LEVEL_3 = lambda loa, piv: {
   ("urn:max:am:secureplus:federated-saml2:assurancelevel3" == piv)
}
CAS_LEVEL_OF_ASSURANCE_PREDICATE = CAS_PASSWORD_OR_PIV

autherror="Authentication error: Authentication failed: the supplied credential is not right"

error_msg = {
'Internal Error Occurred':'Internal Error Occurred',
'Failed to upload File':'Failed to upload File',
'Failed to unzip File':'Failed to unzip File',
'Invalid Input Form Parameters Received':'Invalid Input Form Parameters Received',
'Failed to Scan File':'Failed to Scan File',
'No Authentication received':'No Authentication received',
'Invalid Authentication':'Invalid Authentication',
'Invalid SFTP Authentication':'Invalid SFTP Authentication'
}

