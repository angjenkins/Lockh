/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.mapping;

import gov.gsa.fas.order.v1.ItemNumberStandard;
import gov.gsa.fas.order.v1.LineItem;
import gov.gsa.fas.order.v1.Order;
import gov.gsa.fas.order.v1.OrderOrigin;
import gov.gsa.fas.order.v1.WdcOrderedItemDetails;
import gov.gsa.fas.services.order.v1.wdc.parsing.ParsedRecord;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * This is the first RecordMapper that will be called.
 * @author zabelc
 */
public class ZkpBasRecordMapper extends AbstractRecordMapper implements RecordMapper {

	

	@Override
	public void mapParsedRecordToOrder(ParsedRecord record, Order order) {

		//Get internal order parts
		LineItem lineItem = order.getLineItemList().getLineItem().get(0);
		WdcOrderedItemDetails wdcOrderedItemDetails = lineItem.getWdcOrderedItemDetails();

		order.setType(OrderOrigin.WDC);
		
		order.getOrderNumber().setValue(record.getTrimmedValue("ZOR-DOC-NUM"));
		order.getOrderNumber().setSuffix(record.getTrimmedValue("SUFFIX"));
		record.getTrimmedValue("OUTPUT-ID");
		wdcOrderedItemDetails.setDocumentIdentitierCode( record.getTrimmedValue("DIC") );
		wdcOrderedItemDetails.setRoutingIdentitierCode( record.getTrimmedValue("RIC") );
		wdcOrderedItemDetails.setCustomerSatusUpdateMedium( record.getTrimmedValue("M-S") );
		lineItem.getItemNumber().setStandard(ItemNumberStandard.NSN);
		lineItem.getItemNumber().setValue(record.getTrimmedValue("NSN"));
		wdcOrderedItemDetails.setNsn( record.getTrimmedValue("NSN") );
		lineItem.getQuantity().setUnitCode(record.getTrimmedValue("UI"));
		wdcOrderedItemDetails.getQuantity().setUnitCode(record.getTrimmedValue("UI"));
		record.getTrimmedValue("DOC-NR");
//		wdcOrderedItemDetails.setTransactionDispositionCode();
		wdcOrderedItemDetails.getSupplementalAac().setValue( record.getTrimmedValue("SUP-ADDR") );
		wdcOrderedItemDetails.setSignalCode(record.getTrimmedValue("SIGNAL"));
		wdcOrderedItemDetails.setFundCode( record.getTrimmedValue("FUND") );
		wdcOrderedItemDetails.setDistributionCode( record.getTrimmedValue("DIST") );
		wdcOrderedItemDetails.setProjectCode( record.getTrimmedValue("PROJ") );
		//To strip 0s convert it to numeric and convert to string
		String priorityStr = record.getTrimmedValue("PRI");
		if(priorityStr != null && !priorityStr.trim().isEmpty()){
			int priorityCodeInt = Integer.parseInt(priorityStr);
			priorityStr = String.valueOf(priorityCodeInt);
		}
		wdcOrderedItemDetails.getPriority().setCode(priorityStr);
		wdcOrderedItemDetails.setRequiredDeliveryDateCode( record.getTrimmedValue("RDD") );
		wdcOrderedItemDetails.setAdviceCode( record.getTrimmedValue("ADVICE") );
		String areaRedfData = record.getTrimmedValue("AREA-REDF");
		if(areaRedfData != null && !areaRedfData.trim().isEmpty()){
			if(areaRedfData.length() >= 7){
				wdcOrderedItemDetails.setTransactionDispositionCode(areaRedfData.substring(5, 7));
			}
		}
//		record.getTrimmedValue("AREA-REDF");
		wdcOrderedItemDetails.getAssociatedAgencyCodes().setAgency( record.getTrimmedValue("AGENCY") );
		wdcOrderedItemDetails.getAssociatedAgencyCodes().setBureau( record.getTrimmedValue("BUREAU") );
		wdcOrderedItemDetails.getAssociatedAgencyCodes().setState( record.getTrimmedValue("STATE") );
		wdcOrderedItemDetails.getAssociatedAgencyCodes().setCity( record.getTrimmedValue("CITY") );
		wdcOrderedItemDetails.setExportType( determineExportType(record.getTrimmedValue("EXP-DOM")) );
		
		wdcOrderedItemDetails.setInputCode(	record.getTrimmedValue("INPUT-SRC") );
		wdcOrderedItemDetails.getConsignee().getAac().setAccessCode( record.getTrimmedValue("CONSIGNEE") );
		order.getAac().setValue( record.getTrimmedValue("CONSIGNEE") );

		record.getTrimmedValue("EDI");
		record.getTrimmedValue("NAS");
		record.getTrimmedValue("TRANS-IND");
		record.getTrimmedValue("BR-CANC-CTR");
		record.getTrimmedValue("BR-CANC-VALUE");
		record.getTrimmedValue("BS-CANC-CTR");
		record.getTrimmedValue("BS-CANC-VALUE");
		record.getTrimmedValue("UNTRANSFER-IND");
		record.getTrimmedValue("PRIME-CONS");
		record.getTrimmedValue("NR-ACT-SEG");
		record.getTrimmedValue("FILLER");
		record.getTrimmedValue("BASE-SEG-IND");
		lineItem.getQuantity().setValue( (Integer) record.getProcessedValue("QTY-REQD") );
		wdcOrderedItemDetails.getQuantity().setValue( (Integer) record.getProcessedValue("QTY-REQD") );
		wdcOrderedItemDetails.setEntryDate( (XMLGregorianCalendar)record.getProcessedValue("ENTRY-DATE") );
		order.setOrderDate( (XMLGregorianCalendar)record.getProcessedValue("ENTRY-DATE") );
		wdcOrderedItemDetails.setEditDate( (XMLGregorianCalendar)record.getProcessedValue("EDIT-DATE") );
		wdcOrderedItemDetails.setCalculatedRequiredDeliveryDate( (XMLGregorianCalendar)record.getProcessedValue("CALC-RDD") );
		wdcOrderedItemDetails.setBuyComputationDate( (XMLGregorianCalendar)record.getProcessedValue("BUY-COMP-DATE") );
		wdcOrderedItemDetails.setFutureFreezeDate( (XMLGregorianCalendar)record.getProcessedValue("FUT-FRZ-DATE") );
		wdcOrderedItemDetails.getConsignee().setZone( record.getTrimmedValue("ZONE") );
		wdcOrderedItemDetails.getPriority().setGroup( record.getTrimmedValue("PRI-GROUP") );
	}

}
