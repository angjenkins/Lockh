package gov.gsa.fas.services.order.v1.wdc;

import static org.junit.Assert.assertNotNull;
import gov.gsa.fas.order.v1.Order;
import gov.gsa.fas.order.v1.OrderNumber;
import gov.gsa.fas.services.order.v1.GetOrderDetailsResponse;
import gov.gsa.fas.services.order.v1.wdc.dao.WdcOrderPartDaoMockImplFactory;

import java.io.IOException;

import org.junit.Test;
import org.xml.sax.SAXException;

public class WdcOrderDetailsDaoTest {

	WdcOrderDetailsDao wdcOrderDetailsDao;
	
	public WdcOrderDetailsDaoTest() throws IOException, SAXException{
		wdcOrderDetailsDao = new WdcOrderDetailsDao(new WdcOrderPartDaoMockImplFactory());
	}

	private void baseTest(String orderNum, String suffix) throws Exception {
		OrderNumber orderNumber = new OrderNumber();
		orderNumber.setValue(orderNum);
		orderNumber.setSuffix(suffix);
		GetOrderDetailsResponse response = this.wdcOrderDetailsDao.getOrderDetails(orderNumber);
		Order order = response.getOrder();
		assertNotNull(order);
		
		System.out.println("--------------------------------\n"
						+"Order "+orderNum+" ("+suffix+"):\n"
						+XmlUtils.marshallJaxbObject(response)
						+"\n--------------------------------\n");
	}
	
	


	@Test
	public void testCrhf_BAEA5V40790041() throws Exception {
		baseTest("BAEA5V40790041", null);
	}
	@Test
	public void testCrhf_BAEA5V40823005() throws Exception {
		baseTest("BAEA5V40823005", null);
	}

	@Test
	public void testUrhf_ALEAAC5263004E() throws Exception {
		baseTest("ALEAAC5263004E", null);
	}
	@Test
	public void testUrhf_ALEAAC6004001E() throws Exception {
		baseTest("ALEAAC6004001E", null);
	}
	@Test
	public void testUrhf_BACA9N5014A126() throws Exception {
		baseTest("BACA9N5014A126", null);
	}
	@Test
	public void testUrhf_BACA9N5014A202() throws Exception {
		baseTest("BACA9N5014A202", null);
	}
	
	
}
