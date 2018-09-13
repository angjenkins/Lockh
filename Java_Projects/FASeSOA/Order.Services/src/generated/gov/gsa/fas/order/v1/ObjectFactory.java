
package gov.gsa.fas.order.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.order.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Order_QNAME = new QName("http://fas.gsa.gov/Order/v1.0", "order");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.order.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FulfillmentMethod }
     * 
     */
    public FulfillmentMethod createFulfillmentMethod() {
        return new FulfillmentMethod();
    }

    /**
     * Create an instance of {@link AssociatedAgencyCodes }
     * 
     */
    public AssociatedAgencyCodes createAssociatedAgencyCodes() {
        return new AssociatedAgencyCodes();
    }

    /**
     * Create an instance of {@link WdcOrderedItemDetails }
     * 
     */
    public WdcOrderedItemDetails createWdcOrderedItemDetails() {
        return new WdcOrderedItemDetails();
    }

    /**
     * Create an instance of {@link WdcFullfilledItemDetails }
     * 
     */
    public WdcFullfilledItemDetails createWdcFullfilledItemDetails() {
        return new WdcFullfilledItemDetails();
    }

    /**
     * Create an instance of {@link ItemNumber }
     * 
     */
    public ItemNumber createItemNumber() {
        return new ItemNumber();
    }

    /**
     * Create an instance of {@link Store }
     * 
     */
    public Store createStore() {
        return new Store();
    }

    /**
     * Create an instance of {@link ExportInfo }
     * 
     */
    public ExportInfo createExportInfo() {
        return new ExportInfo();
    }

    /**
     * Create an instance of {@link Order.LineItemList }
     * 
     */
    public Order.LineItemList createOrderLineItemList() {
        return new Order.LineItemList();
    }

    /**
     * Create an instance of {@link EddRequisitionNumber }
     * 
     */
    public EddRequisitionNumber createEddRequisitionNumber() {
        return new EddRequisitionNumber();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link WdcProcessStage }
     * 
     */
    public WdcProcessStage createWdcProcessStage() {
        return new WdcProcessStage();
    }

    /**
     * Create an instance of {@link ItemQuantity }
     * 
     */
    public ItemQuantity createItemQuantity() {
        return new ItemQuantity();
    }

    /**
     * Create an instance of {@link CscItemDetails }
     * 
     */
    public CscItemDetails createCscItemDetails() {
        return new CscItemDetails();
    }

    /**
     * Create an instance of {@link RequisitionPriority }
     * 
     */
    public RequisitionPriority createRequisitionPriority() {
        return new RequisitionPriority();
    }

    /**
     * Create an instance of {@link OrderNumber }
     * 
     */
    public OrderNumber createOrderNumber() {
        return new OrderNumber();
    }

    /**
     * Create an instance of {@link WdcConsignee }
     * 
     */
    public WdcConsignee createWdcConsignee() {
        return new WdcConsignee();
    }

    /**
     * Create an instance of {@link Liid }
     * 
     */
    public Liid createLiid() {
        return new Liid();
    }

    /**
     * Create an instance of {@link Transportation }
     * 
     */
    public Transportation createTransportation() {
        return new Transportation();
    }

    /**
     * Create an instance of {@link ShipmentData }
     * 
     */
    public ShipmentData createShipmentData() {
        return new ShipmentData();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link WdcProcessStageList }
     * 
     */
    public WdcProcessStageList createWdcProcessStageList() {
        return new WdcProcessStageList();
    }

    /**
     * Create an instance of {@link LineItem }
     * 
     */
    public LineItem createLineItem() {
        return new LineItem();
    }

    /**
     * Create an instance of {@link ActivityAddressCode }
     * 
     */
    public ActivityAddressCode createActivityAddressCode() {
        return new ActivityAddressCode();
    }

    /**
     * Create an instance of {@link ShipmentInfo }
     * 
     */
    public ShipmentInfo createShipmentInfo() {
        return new ShipmentInfo();
    }

    /**
     * Create an instance of {@link CarrierTrackingDetails }
     * 
     */
    public CarrierTrackingDetails createCarrierTrackingDetails() {
        return new CarrierTrackingDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/Order/v1.0", name = "order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

}
