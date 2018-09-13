/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.mapping;

import org.junit.Test;

import gov.gsa.fas.services.order.v1.wdc.parsing.CrhfRecordParserFactory;

/**
 * @author CourtAZabel
 */
public class Crhf_RecordMapperTest extends AbstractRecordMapperTest {

	public Crhf_RecordMapperTest(){
		super();
		this.wdcOrderPartDao = this.wdcOrderPartDaoFactory.createWdcOrderPartDao_Crhf();
		this.recordMapper = new CrhfRecordMapper();
		this.recordParser = (new CrhfRecordParserFactory()).getRecordParser();
	}
	
/*	@Test
	public void testAllData_nosfx_ALEAAC5263004E() {
		runTest("ALEAAC5263004E", null);
	}
	
	@Test
	public void testAllData_nosfx_ALEAAC6004001E() {
		runTest("ALEAAC6004001E", null);
	}

	@Test
	public void testAllData_wsfx_BJOB5V20440313_() {
		runTest("BJOB5V20440313", "");
	}

	@Test
	public void testAllData_wsfx_BKEC9M71490083_() {
		runTest("BKEC9M71490083", "");
	}*/


	@Test
	public void testChrfOnly_nosfx_BAEA5V40790041() {
		runTest("BAEA5V40790041", null);
	}
	@Test
	public void testChrfOnly_nosfx_BAEA5V40823005() {
		runTest("BAEA5V40823005", null);
	}
	@Test
	public void testChrfOnly_wisfx_AC041193070191_() {
		runTest("AC041193070191", "A");
		runTest("AC041193070191", "C");
		runTest("AC041193070191", "E");
		runTest("AC041193070191", "G");
	}
//	@Test
//	public void testChrfOnly_wisfx__() {
//		runTest("", "");
//	}

/*	@Test
	public void testUhrfOnly_nosfx_BACA9N5014A126() {
		runTest("BACA9N5014A126", null);
	}
	@Test
	public void testUhrfOnly_nosfx_BACA9N5014A202() {
		runTest("BACA9N5014A202", null);
	}
	@Test
	public void testUhrfOnly_wisfx_BISH5V00240659_() {
		runTest("BISH5V00240659", "");
	}
	@Test
	public void testUhrfOnly_wisfx_BISH5V72641449_() {
		runTest("BISH5V72641449", "");
	}*/
}
