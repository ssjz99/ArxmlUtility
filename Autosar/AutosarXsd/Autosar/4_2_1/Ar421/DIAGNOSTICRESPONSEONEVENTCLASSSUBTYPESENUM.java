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
 * <p>DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICRESPONSEONEVENTCLASSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS")
    DIAGNOSTIC___RESPONSE___ON___EVENT___CLASS("DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS");
    private final String value;

    DIAGNOSTICRESPONSEONEVENTCLASSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICRESPONSEONEVENTCLASSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICRESPONSEONEVENTCLASSSUBTYPESENUM c: DIAGNOSTICRESPONSEONEVENTCLASSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
