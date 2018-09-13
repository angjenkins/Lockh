import logging

logger = logging.getLogger('FeedbackLogger')
hdlr = logging.FileHandler('../logs/Feedback.log')
formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
hdlr.setFormatter(formatter)
logger.addHandler(hdlr) 
logger.setLevel(logging.INFO)

def logFeedback(name,message,rating,remote_addr):
    print 'Log feedback'
    logger.info("Feedback Received")
    logger.info("Name: " + name)
    logger.info("Message: " + message)
    logger.info("Rating: " + str(rating))
    logger.info("IP Address: " + remote_addr)

