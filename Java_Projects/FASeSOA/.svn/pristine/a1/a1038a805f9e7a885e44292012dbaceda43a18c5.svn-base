package gov.gsa.fas.services.order.v1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.jboss.wsf.spi.annotation.WebContext;

import gov.gsa.fas.global.v1.Address;
import gov.gsa.fas.order.v1.Liid;
import gov.gsa.fas.order.v1.OrderNumber;
import gov.gsa.fas.order.v1.OrderNumberScope;
import gov.gsa.fas.persistence.order.model.GecoOrderSale;
import gov.gsa.fas.persistence.order.model.GgsOrderSale;
import gov.gsa.fas.persistence.order.model.OrderHistory;
import gov.gsa.fas.persistence.order.model.OrderSale;
import gov.gsa.fas.persistence.order.model.OrderSession;
import gov.gsa.fas.persistence.order.model.OrderShipAddress;
import gov.gsa.fas.persistence.order.service.OrderPersistence;
import gov.gsa.fas.persistence.order.service.OrderPersistenceException;
import gov.gsa.fas.services.common.DateUtility;
import gov.gsa.fas.services.messages.v1.CancelOrderRequest;
import gov.gsa.fas.services.messages.v1.CscPORequest;
import gov.gsa.fas.services.messages.v1.CscPOResponse;
import gov.gsa.fas.services.order.v1.wdc.WdcOrderDetailsDao;
import gov.gsa.fas.services.order.v1.wdc.parsing.RecordParsingException;

/**
 * <code>OrderDetailsImpl</code> provides implementation for 
 * <code>OrderDetails</code> service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see			gov.gsa.fas.services.order.v1.OrderDetails
 */

@WebContext(contextRoot = "/order.services", urlPattern = "/OrderService")
@WebService(endpointInterface = "gov.gsa.fas.services.order.v1.OrderDetails", portName = "OrderDetails", targetNamespace = "http://fas.gsa.gov/services/Order/v1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Remote(OrderDetails.class)
@Stateless

public class OrderDetailsImpl implements gov.gsa.fas.services.order.v1.OrderDetails {

	private static final Logger logger = Logger.getLogger(OrderDetailsImpl.class.getName());
	private InitialContext ctx;

	private WdcOrderDetailsDao wdcOrderDetailsDao = new WdcOrderDetailsDao();
	
	/**
	 * Get the Order details from CSC/FSS19 systems by order number or
	 * session number or Geco Order Number.
	 * 
	 * @param 	parameters
	 * @return	<code>GetOrderDetailsResponse</code> object
	 * @throws 	ServiceFault if any error occurs
	 */
	public GetOrderDetailsResponse getOrderDetails(
			GetOrderDetailsRequest parameters) throws ServiceFault {
		validateOrderDetailsRequest(parameters);
		GetOrderDetailsResponse orderDetailsResp = null;
		XMLGregorianCalendar orderXmlGregCal = null;
		OrderNumber orderNumberObj = parameters.getOrderNumber();
		
		Long orderNumber = null;
		if(orderNumberObj != null && orderNumberObj.getValue() != null &&
				!orderNumberObj.getValue().trim().isEmpty()){

			if( OrderNumberScope.WDC == orderNumberObj.getScope() ){
				logger.info("getOrderDetails(): Getting FSS19 Order details for Order No->" + 
						orderNumberObj.getValue());
				if(orderNumberObj.getValue().trim().length() > 14){
					logger.error("getOrderDetails(): FSS19 order number length greater than 14");
					throw new ServiceFault("", createFault("E", "No orders found"));
				}
				try {
					return this.wdcOrderDetailsDao.getOrderDetails(orderNumberObj);
				} catch (RecordParsingException rpe) {
					logger.error("getOrderDetails(): System Failure: Record Parsing failure while obtaining ",rpe);
					throw new ServiceFault("", createFault("E", "System Failure: Unable to parse order records - FSS19 Parsing failure"));
				}
			}
			String orderNoStr = orderNumberObj.getValue().trim();
			OrderSale ordSale = getOrderSale(orderNoStr);
			orderNumber = new Long(orderNoStr);
			logger.info("getOrderDetails(): Getting Order details for Order No->" + orderNumber);
			orderDetailsResp = getOrderDetailsByOrderNumber(orderNumber);
			if(orderDetailsResp != null && orderDetailsResp.getOrder() != null){
				//Setting LIID
				Liid liid = CscOrderTransformation.transformLiid(ordSale.getLiidId());
				orderDetailsResp.getOrder().setLiid(liid);
				//Setting Order Date
				if(ordSale.getSaleGregDate() != null){
					try {
						orderXmlGregCal=DateUtility.gregorianToXMLGregCalendar(ordSale.getSaleGregDate());
					} catch (ParseException e) {
						logger.warn("getOrderDetails():Failed to parse Order Sale Greg Date->" + ordSale.getSaleGregDate());
					}
					orderDetailsResp.getOrder().setOrderDate(orderXmlGregCal);
				}
			}
		}else if(parameters.getGgsSessionNumber() != null && 
				!parameters.getGgsSessionNumber().trim().isEmpty()){
			String ggsSessionNo = parameters.getGgsSessionNumber().trim();
			logger.info("getOrderDetails(): Getting Order details for GGS Session No->" + ggsSessionNo);			
			GgsOrderSale ggsOrderSale = getOrderNumberFromSession(parameters.getGgsSessionNumber().trim());
			orderDetailsResp = getOrderDetailsByOrderNumber(ggsOrderSale.getOrderNumber());
			//Setting GGSSessionNumber
			if(orderDetailsResp != null){
				orderDetailsResp.getOrder().setGgsSessionNumber(ggsSessionNo);
			}
			if(orderDetailsResp != null && orderDetailsResp.getOrder() != null ){
				//Setting LIID
				Liid liid = CscOrderTransformation.transformLiid(ggsOrderSale.getLiidId());
				orderDetailsResp.getOrder().setLiid(liid);
				//Setting Order Date
				if(ggsOrderSale.getSaleWebOrdDate() != null){
					try {
						orderXmlGregCal=DateUtility.julianToXMLGregCalendar(ggsOrderSale.getSaleWebOrdDate());
					} catch (ParseException e) {
						logger.warn("getOrderDetails():Failed to parse Sale Web order Date->" + ggsOrderSale.getSaleWebOrdDate());
					}
					orderDetailsResp.getOrder().setOrderDate(orderXmlGregCal);
				}
			}
		}else if(parameters.getGecoNumber() != null && 
				!parameters.getGecoNumber().trim().isEmpty()){
			String gecoNbr = parameters.getGecoNumber().trim();
				logger.info("getOrderDetails(): Getting Order details for Geco No->" + gecoNbr);
			GecoOrderSale gecoOrdSale = getOrderNumberFromGeco(gecoNbr);
			orderDetailsResp = getOrderDetailsByOrderNumber(gecoOrdSale.getOrderNumber());
			//Setting Geco Order Number
			if(orderDetailsResp != null){
				orderDetailsResp.getOrder().setGecoOrderNumber(gecoNbr);
			}
			if(orderDetailsResp != null && orderDetailsResp.getOrder() != null){
				//Setting LIID
				Liid liid = CscOrderTransformation.transformLiid(gecoOrdSale.getLiidId());
				orderDetailsResp.getOrder().setLiid(liid);
				//Setting Order Date
				if(gecoOrdSale.getGecoOrderDate() != null){
					try {
						orderXmlGregCal=DateUtility.julianToXMLGregCalendar(gecoOrdSale.getGecoOrderDate());
					} catch (ParseException e) {
						logger.warn("getOrderDetails():Failed to parse Sale Web order Date->" + gecoOrdSale.getGecoOrderDate());
					}
					orderDetailsResp.getOrder().setOrderDate(orderXmlGregCal);
				}
			}
		}
		return orderDetailsResp;
	}
	
	/**
	 * Get the Order session details for the corresponding session number.
	 * 
	 * @param parameters
	 * @return
	 * @throws ServiceFault
	 */
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public GetOrderSessionResponse getOrderSession(
			GetOrderSessionRequest parameters) throws ServiceFault {
		String orderSessionIdStr = parameters.getOrderSessionIdentifier();
		if(orderSessionIdStr == null || orderSessionIdStr.trim().isEmpty()){
			logger.error("getOrderSession():Order Session Number is empty");
			throw new ServiceFault("", createFault("E", "Order Session Number is empty"));
		}
		logger.info("getOrderSession():Getting OrderSession list for->" + orderSessionIdStr);
		if(orderSessionIdStr.trim().length() > 10){
			logger.error("getOrderSession(): Order session number length greater than 10");
			throw new ServiceFault("", createFault("E", "ACIS Session Not Found"));
		}
		int orderSessionId = 0;
		try {
			orderSessionId = Integer.parseInt(orderSessionIdStr.trim());
		} catch (NumberFormatException e1) {
			logger.error("getOrderSession():Order Session Number is not numeric");
			throw new ServiceFault("", createFault("E", "Order Session Number should be numeric"));
		}
		GetOrderSessionResponse ordSessionResp = new GetOrderSessionResponse();
		try {
			OrderPersistence ordPersistence = getOrderPersistenceLocal();
			List<OrderSession> ordSessionList = ordPersistence.retrieveOrderSession(orderSessionId);
			ordSessionResp =  AcisOrderSessionTransformation.transformOrderSession(ordSessionList);
		}catch(OrderPersistenceException ope){
			logger.error("getOrderSession(): System Failure: Failed to get Order session details for session number->" + orderSessionId);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Order session details-" + ope.getMessage()));			
		}
		return ordSessionResp;
	}
	
	/**
	 * Cancels WDC order. The cancel request will be persisted in legacy VISS
	 * system. If successful, returns true.
	 * 
	 * @param 	orderItem
	 * @return
	 * @throws ServiceFault
	 */
	public boolean cancelOrder(CancelOrderRequest orderItem) throws ServiceFault {
		ArrayList<String> valMsgs = OrderDetailsValidator.validateCancelOrder(orderItem);
		if(valMsgs != null && valMsgs.size() > 0){
			StringBuffer valMsgBuf = new StringBuffer();
			for(String msg : valMsgs){
				valMsgBuf.append(msg + ";");
			}
			logger.error("cancelOrder(): Validations falied for Order data" + "\n" +
					valMsgs.toString());
			throw new ServiceFault("", createFault("E", "Validations Failed: " + valMsgs.toString()));
		}
		logger.info("cancelOrder(): Cancelling Order for Item->" + orderItem.getOrderItem().getNsn() + 
				"-" + orderItem.getOrderItem().getRequisitionNumber());
		gov.gsa.fas.persistence.order.model.OrderCancel ordCancel =
			CscOrderTransformation.transformOrderCancel(orderItem);
		logger.info("cancelOrder(): Order Cancel transformation completed for Item->" + orderItem.getOrderItem().getNsn() + 
				"-" + orderItem.getOrderItem().getRequisitionNumber());
		boolean isCancelled = false;
		try {
			isCancelled = getOrderPersistenceLocal().cancelOrder(ordCancel);
		} catch (OrderPersistenceException e) {
			logger.error("cancelOrder(): System Failure: Failed to persist Order Cancel request", e);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to persist Order Cancel Request-" + 
					e.getMessage()));
		}		
		return isCancelled;
	}
	
	/**
	 * Get the purchase order details like PO number etc.
	 * 
	 * @param 	poDetailsRequest <code>CscPORequest</code>
	 * @return	<code>CscPOResponse</code> object
	 * @throws 	ServiceFault, if any error occurs
	 */
	public CscPOResponse getPODetails(CscPORequest poDetailsRequest)
																			throws ServiceFault {
		if(poDetailsRequest == null || poDetailsRequest.getGgsSessionNumber() <= 0 || 
					poDetailsRequest.getManufacturePartNumber() == null || 
					poDetailsRequest.getManufacturePartNumber().trim().isEmpty() ||
					poDetailsRequest.getPrefix() == null ||
					poDetailsRequest.getPrefix().trim().isEmpty()){
			logger.error("getPODetails(): PODetailsRequest is null or values null or empty");
			throw new ServiceFault("", createFault("E", "Invalid PO Request details"));
		}
		logger.info("getPODetails(): Getting PO Details for GGS session No->" + poDetailsRequest.getGgsSessionNumber() + 
				", Manufacture Part Number->" + poDetailsRequest.getManufacturePartNumber() + " and Prefix->" + 
				poDetailsRequest.getPrefix());
		OrderPersistence ordPersistence = getOrderPersistenceLocal();
		CscPOResponse poResp = null;
		String poNumber;
		try{
			poNumber = ordPersistence.retrievePOData(poDetailsRequest.getGgsSessionNumber(), poDetailsRequest.getManufacturePartNumber(),
				poDetailsRequest.getPrefix());
		} catch (OrderPersistenceException e) {
			logger.error("getPODetails(): System Failure: Failed to get PO details-" + e.getMessage(), e);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get PO details-" + e.getMessage()));
		}
		if(poNumber != null && !poNumber.trim().isEmpty()){
			poResp = new CscPOResponse();
			poResp.setPoNumber(poNumber);
		}
		return poResp;
	}	
	
	/**
	 * Validates Order search criteria request.
	 * 
	 * @param req
	 * @throws ServiceFault
	 */
	private void validateOrderDetailsRequest(GetOrderDetailsRequest req) 
																					throws ServiceFault{
		boolean isOrderNo = false;
		boolean isSessionNo = false;
		boolean isGecoNo = false;
		if(req.getOrderNumber() != null && req.getOrderNumber().getValue() != null &&
				!req.getOrderNumber().getValue().trim().isEmpty()){
			isOrderNo = true;
		}else if(req.getGgsSessionNumber() != null && 
				!req.getGgsSessionNumber().trim().isEmpty()){
			isSessionNo = true;
		}else if(req.getGecoNumber() != null && 
				!req.getGecoNumber().trim().isEmpty()){
			isGecoNo = true;
		}
		if(!(isOrderNo || isSessionNo || isGecoNo)){
			logger.error("validateOrderDetailsRequest(): Order search criteria input is empty");
			throw new ServiceFault("", createFault("E", "Order search criteria input is empty"));
		}
	}
	
	/**
	 * Retrieves Order details for the corresponding order number.
	 * 
	 * @param 	orderNo
	 * @return
	 * @throws ServiceFault
	 */
	private GetOrderDetailsResponse getOrderDetailsByOrderNumber(Long orderNo) throws ServiceFault{
		if(orderNo == null || orderNo.longValue() <= 0){
			logger.error("getOrderDetailsByOrderNumber(): Order Number is null or <0");
			throw new ServiceFault("", createFault("E", "Order Number should be numeric"));
		}
		logger.info("getOrderDetailsByOrderNumber():Getting Order History for Order Number->" +
				orderNo);	
		GetOrderDetailsResponse ordHistResp = new GetOrderDetailsResponse();
		OrderPersistence ordPersistence = getOrderPersistenceLocal();
		List<OrderHistory> ordHistList;
		try {
			ordHistList = ordPersistence.retrieveOrderHistory(orderNo);
		} catch (OrderPersistenceException e) {
				logger.error("getOrderDetailsByOrderNumber(): System Failure: Failed to get Order History-" + e.getMessage(), e);
				throw new ServiceFault("", createFault("E", "System Failure: Failed to get Order History-" +e.getMessage()));
		}
		ordHistResp =  CscOrderTransformation.transformOrderHistory(ordHistList);
		OrderShipAddress ordShipAddr;
		try {
			ordShipAddr = ordPersistence.retrieveOrderShippingAddress(orderNo);
		} catch (OrderPersistenceException e) {
			logger.error("getOrderDetailsByOrderNumber(): System Failure: Failed to get Order Shipping Address-" + e.getMessage(), e);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Order Shipping Address-" + e.getMessage()));
		}
		Address addr = CscOrderTransformation.transformShipAddress(ordShipAddr);
		if(addr != null && ordHistResp.getOrder() != null){
			ordHistResp.getOrder().setOrderAddress(addr);
		}
		return ordHistResp;	
	}	
	
	/**
	 * Validates only Order number string. If not valid, raises <code>ServiceFault</code> with
	 * detail fault element.
	 * 
	 * @param orderNbrStr
	 * @throws ServiceFault
	 */
	private OrderSale getOrderSale(String orderNbrStr) throws ServiceFault{
		logger.info("validateOrderNumber(): Validating order number->" + orderNbrStr);
		long orderNo =-1;
		try {
			orderNo = Long.parseLong(orderNbrStr);
		} catch (NumberFormatException e) {
			logger.info("validateOrderNumber(): Order Number is not numeric");
			throw new ServiceFault("", createFault("E", "Order Number should be numeric"));
		}
		OrderPersistence ordPersistence = getOrderPersistenceLocal();
		OrderSale ordSale= null;
		try {
			ordSale = ordPersistence.retrieveOrderSale(orderNo);
		} catch (OrderPersistenceException e) {
			logger.error("validateOrderNumber(): System Failure:" + e.getMessage(), e);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Order Sale data-" + e.getMessage()));
		}
		if(ordSale == null){
			logger.error("validateOrderNumber(): Order Sale data is null for Order No->" + orderNo);
			throw new ServiceFault("", createFault("E", "No orders found"));
		}
		return ordSale;
	}
	
	/**
	 * Get the order number from Geco Order number.
	 *  
	 * @param gecoNo
	 * @return
	 * @throws ServiceFault
	 */
	private GecoOrderSale getOrderNumberFromGeco(String gecoNo) throws ServiceFault{
		logger.info("getOrderNumberFromGeco(): Getting GecoOrderSale from Geco OrderNo->" + gecoNo);
		Long orderNo = null;
		OrderPersistence ordPersistence = getOrderPersistenceLocal();
		GecoOrderSale ordSale = null;
		try {
			ordSale = ordPersistence.retrieveGecoOrderSale(new Long(gecoNo));
		} catch (NumberFormatException e) {
			logger.error("getOrderNumberFromGeco(): Geco Order number is not numeric", e);
			throw new ServiceFault("", createFault("E", "Geco Order Number should be numeric"));
		} catch (OrderPersistenceException e) {
			logger.error("getOrderNumberFromGeco(): System Failure:Failed to get Geco Order Sale Data" + e.getMessage(), e);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Geco Order Sale Data-" + e.getMessage()));
		}
		if(ordSale != null){
			orderNo = ordSale.getOrderNumber();
		}else{
			logger.error("getOrderNumberFromGeco(): Geco Order Sale data is null for Geco No->" + gecoNo);
			throw new ServiceFault("", createFault("E", "No orders found"));
		}
		String orderNoStr = (orderNo != null)?orderNo.toString():null;
		logger.info("getOrderNumberFromGeco(): Geco No->" + gecoNo + "," +
				"Order Number ->" + orderNoStr);
		if(orderNo == null || orderNo == 0){
			ServiceFault srvcFault = new ServiceFault("", 
					createFault("E", "No orders found"));
			throw srvcFault;
		}		
		return ordSale;
	}


	/**
	 * Get the Order number from GGS session number.
	 * 
	 * @param sessionNo
	 * @return
	 * @throws ServiceFault
	 */
	private GgsOrderSale getOrderNumberFromSession(String sessionNo) throws ServiceFault{
		logger.info("getOrderNumberFromSession(): Getting GgsOrderSale from session->" + sessionNo);
		Long orderNo = null;
		OrderPersistence ordPersistence = getOrderPersistenceLocal();
		GgsOrderSale ordSale= null;
		try {
			ordSale = ordPersistence.retrieveOrderSessionSale(new Long(sessionNo));
		} catch (NumberFormatException e) {
			logger.error("getOrderNumberFromSession(): Session number is not numeric", e);
			throw new ServiceFault("", createFault("E", "Order Session Number should be numeric"));
		} catch (OrderPersistenceException e) {
			logger.error("getOrderNumberFromSession(): System Failure:Failed to get Order Sale data " + e.getMessage(), e);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Order Sale data-" + e.getMessage()));
		}
		if(ordSale != null){
			orderNo = ordSale.getOrderNumber();
		}else{
			logger.error("getOrderNumberFromSession(): Order Sale data is null for session No->" + sessionNo);
			throw new ServiceFault("", createFault("E", "No orders found"));
		}
		String orderNoStr = (orderNo != null)?orderNo.toString():null;
		logger.info("getOrderNumberFromSession(): Session No->" + sessionNo + "," +
				"Order Number ->" + orderNoStr);
		if(orderNo == null || orderNo == 0){
			ServiceFault srvcFault = new ServiceFault("", 
					createFault("E", "No orders found"));
			throw srvcFault;
		}		
		return ordSale;
	}	
	
	/**
	 * Get the local EJB of <code>OrderPersistence</code> object.
	 * 
	 * @return
	 * @throws NamingException
	 */
	private OrderPersistence getOrderPersistenceLocal() throws ServiceFault{
		String orderPersistenceJNDI = "enterprise.services/OrderPersistenceImpl/local";
  	Object robj = null;
  	try {
			if( ctx == null ){
			  ctx=new InitialContext();
			}
			robj = ctx.lookup( orderPersistenceJNDI);
		} catch (NamingException e) {
			logger.error("getOrderPersistenceLocal(): System Failure: Failed to get OrderPersistence local EJB", e);
			ServiceFault srvcFault = new ServiceFault("System Failure: Enterprise Service error-NamingException", null);
			throw srvcFault;
		} 
  	logger.info("getOrderPersistenceLocal(): Class name->" + robj.getClass().getName());
  	return (OrderPersistence)robj;		
	}
	
	/**
	 * Creates and returns the <code>gov.gsa.fas.faults.v1.ServiceFault</code> detailed fault
	 * element. 
	 * 
	 * @param 	code
	 * @param 	msg
	 * @return
	 */
	private gov.gsa.fas.faults.v1.ServiceFault createFault(String code, String msg){
		gov.gsa.fas.faults.v1.ServiceFault sFault = new gov.gsa.fas.faults.v1.ServiceFault();
		sFault.setCode(code);
		sFault.setMessage(msg);
		return sFault;
	}
}
