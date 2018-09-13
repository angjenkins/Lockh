/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing;

import org.junit.Test;



/**
 * @author zabelc
 *
 */
public class Urhf_RecordParsingTest extends AbstractRecordParsingTest{

	public Urhf_RecordParsingTest(){
		super();
		this.wdcOrderPartDao = this.wdcOrderPartDaoFactory.createWdcOrderPartDao_Urhf();
		this.recordParser = (new UrhfRecordParserFactory()).getRecordParser();
	}

	@Test
	public void testUhrfOnly_nosfx_BACA9N5014A126() throws Exception {
		runTest("BACA9N5014A126", null);
	}
	@Test
	public void testUhrfOnly_nosfx_BACA9N5014A202() throws Exception {
		runTest("BACA9N5014A202", null);
	}
	@Test
	public void testUhrfOnly_wisfx_BISH5V00240659_() throws Exception {
		runTest("BISH5V00240659", "A");
		runTest("BISH5V00240659", "B");
		runTest("BISH5V00240659", "E");
	}
	@Test
	public void testUhrfOnly_wisfx_BISH5V72641449_() throws Exception {
		runTest("BISH5V72641449", "A");
		runTest("BISH5V72641449", "B");
		runTest("BISH5V72641449", "D");
	}

}
