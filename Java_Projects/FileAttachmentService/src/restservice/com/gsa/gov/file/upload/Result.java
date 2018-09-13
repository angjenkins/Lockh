package com.gsa.gov.file.upload;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Output")
public class Result {
	private String status;
	private String result;
	public Result(){
		
	}
	public Result(String status, String result){
		this.status = status;
		this.result = result;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		status = status;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString(){
		return new StringBuffer("result : ").append(this.result).toString();
	}
	
}
