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
 * <p>FRAME-TRIGGERING--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FRAME-TRIGGERING--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAN-FRAME-TRIGGERING"/>
 *     &lt;enumeration value="ETHERNET-FRAME-TRIGGERING"/>
 *     &lt;enumeration value="FLEXRAY-FRAME-TRIGGERING"/>
 *     &lt;enumeration value="FRAME-TRIGGERING"/>
 *     &lt;enumeration value="LIN-FRAME-TRIGGERING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FRAME-TRIGGERING--SUBTYPES-ENUM")
@XmlEnum
public enum FRAMETRIGGERINGSUBTYPESENUM {

    @XmlEnumValue("CAN-FRAME-TRIGGERING")
    CAN___FRAME___TRIGGERING("CAN-FRAME-TRIGGERING"),
    @XmlEnumValue("ETHERNET-FRAME-TRIGGERING")
    ETHERNET___FRAME___TRIGGERING("ETHERNET-FRAME-TRIGGERING"),
    @XmlEnumValue("FLEXRAY-FRAME-TRIGGERING")
    FLEXRAY___FRAME___TRIGGERING("FLEXRAY-FRAME-TRIGGERING"),
    @XmlEnumValue("FRAME-TRIGGERING")
    FRAME___TRIGGERING("FRAME-TRIGGERING"),
    @XmlEnumValue("LIN-FRAME-TRIGGERING")
    LIN___FRAME___TRIGGERING("LIN-FRAME-TRIGGERING");
    private final String value;

    FRAMETRIGGERINGSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FRAMETRIGGERINGSUBTYPESENUM fromValue(String v) {
        for (FRAMETRIGGERINGSUBTYPESENUM c: FRAMETRIGGERINGSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
