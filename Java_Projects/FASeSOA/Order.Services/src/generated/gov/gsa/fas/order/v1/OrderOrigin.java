
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderOrigin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderOrigin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CSC"/>
 *     &lt;enumeration value="EDD"/>
 *     &lt;enumeration value="GECO"/>
 *     &lt;enumeration value="WDC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderOrigin")
@XmlEnum
public enum OrderOrigin {

    CSC,
    EDD,
    GECO,
    WDC;

    public String value() {
        return name();
    }

    public static OrderOrigin fromValue(String v) {
        return valueOf(v);
    }

}
