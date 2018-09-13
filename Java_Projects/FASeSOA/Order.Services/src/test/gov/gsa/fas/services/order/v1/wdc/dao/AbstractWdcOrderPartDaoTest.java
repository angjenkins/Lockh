package gov.gsa.fas.services.order.v1.wdc.dao;

import static org.junit.Assert.*;

public abstract class AbstractWdcOrderPartDaoTest {

	WdcOrderPartDao wdcOrderPartDao;
	AbstractWdcOrderPartDaoFactory wdcOrderPartDaoFactory;

	
	public AbstractWdcOrderPartDaoTest(){
//		this.wdcOrderPartDaoFactory = new WdcOrderPartDaoMockImplFactory();
		this.wdcOrderPartDaoFactory = new WdcOrderPartDaoWsImplFactory();
	}
	
	OrderPart runTest(String orderNumber, String orderSuffix) {
		OrderPart orderPart = this.wdcOrderPartDao.getOrderPart(orderNumber, orderSuffix);
		System.out.println(orderNumber+" "+orderSuffix+": "+orderPart);
		makeAsserts(orderNumber, orderPart);	
		return orderPart;
	}
	
	/**
	 * Make standard asserts for missing order
	 * @param orderPart
	 */
	void makeAsserts(String orderNumber, OrderPart orderPart) {
		assertNotNull(orderPart);
		assertNotNull(orderPart.partData);
		assertTrue(orderPart.partData.length()>14);
		assertFalse(orderPart.isMissing());
	}

	OrderPart runMissingTest(String orderNumber, String orderSuffix) {
		OrderPart orderPart = this.wdcOrderPartDao.getOrderPart(orderNumber, orderSuffix);
//		System.out.println(orderNumber+" "+orderSuffix+": "+orderPart);
		makeMissingAsserts(orderNumber, orderPart);	
		return orderPart;
	}
	
	/**
	 * Make standard asserts for missing order
	 * @param orderPart
	 */
	void makeMissingAsserts(String orderNumber, OrderPart orderPart) {
		assertNotNull(orderPart);
		assertNotNull(orderPart.partData);
		assertTrue(orderPart.partData.length()>0);
		assertTrue(orderPart.isMissing());
	}

}
