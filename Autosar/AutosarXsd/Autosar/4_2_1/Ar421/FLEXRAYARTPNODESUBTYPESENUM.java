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
 * <p>FLEXRAY-AR-TP-NODE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FLEXRAY-AR-TP-NODE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLEXRAY-AR-TP-NODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FLEXRAY-AR-TP-NODE--SUBTYPES-ENUM")
@XmlEnum
public enum FLEXRAYARTPNODESUBTYPESENUM {

    @XmlEnumValue("FLEXRAY-AR-TP-NODE")
    FLEXRAY___AR___TP___NODE("FLEXRAY-AR-TP-NODE");
    private final String value;

    FLEXRAYARTPNODESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FLEXRAYARTPNODESUBTYPESENUM fromValue(String v) {
        for (FLEXRAYARTPNODESUBTYPESENUM c: FLEXRAYARTPNODESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
