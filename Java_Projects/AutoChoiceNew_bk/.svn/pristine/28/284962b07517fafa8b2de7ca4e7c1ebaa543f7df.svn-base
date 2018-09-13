/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;


/**
 * @author Arnel Macatula
 *
 */

public class StatesZipCompositePK implements Serializable {
	
	protected String state = "";
	protected String zip = "";
	protected String city_Name = "";
	
	public StatesZipCompositePK(){
		
	}
	
	public StatesZipCompositePK(String state, String zip, String city_Name){
		this.state = state;
		this.zip = zip;
		this.city_Name = city_Name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((city_Name == null) ? 0 : city_Name.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatesZipCompositePK other = (StatesZipCompositePK) obj;
		if (city_Name == null) {
			if (other.city_Name != null)
				return false;
		} else if (!city_Name.equals(other.city_Name))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity_Name() {
		return city_Name;
	}

	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}

	
}