/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.mapping;

import gov.gsa.fas.order.v1.LineItem;
import gov.gsa.fas.order.v1.Order;
import gov.gsa.fas.order.v1.ShipmentInfo;
import gov.gsa.fas.order.v1.WdcFullfilledItemDetails;
import gov.gsa.fas.services.order.v1.wdc.parsing.ParsedRecord;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author zabelc
 *
 */
public class UrhfRecordMapper extends AbstractRecordMapper implements RecordMapper {


	@Override
	public void mapParsedRecordToOrder(ParsedRecord record, Order order) {
		//Get internal order parts
		LineItem lineItem = order.getLineItemList().getLineItem().get(0);
		//Ordered Item Details set by BAS
		//WdcOrderedItemDetails wdcOrderedItemDetails = lineItem.getWdcOrderedItemDetails();
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
		record.getTrimmedValue("VAR-DATA");
		wdcFulfilledItemDetails.setRoutingIdentitierCode( record.getTrimmedValue("MRO-RIC-TO") );
		wdcFulfilledItemDetails.setTransactionDispositionCode( record.getTrimmedValue("MRO-TD") );
		record.getTrimmedValue("MUST-SHIP");
		record.getTrimmedValue("SURV-FOLLOWUP");
		record.getTrimmedValue("PARITY-SFX");
		record.getTrimmedValue("IMC-2");
		record.getTrimmedValue("ITEM-MGR-2");
		wdcFulfilledItemDetails.setStatus( record.getTrimmedValue("STATUS-CD") );
		record.getTrimmedValue("DISCREP-TYPE");
		record.getTrimmedValue("ERROR-CD-1");
		record.getTrimmedValue("ERROR-CD-2");

		mapProcessStages(record, lineItem);
		
		shipmentInfo.getTransportation().setMode( record.getTrimmedValue("MODE") );;
		shipmentInfo.getTransportation().setControlNumber( record.getTrimmedValue("TCN") );
		shipmentInfo.getCarrierTrackingDetails().setGovtBillOfLadingNumber( record.getTrimmedValue("GBL") );
		shipmentInfo.getCarrierTrackingDetails().setInlaneGovtBillOfLadingNumber(null);//TODO 
		String mrcVarData = record.getTrimmedValue("MRC-VAR-DATA");
		if(mrcVarData != null && !mrcVarData.trim().isEmpty()){
			int poLen = (mrcVarData.length() > 11) ? 11 : mrcVarData.length();
			int manifestLen = (mrcVarData.length() > 7) ? 7 : mrcVarData.length();
			shipmentInfo.getCarrierTrackingDetails().setShipmentPoNumber(mrcVarData.substring(0, poLen));
			shipmentInfo.getCarrierTrackingDetails().setManifestNumber(mrcVarData.substring(0, manifestLen));
			if(mrcVarData.length() >= 12){
				shipmentInfo.getCarrierTrackingDetails().setFreightOnBoardCode(mrcVarData.substring(11, 12));
			}
			if(mrcVarData.length() >= 13){
				wdcFulfilledItemDetails.setAdministrativeContractingOffice( mrcVarData.substring(12, 13) );
			}
		}
		record.getTrimmedValue("DIVERSION-ADD");
		shipmentInfo.getExportInfo().setExportPackingFacility( record.getTrimmedValue("EPF") );
		shipmentInfo.getExportInfo().setPointOfEmbarkation( record.getTrimmedValue("POE") );
		record.getTrimmedValue("HOLD");
		record.getTrimmedValue("SDC");
		record.getTrimmedValue("CANC-SOURCE");
		wdcFulfilledItemDetails.setDunsNumber( record.getTrimmedValue("DUNS-NR") );
		shipmentInfo.getExportInfo().setType( determineExportType(record.getTrimmedValue("ACT-E-D")) );
		Integer variance = deriveVariance(record.getTrimmedValue("PERCENT-UP"), 
				record.getTrimmedValue("PERCENT-DOWN"));
		if(variance != null){
			wdcFulfilledItemDetails.setVariance(variance.toString());
		}
		wdcFulfilledItemDetails.getQuantity().setValue( (Integer)record.getProcessedValue("MRO-QTY") );
		wdcFulfilledItemDetails.getShippedQuantity().setValue( (Integer)record.getProcessedValue("QTY-SHIPPED") );
		wdcFulfilledItemDetails.setQuantityCut( safeIntToDouble((Integer)record.getProcessedValue("QTY-DENIED")) );
		record.getTrimmedValue("AN-SENT-QTY");
		record.getTrimmedValue("AP-RESP-QTY");
		record.getTrimmedValue("AC-PREP-DATE");
		record.getTrimmedValue("DTE-AVAIL-SHP");
		wdcFulfilledItemDetails.setEstimatedShipDate( (XMLGregorianCalendar)record.getProcessedValue("ESD") );
		shipmentInfo.setActualShipDate( (XMLGregorianCalendar)record.getProcessedValue("SHIP-DATE") );
		wdcFulfilledItemDetails.setOrderPrice( safeToString(record.getProcessedValue("SELL-PR")) );
		wdcFulfilledItemDetails.setCostPrice( safeToString(record.getProcessedValue("COST-PR")) );
		wdcFulfilledItemDetails.setUnitWeight( (Double)record.getProcessedValue("UNIT-WGT") );
		record.getTrimmedValue("MARK-UP");
		wdcFulfilledItemDetails.setBilledDate( (XMLGregorianCalendar)record.getProcessedValue("BILL-DATE") );
	}

}
