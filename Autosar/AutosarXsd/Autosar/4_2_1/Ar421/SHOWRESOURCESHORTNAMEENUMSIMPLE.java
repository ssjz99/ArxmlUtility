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
 * <p>SHOW-RESOURCE-SHORT-NAME-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SHOW-RESOURCE-SHORT-NAME-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-SHOW-SHORT-NAME"/>
 *     &lt;enumeration value="SHOW-SHORT-NAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SHOW-RESOURCE-SHORT-NAME-ENUM--SIMPLE")
@XmlEnum
public enum SHOWRESOURCESHORTNAMEENUMSIMPLE {


    /**
     * The short name of the target is '''not''' rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("NO-SHOW-SHORT-NAME")
    NO___SHOW___SHORT___NAME("NO-SHOW-SHORT-NAME"),

    /**
     * The short name of the target is rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("SHOW-SHORT-NAME")
    SHOW___SHORT___NAME("SHOW-SHORT-NAME");
    private final String value;

    SHOWRESOURCESHORTNAMEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SHOWRESOURCESHORTNAMEENUMSIMPLE fromValue(String v) {
        for (SHOWRESOURCESHORTNAMEENUMSIMPLE c: SHOWRESOURCESHORTNAMEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
