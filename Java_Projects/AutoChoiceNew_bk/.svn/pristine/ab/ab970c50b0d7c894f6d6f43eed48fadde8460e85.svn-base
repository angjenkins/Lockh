/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import java.sql.Timestamp;
/**
 * @author Arnel Macatula
 *
 */


@Entity
@Table (name="Bid_Line_Picture")
@IdClass(BidLinePictureCompositePK.class)
public class BidLinePictureDTO {

	@Id
	@NotEmpty(message="Sol_No_1  cannot be empty")
	@NotNull
	@Length(max=2)
	@Column(name="Sol_No_1")
	protected String Sol_No_1 = "";
	@Id
	@NotEmpty(message="Sol_No_2  cannot be empty")
	@NotNull
	@Length(max=6)
	@Column(name="Sol_No_2")
	protected String Sol_No_2 = "";
	@Id
	@NotEmpty(message="Sol_No_3  cannot be empty")
	@NotNull
	@Length(max=2)
	@Column(name="Sol_No_3")
	protected String Sol_No_3 = "";


	@NotNull
	@Column(name="Contr_DUNS")
	protected String Contr_DUNS = "";

	@Id
	@NotEmpty(message="Contract cannot be empty")
	@NotNull
	@Column(name="Contract")
	protected String Contract = "";

	@Id
	@NotEmpty(message="Sch_Line  cannot be empty")
	@NotNull
	@Column(name="Sch_Line")
	protected String Sch_Line = "";

	@Id
	@NotEmpty
	@NotNull
	@Column(name="Sequence")
	protected int Sequence = 0;

	
	@Column(name="Model")
	protected String model = "";

	@Id
	@NotEmpty
	@NotNull
	@Column(name="FY")
	protected int FY = 0;
	
	@Column(name="FileName")
	protected String fileName = "";
	
	@Column(name="Date_Initiated")
	protected Timestamp dateInitiated = null;

	
	@Column(name="Date_Updated")
	protected Timestamp dateUpdated = null;
	
	
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Column(name="Status")
	protected String status = "";
	
	@Transient
 	protected int newSequence = 0;
	
	@Transient
 	protected int oldSequence = 0;
	
	@Transient
 	protected int totPicCnt = 0;
 	

	public int getTotPicCnt() {
		return totPicCnt;
	}

	public void setTotPicCnt(int totPicCnt) {
		this.totPicCnt = totPicCnt;
	}

	public int getOldSequence() {
		return oldSequence;
	}

	public void setOldSequence(int oldSequence) {
		this.oldSequence = oldSequence;
	}

	public int getNewSequence() {
		return newSequence;
	}

	public void setNewSequence(int newSequence) {
		this.newSequence = newSequence;
	}

	public String getSol_No_1() {
		return Sol_No_1;
	}

	public void setSol_No_1(String sol_No_1) {
		Sol_No_1 = sol_No_1;
	}

	public String getSol_No_2() {
		return Sol_No_2;
	}

	public void setSol_No_2(String sol_No_2) {
		Sol_No_2 = sol_No_2;
	}

	public String getSol_No_3() {
		return Sol_No_3;
	}

	public void setSol_No_3(String sol_No_3) {
		Sol_No_3 = sol_No_3;
	}

	public String getContr_DUNS() {
		return Contr_DUNS;
	}

	public void setContr_DUNS(String contr_DUNS) {
		Contr_DUNS = contr_DUNS;
	}

	public String getContract() {
		return Contract;
	}

	public void setContract(String contract) {
		Contract = contract;
	}

	public String getSch_Line() {
		return Sch_Line;
	}

	public void setSch_Line(String sch_Line) {
		Sch_Line = sch_Line;
	}

	public int getSequence() {
		return Sequence;
	}

	public void setSequence(int sequence) {
		Sequence = sequence;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}



	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Timestamp getDateInitiated() {
		return dateInitiated;
	}

	public void setDateInitiated(Timestamp dateInitiated) {
		this.dateInitiated = dateInitiated;
	}

	public Timestamp getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Timestamp dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getFY() {
		return FY;
	}

	public void setFY(int fY) {
		FY = fY;
	}

	

	
}

