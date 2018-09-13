/*
 * @(#)ResponseXmlProcessor.java			Aug 30, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.response;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.response.beans.E_127;
import gov.gsa.fas.vision.dla.response.beans.E_143;
import gov.gsa.fas.vision.dla.response.beans.E_1705;
import gov.gsa.fas.vision.dla.response.beans.E_329;
import gov.gsa.fas.vision.dla.response.beans.E_337;
import gov.gsa.fas.vision.dla.response.beans.E_353;
import gov.gsa.fas.vision.dla.response.beans.E_373;
import gov.gsa.fas.vision.dla.response.beans.E_640;
import gov.gsa.fas.vision.dla.response.beans.E_96;
import gov.gsa.fas.vision.dla.response.beans.F_File_842AR;
import gov.gsa.fas.vision.dla.response.beans.ObjectFactory;
import gov.gsa.fas.vision.dla.response.beans.S_BNR;
import gov.gsa.fas.vision.dla.response.beans.S_SE;
import gov.gsa.fas.vision.dla.response.beans.S_ST;
import gov.gsa.fas.vision.dla.response.beans.T_842;

/**
 * <code>ResponseXmlProcessor</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class ResponseXmlProcessor {
	private static final Logger logger = Logger.getLogger(ResponseXmlProcessor.class.getName());
	
	private WsdrRequestData wsdrReqData;
	private CaseOutcomeData caseData;
	private T_842 t842;
	private SegmentCount segCnt;
	private ObjectFactory objectFactory = new ObjectFactory();
	
	public ResponseXmlProcessor(WsdrRequestData wsdrReqData, CaseOutcomeData caseData){
		this.wsdrReqData = wsdrReqData;
		this.caseData = caseData;
	}
	
	public String processResponseXml() throws VisionDlaException{
		logger.info ("generateResponseXml():Generating response XML for VisionDLAKey->" + caseData.getVisionDlaKey());
		if(wsdrReqData == null || caseData == null){
			logger.error("generateResponseXml(): WsdrRequest data or Case data is null");
			throw new VisionDlaException("Data not provided to generated resposne Xml");
		}
		t842 = new T_842();
		t842.setStandard("X12");
		segCnt = new SegmentCount();
//		setT_842();
		setTransactionSetHeader();
		setSBeginningSegmentForNonconformanceReport();
		LNameProcessor lNameProcessor = new LNameProcessor(t842, wsdrReqData, caseData, segCnt);
		lNameProcessor.setLName();
		LHierarchicalLevelProcessor lhlProcessor = new LHierarchicalLevelProcessor(
				t842, wsdrReqData, caseData, segCnt);
		lhlProcessor.setLHierarchicalLevel();
		setSTransactionSetTrailer();
		F_File_842AR fFile842AR = new F_File_842AR();
    List<T_842> t842List = fFile842AR.getT_Nonconformance_Report_842AR();
    t842List.add(t842);			
		String responseXml = ResponseXmlHelper.marshallResponse(fFile842AR);
		logger.info("generateResponseXml(): Generated resonse XML-> " + responseXml);
		return responseXml;
	}
	
	private void setT_842(){
		t842.setStandard("X12");
		t842.setCreatedBy("GSA");
		t842.setCreatedDate(Utility.getCurrentXMLGregCalendar());
		t842.setID("842");
		t842.setName("Nonconformance Report");
	}
	
	private void setTransactionSetHeader(){
		S_ST sst = new S_ST();
		E_143 e143 = new E_143();
		e143.setValue("842");
		E_329 e329 = new E_329();
		E_1705 e1705 = new E_1705();
		e1705.setValue("004030F842A0RA00");
		JAXBElement<E_1705> e1705Jaxb = objectFactory.
				createS_STE_Implementation_Convention_Reference(e1705);
		e329.setValue(wsdrReqData.getTransetControlNumber());
		sst.setE_Transaction_Set_Identifier_Code(e143);
		sst.setE_Transaction_Set_Control_Number(e329);
		sst.setE_Implementation_Convention_Reference(e1705Jaxb);
		t842.setS_Transaction_Set_Header(sst);
		segCnt.addSegmentCount();
	}
	
	private void setSBeginningSegmentForNonconformanceReport(){
		S_BNR sbnr = new S_BNR();
		E_353 e353 = new E_353();
		e353.setValue("11");
		E_127 e127 = new E_127();
		e127.setValue("Z");
		E_373 e373 = new E_373();
		e373.setValue(Utility.getNow("yyyyMMdd"));
		E_337 e337 = new E_337();
		e337.setValue(Utility.getNow("HHmmss"));
		E_640 e640 = new E_640();
		e640.setValue("SR");
		JAXBElement<E_640> e640Jaxb = objectFactory.
				createS_BNRE_Transaction_Type_Code(e640);
		
		sbnr.setE_Transaction_Set_Purpose_Code(e353);
		sbnr.setE_Reference_Identification(e127);
		sbnr.setE_Date(e373);
		sbnr.setE_Time(e337);
		sbnr.setE_Transaction_Type_Code(e640Jaxb);
		t842.setS_Beginning_Segment_For_Nonconformance_Report(sbnr);
		segCnt.addSegmentCount();
	}
	
	private void setSTransactionSetTrailer(){
		S_SE sse = new S_SE();
		E_96 e96 = new E_96();
		segCnt.addSegmentCount();
		e96.setValue(segCnt.getSegmentCount() + ""); 
		sse.setE_Number_Of_Included_Segments(e96);
		E_329 e329 = new E_329();
		e329.setValue(wsdrReqData.getTransetControlNumber());
		sse.setE_Transaction_Set_Control_Number(e329);
		t842.setS_Transaction_Set_Trailer(sse);
	}
}
