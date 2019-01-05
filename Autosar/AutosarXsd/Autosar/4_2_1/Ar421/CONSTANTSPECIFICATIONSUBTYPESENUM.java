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
 * <p>CONSTANT-SPECIFICATION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CONSTANT-SPECIFICATION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONSTANT-SPECIFICATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CONSTANT-SPECIFICATION--SUBTYPES-ENUM")
@XmlEnum
public enum CONSTANTSPECIFICATIONSUBTYPESENUM {

    @XmlEnumValue("CONSTANT-SPECIFICATION")
    CONSTANT___SPECIFICATION("CONSTANT-SPECIFICATION");
    private final String value;

    CONSTANTSPECIFICATIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CONSTANTSPECIFICATIONSUBTYPESENUM fromValue(String v) {
        for (CONSTANTSPECIFICATIONSUBTYPESENUM c: CONSTANTSPECIFICATIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
