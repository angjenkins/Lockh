
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderNumberScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderNumberScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CSC"/>
 *     &lt;enumeration value="WDC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderNumberScope")
@XmlEnum
public enum OrderNumberScope {

    CSC,
    WDC;

    public String value() {
        return name();
    }

    public static OrderNumberScope fromValue(String v) {
        return valueOf(v);
    }

}
