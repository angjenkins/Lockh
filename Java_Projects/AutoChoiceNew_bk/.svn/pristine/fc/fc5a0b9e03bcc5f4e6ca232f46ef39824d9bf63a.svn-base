package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@IdClass(RequisitionsJustCompositePK.class)
@Table (name="requisitions_just")
@Component
public class RequisitionsJustDTO {
	@Id
	@NotNull
	@NotEmpty(message="Agency Code cannot be empty")
	protected int caseNo;
	
	@Id
	@Length(max=6)
	@NotNull
	@NotEmpty(message="Case number (real) cannot be empty")
	protected String caseNo_Real = "";
	
	@Length(max=800)
	@Column(name="Justification")
	protected String justification;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated;
	
	@Column(name="Date_Updated")
	protected Timestamp updatedDate;
	
	@Length(max=1)
	@NotNull
	@Column(name="Flg_Quote")
	protected String flgQuote = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Flg_Responses")
	protected String flgResponses = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Flg_Best_Value")
	protected String flgBestValue = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Flg_Justification")
	protected String flgJustification = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Flg_Inter_Ag")
	protected String flgInterAg = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Flg_Urgent")
	protected String flgUrgent = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Flg_Sugg_Source")
	protected String flgSuggSource = "";

	public int getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}

	public String getCaseNo_Real() {
		return caseNo_Real;
	}

	public void setCaseNo_Real(String caseNo_Real) {
		this.caseNo_Real = caseNo_Real;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getFlgQuote() {
		return flgQuote;
	}

	public void setFlgQuote(String flgQuote) {
		this.flgQuote = flgQuote;
	}

	public String getFlgResponses() {
		return flgResponses;
	}

	public void setFlgResponses(String flgResponses) {
		this.flgResponses = flgResponses;
	}

	public String getFlgBestValue() {
		return flgBestValue;
	}

	public void setFlgBestValue(String flgBestValue) {
		this.flgBestValue = flgBestValue;
	}

	public String getFlgJustification() {
		return flgJustification;
	}

	public void setFlgJustification(String flgJustification) {
		this.flgJustification = flgJustification;
	}

	public String getFlgInterAg() {
		return flgInterAg;
	}

	public void setFlgInterAg(String flgInterAg) {
		this.flgInterAg = flgInterAg;
	}

	public String getFlgUrgent() {
		return flgUrgent;
	}

	public void setFlgUrgent(String flgUrgent) {
		this.flgUrgent = flgUrgent;
	}

	public String getFlgSuggSource() {
		return flgSuggSource;
	}

	public void setFlgSuggSource(String flgSuggSource) {
		this.flgSuggSource = flgSuggSource;
	}
	
	

}
