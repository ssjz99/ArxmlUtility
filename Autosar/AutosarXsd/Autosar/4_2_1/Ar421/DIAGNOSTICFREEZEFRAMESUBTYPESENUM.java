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
 * <p>DIAGNOSTIC-FREEZE-FRAME--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-FREEZE-FRAME--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-FREEZE-FRAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-FREEZE-FRAME--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICFREEZEFRAMESUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-FREEZE-FRAME")
    DIAGNOSTIC___FREEZE___FRAME("DIAGNOSTIC-FREEZE-FRAME");
    private final String value;

    DIAGNOSTICFREEZEFRAMESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICFREEZEFRAMESUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICFREEZEFRAMESUBTYPESENUM c: DIAGNOSTICFREEZEFRAMESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
