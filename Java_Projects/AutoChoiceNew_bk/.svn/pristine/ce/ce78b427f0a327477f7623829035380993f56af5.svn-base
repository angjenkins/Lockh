package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@IdClass(ZLBCycleCompositePK.class)
@Table (name="zlb_cycle")
public class ZLBCycleDTO {
	
	@Id
	@NotNull
	@NotEmpty(message="ZC Cycle Number cannot be empty")
	protected int ZC_CYCLE_NUM = 0;
	
	@Id
	@NotNull
	@NotEmpty(message="ZC Cycle Date cannot be empty")
	@Length(max=5)
	protected String ZC_CYCLE_DATE;
	
	@Length(max=6)
	@Column(name="ZC_TIMESTAMP")
	protected String zcTimeStamp;
	
	@Length(max=7)
	@Column(name="ZC_FILE_NAME")
	protected String zcFileName;
	
	@Column(name="ZC_DETAIL_COUNT")
	protected int zcFileCount;
	
	@Column(name="ZC_DETAIL_AMT")
	protected double zcDetailAmt;
	
	@Length(max=1)
	@Column(name="ZC_CYCLE_STATUS")
	protected String zcCycleStatus;
	
	@Length(max=5)
	@Column(name="ZC_FILLER_A")
	protected String zcFillerA;

	public int getZC_CYCLE_NUM() {
		return ZC_CYCLE_NUM;
	}

	public void setZC_CYCLE_NUM(int zC_CYCLE_NUM) {
		ZC_CYCLE_NUM = zC_CYCLE_NUM;
	}

	public String getZC_CYCLE_DATE() {
		return ZC_CYCLE_DATE;
	}

	public void setZC_CYCLE_DATE(String zC_CYCLE_DATE) {
		ZC_CYCLE_DATE = zC_CYCLE_DATE;
	}

	public String getZcTimeStamp() {
		return zcTimeStamp;
	}

	public void setZcTimeStamp(String zcTimeStamp) {
		this.zcTimeStamp = zcTimeStamp;
	}

	public String getZcFileName() {
		return zcFileName;
	}

	public void setZcFileName(String zcFileName) {
		this.zcFileName = zcFileName;
	}

	public int getZcFileCount() {
		return zcFileCount;
	}

	public void setZcFileCount(int zcFileCount) {
		this.zcFileCount = zcFileCount;
	}

	public double getZcDetailAmt() {
		return zcDetailAmt;
	}

	public void setZcDetailAmt(double zcDetailAmt) {
		this.zcDetailAmt = zcDetailAmt;
	}

	public String getZcCycleStatus() {
		return zcCycleStatus;
	}

	public void setZcCycleStatus(String zcCycleStatus) {
		this.zcCycleStatus = zcCycleStatus;
	}

	public String getZcFillerA() {
		return zcFillerA;
	}

	public void setZcFillerA(String zcFillerA) {
		this.zcFillerA = zcFillerA;
	}

}
