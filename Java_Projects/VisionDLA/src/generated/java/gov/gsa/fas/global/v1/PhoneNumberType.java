
package gov.gsa.fas.global.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneNumberType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhoneNumberType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Domestic"/>
 *     &lt;enumeration value="International"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhoneNumberType")
@XmlEnum
public enum PhoneNumberType {

    @XmlEnumValue("Domestic")
    DOMESTIC("Domestic"),
    @XmlEnumValue("International")
    INTERNATIONAL("International");
    private final String value;

    PhoneNumberType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoneNumberType fromValue(String v) {
        for (PhoneNumberType c: PhoneNumberType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
