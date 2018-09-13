package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ZLBDetailCompositePK implements Serializable{
	protected int ZC_CYCLE_NUM;
	protected String ZC_CYCLE_DATE;
	protected int ZL_RECORD_NUM;
	
	public ZLBDetailCompositePK(){
		
	}
	
	public ZLBDetailCompositePK(String ZC_CYCLE_DATE, int ZC_CYCLE_NUM, int ZL_RECORD_NUM){
		this.ZC_CYCLE_NUM = ZC_CYCLE_NUM;
		this.ZC_CYCLE_DATE = ZC_CYCLE_DATE;
		this.ZL_RECORD_NUM = ZL_RECORD_NUM;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof ZLBDetailCompositePK) && 
                 ((ZLBDetailCompositePK) o).getZC_CYCLE_NUM() == this.ZC_CYCLE_NUM &&
                 ((ZLBDetailCompositePK) o).getZC_CYCLE_DATE().equals(this.ZC_CYCLE_DATE) &&
                 ((ZLBDetailCompositePK) o).getZL_RECORD_NUM() == this.ZL_RECORD_NUM);
    }
	@Override
    public int hashCode() { 
        return ZC_CYCLE_NUM + ZC_CYCLE_DATE.hashCode() + ZL_RECORD_NUM; 
    }

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

	public int getZL_RECORD_NUM() {
		return ZL_RECORD_NUM;
	}

	public void setZL_RECORD_NUM(int zL_RECORD_NUM) {
		ZL_RECORD_NUM = zL_RECORD_NUM;
	}
}
