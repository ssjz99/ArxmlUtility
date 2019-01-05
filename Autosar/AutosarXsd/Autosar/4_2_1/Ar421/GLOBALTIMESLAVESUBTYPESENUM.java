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
 * <p>GLOBAL-TIME-SLAVE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="GLOBAL-TIME-SLAVE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GLOBAL-TIME-CAN-SLAVE"/>
 *     &lt;enumeration value="GLOBAL-TIME-ETH-SLAVE"/>
 *     &lt;enumeration value="GLOBAL-TIME-FR-SLAVE"/>
 *     &lt;enumeration value="GLOBAL-TIME-SLAVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GLOBAL-TIME-SLAVE--SUBTYPES-ENUM")
@XmlEnum
public enum GLOBALTIMESLAVESUBTYPESENUM {

    @XmlEnumValue("GLOBAL-TIME-CAN-SLAVE")
    GLOBAL___TIME___CAN___SLAVE("GLOBAL-TIME-CAN-SLAVE"),
    @XmlEnumValue("GLOBAL-TIME-ETH-SLAVE")
    GLOBAL___TIME___ETH___SLAVE("GLOBAL-TIME-ETH-SLAVE"),
    @XmlEnumValue("GLOBAL-TIME-FR-SLAVE")
    GLOBAL___TIME___FR___SLAVE("GLOBAL-TIME-FR-SLAVE"),
    @XmlEnumValue("GLOBAL-TIME-SLAVE")
    GLOBAL___TIME___SLAVE("GLOBAL-TIME-SLAVE");
    private final String value;

    GLOBALTIMESLAVESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GLOBALTIMESLAVESUBTYPESENUM fromValue(String v) {
        for (GLOBALTIMESLAVESUBTYPESENUM c: GLOBALTIMESLAVESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
