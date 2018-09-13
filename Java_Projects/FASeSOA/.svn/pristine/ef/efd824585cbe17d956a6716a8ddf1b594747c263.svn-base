/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.dao;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.apache.log4j.Logger;

import gov.gsa.fas.services.common.PropertyConstants;
import gov.gsa.fas.services.common.ServicesProperties;
import gov.gsa.fas.webservicesb.program.fss19wsprg.ProgramFSS19WSPRGPort;
import gov.gsa.fas.webservicesb.program.fss19wsprg.ProgramFSS19WSPRGService;

/**
 * @author zabelc
 *
 */
public class WdcOrderPartDaoWsImplFactory extends AbstractWdcOrderPartDaoFactory {
	private final static Logger logger = Logger.getLogger(WdcOrderPartDaoWsImplFactory.class.getName());
	private static String fss19ServiceUrl=ServicesProperties.getPropertyValue(PropertyConstants.FSS19_SERVICE_URL);
	
	private ProgramFSS19WSPRGPort programFSS19WSPRGPort;

	private void createProgramFSS19WSPRGPort(URL wsdlLocationUrl){
		logger.info("createProgramFSS19WSPRGPort(): FSS19 Service URL->" + fss19ServiceUrl);
		QName serviceQName = new QName("http://webservicesb.fas.gsa.gov/Program/FSS19WSPRG", 
				"ProgramFSS19WSPRGService");
		Service srvc = Service.create(wsdlLocationUrl, serviceQName);
		this.programFSS19WSPRGPort = srvc.getPort(ProgramFSS19WSPRGPort.class);
    BindingProvider bp = (BindingProvider)programFSS19WSPRGPort;
    bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, fss19ServiceUrl);	
	}
	
	public WdcOrderPartDaoWsImplFactory(){
		URL wsdlUrl = this.getClass().getResource("/wsdl/FSS19WS.wsdl");
		createProgramFSS19WSPRGPort(wsdlUrl);
	}
	
	public WdcOrderPartDao createWdcOrderPartDao(String recordType, boolean useOrderSuffix, String recordSuffix){
		return new WdcOrderPartDaoWsImpl(this.programFSS19WSPRGPort, recordType, useOrderSuffix, recordSuffix);
	}

}
