/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.dao;

import gov.gsa.fas.webservicesb.program.fss19wsprg.GetRecordRequest;
import gov.gsa.fas.webservicesb.program.fss19wsprg.GetRecordResponse;
import gov.gsa.fas.webservicesb.program.fss19wsprg.ProgramFSS19WSPRGPort;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import org.apache.log4j.Logger;

/**
 * Abstract class to unify parts of obtaining WDC order Parts
 * @author zabelc
 */
public class WdcOrderPartDaoWsImpl extends AbstractWdcOrderPartDao implements WdcOrderPartDao {

	private static final Logger logger = Logger.getLogger(WdcOrderPartDaoWsImpl.class.getName());
	
	ProgramFSS19WSPRGPort programFSS19WSPRGPort;
	public WdcOrderPartDaoWsImpl(ProgramFSS19WSPRGPort programFSS19WSPRGPort,
			String recordType, boolean useOrderSuffix, String recordSuffix) {
		super(recordType, useOrderSuffix, recordSuffix);
		this.programFSS19WSPRGPort = programFSS19WSPRGPort;
	}


	/* (non-Javadoc)
	 * @see gov.gsa.fas.services.order.v1.wdc.WdcOrderPartDao#getOrderPart(java.lang.String, java.lang.String)
	 */
	@Override
	public OrderPart getOrderPart(String ordNumStr, String orderStuffix){
		logger.info("getOrderPart(): Invoking FSS19 Service for Order Number->" + ordNumStr + ", " +
				"Suffix->" + orderStuffix);
		GetRecordRequest request = createGetRecordRequest(ordNumStr, orderStuffix);
		logger.info("getOrderPart(): FSS19 Request - Type-> " + request.getInType() + 
				", In Data->" + request.getInData());
		//// Adding Handler to debug SOAP message
		BindingProvider bindingProvider = (BindingProvider)programFSS19WSPRGPort;
		List<Handler> handlerChain = new ArrayList<Handler>();
		handlerChain.add(new LogHandler());
		bindingProvider.getBinding().setHandlerChain(handlerChain);
		///
		GetRecordResponse response = programFSS19WSPRGPort.getRecord(request);
		
		System.out.println("FSS19WS Request: "+request.getInType()+" "+request.getInData()+" : "+response.getOutputRec());
		
		OrderPart orderPart = createOrderPart();
		orderPart.setPartData(response.getOutputRec());
		
		return orderPart;
	}
}
