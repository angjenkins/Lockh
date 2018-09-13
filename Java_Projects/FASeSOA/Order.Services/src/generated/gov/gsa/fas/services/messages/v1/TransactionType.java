
package gov.gsa.fas.services.messages.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZKP"/>
 *     &lt;enumeration value="Finance305Credit"/>
 *     &lt;enumeration value="Finance305Debit"/>
 *     &lt;enumeration value="Reshipment"/>
 *     &lt;enumeration value="MaterialReturn"/>
 *     &lt;enumeration value="ZLACredit"/>
 *     &lt;enumeration value="ZLADebit"/>
 *     &lt;enumeration value="ZSACredit"/>
 *     &lt;enumeration value="ZSADebit"/>
 *     &lt;enumeration value="ZSAPz"/>
 *     &lt;enumeration value="VendorOffset"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionType")
@XmlEnum
public enum TransactionType {

    ZKP("ZKP"),
    @XmlEnumValue("Finance305Credit")
    FINANCE_305_CREDIT("Finance305Credit"),
    @XmlEnumValue("Finance305Debit")
    FINANCE_305_DEBIT("Finance305Debit"),
    @XmlEnumValue("Reshipment")
    RESHIPMENT("Reshipment"),
    @XmlEnumValue("MaterialReturn")
    MATERIAL_RETURN("MaterialReturn"),
    @XmlEnumValue("ZLACredit")
    ZLA_CREDIT("ZLACredit"),
    @XmlEnumValue("ZLADebit")
    ZLA_DEBIT("ZLADebit"),
    @XmlEnumValue("ZSACredit")
    ZSA_CREDIT("ZSACredit"),
    @XmlEnumValue("ZSADebit")
    ZSA_DEBIT("ZSADebit"),
    @XmlEnumValue("ZSAPz")
    ZSA_PZ("ZSAPz"),
    @XmlEnumValue("VendorOffset")
    VENDOR_OFFSET("VendorOffset");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
