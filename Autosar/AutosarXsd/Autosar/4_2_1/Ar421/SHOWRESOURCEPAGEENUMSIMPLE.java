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
 * <p>SHOW-RESOURCE-PAGE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SHOW-RESOURCE-PAGE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-SHOW-PAGE"/>
 *     &lt;enumeration value="SHOW-PAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SHOW-RESOURCE-PAGE-ENUM--SIMPLE")
@XmlEnum
public enum SHOWRESOURCEPAGEENUMSIMPLE {


    /**
     * The page number  of the target is '''not''' rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("NO-SHOW-PAGE")
    NO___SHOW___PAGE("NO-SHOW-PAGE"),

    /**
     * The page number  of the target is rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("SHOW-PAGE")
    SHOW___PAGE("SHOW-PAGE");
    private final String value;

    SHOWRESOURCEPAGEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SHOWRESOURCEPAGEENUMSIMPLE fromValue(String v) {
        for (SHOWRESOURCEPAGEENUMSIMPLE c: SHOWRESOURCEPAGEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
