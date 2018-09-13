package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

//import src.main.java.gov.gsa.fas.AutoChoice.DTO.ContrModCompositePK;

import java.sql.Timestamp;

@Entity
@IdClass(ContrModCompositePK.class)
@Table (name="contr_mod")
public class ContrModDTO {
	
	@Id
	@Length(max=5)
	@NotNull
	@NotEmpty(message="Contract cannot be empty")
	protected String contract = "";
	
	@Id
	@Length(max=3)
	@NotNull
	protected String mod = "";
	
	@NotNull
	@Column(name="Tot_Chg_Units")
	protected int totChangeUnits = 0;
	
	@NotNull
	@Column(name="Tot_Chg_Amount")
	protected double totChangeAmt = 0.0000;
	
	@NotNull
	@Column(name="Curr_Chg_Units")
	protected int currChangeUnits = 0;
	
	@NotNull
	@Column(name="Curr_Chg_Amount")
	protected double currChangeAmt = 0.0000;
	
	@Length(max=1)
	@NotNull
	@Column(name="Hold_Final")
	protected String holdFinal = "";
	
	@NotNull
	@Column(name="Date_Mod_Initiated")
	protected Timestamp modInitDate;
	
	@NotNull
	@Column(name="Date_Mod_Effective")
	protected Timestamp modEffectDate;
	
	@NotNull
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdateDate;	
	
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "0";
	
	@Length(max=1)
	@Column(name="Contract_Status")
	protected String contractStatus = "";
	
	@Column(name="Order_Date")
	protected Timestamp orderDate;	
	
	@Column(name="Msg")
	protected byte[] msg;
	
	@Length(max=48)
	@Column(name="Msg_Mod")
	protected String msgMod = "";
	
	@Length(max=60)
	@Column(name="Explanation")
	protected String explanation = "";

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public int getTotChangeUnits() {
		return totChangeUnits;
	}

	public void setTotChangeUnits(int totChangeUnits) {
		this.totChangeUnits = totChangeUnits;
	}

	public double getTotChangeAmt() {
		return totChangeAmt;
	}

	public void setTotChangeAmt(double totChangeAmt) {
		this.totChangeAmt = totChangeAmt;
	}

	public int getCurrChangeUnits() {
		return currChangeUnits;
	}

	public void setCurrChangeUnits(int currChangeUnits) {
		this.currChangeUnits = currChangeUnits;
	}

	public double getCurrChangeAmt() {
		return currChangeAmt;
	}

	public void setCurrChangeAmt(double currChangeAmt) {
		this.currChangeAmt = currChangeAmt;
	}

	public String getHoldFinal() {
		return holdFinal;
	}

	public void setHoldFinal(String holdFinal) {
		this.holdFinal = holdFinal;
	}

	public Timestamp getModInitDate() {
		return modInitDate;
	}

	public void setModInitDate(Timestamp modInitDate) {
		this.modInitDate = modInitDate;
	}

	public Timestamp getModEffectDate() {
		return modEffectDate;
	}

	public void setModEffectDate(Timestamp modEffectDate) {
		this.modEffectDate = modEffectDate;
	}

	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public byte[] getMsg() {
		return msg;
	}

	public void setMsg(byte[] msg) {
		this.msg = msg;
	}

	public String getMsgMod() {
		return msgMod;
	}

	public void setMsgMod(String msgMod) {
		this.msgMod = msgMod;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

}
