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
 * <p>SYSTEM-SIGNAL--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SYSTEM-SIGNAL--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYSTEM-SIGNAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SYSTEM-SIGNAL--SUBTYPES-ENUM")
@XmlEnum
public enum SYSTEMSIGNALSUBTYPESENUM {

    @XmlEnumValue("SYSTEM-SIGNAL")
    SYSTEM___SIGNAL("SYSTEM-SIGNAL");
    private final String value;

    SYSTEMSIGNALSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SYSTEMSIGNALSUBTYPESENUM fromValue(String v) {
        for (SYSTEMSIGNALSUBTYPESENUM c: SYSTEMSIGNALSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
