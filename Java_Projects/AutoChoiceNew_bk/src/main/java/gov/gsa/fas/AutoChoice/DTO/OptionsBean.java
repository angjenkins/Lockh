package gov.gsa.fas.AutoChoice.DTO;





import java.util.List;

import gov.gsa.fas.AutoChoice.DTO.ContrLineDTO;



public class OptionsBean {

	ContrLineOptCheckDTO contrLineCheckDTO = null;
	List<ContrLineOptCheckDTO> contrLineOptCheckDTO = null;
	
	


	public ContrLineOptCheckDTO getContrLineCheckDTO() {
		return contrLineCheckDTO;
	}

	public void setContrLineCheckDTO(ContrLineOptCheckDTO contrLineCheckDTO) {
		this.contrLineCheckDTO = contrLineCheckDTO;
	}

	public List<ContrLineOptCheckDTO> getContrLineOptCheckDTO() {
		return contrLineOptCheckDTO;
	}

	public void setContrLineOptCheckDTO(
			List<ContrLineOptCheckDTO> contrLineOptCheckDTO) {
		this.contrLineOptCheckDTO = contrLineOptCheckDTO;
	}
//
//	public boolean equals( Object obj )
//	{
//		boolean flag = false;
//		OptionsBean other = ( OptionsBean )obj;
//		if( other.categoryCode.equals(categoryCode) )
//			flag = true;
//		return flag;
//	}
//	
//	public int hashCode() { return categoryCode.hashCode(); }
//	

	
	

}
