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
 * <p>J-1939-TP-NODE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="J-1939-TP-NODE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="J-1939-TP-NODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "J-1939-TP-NODE--SUBTYPES-ENUM")
@XmlEnum
public enum J1939TPNODESUBTYPESENUM {

    @XmlEnumValue("J-1939-TP-NODE")
    J___1939___TP___NODE("J-1939-TP-NODE");
    private final String value;

    J1939TPNODESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static J1939TPNODESUBTYPESENUM fromValue(String v) {
        for (J1939TPNODESUBTYPESENUM c: J1939TPNODESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
