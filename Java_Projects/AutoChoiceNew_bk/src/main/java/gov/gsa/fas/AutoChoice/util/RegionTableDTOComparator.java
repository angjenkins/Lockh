package gov.gsa.fas.AutoChoice.util;


import gov.gsa.fas.AutoChoice.DTO.RegionTableDTO;

import java.util.Comparator;

public class RegionTableDTOComparator implements Comparator<RegionTableDTO>
{
    public int compare(RegionTableDTO o1, RegionTableDTO o2)
    {
       return o1.getRegionInt().compareTo(o2.getRegionInt());
    }
}
