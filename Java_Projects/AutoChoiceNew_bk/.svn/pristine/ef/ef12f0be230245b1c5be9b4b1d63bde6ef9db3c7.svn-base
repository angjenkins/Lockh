package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

public class ControlLogCompositePK implements Serializable{
	
	protected String caseNo;
	protected Timestamp date_Init;
	protected String type_Proc;
	
	public ControlLogCompositePK(){
		
	}
	
	public ControlLogCompositePK(String caseNo,Timestamp date_Init, String type_Proc){
		this.caseNo = caseNo;
		this.date_Init = date_Init;
		this.type_Proc = type_Proc;
	}

	@Override
	public boolean equals(Object o) { 
        return ((o instanceof ControlLogCompositePK) && 
                 ((ControlLogCompositePK) o).getCaseNo().equals(this.caseNo) &&
                 ((ControlLogCompositePK) o).getDate_Init().equals(this.date_Init) &&
                 ((ControlLogCompositePK) o).getType_Proc().equals(this.type_Proc));
    }
	@Override
    public int hashCode() { 
        return caseNo.hashCode() + date_Init.hashCode() + type_Proc.hashCode(); 
    }

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public Timestamp getDate_Init() {
		return date_Init;
	}

	public void setDate_Init(Timestamp date_Init) {
		this.date_Init = date_Init;
	}

	public String getType_Proc() {
		return type_Proc;
	}

	public void setType_Proc(String type_Proc) {
		this.type_Proc = type_Proc;
	}

}
