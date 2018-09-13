package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class OrderStatusCompositePK implements Serializable{
	protected String caseNo;
	protected String veh_Order_No;
	protected String VIN;
	
	public OrderStatusCompositePK(){
		
	}
	
	public OrderStatusCompositePK(String caseNo, String veh_Order_No, String VIN){
		this.caseNo = caseNo;
		this.veh_Order_No = veh_Order_No;
		this.VIN = VIN;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof OrderStatusCompositePK) && 
                 ((OrderStatusCompositePK) o).getCaseNo().equals(this.caseNo) &&
                 ((OrderStatusCompositePK) o).getVeh_Order_No().equals(this.veh_Order_No) &&
                 ((OrderStatusCompositePK) o).getVIN().equals(this.VIN) );
    }
	@Override
    public int hashCode() { 
        return caseNo.hashCode() + veh_Order_No.hashCode() + VIN.hashCode(); 
    }

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getVeh_Order_No() {
		return veh_Order_No;
	}

	public void setVeh_Order_No(String veh_Order_No) {
		this.veh_Order_No = veh_Order_No;
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String VIN) {
		this.VIN = VIN;
	}

	
}
