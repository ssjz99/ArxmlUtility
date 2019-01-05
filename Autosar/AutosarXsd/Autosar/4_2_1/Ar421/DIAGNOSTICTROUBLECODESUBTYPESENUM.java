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
 * <p>DIAGNOSTIC-TROUBLE-CODE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-TROUBLE-CODE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE"/>
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE-J-1939"/>
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE-OBD"/>
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE-UDS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-TROUBLE-CODE--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICTROUBLECODESUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE")
    DIAGNOSTIC___TROUBLE___CODE("DIAGNOSTIC-TROUBLE-CODE"),
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-J-1939")
    DIAGNOSTIC___TROUBLE___CODE___J___1939("DIAGNOSTIC-TROUBLE-CODE-J-1939"),
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-OBD")
    DIAGNOSTIC___TROUBLE___CODE___OBD("DIAGNOSTIC-TROUBLE-CODE-OBD"),
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-UDS")
    DIAGNOSTIC___TROUBLE___CODE___UDS("DIAGNOSTIC-TROUBLE-CODE-UDS");
    private final String value;

    DIAGNOSTICTROUBLECODESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICTROUBLECODESUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICTROUBLECODESUBTYPESENUM c: DIAGNOSTICTROUBLECODESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
