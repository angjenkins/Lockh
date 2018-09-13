package gov.gsa.fas.services.order.v1.wdc.dao;

public interface WdcOrderPartDao {

	/**
	 * Given 
	 * @param ordNum
	 * @param ordSfx
	 * @return
	 */
	public abstract OrderPart getOrderPart(String ordNum, String ordSfx);

}