
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="Q"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExportType")
@XmlEnum
public enum ExportType {

    D,
    E,
    F,
    G,
    H,
    J,
    K,
    L,
    Q;

    public String value() {
        return name();
    }

    public static ExportType fromValue(String v) {
        return valueOf(v);
    }

}
