package gov.gsa.fas.services.order.v1.wdc.dao;

import org.junit.Before;
import org.junit.Test;


public class ZkpBas_WdcOrderPartDaoTest extends AbstractWdcOrderPartDaoTest{

	@Before
	public void setUp() throws Exception {
		this.wdcOrderPartDao = wdcOrderPartDaoFactory.createWdcOrderPartDao_ZkpBas();
	}

	@Test
	public void testMissing_nosfx() {
		runMissingTest("12345678901234", null);
	}
	@Test
	public void testMissing_wisfx() {
		runMissingTest("12345678901234", "Q");
	}
	
	@Test
	public void testAllData_nosfx_ALEAAC5263004E() {
		runTest("ALEAAC5263004E", null);
	}
	
	@Test
	public void testAllData_nosfx_ALEAAC6004001E() {
		runTest("ALEAAC6004001E", null);
	}

	@Test
	public void testAllData_wsfx_BJOB5V20440313_() {
		runTest("BJOB5V20440313", "A");
		runTest("BJOB5V20440313", "B");
		runTest("BJOB5V20440313", "C");
		runTest("BJOB5V20440313", "D");
	}

	@Test
	public void testAllData_wsfx_BKEC9M71490083_() {
		runTest("BKEC9M71490083", "A");
		runTest("BKEC9M71490083", "C");
	}


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

	@Test
	public void testUhrfOnly_nosfx_BACA9N5014A126() {
		runTest("BACA9N5014A126", null);
	}
	@Test
	public void testUhrfOnly_nosfx_BACA9N5014A202() {
		runTest("BACA9N5014A202", null);
	}
	@Test
	public void testUhrfOnly_wisfx_BISH5V00240659_() {
		runTest("BISH5V00240659", "A");
		runTest("BISH5V00240659", "B");
		runTest("BISH5V00240659", "E");
	}
	@Test
	public void testUhrfOnly_wisfx_BISH5V72641449_() {
		runTest("BISH5V72641449", "A");
		runTest("BISH5V72641449", "B");
		runTest("BISH5V72641449", "D");
	}
}
