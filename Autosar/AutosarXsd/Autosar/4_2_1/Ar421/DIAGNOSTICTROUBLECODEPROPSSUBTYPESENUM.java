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
 * <p>DIAGNOSTIC-TROUBLE-CODE-PROPS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-TROUBLE-CODE-PROPS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE-PROPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-TROUBLE-CODE-PROPS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICTROUBLECODEPROPSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-PROPS")
    DIAGNOSTIC___TROUBLE___CODE___PROPS("DIAGNOSTIC-TROUBLE-CODE-PROPS");
    private final String value;

    DIAGNOSTICTROUBLECODEPROPSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICTROUBLECODEPROPSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICTROUBLECODEPROPSSUBTYPESENUM c: DIAGNOSTICTROUBLECODEPROPSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
