/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing.prcs;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Process a string as a JulianDate.  Null, empty, or blank strings
 * will return a null processed field
 * 
 * @author CourtAZabel
 */
public class JulianDateProcessor implements FieldProcessor {

	/* (non-Javadoc)
	 * @see gov.gsa.fas.services.order.v1.wdc.parsing.prcs.FieldProcessor#processField(java.lang.String)
	 */
	@Override
	public ProcessedField processField(String fieldName, String rawValue) throws ProcessingException {
		ProcessedField field = new ProcessedField(fieldName, rawValue);
		if( rawValue==null || "".equals(rawValue.trim()) )
			return field;
		
		String trimmedField = rawValue.trim();
//		including trimmed field throws some things off
//		field.setTrimmedValue(trimmedField);
		if( trimmedField.length()<5 || trimmedField.length()>7 )
			throw new ProcessingException("Julian Dates must be between 5 & 7 digits. The following is not valid: ["+trimmedField+"]");
		
		String yearStr = trimmedField.substring(0, 4);
		String dayStr = trimmedField.substring(4);
		
		try {
			int yearInt = Integer.parseInt(yearStr);
			int dayInt = Integer.parseInt(dayStr);
			
			if( yearInt==0 && dayInt==0 )
				return field;
			
			GregorianCalendar gcal = new GregorianCalendar();
			gcal.clear();
			gcal.set(Calendar.YEAR, yearInt);
			gcal.set(Calendar.DAY_OF_YEAR, dayInt);

			XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
			
			field.setProcessedValue(xcal);
			
			return field;
		} catch (NumberFormatException nfe) {
			throw new ProcessingException("Unable to convert ["+trimmedField+"] to date.", nfe);
		} catch (DatatypeConfigurationException dce) {
			throw new ProcessingException("Unable to convert ["+trimmedField+"] to xml date.", dce);
		}
	}

}
