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
 * <p>FLEXRAY-TP-CONNECTION-CONTROL--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FLEXRAY-TP-CONNECTION-CONTROL--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLEXRAY-TP-CONNECTION-CONTROL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FLEXRAY-TP-CONNECTION-CONTROL--SUBTYPES-ENUM")
@XmlEnum
public enum FLEXRAYTPCONNECTIONCONTROLSUBTYPESENUM {

    @XmlEnumValue("FLEXRAY-TP-CONNECTION-CONTROL")
    FLEXRAY___TP___CONNECTION___CONTROL("FLEXRAY-TP-CONNECTION-CONTROL");
    private final String value;

    FLEXRAYTPCONNECTIONCONTROLSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FLEXRAYTPCONNECTIONCONTROLSUBTYPESENUM fromValue(String v) {
        for (FLEXRAYTPCONNECTIONCONTROLSUBTYPESENUM c: FLEXRAYTPCONNECTIONCONTROLSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
