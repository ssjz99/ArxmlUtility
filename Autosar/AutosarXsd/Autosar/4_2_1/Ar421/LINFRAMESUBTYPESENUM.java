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
 * <p>LIN-FRAME--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="LIN-FRAME--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIN-EVENT-TRIGGERED-FRAME"/>
 *     &lt;enumeration value="LIN-FRAME"/>
 *     &lt;enumeration value="LIN-SPORADIC-FRAME"/>
 *     &lt;enumeration value="LIN-UNCONDITIONAL-FRAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LIN-FRAME--SUBTYPES-ENUM")
@XmlEnum
public enum LINFRAMESUBTYPESENUM {

    @XmlEnumValue("LIN-EVENT-TRIGGERED-FRAME")
    LIN___EVENT___TRIGGERED___FRAME("LIN-EVENT-TRIGGERED-FRAME"),
    @XmlEnumValue("LIN-FRAME")
    LIN___FRAME("LIN-FRAME"),
    @XmlEnumValue("LIN-SPORADIC-FRAME")
    LIN___SPORADIC___FRAME("LIN-SPORADIC-FRAME"),
    @XmlEnumValue("LIN-UNCONDITIONAL-FRAME")
    LIN___UNCONDITIONAL___FRAME("LIN-UNCONDITIONAL-FRAME");
    private final String value;

    LINFRAMESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LINFRAMESUBTYPESENUM fromValue(String v) {
        for (LINFRAMESUBTYPESENUM c: LINFRAMESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
