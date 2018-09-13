package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class MessageCompositePK implements Serializable{
	protected String type;
	protected String code;
	protected String flag_Current;
	protected double line_Number;
	
	public MessageCompositePK(){
		
	}
	
	public MessageCompositePK(String type,String code,String flag_Current,double line_Number){
		this.type = type;
		this.code = code;
		this.flag_Current = flag_Current;
		this.line_Number = line_Number;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof MessageCompositePK) && 
                 ((MessageCompositePK) o).getType().equals(this.type) &&
                 ((MessageCompositePK) o).getCode().equals(this.code) &&
                 ((MessageCompositePK) o).getFlag_Current().equals(this.flag_Current) &&
                 ((MessageCompositePK) o).getLine_Number() == this.line_Number);
    }
	@Override
    public int hashCode() { 
        return type.hashCode() + code.hashCode() + flag_Current.hashCode() + Double.valueOf(line_Number).hashCode(); 
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFlag_Current() {
		return flag_Current;
	}

	public void setFlag_Current(String flag_Current) {
		this.flag_Current = flag_Current;
	}

	public double getLine_Number() {
		return line_Number;
	}

	public void setLine_Number(double line_Number) {
		this.line_Number = line_Number;
	}

}
