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
 * <p>DATA-CONSTR--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DATA-CONSTR--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATA-CONSTR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DATA-CONSTR--SUBTYPES-ENUM")
@XmlEnum
public enum DATACONSTRSUBTYPESENUM {

    @XmlEnumValue("DATA-CONSTR")
    DATA___CONSTR("DATA-CONSTR");
    private final String value;

    DATACONSTRSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DATACONSTRSUBTYPESENUM fromValue(String v) {
        for (DATACONSTRSUBTYPESENUM c: DATACONSTRSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
