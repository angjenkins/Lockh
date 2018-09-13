package gov.gsa.fas.services.order.v1.wdc.parsing.prcs;

import static org.junit.Assert.*;

import org.junit.Test;

public class DefaultProcessorTest {

	public DefaultProcessor processor = DefaultProcessor.getSingleton();
	
	@Test
	public void testNormalString() throws ProcessingException {
		String rawField = "NormalString";
		Object result = processor.processField("name",rawField);
		assertEquals(rawField, result);
	}
	@Test
	public void testRightPaddedString() throws ProcessingException {
		String rawField = "String       ";
		Object result = processor.processField("name",rawField);
		assertEquals("String", result);
	}
	@Test
	public void testLeftPaddedString() throws ProcessingException {
		String rawField = "     String";
		Object result = processor.processField("name",rawField);
		assertEquals("String", result);
	}
	@Test
	public void testBothPaddedString() throws ProcessingException {
		String rawField = "     String          ";
		Object result = processor.processField("name",rawField);
		assertEquals("String", result);
	}

	
	public void testInteger() throws ProcessingException{
		String rawField = "12345";
		Object result = processor.processField("name",rawField);
		assertEquals(12345, result);
	}
	public void testPaddedInteger() throws ProcessingException{
		String rawField = "  12345  ";
		Object result = processor.processField("name",rawField);
		assertEquals(12345, result);
	}
	public void testZeroPaddedInteger() throws ProcessingException{
		String rawField = "00012345";
		Object result = processor.processField("name",rawField);
		assertEquals(12345, result);
	}
	public void testZeroInteger() throws ProcessingException{
		String rawField = "000";
		Object result = processor.processField("name",rawField);
		assertEquals(0, result);
	}
}
