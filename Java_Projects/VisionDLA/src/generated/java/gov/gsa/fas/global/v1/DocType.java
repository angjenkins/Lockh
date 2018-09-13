
package gov.gsa.fas.global.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Solicitation"/>
 *     &lt;enumeration value="Offer"/>
 *     &lt;enumeration value="Contract"/>
 *     &lt;enumeration value="Mod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocType")
@XmlEnum
public enum DocType {

    @XmlEnumValue("Solicitation")
    SOLICITATION("Solicitation"),
    @XmlEnumValue("Offer")
    OFFER("Offer"),
    @XmlEnumValue("Contract")
    CONTRACT("Contract"),
    @XmlEnumValue("Mod")
    MOD("Mod");
    private final String value;

    DocType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocType fromValue(String v) {
        for (DocType c: DocType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
