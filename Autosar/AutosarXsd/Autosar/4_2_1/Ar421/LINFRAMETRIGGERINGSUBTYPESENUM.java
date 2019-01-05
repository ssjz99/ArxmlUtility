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
 * <p>LIN-FRAME-TRIGGERING--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="LIN-FRAME-TRIGGERING--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIN-FRAME-TRIGGERING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LIN-FRAME-TRIGGERING--SUBTYPES-ENUM")
@XmlEnum
public enum LINFRAMETRIGGERINGSUBTYPESENUM {

    @XmlEnumValue("LIN-FRAME-TRIGGERING")
    LIN___FRAME___TRIGGERING("LIN-FRAME-TRIGGERING");
    private final String value;

    LINFRAMETRIGGERINGSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LINFRAMETRIGGERINGSUBTYPESENUM fromValue(String v) {
        for (LINFRAMETRIGGERINGSUBTYPESENUM c: LINFRAMETRIGGERINGSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
