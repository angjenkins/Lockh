
package gov.gsa.fas.global.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Domain.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Domain">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Solicitation"/>
 *     &lt;enumeration value="Offer"/>
 *     &lt;enumeration value="Pricing"/>
 *     &lt;enumeration value="Contract"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Domain")
@XmlEnum
public enum Domain {

    @XmlEnumValue("Solicitation")
    SOLICITATION("Solicitation"),
    @XmlEnumValue("Offer")
    OFFER("Offer"),
    @XmlEnumValue("Pricing")
    PRICING("Pricing"),
    @XmlEnumValue("Contract")
    CONTRACT("Contract");
    private final String value;

    Domain(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Domain fromValue(String v) {
        for (Domain c: Domain.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
