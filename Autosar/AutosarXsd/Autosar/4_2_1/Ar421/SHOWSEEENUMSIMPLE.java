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
 * <p>SHOW-SEE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SHOW-SEE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-SHOW-SEE"/>
 *     &lt;enumeration value="SHOW-SEE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SHOW-SEE-ENUM--SIMPLE")
@XmlEnum
public enum SHOWSEEENUMSIMPLE {


    /**
     * The word "see" is '''not''' rendered before  the reference.
     * 
     */
    @XmlEnumValue("NO-SHOW-SEE")
    NO___SHOW___SEE("NO-SHOW-SEE"),

    /**
     * The word "see"is rendered before the reference.
     * 
     */
    @XmlEnumValue("SHOW-SEE")
    SHOW___SEE("SHOW-SEE");
    private final String value;

    SHOWSEEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SHOWSEEENUMSIMPLE fromValue(String v) {
        for (SHOWSEEENUMSIMPLE c: SHOWSEEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
