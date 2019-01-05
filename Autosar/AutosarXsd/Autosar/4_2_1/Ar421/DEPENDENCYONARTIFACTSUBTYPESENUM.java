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
 * <p>DEPENDENCY-ON-ARTIFACT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DEPENDENCY-ON-ARTIFACT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPENDENCY-ON-ARTIFACT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DEPENDENCY-ON-ARTIFACT--SUBTYPES-ENUM")
@XmlEnum
public enum DEPENDENCYONARTIFACTSUBTYPESENUM {

    @XmlEnumValue("DEPENDENCY-ON-ARTIFACT")
    DEPENDENCY___ON___ARTIFACT("DEPENDENCY-ON-ARTIFACT");
    private final String value;

    DEPENDENCYONARTIFACTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DEPENDENCYONARTIFACTSUBTYPESENUM fromValue(String v) {
        for (DEPENDENCYONARTIFACTSUBTYPESENUM c: DEPENDENCYONARTIFACTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
