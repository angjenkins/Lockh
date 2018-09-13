package gov.gsa.fas.services.order.v1.wdc;

import static org.junit.Assert.*;
import gov.gsa.fas.order.v1.Order;

import org.junit.Before;
import org.junit.Test;

public class CleanOrderTest {

	WdcOrderDetailsDao wdcOrderDetailsDao = new WdcOrderDetailsDao();
	
	@Test
	public void testEmptyClean() {
		Order order = OrderUtils.createOrder();
		OrderUtils.cleanOrder(order);
		
		assertNull(order.getOrderNumber());
		assertNull(order.getLineItemList());
	}

}
