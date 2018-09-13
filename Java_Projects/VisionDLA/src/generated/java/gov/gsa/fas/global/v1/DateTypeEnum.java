
package gov.gsa.fas.global.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dateTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Price"/>
 *     &lt;enumeration value="Percentage"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="PositiveInt"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="Boolean"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dateTypeEnum")
@XmlEnum
public enum DateTypeEnum {

    @XmlEnumValue("Price")
    PRICE("Price"),
    @XmlEnumValue("Percentage")
    PERCENTAGE("Percentage"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("PositiveInt")
    POSITIVE_INT("PositiveInt"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean");
    private final String value;

    DateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateTypeEnum fromValue(String v) {
        for (DateTypeEnum c: DateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
