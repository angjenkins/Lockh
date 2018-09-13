/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing;

import gov.gsa.fas.services.order.v1.wdc.parsing.prcs.DefaultProcessor;
import gov.gsa.fas.services.order.v1.wdc.parsing.prcs.FieldProcessor;

/**
 * @author zabelc
 *
 */
public class MappedField {

	private String name;
	private int length;
	private FieldProcessor processor;

	public MappedField(String name, int length, FieldProcessor processor) {
		this.name = name;
		this.length = length;
		this.processor = processor;
	}
	
	public MappedField(String name, int length) {
		this(name, length, DefaultProcessor.getSingleton());
	}

	public String getName() {
		return name;
	}

	public int getLength() {
		return length;
	}

	public FieldProcessor getProcessor() {
		return processor;
	}
	
}
