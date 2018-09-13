
package gov.gsa.fas.discrepancyoutcome.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="documentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="WORD"/>
 *     &lt;enumeration value="IMAGE"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "documentType")
@XmlEnum
public enum DocumentType {

    PDF,
    WORD,
    IMAGE,
    TEXT,
    OTHER;

    public String value() {
        return name();
    }

    public static DocumentType fromValue(String v) {
        return valueOf(v);
    }

}
