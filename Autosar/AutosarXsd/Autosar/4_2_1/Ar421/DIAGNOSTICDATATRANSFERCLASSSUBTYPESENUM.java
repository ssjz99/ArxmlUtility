//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DIAGNOSTIC-DATA-TRANSFER-CLASS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-DATA-TRANSFER-CLASS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-DATA-TRANSFER-CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-DATA-TRANSFER-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICDATATRANSFERCLASSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-DATA-TRANSFER-CLASS")
    DIAGNOSTIC___DATA___TRANSFER___CLASS("DIAGNOSTIC-DATA-TRANSFER-CLASS");
    private final String value;

    DIAGNOSTICDATATRANSFERCLASSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICDATATRANSFERCLASSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICDATATRANSFERCLASSSUBTYPESENUM c: DIAGNOSTICDATATRANSFERCLASSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
