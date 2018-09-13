package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

public class ReqProcLogCompositePK implements Serializable{
	
	protected String caseNo;
	protected String buyer_Code;
	protected Timestamp date_Open;
	
	public ReqProcLogCompositePK(){
		
	}
	
	public ReqProcLogCompositePK(String caseNo,String buyer_Code,Timestamp date_Open){
		this.caseNo = caseNo;
		this.buyer_Code = buyer_Code;
		this.date_Open = date_Open;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof ReqProcLogCompositePK) && 
                 ((ReqProcLogCompositePK) o).getCaseNo().equals(this.caseNo) &&
                 ((ReqProcLogCompositePK) o).getBuyer_Code().equals(this.buyer_Code) &&
                 ((ReqProcLogCompositePK) o).getDate_Open().equals(this.date_Open) );
    }
	@Override
    public int hashCode() { 
        return caseNo.hashCode() + buyer_Code.hashCode() + date_Open.hashCode(); 
    }

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getBuyer_Code() {
		return buyer_Code;
	}

	public void setBuyer_Code(String buyer_Code) {
		this.buyer_Code = buyer_Code;
	}

	public Timestamp getDate_Open() {
		return date_Open;
	}

	public void setDate_Open(Timestamp date_Open) {
		this.date_Open = date_Open;
	}
}
