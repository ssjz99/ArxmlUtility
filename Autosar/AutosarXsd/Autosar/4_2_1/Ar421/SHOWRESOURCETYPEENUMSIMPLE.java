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
 * <p>SHOW-RESOURCE-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SHOW-RESOURCE-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-SHOW-TYPE"/>
 *     &lt;enumeration value="SHOW-TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SHOW-RESOURCE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum SHOWRESOURCETYPEENUMSIMPLE {


    /**
     * The type of the target is '''not''' rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("NO-SHOW-TYPE")
    NO___SHOW___TYPE("NO-SHOW-TYPE"),

    /**
     * The type of the target is rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("SHOW-TYPE")
    SHOW___TYPE("SHOW-TYPE");
    private final String value;

    SHOWRESOURCETYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SHOWRESOURCETYPEENUMSIMPLE fromValue(String v) {
        for (SHOWRESOURCETYPEENUMSIMPLE c: SHOWRESOURCETYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
