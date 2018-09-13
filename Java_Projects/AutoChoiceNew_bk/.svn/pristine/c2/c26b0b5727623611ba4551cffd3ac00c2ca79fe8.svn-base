package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

public class OrderStatusArchiveCompPK implements Serializable{
	protected String caseNo;
	protected String veh_Order_No;
	protected String VIN;
	protected Timestamp date_Updated;
	
	public OrderStatusArchiveCompPK(){
		
	}
	
	public OrderStatusArchiveCompPK(String caseNo, String veh_Order_No, String VIN, Timestamp date_Updated){
		this.caseNo = caseNo;
		this.veh_Order_No = veh_Order_No;
		this.VIN = VIN;
		this.date_Updated = date_Updated;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof OrderStatusArchiveCompPK) && 
                 ((OrderStatusArchiveCompPK) o).getCaseNo().equals(this.caseNo) &&
                 ((OrderStatusArchiveCompPK) o).getVeh_Order_No().equals(this.veh_Order_No) &&
                 ((OrderStatusArchiveCompPK) o).getVIN().equals(this.VIN) &&
                 ((OrderStatusArchiveCompPK) o).getDate_Updated().equals(this.date_Updated));
    }
	@Override
    public int hashCode() { 
        return caseNo.hashCode() + veh_Order_No.hashCode() + VIN.hashCode() + date_Updated.hashCode(); 
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

	public void setVIN(String vIN) {
		VIN = vIN;
	}

	public Timestamp getDate_Updated() {
		return date_Updated;
	}

	public void setDate_Updated(Timestamp date_Updated) {
		this.date_Updated = date_Updated;
	}
}
