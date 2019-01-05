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
 * <p>CAN-TP-NODE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CAN-TP-NODE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAN-TP-NODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CAN-TP-NODE--SUBTYPES-ENUM")
@XmlEnum
public enum CANTPNODESUBTYPESENUM {

    @XmlEnumValue("CAN-TP-NODE")
    CAN___TP___NODE("CAN-TP-NODE");
    private final String value;

    CANTPNODESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CANTPNODESUBTYPESENUM fromValue(String v) {
        for (CANTPNODESUBTYPESENUM c: CANTPNODESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
