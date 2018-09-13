/*
 * @(#)CrhfBasRecordMapper.java			Mar 7, 2013	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.order.v1.wdc.mapping;

import javax.xml.datatype.XMLGregorianCalendar;

import gov.gsa.fas.order.v1.ItemNumberStandard;
import gov.gsa.fas.order.v1.LineItem;
import gov.gsa.fas.order.v1.Order;
import gov.gsa.fas.order.v1.OrderOrigin;
import gov.gsa.fas.order.v1.WdcOrderedItemDetails;
import gov.gsa.fas.services.order.v1.wdc.parsing.ParsedRecord;

/**
 * <code>CrhfBasRecordMapper</code> provides mapping for CrhfBasRecord mapping.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class CrhfBasRecordMapper extends AbstractRecordMapper implements RecordMapper {

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
		wdcOrderedItemDetails.getPriority().setCode( record.getTrimmedValue("PRI") );
		wdcOrderedItemDetails.setRequiredDeliveryDateCode( record.getTrimmedValue("RDD") );
		wdcOrderedItemDetails.setAdviceCode( record.getTrimmedValue("ADVICE") );
		String vari1Data = record.getTrimmedValue("VARI1");
		if(vari1Data != null && !vari1Data.trim().isEmpty()){
			if(vari1Data.length() >= 7){
				wdcOrderedItemDetails.setTransactionDispositionCode(vari1Data.substring(5, 7));
			}
		}
//		record.getTrimmedValue("VARI1");
		wdcOrderedItemDetails.getAssociatedAgencyCodes().setAgency( record.getTrimmedValue("AGENCY") );
		wdcOrderedItemDetails.getAssociatedAgencyCodes().setBureau( record.getTrimmedValue("BUREAU") );
		wdcOrderedItemDetails.getAssociatedAgencyCodes().setState( record.getTrimmedValue("STATE") );
		wdcOrderedItemDetails.getAssociatedAgencyCodes().setCity( record.getTrimmedValue("CITY") );
		wdcOrderedItemDetails.setExportType( determineExportType(record.getTrimmedValue("EXP-DOM")) );
		
		wdcOrderedItemDetails.setInputCode(	record.getTrimmedValue("INPUT-SRC") );
		wdcOrderedItemDetails.getConsignee().getAac().setAccessCode( record.getTrimmedValue("CONSIGNEE") );
		order.getAac().setValue( record.getTrimmedValue("CONSIGNEE") );
		record.getTrimmedValue("CRP");
		record.getTrimmedValue("MAP-MARK-FOR");
		record.getTrimmedValue("EDI");
		record.getTrimmedValue("NAS");
		record.getTrimmedValue("NR-ACT-SEG");
		record.getTrimmedValue("BASE-SEG-IND");
		lineItem.getQuantity().setValue( (Integer) record.getProcessedValue("QTY-REQD") );
		wdcOrderedItemDetails.getQuantity().setValue( (Integer) record.getProcessedValue("QTY-REQD") );
		wdcOrderedItemDetails.setEntryDate( (XMLGregorianCalendar)record.getProcessedValue("ENTRY-DATE") );
		order.setOrderDate( (XMLGregorianCalendar)record.getProcessedValue("ENTRY-DATE") );
		wdcOrderedItemDetails.setEditDate( (XMLGregorianCalendar)record.getProcessedValue("EDIT-DATE") );
		record.getProcessedValue("TRANSFER-DATE");
		wdcOrderedItemDetails.getConsignee().setZone( record.getTrimmedValue("ZONE") );
		wdcOrderedItemDetails.getPriority().setGroup( record.getTrimmedValue("PRI-GROUP") );
		
	}

}
