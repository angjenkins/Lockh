/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing.prcs;


/**
 * Interface defining classes which can process field data
 * @author CourtAZabel
 */
public interface FieldProcessor {

	/**
	 * Process the rawField into some sort of object
	 * @param rawField
	 * @param rawValue 
	 * @return ParsedField
	 */
	public ProcessedField processField(String fieldName, String rawField) throws ProcessingException;
}
