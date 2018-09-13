
package gov.gsa.fas.global.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Submited"/>
 *     &lt;enumeration value="Withdrawn"/>
 *     &lt;enumeration value="Rejected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocStatus")
@XmlEnum
public enum DocStatus {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Submited")
    SUBMITED("Submited"),
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    DocStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocStatus fromValue(String v) {
        for (DocStatus c: DocStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
