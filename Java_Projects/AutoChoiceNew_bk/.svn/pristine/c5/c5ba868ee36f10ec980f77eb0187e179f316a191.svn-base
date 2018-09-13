package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;
import java.sql.Timestamp;


public class EngReqLogCompositePK implements Serializable{
	protected String buyer_Code;
	protected String caseNo;
	protected Timestamp date_Open;
	
	public EngReqLogCompositePK(){
		
	}
	
	public EngReqLogCompositePK(String buyer_Code, String caseNo, Timestamp date_Open){
		this.buyer_Code = buyer_Code;
		this.caseNo = caseNo;
		this.date_Open = date_Open;
		
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof EngReqLogCompositePK) && 
                 ((EngReqLogCompositePK) o).getBuyer_Code().equals(this.buyer_Code) &&
                 ((EngReqLogCompositePK) o).getCaseNo().equals(this.caseNo) &&
                 ((EngReqLogCompositePK) o).getDate_Open().equals(this.date_Open));
    }
	@Override
    public int hashCode() { 
        return buyer_Code.hashCode() + caseNo.hashCode() + date_Open.hashCode(); 
    }

	public String getBuyer_Code() {
		return buyer_Code;
	}

	public void setBuyer_Code(String buyer_Code) {
		this.buyer_Code = buyer_Code;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public Timestamp getDate_Open() {
		return date_Open;
	}

	public void setDate_Open(Timestamp date_Open) {
		this.date_Open = date_Open;
	}

}
