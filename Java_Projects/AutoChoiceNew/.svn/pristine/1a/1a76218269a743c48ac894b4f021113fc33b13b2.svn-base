package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ReportEmailCompositePK implements Serializable{
	
	protected String report_Code;
	protected String selection_Code;
	protected String type_Delivery;
	protected double sequence;
	
	public ReportEmailCompositePK(){
		
	}
	
	public ReportEmailCompositePK(String report_Code,String selection_Code,String type_Delivery,double sequence){
		this.report_Code =report_Code ;
		this.selection_Code = selection_Code;
		this.type_Delivery = type_Delivery;
		this.sequence = sequence;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof ReportEmailCompositePK) && 
                 ((ReportEmailCompositePK) o).getReport_Code().equals(this.report_Code) &&
                 ((ReportEmailCompositePK) o).getSelection_Code().equals(this.selection_Code) &&
                 ((ReportEmailCompositePK) o).getType_Delivery().equals(this.type_Delivery) &&
                 ((ReportEmailCompositePK) o).getSequence() == this.sequence);
    }
	@Override
    public int hashCode() { 
        return report_Code.hashCode() + selection_Code.hashCode() + type_Delivery.hashCode() + Double.valueOf(sequence).hashCode(); 
    }

	public String getReport_Code() {
		return report_Code;
	}

	public void setReport_Code(String report_Code) {
		this.report_Code = report_Code;
	}

	public String getSelection_Code() {
		return selection_Code;
	}

	public void setSelection_Code(String selection_Code) {
		this.selection_Code = selection_Code;
	}

	public String getType_Delivery() {
		return type_Delivery;
	}

	public void setType_Delivery(String type_Delivery) {
		this.type_Delivery = type_Delivery;
	}

	public double getSequence() {
		return sequence;
	}

	public void setSequence(double sequence) {
		this.sequence = sequence;
	}

}
