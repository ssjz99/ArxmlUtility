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
 * <p>SYSTEM-SIGNAL-GROUP--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SYSTEM-SIGNAL-GROUP--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYSTEM-SIGNAL-GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SYSTEM-SIGNAL-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum SYSTEMSIGNALGROUPSUBTYPESENUM {

    @XmlEnumValue("SYSTEM-SIGNAL-GROUP")
    SYSTEM___SIGNAL___GROUP("SYSTEM-SIGNAL-GROUP");
    private final String value;

    SYSTEMSIGNALGROUPSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SYSTEMSIGNALGROUPSUBTYPESENUM fromValue(String v) {
        for (SYSTEMSIGNALGROUPSUBTYPESENUM c: SYSTEMSIGNALGROUPSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
