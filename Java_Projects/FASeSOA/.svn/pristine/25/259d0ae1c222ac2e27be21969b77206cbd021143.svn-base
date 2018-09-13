/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing.prcs;


/**
 * Default Field processor which trims the field & possibly
 * offers it as an integer
 * 
 * If the string is empty then it returns null.
 * 
 * If the string is all numeric then it returns the integer 
 * value of the string
 * 
 * @author CourtAZabel
 */
public class DefaultProcessor implements FieldProcessor {

	private DefaultProcessor(){}
	private static DefaultProcessor singleton = new DefaultProcessor();;
	public static DefaultProcessor getSingleton(){
		return singleton;
	}
	
	private static int MAX_INTEGER_LENGTH = (""+Integer.MAX_VALUE).length()-1;
	
	/* (non-Javadoc)
	 * @see gov.gsa.fas.services.order.v1.wdc.parsing.prcs.FieldProcessor#processField(java.lang.String)
	 */
	@Override
	public ProcessedField processField(String fieldName, String rawValue) throws ProcessingException {
		ProcessedField field = new ProcessedField(fieldName, rawValue);
		String trimmed = rawValue.trim();
		if( !"".equals(trimmed) ){
			field.setTrimmedValue(trimmed);
			
			if( isInt(trimmed))
				field.setProcessedValue(Integer.parseInt(trimmed));
		}
		return field;
	}

	
	private boolean isInt(String str) {
		if( str.length()>MAX_INTEGER_LENGTH )
			return false;
		for(int c=0; c<str.length(); c++){
			char ch = str.charAt(c);
			if( ch<'0'||ch>'9' )
				return false;
		}
		return true;
	}

}
