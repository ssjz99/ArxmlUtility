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
 * <p>VARIABLE-ACCESS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="VARIABLE-ACCESS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VARIABLE-ACCESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VARIABLE-ACCESS--SUBTYPES-ENUM")
@XmlEnum
public enum VARIABLEACCESSSUBTYPESENUM {

    @XmlEnumValue("VARIABLE-ACCESS")
    VARIABLE___ACCESS("VARIABLE-ACCESS");
    private final String value;

    VARIABLEACCESSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VARIABLEACCESSSUBTYPESENUM fromValue(String v) {
        for (VARIABLEACCESSSUBTYPESENUM c: VARIABLEACCESSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
