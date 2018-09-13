package gov.gsa.fas.AutoChoice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import gov.gsa.fas.AutoChoice.DAO.MinimumDAO;
import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemVerbiageDTO;
import gov.gsa.fas.AutoChoice.DTO.VehTypeDTO;
import gov.gsa.fas.AutoChoice.beans.CommonBean;
import gov.gsa.fas.AutoChoice.beans.MinimumBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("request")
public class MinimumService {

	@Autowired
	private MinimumBean minimumBean;
	
	@Autowired
	private CommonBean commonBean;

	@Autowired
	private MinimumDAO minimumDAO;

	public void getMinimumReqList(StdItemDTO dto) {
		try {

			List<Map<String, Object>> minimumList = minimumDAO.getMinimumList(dto);

			Map<String, Map<String, String>> stdOptionsMap = new HashMap<String, Map<String, String>>();
			Map<String, Map<String, String>> stdOptionsValueMap = new HashMap<String, Map<String, String>>();
			List<String> model = new ArrayList<String>();
			commonBean.setStdItem(null);
			commonBean.setStdItemDescription(null);
			
			for (Map<String, Object> minimumRow : minimumList) {
				String key = minimumRow.get("Category_Name").toString();

				if (stdOptionsMap.get(key) == null) {
					stdOptionsMap.put(key, new HashMap<String, String>());
				}
				
				if (stdOptionsMap.get(key).get(
						minimumRow.get("Description").toString())==null) {
					stdOptionsMap.get(key).put(
							minimumRow.get("Description").toString(),minimumRow.get("Fed_Value_Current").toString());
				}

				if (stdOptionsValueMap.get(minimumRow.get("Description").toString()) == null) {
					stdOptionsValueMap.put(minimumRow.get("Description").toString(), new HashMap<String, String>());
				}

				if (stdOptionsValueMap.get(minimumRow.get("Description").toString()).get(minimumRow.get("Model").toString()) == null) {
					stdOptionsValueMap.get(minimumRow.get("Description").toString()).put(
							minimumRow.get("Model").toString(),
							minimumRow.get("Fed_Value_Next").toString());
				}

				if (!model.contains(minimumRow.get("Model").toString())) {
					model.add(minimumRow.get("Model").toString());
				}
				
				if(commonBean.getStdItem()==null)
				{
					commonBean.setStdItem(minimumRow.get("Std_Item").toString());
					commonBean.setStdItemDescription(minimumRow.get("std_item_description").toString());
				}
					
			}
			
			minimumBean.setModel(model);
			minimumBean.setStdOptions(stdOptionsMap);
			minimumBean.setStdOptionsValues(stdOptionsValueMap);
			
//			for (Map.Entry<String, Map<String, String>> entry : stdOptionsValueMap
//					.entrySet()) {
//				System.out.println(entry.getKey());
//				System.out.println("-----------------");
//				for (Map.Entry<String, String> value : entry.getValue()
//						.entrySet()) {
//					System.out.println(value.getKey() + "/" + value.getValue());
//				}
//				System.out.println("********************");
//			}
//
//			System.out.println("====================");
//
//			for (Map.Entry<String, Map<String, String>> entry : stdOptionsMap
//					.entrySet()) {
//				System.out.println(entry.getKey());
//				System.out.println("-----------------");
//				for (Map.Entry<String, String> value : entry.getValue()
//						.entrySet()) {
//				
//					System.out.println(value.getKey() + "/" + value.getValue());
//				}
//				System.out.println("********************");
//			}
//
//			System.out.println("====================");
//
//			for (String value : model) {
//				System.out.println(value);
//			}
//			System.out.println("********************");
//
//			// minimumBean.setStdOptions(stdOptions);
//			// minimumBean.setContOptionValues(contOptionValues);*/
//
//			/*
//			 * for(Map<String,Object> minimumRow:minimumList){ for
//			 * (Map.Entry<String, Object> entry : minimumRow.entrySet()) {
//			 * System.out.println(entry.getKey() + "/" +
//			 * entry.getValue().toString()); } }
//			 */

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

 
}