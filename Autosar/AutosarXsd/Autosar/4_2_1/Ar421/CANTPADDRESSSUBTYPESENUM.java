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
 * <p>CAN-TP-ADDRESS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CAN-TP-ADDRESS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAN-TP-ADDRESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CAN-TP-ADDRESS--SUBTYPES-ENUM")
@XmlEnum
public enum CANTPADDRESSSUBTYPESENUM {

    @XmlEnumValue("CAN-TP-ADDRESS")
    CAN___TP___ADDRESS("CAN-TP-ADDRESS");
    private final String value;

    CANTPADDRESSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CANTPADDRESSSUBTYPESENUM fromValue(String v) {
        for (CANTPADDRESSSUBTYPESENUM c: CANTPADDRESSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}