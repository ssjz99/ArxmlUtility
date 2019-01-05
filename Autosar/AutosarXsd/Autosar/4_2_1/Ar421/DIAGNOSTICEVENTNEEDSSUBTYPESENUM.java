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
 * <p>DIAGNOSTIC-EVENT-NEEDS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-EVENT-NEEDS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-EVENT-NEEDS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-EVENT-NEEDS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICEVENTNEEDSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-EVENT-NEEDS")
    DIAGNOSTIC___EVENT___NEEDS("DIAGNOSTIC-EVENT-NEEDS");
    private final String value;

    DIAGNOSTICEVENTNEEDSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICEVENTNEEDSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICEVENTNEEDSSUBTYPESENUM c: DIAGNOSTICEVENTNEEDSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
