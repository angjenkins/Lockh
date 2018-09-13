package gov.gsa.fas.services.order.v1.wdc.dao;

public abstract class AbstractWdcOrderPartDaoFactory {

	public abstract WdcOrderPartDao createWdcOrderPartDao(String recordType, boolean useOrderSuffix, String recordSuffix);

	public WdcOrderPartDao createWdcOrderPartDao_ZkpBas() {
		return createWdcOrderPartDao("ZKP", true, "BAS");
	}

	public WdcOrderPartDao createWdcOrderPartDao_Urhf() {
		return createWdcOrderPartDao("ZKP", true, "ACTU");
	}

	public WdcOrderPartDao createWdcOrderPartDao_Crhf() {
		return createWdcOrderPartDao("ZKP", true, "ACTC");
	}
	@Deprecated
	public WdcOrderPartDao createWdcOrderPartDao_Order() {
		return createWdcOrderPartDao("ORDER",false,"");
	}
}