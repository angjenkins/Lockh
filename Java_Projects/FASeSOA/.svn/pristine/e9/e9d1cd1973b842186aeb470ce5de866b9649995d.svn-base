/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing.prcs;

/**
 * @author zabelc
 *
 */
public class ProcessedField {

	private String name;
	private String rawValue;
	private Object processedValue = null;
	private String trimmedValue = null;

	public ProcessedField(String name, String rawValue) {
		this.name = name;
		this.rawValue = rawValue;
	}

	void setTrimmedValue(String trimmed) {
		this.trimmedValue = trimmed;
		this.processedValue = this.trimmedValue;
	}

	void setProcessedValue(Object processedValue) {
		this.processedValue = processedValue;
	}

	public String getName() {
		return this.name;
	}

	public String getRawValue() {
		return rawValue;
	}
	public String getTrimmedValue() {
		return trimmedValue;
	}
	
	public Object getProcessedValue() {
		return processedValue;
	}

	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer( "<raw=[").append(rawValue+"], trimmed=[").append(trimmedValue).append("] , processed=[");
		if( processedValue!=null ){
			sb.append('(').append(processedValue.getClass().getSimpleName()).append(')');
		}
		sb.append(processedValue).append("]>");
		return sb.toString();
	}

}
