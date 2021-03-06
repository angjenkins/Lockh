
package gov.gsa.fas.services.orderdiscrepancy.v1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "OrderDiscrepancyTransaction", targetNamespace = "http://fas.gsa.gov/services/OrderDiscrepancy/v1.0", wsdlLocation = "file:/C:/Users/premanandpeddachetty/workspace/FASeSOA/Order.Services/resources/wsdl/OrderDiscrepancyTransaction.wsdl")
public class OrderDiscrepancyTransaction_Service
    extends Service
{

    private final static URL ORDERDISCREPANCYTRANSACTION_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(gov.gsa.fas.services.orderdiscrepancy.v1.OrderDiscrepancyTransaction_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = gov.gsa.fas.services.orderdiscrepancy.v1.OrderDiscrepancyTransaction_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Users/premanandpeddachetty/workspace/FASeSOA/Order.Services/resources/wsdl/OrderDiscrepancyTransaction.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Users/premanandpeddachetty/workspace/FASeSOA/Order.Services/resources/wsdl/OrderDiscrepancyTransaction.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ORDERDISCREPANCYTRANSACTION_WSDL_LOCATION = url;
    }

    public OrderDiscrepancyTransaction_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderDiscrepancyTransaction_Service() {
        super(ORDERDISCREPANCYTRANSACTION_WSDL_LOCATION, new QName("http://fas.gsa.gov/services/OrderDiscrepancy/v1.0", "OrderDiscrepancyTransaction"));
    }

    /**
     * 
     * @return
     *     returns OrderDiscrepancyTransaction
     */
    @WebEndpoint(name = "OrderDiscrepancyTransactionBinding")
    public OrderDiscrepancyTransaction getOrderDiscrepancyTransactionBinding() {
        return super.getPort(new QName("http://fas.gsa.gov/services/OrderDiscrepancy/v1.0", "OrderDiscrepancyTransactionBinding"), OrderDiscrepancyTransaction.class);
    }

}
