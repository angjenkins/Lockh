package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ZLBCycleCompositePK implements Serializable{
	protected int ZC_CYCLE_NUM;
	protected String ZC_CYCLE_DATE;
	
	public ZLBCycleCompositePK(){
		
	}
	
	public ZLBCycleCompositePK(String ZC_CYCLE_DATE, int ZC_CYCLE_NUM){
		this.ZC_CYCLE_NUM = ZC_CYCLE_NUM;
		this.ZC_CYCLE_DATE = ZC_CYCLE_DATE;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof ZLBCycleCompositePK) && 
                 ((ZLBCycleCompositePK) o).getZC_CYCLE_NUM() == this.ZC_CYCLE_NUM &&
                 ((ZLBCycleCompositePK) o).getZC_CYCLE_DATE().equals(this.ZC_CYCLE_DATE) );
    }
	@Override
    public int hashCode() { 
        return ZC_CYCLE_NUM + ZC_CYCLE_DATE.hashCode() ; 
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
}
