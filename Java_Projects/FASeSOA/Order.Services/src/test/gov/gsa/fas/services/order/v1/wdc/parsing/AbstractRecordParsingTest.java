/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing;

import static org.junit.Assert.*;
import gov.gsa.fas.services.order.v1.wdc.dao.AbstractWdcOrderPartDaoFactory;
import gov.gsa.fas.services.order.v1.wdc.dao.OrderPart;
import gov.gsa.fas.services.order.v1.wdc.dao.WdcOrderPartDao;
import gov.gsa.fas.services.order.v1.wdc.dao.WdcOrderPartDaoMockImplFactory;

import org.junit.Test;

/**
 * @author zabelc
 *
 */
public abstract class AbstractRecordParsingTest {
	
	WdcOrderPartDao wdcOrderPartDao;
	RecordParser recordParser;
	AbstractWdcOrderPartDaoFactory wdcOrderPartDaoFactory;
	
	public AbstractRecordParsingTest(){
		this.wdcOrderPartDaoFactory = new WdcOrderPartDaoMockImplFactory();
	}
	
	void runTest(String orderNum, String suffix) throws Exception{
		OrderPart orderPart = this.wdcOrderPartDao.getOrderPart(orderNum, suffix);
		if( orderPart.isMissing() )
			return;
		ParsedRecord record = this.recordParser.parseRecord( orderPart.getPartData() );
		System.out.println(orderPart.getPartName()+" Order("+orderNum+" "+suffix+"):"+record);
		assertNotNull(record);
		assertFalse( record.getFieldDataMap().isEmpty() );
	}
	
	@Test
	public void testAllData_nosfx_ALEAAC5263004E() throws Exception {
		runTest("ALEAAC5263004E", null);
	}

	@Test
	public void testAllData_nosfx_ALEAAC6004001E() throws Exception {
		runTest("ALEAAC6004001E", null);
	}

	@Test
	public void testAllData_wsfx_BJOB5V20440313_() throws Exception {
		runTest("BJOB5V20440313", "A");
		runTest("BJOB5V20440313", "B");
		runTest("BJOB5V20440313", "C");
		runTest("BJOB5V20440313", "D");
	}

	@Test
	public void testAllData_wsfx_BKEC9M71490083_() throws Exception {
		runTest("BKEC9M71490083", "A");
		runTest("BKEC9M71490083", "C");
	}






}
