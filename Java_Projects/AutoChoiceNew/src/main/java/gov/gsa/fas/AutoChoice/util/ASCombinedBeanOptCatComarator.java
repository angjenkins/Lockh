package gov.gsa.fas.AutoChoice.util;

import gov.gsa.fas.AutoChoice.DTO.ASCombinedDTO;

import java.util.Comparator;

public class ASCombinedBeanOptCatComarator implements Comparator<ASCombinedDTO>
{
    public int compare(ASCombinedDTO o1, ASCombinedDTO o2)
    {
       return o1.getOptCat_categoryName().compareTo(o2.getOptCat_categoryName());
   }
}
