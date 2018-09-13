package test.mtom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "AttachmentWS", targetNamespace = "http://fas.gsa.gov/services/Attachment/v1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AttachmentWS {
   /**
    * 
    * @param attachment
    * @return
    *     returns boolean
    * @throws ServiceFault
    */
   @WebMethod
   public void upload( 
		   @WebParam(name="file",targetNamespace = "http://fas.gsa.gov/services/Attachment/v1.0") byte[] imageBytes );

}
