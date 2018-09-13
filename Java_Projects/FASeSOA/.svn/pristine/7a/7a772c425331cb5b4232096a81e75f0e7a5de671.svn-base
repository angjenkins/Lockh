/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing;

import gov.gsa.fas.services.order.v1.wdc.parsing.prcs.FieldProcessor;
import gov.gsa.fas.services.order.v1.wdc.parsing.prcs.ProcessedField;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zabelc
 *
 */
public class RecordParser {

	List<MappedField> fields = new ArrayList<MappedField>();
	
	public void addMappedField(MappedField field){
		this.fields.add(field);
	}
	public void addMappedField(String name, int length){
		this.fields.add(new MappedField(name, length));
	}
	public void addMappedField(String name, int length, FieldProcessor processor) {
		this.fields.add(new MappedField(name, length, processor));
	}

	
	public int getRecordLength(){
		int len = 0;
		for (MappedField field : this.fields) {
			len+=field.getLength();
		}
		return len;
	}

	public ParsedRecord parseRecord(String record) throws RecordParsingException{
		int expectedLength = this.getRecordLength();
		if( record.length()!=expectedLength )
//			throw new RecordParsingException
			System.err.println("Record Length("+record.length()+") != Expected Length("+expectedLength+") for record: ["+record+"]");
		
		ParsedRecord result = new ParsedRecord(fields.size());
		int posn = 0;
		int endIdx = 0;
		for (MappedField field : this.fields) {
			endIdx = posn + field.getLength();
			if( endIdx>record.length() ){
				System.err.println("Field "+field.getName()+" fell off the world: pos="+posn+" end="+endIdx+" data size="+record.length());
			}else{
			
				String rawValue = record.substring(posn, endIdx);
				
				ProcessedField processedValue = field.getProcessor().processField(field.getName(), rawValue);
				result.addField( processedValue );
				
				//Setup the next position
				posn = endIdx;
			}
		}
		return result;
	}
}
