/*
 * @(#)TransactionTestData.java			Jun 18, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.orderdiscrepancy;

import gov.gsa.fas.persistence.orderdiscrepancy.model.Finance305Transaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.MaterialReturnTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ReshipmentTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZkpTransaction;
import gov.gsa.fas.services.common.DateUtility;
import gov.gsa.fas.services.orderdiscrepancy.v1.TransactionConstants;

/**
 * <code>TransactionTestData.java</code>
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see     
 */

public class TransactionPersistenceTestData {

	public static ZkpTransaction createZkpTestRecord(){
		ZkpTransaction zkp = new ZkpTransaction();
		zkp.setRodKey(760119l);
		zkp.setPendingFlag((byte)0);
		zkp.setHeader(TransactionConstants.ZKP_HEADER);
		zkp.setTechCode("BS");
		zkp.setRequisitionNumber("FB480420220999");
		zkp.setRequisitionSuffix(" ");
		zkp.setReportType(TransactionConstants.ZKP_REPORT_TYPE_IND);
		zkp.setCreatedTime(DateUtility.getCurrentTimestamp());
		return zkp;
	}
	
	public static Finance305Transaction createFinance305TestRecord(){
		Finance305Transaction fin305 = new Finance305Transaction();
		fin305.setRodKey(815766l);
		fin305.setPendingFlag((byte)0);
		fin305.setFileId(TransactionConstants.FINANCE305_FILE_ID);
		fin305.setRecordId(5040);
		fin305.setDocId(TransactionConstants.FINANCE305_DOC_ID);
		fin305.setRtgId("GN1");
		fin305.setComCtrCd("F");
		fin305.setNsn("7930011343901  ");
		fin305.setUnit("DZ");
		fin305.setQuantity(10);
		fin305.setRequisitionNumber("M9530221259221");
		fin305.setRequisitionSuffix(" ");
		fin305.setSupplementAddrAAC("YMTM  ");
		fin305.setSignalCode("A");
		fin305.setFundCode("LV");
		fin305.setDistributionCode("   ");
		fin305.setProjectCode("9GF");
		fin305.setPriorityCode("BA");
		fin305.setCycleDate(TransactionConstants.FINANCE305_CYCLE_DATE);
		fin305.setModeOfShip(TransactionConstants.FINANCE305_MODE_OF_SHIP);
		fin305.setExtSellValue(7180l);
		fin305.setSellPrice(718l);
		fin305.setCostPrice(TransactionConstants.FINANCE305_COST_PRICE);
		fin305.setTdSer8Ind(TransactionConstants.FINANCE305_TD_SER8_IND);
		fin305.setAgencyBureauCode("2100");
		fin305.setStateCode("GM");
		fin305.setCityCode("9435");
		fin305.setExpDomInd("F");
		fin305.setTdCode("PK");
		fin305.setManifestPONumber("ED12862N");
		fin305.setBoac("W81X9C");
		fin305.setRegion("2");
		fin305.setAdviceCode("02");
		return fin305;
	}
	
	public static ReshipmentTransaction createReshipmentTestRecord(){
		ReshipmentTransaction reship = new ReshipmentTransaction();
		reship.setRodKey(603727l);
		reship.setPendingFlag((byte)0);
		reship.setDocId(TransactionConstants.RESHIPMENT_DOC_ID);
		reship.setDocIdExt("A");
		reship.setRoutingIdCode("GSA");
		reship.setMediaStatus("F");
		reship.setNsn("8415010285575  ");
		reship.setUnit("PR");
		reship.setQuantity(1);
		reship.setRequisitionNumber("W91WVY83525008");
		reship.setSupplementAddrAAC("W81K57");
		reship.setSignalCode("A");
		reship.setFundCode("92");
		reship.setDistributionCode("   ");
		reship.setProjectCode("   ");
		reship.setPriorityCode("13");
		reship.setRequiredDeliveryDate("060");
		reship.setAdviceCode("2B");
		reship.setTdCode("15");
		reship.setRegionCode(TransactionConstants.RESHIPMENT_REGION_CODE);
		reship.setRoutingCode(TransactionConstants.RESHIPMENT_ROUTING_CODE);
		reship.setCreatedUserCode("PD");
		return reship;
	}
	
	public static MaterialReturnTransaction createMaterialReturnTestRecord(){
		MaterialReturnTransaction mrt = new MaterialReturnTransaction();
		mrt.setRodKey(960013l);
		mrt.setPendingFlag((byte)0);
		mrt.setDocId(TransactionConstants.MATERIAL_RETURN_DOC_ID);
		mrt.setNsn("7230032736094 ");
		mrt.setUnit("BX");
		mrt.setQuantity(7);
		mrt.setRequisitionNumber("W91ZKW12300280");
		mrt.setRequisitionSuffix(" ");
		mrt.setSupplementAddrAAC("P3446W");
		mrt.setSignalCode("F");
		mrt.setFundCode("F9");
		mrt.setRoutingIdCode("GX4");
		mrt.setExtendValue(245202l);
		mrt.setCreatedUserCode("MS");
		mrt.setLiabilityCode("L");
		mrt.setRegionCode(TransactionConstants.MATERIAL_RETURN_REGION);
		return mrt;
	}
}
