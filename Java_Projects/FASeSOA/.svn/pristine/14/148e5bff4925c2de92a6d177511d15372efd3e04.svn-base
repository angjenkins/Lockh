/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.dao;

/**
 * @author zabelc
 */
public class OrderPart {

	String partName;
	String partData;
	
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartData() {
		return partData;
	}
	public void setPartData(String partData) {
		this.partData = partData;
	}
	
	
	public boolean isMissing(){
		return partData.endsWith("MISING") || partData.endsWith("MISSING") ;
	}
	
	@Override
	public String toString() {
		return "OrderPart [partName=" + partName + ", partData("+partData.length()+")=" + partData + "]";
	}
	
}
