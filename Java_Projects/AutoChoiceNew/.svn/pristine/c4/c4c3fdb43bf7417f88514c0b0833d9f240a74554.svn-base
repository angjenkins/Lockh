/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;


/**
 * @author Arnel Macatula
 *
 */

import java.io.Serializable;


public class StdItmFedCompositePK implements Serializable{
	protected int group_DUNS = 0;
	protected String std_Item = "";
	protected String option_Code = "";
	protected String model = "";
	
	public StdItmFedCompositePK(){
		
	}
	
	public StdItmFedCompositePK(int group_DUNS, String std_Item, String option_Code, String model){
		this.group_DUNS = group_DUNS;
		this.std_Item = std_Item;
		this.option_Code = option_Code;
		this.model = model;
	}

	@Override
	public boolean equals(Object o) { 
        return ((o instanceof StdItmFedCompositePK) && 
                 ((StdItmFedCompositePK) o).getStd_Item().equals(this.std_Item) &&
                 ((StdItmFedCompositePK) o).getModel().equals(this.model) &&
                 ((StdItmFedCompositePK) o).getOption_Code().equals(this.option_Code) &&
                 ((StdItmFedCompositePK) o).getGroup_DUNS() == this.group_DUNS);
    }
	@Override
    public int hashCode() { 
        return std_Item.hashCode() + option_Code.hashCode() + model.hashCode() + group_DUNS; 
    }

	public int getGroup_DUNS() {
		return group_DUNS;
	}

	public void setGroup_DUNS(int group_DUNS) {
		this.group_DUNS = group_DUNS;
	}

	public String getStd_Item() {
		return std_Item;
	}

	public void setStd_Item(String std_Item) {
		this.std_Item = std_Item;
	}

	public String getOption_Code() {
		return option_Code;
	}

	public void setOption_Code(String option_Code) {
		this.option_Code = option_Code;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

	
	
		
}