/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.mapping;

import gov.gsa.fas.order.v1.ExportType;
import gov.gsa.fas.order.v1.LineItem;
import gov.gsa.fas.order.v1.WdcProcessStage;
import gov.gsa.fas.order.v1.WdcProcessStageList;
import gov.gsa.fas.services.order.v1.wdc.parsing.ParsedRecord;


/**
 * @author CourtAZabel
 *
 */
public abstract class AbstractRecordMapper {

	protected void mapProcessStages(ParsedRecord record, LineItem lineItem) {
			WdcProcessStageList wdcProcessStages = lineItem.getWdcProcessStages();
			
			for(int i=1; i<=10; i++){
				if( record.getTrimmedValue("PROC-CD-"+i)!=null ){
					WdcProcessStage stage = new WdcProcessStage();
					stage.setCode(record.getTrimmedValue("PROC-CD-"+i));
	//				stage.setDate((XMLGregorianCalendar)record.getProcessedValue("PROC-DATE-"+i));//TODO Fix Schema
					stage.setJulianDate(record.getRawValue("PROC-DATE-"+i));
					wdcProcessStages.getStage().add(stage);
				}
			}
			
		}

	protected ExportType determineExportType(String edValue) {
		if(edValue == null) return null;
		return ExportType.fromValue(edValue);
//		if( "E".equalsIgnoreCase( edValue ) )
//			return ExportType.EXPORT;
//		else if( "D".equalsIgnoreCase(edValue) )
//			return ExportType.DOMESTIC;
//		else return null;
	}
	
	protected Integer deriveVariance(String percentUp, String percentDown) {
		if(percentUp != null && !percentUp.isEmpty()){
			int percentUpInt = Integer.parseInt(percentUp);
			if(percentUpInt > 0){
				return percentUpInt;
			}
		}
		if(percentDown != null && !percentDown.isEmpty()){
			int percentDownInt = Integer.parseInt(percentDown);
			return percentDownInt;
		}
		return null;
	}	

	protected String safeToString(Object processedValue) {
		if( processedValue==null )
			return null;
		else return processedValue.toString();
	}

	protected Double safeIntToDouble(Integer intValue) {
		if( intValue==null )
			return null;
		else return Double.parseDouble(intValue.toString());
	}


	
}
