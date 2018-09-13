package gov.gsa.fas.services.order.v1.wdc.dao;

import gov.gsa.fas.webservicesb.program.fss19wsprg.GetRecordRequest;

public class AbstractWdcOrderPartDao {

	protected String recordType;
	protected boolean useOrderSuffix;
	protected String recordSuffix;
	
	public AbstractWdcOrderPartDao(String recordType, boolean useOrderSuffix,
			String recordSuffix) {
		super();
		this.recordType = recordType;
		this.useOrderSuffix = useOrderSuffix;
		this.recordSuffix = recordSuffix;
	}

	protected GetRecordRequest createGetRecordRequest(String ordNumStr, String orderStuffix) {
		GetRecordRequest request = new GetRecordRequest();
		request.setInType(this.recordType);
		
		StringBuffer inDataSB = new StringBuffer(ordNumStr);
//		if( this.useOrderSuffix )
//			inDataSB.append(orderStuffix);
		if( orderStuffix!=null && !"".equals(orderStuffix) )
			inDataSB.append(orderStuffix);
		else inDataSB.append(" ");//default suffix
		inDataSB.append(this.recordSuffix);
		
		request.setInData( inDataSB.toString() );
		
		return request;
	}

	protected OrderPart createOrderPart() {
		OrderPart orderPart = new OrderPart();
		orderPart.setPartName(this.recordType + this.recordSuffix);
		return orderPart;
	}



}