package gov.gsa.fas.services.order.v1.wdc.mapping;

import gov.gsa.fas.order.v1.LineItem;
import gov.gsa.fas.order.v1.Order;
import gov.gsa.fas.order.v1.ShipmentInfo;
import gov.gsa.fas.order.v1.WdcFullfilledItemDetails;
import gov.gsa.fas.services.order.v1.wdc.parsing.ParsedRecord;

import javax.xml.datatype.XMLGregorianCalendar;

public class CrhfRecordMapper  extends AbstractRecordMapper implements RecordMapper {


	@Override
	public void mapParsedRecordToOrder(ParsedRecord record, Order order) {
		//Get internal order parts
		LineItem lineItem = order.getLineItemList().getLineItem().get(0);
		WdcFullfilledItemDetails wdcFulfilledItemDetails = lineItem.getWdcFulfilledItemDetails();
		ShipmentInfo shipmentInfo = wdcFulfilledItemDetails.getShipmentInfo();
		
//		These are set by BAS
//		order.getOrderNumber().setValue(record.getTrimmedValue("ZOR-DOC-NUM"));
//		order.getOrderNumber().setSuffix(record.getTrimmedValue("SUFFIX"));

		record.getTrimmedValue("OUTPUT-ID");
		record.getTrimmedValue("SFX");

//		Line Item NSN is set by base record
//		lineItem.getItemNumber().setStandard(ItemNumberStandard.NSN);
//		lineItem.getItemNumber().setValue(record.getTrimmedValue("MRO-NSN"));
		wdcFulfilledItemDetails.setNsn( record.getTrimmedValue("MRO-NSN") );

		wdcFulfilledItemDetails.getQuantity().setUnitCode(record.getTrimmedValue("MRO-UI"));
		wdcFulfilledItemDetails.getShippedQuantity().setUnitCode(record.getTrimmedValue("MRO-UI"));

		record.getTrimmedValue("REG");
		record.getTrimmedValue("ACTIVITY");
		record.getTrimmedValue("BUYER");
		wdcFulfilledItemDetails.setRoutingIdentitierCode( record.getTrimmedValue("MRO-RIC-TO") );
		wdcFulfilledItemDetails.setTransactionDispositionCode( record.getTrimmedValue("MRO-TD") );
		wdcFulfilledItemDetails.setStatus(record.getTrimmedValue("STATUS"));
		record.getTrimmedValue("DISCREP-TYPE");

		mapProcessStages(record, lineItem);
		
		shipmentInfo.getTransportation().setMode( record.getTrimmedValue("MODE") );;
		shipmentInfo.getTransportation().setControlNumber( record.getTrimmedValue("TCN") );
		shipmentInfo.getCarrierTrackingDetails().setGovtBillOfLadingNumber( record.getTrimmedValue("GBL") );
		shipmentInfo.getCarrierTrackingDetails().setInlaneGovtBillOfLadingNumber(null);//TODO 
		String poNumber = record.getTrimmedValue("PO-NR");
		shipmentInfo.getCarrierTrackingDetails().setShipmentPoNumber(poNumber);
		if(poNumber != null && !poNumber.trim().isEmpty()){
			int manifestLen = (poNumber.length() > 7) ? 7 : poNumber.length();
			shipmentInfo.getCarrierTrackingDetails().setManifestNumber(poNumber.substring(0, manifestLen));
		}
		shipmentInfo.getCarrierTrackingDetails().setFreightOnBoardCode(	record.getTrimmedValue("FOB") );
		wdcFulfilledItemDetails.setAdministrativeContractingOffice( record.getTrimmedValue("ACO") );
		record.getTrimmedValue("MOP");
		Integer variance = deriveVariance(record.getTrimmedValue("PERCENT-UP"), 
				record.getTrimmedValue("PERCENT-DOWN"));
		if(variance != null){
			wdcFulfilledItemDetails.setVariance(variance.toString());
		}
		record.getTrimmedValue("DIVERSION-ADD");
		shipmentInfo.getExportInfo().setExportPackingFacility( record.getTrimmedValue("EPF") );
		shipmentInfo.getExportInfo().setPointOfEmbarkation( record.getTrimmedValue("POE") );
		record.getTrimmedValue("HOLD");
		record.getTrimmedValue("SDC");
		record.getTrimmedValue("CANC-SOURCE");
		record.getTrimmedValue("IMC");
		record.getTrimmedValue("MGR");
		wdcFulfilledItemDetails.setDunsNumber( record.getTrimmedValue("DUNS-NR") );
		wdcFulfilledItemDetails.getQuantity().setValue((Integer)record.getProcessedValue("QTY-SHIPPED"));
		wdcFulfilledItemDetails.getShippedQuantity().setValue( (Integer)record.getProcessedValue("QTY-SHIPPED") );
		wdcFulfilledItemDetails.setQuantityCut( safeIntToDouble((Integer)record.getProcessedValue("QTY-DENIED")) );
		record.getTrimmedValue("DATE-AVAIL");
		shipmentInfo.setActualShipDate( (XMLGregorianCalendar)record.getProcessedValue("SHIP-DATE") );
		wdcFulfilledItemDetails.setOrderPrice( safeToString(record.getProcessedValue("SELL-PR")) );
		wdcFulfilledItemDetails.setCostPrice( safeToString(record.getProcessedValue("COST-PR")) );
		wdcFulfilledItemDetails.setUnitWeight( (Double)record.getProcessedValue("UNIT-WGT") );
		wdcFulfilledItemDetails.setBilledDate( (XMLGregorianCalendar)record.getProcessedValue("BILL-DATE") );
		record.getTrimmedValue("MARK-UP");
		shipmentInfo.getExportInfo().setType( determineExportType(record.getTrimmedValue("ACT-E-D")) );
	}

}
