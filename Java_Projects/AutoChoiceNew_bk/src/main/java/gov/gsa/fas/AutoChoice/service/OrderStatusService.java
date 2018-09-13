package gov.gsa.fas.AutoChoice.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import gov.gsa.fas.AutoChoice.DAO.OrderStatusDAO;
import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.OrderStatusCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.OrderStatusDTO;
import gov.gsa.fas.AutoChoice.DTO.ReportEmailDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.beans.LoginBean;
import gov.gsa.fas.AutoChoice.beans.OrderStatusBean;
import gov.gsa.fas.AutoChoice.util.UtilsLib;
import gov.gsa.fas.AutoChoice.util.SendMail;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Scope("request") 
public class OrderStatusService {
	private OrderStatusDAO orderStatusDAO = new OrderStatusDAO();
	
	public ArrayList<OrderStatusCombinedDTO> getOrderStatusVehReceiptList(OrderStatusBean orderStatusBean, UserAccountDTO user){
		ArrayList<OrderStatusCombinedDTO> returnList = new ArrayList<OrderStatusCombinedDTO>();
		try{
			returnList = orderStatusDAO.fetchVehReceiptList(orderStatusBean, user);			
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch Vehcile Receipt list failed: " + ex.getMessage());
		}
		return returnList;
	}
	
	public ArrayList<RequisitionsDTO> getOrderStatusReqAgOrdNoList(OrderStatusBean orderStatusBean){
		ArrayList<RequisitionsDTO> returnList = new ArrayList<RequisitionsDTO>();
		try{
			returnList = orderStatusDAO.fetchRequisitionsAgOrdNo(orderStatusBean.getSearchKey1());			
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch Req by Agency Order list failed: " + ex.getMessage());
		}
		return returnList;
	}
	
	public ArrayList<OrderStatusCombinedDTO> getOrderStatusReqList(OrderStatusBean orderStatusBean){
		ArrayList<OrderStatusCombinedDTO> returnList = new ArrayList<OrderStatusCombinedDTO>();
		try{
			returnList = orderStatusDAO.fetchOrderStatusReqList(orderStatusBean);	
			if(returnList.get(0).getContr_case_order_date() != null){
				orderStatusBean.setOrderDate(returnList.get(0).getContr_case_order_date());
			}
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch Req list failed: " + ex.getMessage());
		}
		return returnList;
	}
	
	public ArrayList<OrderStatusCombinedDTO> getOrderStatusPartialVINList(OrderStatusBean orderStatusBean, UserAccountDTO user){
		ArrayList<OrderStatusCombinedDTO> returnList = new ArrayList<OrderStatusCombinedDTO>();
		try{
			returnList = orderStatusDAO.fetchOrderStatusPartialVINList(orderStatusBean, user);	
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch partial VIN list failed: " + ex.getMessage());
		}
		return returnList;
	}
	
	public ArrayList<OrderStatusCombinedDTO> getOrderStatusList(OrderStatusBean orderStatusBean){
		ArrayList<OrderStatusCombinedDTO> returnList = new ArrayList<OrderStatusCombinedDTO>();
		try{
			returnList = orderStatusDAO.fetchOrderStatusList(orderStatusBean);
			if(returnList != null && returnList.size() > 0){
				for(int inx = 0 ; inx < returnList.size(); inx++){
					if(returnList.get(inx).getOrder_status_status().equals("IN")){
						returnList.get(inx).setOrder_status_status_display("In Process");
					}
					else if(returnList.get(inx).getOrder_status_status().equals("SP")){
						returnList.get(inx).setOrder_status_status_display("Scheduled For Production");
					}
					else if(returnList.get(inx).getOrder_status_status().equals("AN")){
						returnList.get(inx).setOrder_status_status_display("Available Now- No Shipping Schedule");
					}
					else if(returnList.get(inx).getOrder_status_status().equals("CC")){
						returnList.get(inx).setOrder_status_status_display("Shipped");
					}
					else if(returnList.get(inx).getOrder_status_status().equals("DD")){
						returnList.get(inx).setOrder_status_status_display("Delivered");
					}
					else if(returnList.get(inx).getOrder_status_status().equals("DE")){
						returnList.get(inx).setOrder_status_status_display("Order Canceled");
					}
					else if(returnList.get(inx).getOrder_status_status().equals("BB")){
						returnList.get(inx).setOrder_status_status_display("Ordered");
					}
					else if(returnList.get(inx).getOrder_status_status().equals("D1")){
						returnList.get(inx).setOrder_status_status_display("D1");
					}
					else if(returnList.get(inx).getOrder_status_status().equals("J")){
						returnList.get(inx).setOrder_status_status_display("Built");
					}
					else if(returnList.get(inx).getOrder_status_status().equals("KZ")){
						returnList.get(inx).setOrder_status_status_display("At Dealer");
					}
					else if(returnList.get(inx).getOrder_status_status().equals("ZA")){
						returnList.get(inx).setOrder_status_status_display("ZA");
					}
				}
			}
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch main list failed: " + ex.getMessage());
		}
		return returnList;
	}
	
	public String setDateAgReceived(OrderStatusBean orderStatusBeanRequest, OrderStatusBean orderStatusBean, UserAccountDTO user){
		String returnMessage= "";
		
		try{
			int count = 0;
			for(OrderStatusCombinedDTO dto : orderStatusBeanRequest.getOrderStatusVehReceiptList()){
				if(dto.isEditRow()){
					count = dto.getCounter();
					OrderStatusDTO newDTO = new OrderStatusDTO();
					newDTO.setVeh_Order_No(dto.getOrder_status_von());
					newDTO.setCaseNo(dto.getCase_number());
					newDTO.setVIN(dto.getOrder_status_vin());
					newDTO.setAgReceivedDate(UtilsLib.formatStringToTimestamp(dto.getOrder_status_date_ag_received_string()));
					newDTO.setAgUpdateDate(UtilsLib.getCurrentTS());
					newDTO.setAgUpdateUser(user.getUserID());
					
					newDTO.setContract(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_contract());
					newDTO.setStatus(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_status());
					newDTO.setName(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_name());
					newDTO.setAddress(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_address());
					newDTO.setCity(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_city());
					newDTO.setState(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_state());
					newDTO.setZip(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_zip());
					newDTO.setZipSuffix(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_sfx());
					newDTO.setStatusDate(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_status_date());
					newDTO.setUpdatedDate(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_date_updated());
					newDTO.setOrigStatusDate(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_orig_status_date());
					newDTO.setContactName(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_contact_name());
					newDTO.setContactTelNumber(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_contact_telnum());
					newDTO.setShipmentDate(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_shipment_date());
					newDTO.setDeliveryDate(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_delivery_date());
					newDTO.setWeightRating(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_weight_rating());
					newDTO.setFuelType(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_fuel_type());
					newDTO.setGpm(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_gpm());
					newDTO.setMpgB(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_mpg_b());
					newDTO.setMpgC(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_mpg_c());
					newDTO.setMpgH(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_mpg_h());
					newDTO.setFlexGPM(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_flex_gpm());
					newDTO.setFlexFuelMPGB(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_flex_fuel_mpg_b());
					newDTO.setFlexFuelMPGC(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_flex_fuel_mpg_c());
					newDTO.setFlexFuelMPGH(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_flex_fuel_mpg_h());
					newDTO.setVehColor(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_veh_color());
					newDTO.setVehTrim(orderStatusBean.getOrderStatusVehReceiptList().get(count).getOrder_status_veh_trim());
					
					orderStatusDAO.setOrderStatus(newDTO);
				}
			}
		}
		catch(Exception ex){
			returnMessage = "Order Status set Date Agency Received failed: " + ex.getMessage();
		}
		return returnMessage;
	}
	
	public boolean checkAgencyBureau(OrderStatusBean orderStatusBean, UserAccountDTO user){
		boolean valid = false;
		if(orderStatusBean.getOrderStatusVehReceiptList().get(0).getReq_agency_code() == user.getAgencyCode() &&
				orderStatusBean.getOrderStatusVehReceiptList().get(0).getReq_bureau_code() == user.getBureauCode()){
			valid = true;
		}
		return valid;
		
	}
	
	public boolean checkReqCartStatus(OrderStatusBean orderStatusBean) throws Exception{
		boolean returnValue = false;
		try{
			String status = "";
			status = orderStatusDAO.fetchRequisitionsCartStatus(orderStatusBean);
			if(status != null && status.equals("2")){
				returnValue = true;
			}
		}
		catch(Exception ex){
			throw ex;			
		}
		return returnValue;
	}
	
	public String getReqCartRemarks(String caseNo) throws Exception{
		String returnValue = "";
		try{
			returnValue = orderStatusDAO.fetchRequisitionsCartRemarks(caseNo);
		}
		catch(Exception ex){
			throw ex;			
		}
		return returnValue;
	}
	
	public void checkCase(OrderStatusBean orderStatusBean, UserAccountDTO user){
		try{
			if(!user.getPrivilege().equals("6")){
				if(!orderStatusBean.getOrderStatusList().get(0).getReq_agency_code().equals(user.getAgencyCode()) ||
						!orderStatusBean.getOrderStatusList().get(0).getReq_bureau_code().equals(user.getBureauCode())){
					orderStatusBean.setReturnMessage("This case does not belong to your agency/bureau");
					orderStatusBean.getOrderStatusVehReceiptList().clear();
					orderStatusBean.getOrderStatusList().clear();
				}
			}
			if(orderStatusBean.getOrderStatusList() != null &&
					orderStatusBean.getOrderStatusList().size() > 0 ){
				if(orderStatusBean.getOrderStatusList().get(0).getReq_Date_Canceled() != null && 
					orderStatusBean.getOrderStatusList().get(0).getReq_Date_Canceled().toString().trim().length() > 0){
						orderStatusBean.setReturnMessage2("CANCELED");
				}
				else if(checkReqCartStatus(orderStatusBean)){
					orderStatusBean.setReturnMessage2("Finalized Order Has NOT Been Submitted to GSA Automotive");
				}
			}
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch req cart status failed: " + ex.getMessage());
		}
	}
	
	public void checkCOVCase(OrderStatusBean orderStatusBean, UserAccountDTO user){
		try{
			if(!user.getPrivilege().equals("6")){
				if(!orderStatusBean.getCovList().get(0).getReq_agency_code().equals(user.getAgencyCode()) ||
						!orderStatusBean.getCovList().get(0).getReq_bureau_code().equals(user.getBureauCode())){
					orderStatusBean.setReturnMessage("This case does not belong to your agency/bureau.");
					orderStatusBean.getCovList().clear();
				}
			}
			else if(orderStatusBean.getCovList() != null &&
					orderStatusBean.getCovList().size() > 0 &&
					orderStatusBean.getCovList().get(0).getDaysCOV() < 30){
				orderStatusBean.setReturnMessage("You cannot request a COV until 30 days after the shipment date of the vehicle.");
				orderStatusBean.getCovList().clear();
			}
			else if(orderStatusBean.getCovList() != null &&
					orderStatusBean.getCovList().size() > 0 ){
				if(orderStatusBean.getCovList().get(0).getReq_Date_Canceled() != null && 
					orderStatusBean.getCovList().get(0).getReq_Date_Canceled().toString().trim().length() > 0){
						orderStatusBean.setReturnMessage2("CANCELED");
				}
				else if(checkReqCartStatus(orderStatusBean)){
					orderStatusBean.setReturnMessage2("Finalized Order Has NOT Been Submitted to GSA Automotive");
				}
			}
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch COV list failed: " + ex.getMessage());
		}
	}
	
	public ArrayList<AgBuTableDTO> getAgbuTable(OrderStatusBean orderStatusBean, String agencyCode, String bureauCode){
		ArrayList<AgBuTableDTO> returnList = new ArrayList<AgBuTableDTO>();
		try{
			returnList = orderStatusDAO.fetchAgBuTable(agencyCode, bureauCode);
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch req cart status failed: " + ex.getMessage());
		}
		return returnList;
	}
	
	public void loadOrderStatusMain(OrderStatusBean orderStatusBean, LoginBean loginBean){
		try{
			orderStatusBean.setReturnMessage("");
			//this.orderStatusBean.setPrivilege(getLoginBean().getCurrentUser().getPrivilege());
			orderStatusBean.setOrderStatusList(getOrderStatusReqList(orderStatusBean));
			orderStatusBean.setOrderStatusVehReceiptList(getOrderStatusList(orderStatusBean));
			if(orderStatusBean.getOrderStatusVehReceiptList().size() > 0){
				orderStatusBean.setCaseNumber(orderStatusBean.getOrderStatusVehReceiptList().get(0).getCase_number());				
				checkCase(orderStatusBean, loginBean.getCurrentUser()); 
			}
			if(orderStatusBean.getOrderStatusList().size() > 0){
				if(orderStatusBean.getOrderStatusList().get(0).getReq_Source().equalsIgnoreCase("A")){
					orderStatusBean.getOrderStatusList().get(0).setReq_cart_remarks(getReqCartRemarks(orderStatusBean.getOrderStatusList().get(0).getCase_number()));
				}
			}
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status load main failed: " + ex.getMessage());
		}
	}
	
	public void loadCOV(OrderStatusBean orderStatusBean, UserAccountDTO user){
		orderStatusBean.setCovList(getCOVList(orderStatusBean));
		if(orderStatusBean.getCovList() != null && orderStatusBean.getCovList().size() > 0){
			checkCOVCase(orderStatusBean,user);
			if(orderStatusBean.getCovList() != null && orderStatusBean.getCovList().size() > 0){
				//passed validation
				//get Report Email list.  
				orderStatusBean.setCaseNumber(orderStatusBean.getCovList().get(0).getCase_number());
				orderStatusBean.setReportEmailList(getReportEmailTable(orderStatusBean));
				setEmailLists(orderStatusBean, user);
				
				if(orderStatusBean.getCovList().get(0).getContrduns_group_duns().equals("1")){
					orderStatusBean.setReturnMessage("You cannot request a COV for this vehicle since it belongs to GROUP DUNS 1. Please call 703-605-CARS or email vehicle.buying@gsa.gov");
				}
				else if(orderStatusBean.getToEmailList() == null || orderStatusBean.getToEmailList().size() < 1){
					orderStatusBean.setReturnMessage("You cannot request a COV for this vehicle. Please call 703-605-CARS or email vehicle.buying@gsa.gov.");
				}
				else{
					orderStatusBean.setReturnMessage("If you do not know the VIN number. Call 703-605-CARS or email vehicle.buying@gsa.gov.");
				}
				
				orderStatusBean.setVinList(getVINList(orderStatusBean));
			}
		}
	}
	
	public ArrayList<OrderStatusCombinedDTO> getContrCaseList(OrderStatusBean orderStatusBean){
		ArrayList<OrderStatusCombinedDTO> returnList = new ArrayList<OrderStatusCombinedDTO>();
		try{
			returnList = orderStatusDAO.fetchContrCase(orderStatusBean);	
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch Contr_Case list failed: " + ex.getMessage());
		}
		return returnList;
	}
	
	public ArrayList<OrderStatusCombinedDTO> getContractLineOptionList(OrderStatusBean orderStatusBean){
		ArrayList<OrderStatusCombinedDTO> returnList = new ArrayList<OrderStatusCombinedDTO>();
		try{
			returnList = orderStatusDAO.fetchContrLineOption(orderStatusBean);	
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch Contract Line Option list failed: " + ex.getMessage());
		}
		return returnList;
	}
	
	public ArrayList<OrderStatusCombinedDTO> getCOVList(OrderStatusBean orderStatusBean){
		ArrayList<OrderStatusCombinedDTO> returnList = new ArrayList<OrderStatusCombinedDTO>();
		try{
			returnList = orderStatusDAO.fetchCOVReq(orderStatusBean);	
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch COV list failed: " + ex.getMessage());
		}
		return returnList;
	}
	
	public ArrayList<ReportEmailDTO> getReportEmailTable(OrderStatusBean orderStatusBean){
		ArrayList<ReportEmailDTO> returnList = new ArrayList<ReportEmailDTO>();
		try{
			returnList = orderStatusDAO.fetchReportEmailTable(orderStatusBean.getCovList().get(0).getContrduns_group_duns());
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch req cart status failed: " + ex.getMessage());
		}
		return returnList;
	}
	
	public void setEmailLists(OrderStatusBean orderStatusBean, UserAccountDTO user){
		if(orderStatusBean.getToEmailList() == null){
			orderStatusBean.setToEmailList(new ArrayList<String>());
			orderStatusBean.setCcEmailList(new ArrayList<String>());
		}
		for(ReportEmailDTO dto : orderStatusBean.getReportEmailList()){
			if(dto.getType_Delivery().equals("T")){
				orderStatusBean.getToEmailList().add(dto.getEmail());
			}
			else if(dto.getType_Delivery().equals("C")){
				orderStatusBean.getCcEmailList().add(dto.getEmail());
			}
		}
		orderStatusBean.getCcEmailList().add(user.getEmail());
		orderStatusBean.setFromEmail(user.getEmail());
		
	}
	
	public ArrayList<String> getVINList(OrderStatusBean orderStatusBean){
		ArrayList<String> returnList = new ArrayList<String>();
		try{
			returnList = orderStatusDAO.fetchVINList(orderStatusBean);	
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Order Status fetch VIN list failed: " + ex.getMessage());
		}
		return returnList;
	}
	
	public void setCCEmails(OrderStatusBean orderStatusBean){
		try{
			if(orderStatusBean.getSearchFrom().trim().length() > 0){
				if(orderStatusBean.getSearchFrom().contains(",")){
					 for(String ccAddress : orderStatusBean.getSearchFrom().split(",")){
						 orderStatusBean.getCcEmailList().add(ccAddress);
					 }
				}
				else{
					orderStatusBean.getCcEmailList().add(orderStatusBean.getSearchFrom());
				}
			}	
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Setting CC email list failed: " + ex.getMessage());			
		}
	}
	 public void sendCOVEmail(OrderStatusBean orderStatusBean){
		 try{
			 SendMail sendMail = new SendMail();
			 StringBuffer message = new StringBuffer();
			 if(orderStatusBean.getToEmailList() != null && orderStatusBean.getToEmailList().size() > 0){
					
				 message.append("<table> ");
				 message.append("	<tr>");
				 message.append("		<td>I am  requesting  a duplicate Certificate of Origin for vehicle:</td>");
				 message.append("	</tr>");
				 message.append("	<tr><td>&nbsp;</td></tr>");
				 message.append("	<tr>");
				 message.append("		<td><b>VIN</b>                :  ");
				 message.append(orderStatusBean.getVinSelected());
				 message.append("		</td>");
				 message.append("	</tr>");
				 message.append("	<tr><td>&nbsp;</td></tr>");
				 message.append("	<tr>");
				 message.append("		<td><b>Requisition Number </b>:  ");
				 message.append(orderStatusBean.getCovList().get(0).getReq_fed_mil_req_1() + "-" + orderStatusBean.getCovList().get(0).getReq_fed_mil_req_2() + "-" + orderStatusBean.getCovList().get(0).getReq_fed_mil_req_3());
				 message.append("		</td>");
				 message.append("	</tr>");
				 message.append("	<tr><td>&nbsp;</td></tr>");
				 message.append("	<tr>");
				 message.append("		<td><b>Caseno</b>: ");
				 message.append(orderStatusBean.getCovList().get(0).getCase_number());
				 message.append("		</td>");
				 message.append("	</tr>");
				 message.append("	<tr><td>&nbsp;</td></tr>");
				 message.append("	<tr>");
				 message.append("		<td><b>Contract</b>         :");  
				 message.append(orderStatusBean.getCovList().get(0).getContr_case_contract());
				 message.append("</td>");
				 message.append("	</tr>");
				 message.append("	<tr><td>&nbsp;</td></tr>");
				 message.append("	<tr>");
				 message.append("		<td><b>Model</b>              : "); 
				 message.append(orderStatusBean.getCovList().get(0).getReq_model());
				 message.append("		</td>");
				 message.append("	</tr>");
				 message.append("</table>");
				 message.append("<table>	");
				 message.append("	<tr><td colspan='2'>&nbsp;</td></tr>");
				 message.append("	<tr>");
				 message.append("		<td><b>Mailing Address </b>   :</td>");
				 message.append("	    <td>");
				 message.append(orderStatusBean.getCovList().get(0).getReq_Mail_Add_Line1());
				 message.append("		</td>");
				 message.append("	</tr>");
				 if(orderStatusBean.getCovList().get(0).getReq_Mail_Add_Line2().trim().length() > 0){
					 message.append("<tr>");
					 message.append("<td>&nbsp;</td>");
					 message.append("<td>");
					 message.append(orderStatusBean.getCovList().get(0).getReq_Mail_Add_Line2());
					 message.append(" </td>");
					 message.append("</tr>");
				 }
				 if(orderStatusBean.getCovList().get(0).getReq_Mail_Add_Line3().trim().length() > 0){
					 message.append("<tr>");
					 message.append("<td>&nbsp;</td>");
					 message.append("<td>");
					 message.append(orderStatusBean.getCovList().get(0).getReq_Mail_Add_Line3());
					 message.append(" </td>");
					 message.append("</tr>");
				 }
				 if(orderStatusBean.getCovList().get(0).getReq_Mail_Add_Line4().trim().length() > 0){
					 message.append("<tr>");
					 message.append("<td>&nbsp;</td>");
					 message.append("<td>");
					 message.append(orderStatusBean.getCovList().get(0).getReq_Mail_Add_Line4());
					 message.append(" </td>");
					 message.append("</tr>");
				 }
			
				 message.append("<tr>");
				 message.append("<td>&nbsp;</td>");
				 message.append("<td>  ");
				 message.append(orderStatusBean.getCovList().get(0).getReq_Mail_Add_City());
				 message.append(",");
				 message.append(orderStatusBean.getCovList().get(0).getReq_Mail_Add_State() + " "); 
				 message.append(orderStatusBean.getCovList().get(0).getReq_Mail_Add_Zip() + "-" + orderStatusBean.getCovList().get(0).getReq_Mail_Add_Zip_Sfx());
				 message.append("</td>");
				 message.append("</tr>");
				 message.append("<tr>");
				 message.append("<td>&nbsp;</td>");
				 message.append("<td>  ");
				 message.append(orderStatusBean.getCovList().get(0).getReq_Mail_Add_Country()); 
				 message.append("</td>");
				 message.append("</tr>");
				 message.append("<tr><td colspan='2'>&nbsp;</td></tr>	");					
				 message.append("<tr>");
				 message.append("<td>  ");
				 message.append("<b>My Email Address </b>   : ");
				 message.append("</td>");
				 message.append("	  <td>");
				 message.append(orderStatusBean.getFromEmail());
				 message.append("	  </td>");
				 message.append("	</tr>");
				 message.append("		<tr>");
				 message.append("	  <td>  ");
				 message.append("	<b>Reasons :</b>   : ");
				 message.append("   </td>");
				 message.append("	  <td>");
				 message.append(orderStatusBean.getReason());
				 message.append("	  </td>");
				 message.append("	</tr>");
				 message.append("  </table>");				 			
				
				String attachmentPath=null;
				
				StringBuffer toEmailString = new StringBuffer();
				StringBuffer ccEmailString = new StringBuffer();
				boolean toFirst = true;
				if(orderStatusBean.getToEmailList().size() > 0){
					for(String toEmail : orderStatusBean.getToEmailList()){
						if(toFirst){
							toFirst = false;
						}
						else{
							toEmailString.append(",");
						}						
						toEmailString.append(toEmail);
					}
				}
				boolean ccFirst = true;
				if(orderStatusBean.getCcEmailList().size() > 0){
					for(String ccEmail : orderStatusBean.getCcEmailList()){
						if(ccFirst){
							ccFirst = false;
						}
						else{
							ccEmailString.append(",");
						}						
						ccEmailString.append(ccEmail);
					}
				}
				String subject = "Request for Certificate of Origin (COV)";
				
				//sendMail.sendEmail(orderStatusBean.getFromEmail(), toEmailString.toString(),ccEmailString.toString(), subject, message.toString(), attachmentPath);
				sendMail.sendEmail("henry.ahn@gsa.gov", "henry.ahn@gsa.gov,elizabeth.ruiz@gsa.gov","henry.ahn@gsa.gov", subject, message.toString(), attachmentPath);
			 }
			 else{
				 orderStatusBean.setReturnMessage("Cannot send email.  No recipients listed.");
			 }
		}
		catch(Exception ex){
			orderStatusBean.setReturnMessage("Sending COV email failed: " + ex.getMessage());			
		}
	 }
}
