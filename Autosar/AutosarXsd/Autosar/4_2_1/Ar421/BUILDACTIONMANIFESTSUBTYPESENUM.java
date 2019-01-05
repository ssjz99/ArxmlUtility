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
 * <p>BUILD-ACTION-MANIFEST--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="BUILD-ACTION-MANIFEST--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUILD-ACTION-MANIFEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BUILD-ACTION-MANIFEST--SUBTYPES-ENUM")
@XmlEnum
public enum BUILDACTIONMANIFESTSUBTYPESENUM {

    @XmlEnumValue("BUILD-ACTION-MANIFEST")
    BUILD___ACTION___MANIFEST("BUILD-ACTION-MANIFEST");
    private final String value;

    BUILDACTIONMANIFESTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BUILDACTIONMANIFESTSUBTYPESENUM fromValue(String v) {
        for (BUILDACTIONMANIFESTSUBTYPESENUM c: BUILDACTIONMANIFESTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
