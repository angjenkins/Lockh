/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing;

import org.junit.Test;



/**
 * @author zabelc
 *
 */
public class Crhf_RecordParsingTest extends AbstractRecordParsingTest{

	public Crhf_RecordParsingTest(){
		super();
		this.wdcOrderPartDao = this.wdcOrderPartDaoFactory.createWdcOrderPartDao_Crhf();
		this.recordParser = (new CrhfRecordParserFactory()).getRecordParser();
	}
	
	@Test
	public void testChrfOnly_nosfx_BAEA5V40790041() throws Exception {
		runTest("BAEA5V40790041", null);
	}
	@Test
	public void testChrfOnly_nosfx_BAEA5V40823005() throws Exception {
		runTest("BAEA5V40823005", null);
	}
	@Test
	public void testChrfOnly_wisfx_AC041193070191_() throws Exception {
		runTest("AC041193070191", "A");
		runTest("AC041193070191", "C");
		runTest("AC041193070191", "E");
		runTest("AC041193070191", "G");
	}
//	@Test
//	public void testChrfOnly_wisfx__() throws Exception {
//		runTest("", "");
//	}
}
