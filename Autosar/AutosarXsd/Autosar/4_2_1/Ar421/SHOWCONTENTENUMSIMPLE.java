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
 * <p>SHOW-CONTENT-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SHOW-CONTENT-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-SHOW-CONTENT"/>
 *     &lt;enumeration value="SHOW-CONTENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SHOW-CONTENT-ENUM--SIMPLE")
@XmlEnum
public enum SHOWCONTENTENUMSIMPLE {


    /**
     * The content of the Xref.label is '''not''' rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("NO-SHOW-CONTENT")
    NO___SHOW___CONTENT("NO-SHOW-CONTENT"),

    /**
     * The content of the element is rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("SHOW-CONTENT")
    SHOW___CONTENT("SHOW-CONTENT");
    private final String value;

    SHOWCONTENTENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SHOWCONTENTENUMSIMPLE fromValue(String v) {
        for (SHOWCONTENTENUMSIMPLE c: SHOWCONTENTENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
