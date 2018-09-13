/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing.prcs;


/**
 * Process a string as a DoubleProcessor.  Null, empty, or blank strings
 * will return a null processed field
 * 
 * @author CourtAZabel
 */
public class DoubleProcessor implements FieldProcessor {

	private int decimalPos;
	private int fieldLength;
	
	
	public DoubleProcessor(int decimalPos, int fieldLength) {
		if( decimalPos > fieldLength )
			throw new IllegalArgumentException("Decimal position ["+decimalPos+"] must be less than the field length ["+fieldLength+"]");
		this.decimalPos = decimalPos;
		this.fieldLength = fieldLength;
	}


	/* (non-Javadoc)
	 * @see gov.gsa.fas.services.order.v1.wdc.parsing.prcs.FieldProcessor#processField(java.lang.String)
	 */
	@Override
	public ProcessedField processField(String fieldName, String rawValue) throws ProcessingException {
		ProcessedField field = new ProcessedField(fieldName, rawValue);
		if( rawValue==null || "".equals(rawValue.trim()) )
			return field;
		
		String trimmedField = rawValue.trim();
		if( trimmedField.length()!=this.fieldLength )
			throw new ProcessingException("The expected length for this field is "+this.fieldLength+". The following is not valid: ["+trimmedField+"]");

		String preDecimal = trimmedField.substring(0, decimalPos);
		String postDecimal = trimmedField.substring(decimalPos);
		String number = preDecimal+"."+postDecimal;
		
		try {
			field.setProcessedValue( Double.parseDouble(number) );
			return field;
		} catch (NumberFormatException nfe) {
			throw new ProcessingException("Unable to convert ["+trimmedField+"] to Float.", nfe);
		}
	}

}
