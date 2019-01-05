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
 * <p>GLOBAL-TIME-MASTER--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="GLOBAL-TIME-MASTER--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GLOBAL-TIME-CAN-MASTER"/>
 *     &lt;enumeration value="GLOBAL-TIME-ETH-MASTER"/>
 *     &lt;enumeration value="GLOBAL-TIME-FR-MASTER"/>
 *     &lt;enumeration value="GLOBAL-TIME-MASTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GLOBAL-TIME-MASTER--SUBTYPES-ENUM")
@XmlEnum
public enum GLOBALTIMEMASTERSUBTYPESENUM {

    @XmlEnumValue("GLOBAL-TIME-CAN-MASTER")
    GLOBAL___TIME___CAN___MASTER("GLOBAL-TIME-CAN-MASTER"),
    @XmlEnumValue("GLOBAL-TIME-ETH-MASTER")
    GLOBAL___TIME___ETH___MASTER("GLOBAL-TIME-ETH-MASTER"),
    @XmlEnumValue("GLOBAL-TIME-FR-MASTER")
    GLOBAL___TIME___FR___MASTER("GLOBAL-TIME-FR-MASTER"),
    @XmlEnumValue("GLOBAL-TIME-MASTER")
    GLOBAL___TIME___MASTER("GLOBAL-TIME-MASTER");
    private final String value;

    GLOBALTIMEMASTERSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GLOBALTIMEMASTERSUBTYPESENUM fromValue(String v) {
        for (GLOBALTIMEMASTERSUBTYPESENUM c: GLOBALTIMEMASTERSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
