/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing;

import gov.gsa.fas.services.order.v1.wdc.parsing.prcs.ProcessedField;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zabelc
 */
public class ParsedRecord {

	/**
	 * Map of field names to the data that they contain
	 */
	private Map<String, ProcessedField> fieldDataMap;

	/**
	 * @param fieldCount - the aproximate number of fields
	 */
	public ParsedRecord(int fieldCount) {
		this.fieldDataMap = new HashMap<String, ProcessedField>(fieldCount);
	}
	public void addField(ProcessedField parsedField) {
		this.fieldDataMap.put(parsedField.getName(), parsedField);
	}

	
	/**
	 * Get the Map of ParsedFields
	 * @return
	 */
	public Map<String, ProcessedField> getFieldDataMap() {
		return fieldDataMap;
	}


	/**
	 * Get the full ParsedField
	 * @param fieldName
	 * @return ParsedField or null if field is not present
	 */
	public ProcessedField getParsedField(String fieldName) {
		return this.fieldDataMap.get(fieldName);
	}

	
	/**
	 * Get the Raw Value of the ParsedField
	 * @param fieldName
	 * @return String raw value or null if field is not present
	 */
	public String getRawValue(String fieldName) {
		ProcessedField parsedField = this.fieldDataMap.get(fieldName);
		if( parsedField==null )
			return null;
		else return parsedField.getRawValue();
	}

	/**
	 * Get the Parsed Value of the ParsedField
	 * @param fieldName
	 * @return Object parsed value or null if field is not present
	 */
	public Object getProcessedValue(String fieldName) {
		ProcessedField parsedField = this.fieldDataMap.get(fieldName);
		if( parsedField==null )
			return null;
		else return parsedField.getProcessedValue();
	}
	/**
	 * Get the Trimmed Value of the ParsedField
	 * @param fieldName
	 * @return String field value or null if the field was empty
	 */
	public String getTrimmedValue(String fieldName) {
		ProcessedField parsedField = this.fieldDataMap.get(fieldName);
		if( parsedField==null )
			return null;
		else return parsedField.getTrimmedValue();
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("ParsedRecord [\n");
		for (Map.Entry<String, ProcessedField> entry : this.fieldDataMap.entrySet()) {
			sb.append( String.format("%1$-10s", entry.getKey()) )
				.append("\t=\t").append(entry.getValue()).append("\n");
		}
		sb.append("]\n");
		return sb.toString();
	}

	
	
}
