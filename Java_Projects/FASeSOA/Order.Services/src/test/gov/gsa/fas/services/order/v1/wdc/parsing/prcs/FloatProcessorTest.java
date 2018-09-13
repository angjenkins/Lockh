/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing.prcs;

import static org.junit.Assert.*;
import gov.gsa.fas.services.order.v1.wdc.parsing.RecordParsingException;

import org.junit.Test;

/**
 * @author CourtAZabel
 *
 */
public class FloatProcessorTest {

	@Test
	public void testV99() throws RecordParsingException {
		DoubleProcessor fp = new DoubleProcessor(0, 2);
		ProcessedField processedField = fp.processField("name","05");
		Double result = (Double) processedField.getProcessedValue();
		assertEquals((Double)0.05, result);
	}

	@Test
	public void test9V9() throws RecordParsingException {
		DoubleProcessor fp = new DoubleProcessor(1, 2);
		ProcessedField processedField = fp.processField("name","05");
		Double result = (Double) processedField.getProcessedValue();
		assertEquals((Double)0.5, result);
	}

	
	@Test
	public void test9999V99() throws RecordParsingException {
		DoubleProcessor fp = new DoubleProcessor(4, 6);
		ProcessedField processedField = fp.processField("name","123456");
		Double result = (Double) processedField.getProcessedValue();
		assertEquals((Double)1234.56, result);
	}

}
