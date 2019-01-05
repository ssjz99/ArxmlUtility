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
 * <p>COUPLING-PORT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="COUPLING-PORT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COUPLING-PORT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COUPLING-PORT--SUBTYPES-ENUM")
@XmlEnum
public enum COUPLINGPORTSUBTYPESENUM {

    @XmlEnumValue("COUPLING-PORT")
    COUPLING___PORT("COUPLING-PORT");
    private final String value;

    COUPLINGPORTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COUPLINGPORTSUBTYPESENUM fromValue(String v) {
        for (COUPLINGPORTSUBTYPESENUM c: COUPLINGPORTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
