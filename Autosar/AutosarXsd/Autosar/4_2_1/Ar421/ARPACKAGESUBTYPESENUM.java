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
 * <p>AR-PACKAGE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="AR-PACKAGE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AR-PACKAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AR-PACKAGE--SUBTYPES-ENUM")
@XmlEnum
public enum ARPACKAGESUBTYPESENUM {

    @XmlEnumValue("AR-PACKAGE")
    AR___PACKAGE("AR-PACKAGE");
    private final String value;

    ARPACKAGESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ARPACKAGESUBTYPESENUM fromValue(String v) {
        for (ARPACKAGESUBTYPESENUM c: ARPACKAGESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
