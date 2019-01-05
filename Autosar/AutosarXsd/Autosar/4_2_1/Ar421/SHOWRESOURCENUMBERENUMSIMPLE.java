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
 * <p>SHOW-RESOURCE-NUMBER-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SHOW-RESOURCE-NUMBER-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-SHOW-NUMBER"/>
 *     &lt;enumeration value="SHOW-NUMBER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SHOW-RESOURCE-NUMBER-ENUM--SIMPLE")
@XmlEnum
public enum SHOWRESOURCENUMBERENUMSIMPLE {


    /**
     * The number of the target is '''not''' rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("NO-SHOW-NUMBER")
    NO___SHOW___NUMBER("NO-SHOW-NUMBER"),

    /**
     * The number of the target is rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("SHOW-NUMBER")
    SHOW___NUMBER("SHOW-NUMBER");
    private final String value;

    SHOWRESOURCENUMBERENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SHOWRESOURCENUMBERENUMSIMPLE fromValue(String v) {
        for (SHOWRESOURCENUMBERENUMSIMPLE c: SHOWRESOURCENUMBERENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
