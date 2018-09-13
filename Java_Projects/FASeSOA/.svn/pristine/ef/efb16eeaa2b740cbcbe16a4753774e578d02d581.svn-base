package gov.gsa.fas.services.order.v1.wdc.parsing.prcs;

import static org.junit.Assert.*;

import java.util.Calendar;

import gov.gsa.fas.services.order.v1.wdc.parsing.RecordParsingException;

import org.junit.Test;

public class JulianDateProcessorTest {

	JulianDateProcessor processor = new JulianDateProcessor();

	@Test
	public void test2004156() throws RecordParsingException {
		String rawField = "2004156";

		ProcessedField processedField = this.processor.processField("name",rawField);
		Calendar cal = (Calendar) processedField.getProcessedValue();
		assertNotNull(cal);
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_YEAR);

		assertEquals(rawField, ""+year+day);
	}
	
	@Test
	public void test20041() throws RecordParsingException {
		String rawField = "20041";

		ProcessedField processedField = this.processor.processField("name",rawField);
		Calendar cal = (Calendar) processedField.getProcessedValue();
		assertNotNull(cal);
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_YEAR);

		assertEquals(rawField, ""+year+day);
	}
	@Test
	public void test2004001() throws RecordParsingException {
		String rawField = "2004001";

		ProcessedField processedField = this.processor.processField("name",rawField);
		Calendar cal = (Calendar) processedField.getProcessedValue();
		assertNotNull(cal);
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_YEAR);
		
		String dayStr = String.format("%03d", day);

		assertEquals(rawField, ""+year+dayStr);
	}

}
