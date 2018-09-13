package gov.gsa.fas.services.order.v1.wdc.mapping;

import static org.junit.Assert.*;
import gov.gsa.fas.order.v1.Order;
import gov.gsa.fas.services.order.v1.wdc.OrderUtils;
import gov.gsa.fas.services.order.v1.wdc.XmlUtils;
import gov.gsa.fas.services.order.v1.wdc.dao.AbstractWdcOrderPartDaoFactory;
import gov.gsa.fas.services.order.v1.wdc.dao.OrderPart;
import gov.gsa.fas.services.order.v1.wdc.dao.WdcOrderPartDao;
import gov.gsa.fas.services.order.v1.wdc.dao.WdcOrderPartDaoMockImplFactory;
import gov.gsa.fas.services.order.v1.wdc.dao.WdcOrderPartDaoWsImplFactory;
import gov.gsa.fas.services.order.v1.wdc.parsing.ParsedRecord;
import gov.gsa.fas.services.order.v1.wdc.parsing.RecordParser;
import gov.gsa.fas.services.order.v1.wdc.parsing.RecordParsingException;

public abstract class AbstractRecordMapperTest {

	AbstractWdcOrderPartDaoFactory wdcOrderPartDaoFactory;
	
	AbstractRecordMapperTest(){
//		this.wdcOrderPartDaoFactory = new WdcOrderPartDaoMockImplFactory();
		this.wdcOrderPartDaoFactory = new WdcOrderPartDaoWsImplFactory();
	}
	
	WdcOrderPartDao wdcOrderPartDao;
	RecordMapper recordMapper;
	RecordParser recordParser;
	
	void runTest(String ordNum, String ordSfx){
		try {
			OrderPart orderPart = this.wdcOrderPartDao.getOrderPart(ordNum, ordSfx);
			if( orderPart.isMissing() )
				fail("Missing Order");
			ParsedRecord parsedRecord = this.recordParser.parseRecord(orderPart.getPartData());
			System.out.println("ParsedRecord: "+parsedRecord);
			Order order = OrderUtils.createOrder();
			this.recordMapper.mapParsedRecordToOrder(parsedRecord, order);
			OrderUtils.cleanOrder(order);
			System.out.println("Resulting Order: "+XmlUtils.marshallJaxbObject(order));
			makeAssertions(ordNum, ordSfx, order);
		} catch (RecordParsingException e) {
			throw new RuntimeException(e);
		}
	}

	void makeAssertions(String ordNum, String ordSfx, Order order) {
		assertEquals( ordNum, order.getOrderNumber().getValue() ); 
		assertEquals( ordSfx, order.getOrderNumber().getSuffix() ); 
	}
}
