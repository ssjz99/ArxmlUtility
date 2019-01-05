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
 * <p>DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICREADMEMORYBYADDRESSCLASSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS")
    DIAGNOSTIC___READ___MEMORY___BY___ADDRESS___CLASS("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS");
    private final String value;

    DIAGNOSTICREADMEMORYBYADDRESSCLASSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICREADMEMORYBYADDRESSCLASSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICREADMEMORYBYADDRESSCLASSSUBTYPESENUM c: DIAGNOSTICREADMEMORYBYADDRESSCLASSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
