import logging

logger = logging.getLogger('FileServiceLogger')
hdlr = logging.FileHandler('../logs/FileService.log')
formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
hdlr.setFormatter(formatter)
logger.addHandler(hdlr) 
logger.setLevel(logging.INFO)

def logServiceCalled(message,username,ipaddress):
    logger.info(message + " username : " + username + " ipaddress : " + ipaddress)

def logFileName(filename,ipaddress):
    logger.info("Filename :- " + filename + " ipaddress :" + ipaddress)

def logGeneric(message,ipaddress):
    logger.info(message + " ipaddress :" + ipaddress)

def logServiceURL(message,ipaddress):
    logger.info("FileUpload Service URL : " + message + " ipaddress :" + ipaddress)

def logResponseHeaders(r,ipaddress):
    logger.info("Response Headers & ipaddress :- " + ipaddress)
    logger.info(r.headers)
    logger.info(r.text)
    logger.info(r.status_code)
    logger.info(r.content.strip())
    logger.info("Response Headers written :- " + ipaddress)

