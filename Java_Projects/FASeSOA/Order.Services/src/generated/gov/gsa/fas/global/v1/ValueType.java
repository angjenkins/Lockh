
package gov.gsa.fas.global.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="long"/>
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="uri"/>
 *     &lt;enumeration value="nonNegativeInteger"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValueType")
@XmlEnum
public enum ValueType {

    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("long")
    LONG("long"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("uri")
    URI("uri"),
    @XmlEnumValue("nonNegativeInteger")
    NON_NEGATIVE_INTEGER("nonNegativeInteger");
    private final String value;

    ValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueType fromValue(String v) {
        for (ValueType c: ValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
