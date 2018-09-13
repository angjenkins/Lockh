
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemNumberStandard.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemNumberStandard">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NIIN"/>
 *     &lt;enumeration value="EDD"/>
 *     &lt;enumeration value="NSN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemNumberStandard")
@XmlEnum
public enum ItemNumberStandard {

    NIIN,
    EDD,
    NSN;

    public String value() {
        return name();
    }

    public static ItemNumberStandard fromValue(String v) {
        return valueOf(v);
    }

}
