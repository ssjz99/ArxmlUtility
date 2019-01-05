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
 * <p>SHOW-RESOURCE-ALIAS-NAME-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SHOW-RESOURCE-ALIAS-NAME-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-SHOW-ALIAS-NAME"/>
 *     &lt;enumeration value="SHOW-ALIAS-NAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SHOW-RESOURCE-ALIAS-NAME-ENUM--SIMPLE")
@XmlEnum
public enum SHOWRESOURCEALIASNAMEENUMSIMPLE {


    /**
     * This indicates that alias names of the referenced object shall '''not''' be rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("NO-SHOW-ALIAS-NAME")
    NO___SHOW___ALIAS___NAME("NO-SHOW-ALIAS-NAME"),

    /**
     * This indicates that the alias names of the referenced object shall be rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("SHOW-ALIAS-NAME")
    SHOW___ALIAS___NAME("SHOW-ALIAS-NAME");
    private final String value;

    SHOWRESOURCEALIASNAMEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SHOWRESOURCEALIASNAMEENUMSIMPLE fromValue(String v) {
        for (SHOWRESOURCEALIASNAMEENUMSIMPLE c: SHOWRESOURCEALIASNAMEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
