package gov.gsa.fas.AutoChoice.DTO;



public class OptionType{
private String code ="";
private String description ="";



public OptionType(String code,String description ){
 setCode(code);
 setDescription(description);
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}




}
