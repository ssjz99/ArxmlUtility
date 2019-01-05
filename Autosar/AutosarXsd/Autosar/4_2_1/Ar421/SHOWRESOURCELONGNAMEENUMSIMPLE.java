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
 * <p>SHOW-RESOURCE-LONG-NAME-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SHOW-RESOURCE-LONG-NAME-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-SHOW-LONG-NAME"/>
 *     &lt;enumeration value="SHOW-LONG-NAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SHOW-RESOURCE-LONG-NAME-ENUM--SIMPLE")
@XmlEnum
public enum SHOWRESOURCELONGNAMEENUMSIMPLE {


    /**
     * The long name of the target is '''not''' rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("NO-SHOW-LONG-NAME")
    NO___SHOW___LONG___NAME("NO-SHOW-LONG-NAME"),

    /**
     * The long name of the target is rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("SHOW-LONG-NAME")
    SHOW___LONG___NAME("SHOW-LONG-NAME");
    private final String value;

    SHOWRESOURCELONGNAMEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SHOWRESOURCELONGNAMEENUMSIMPLE fromValue(String v) {
        for (SHOWRESOURCELONGNAMEENUMSIMPLE c: SHOWRESOURCELONGNAMEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
