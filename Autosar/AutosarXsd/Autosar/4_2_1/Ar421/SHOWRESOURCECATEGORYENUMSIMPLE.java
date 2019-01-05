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
 * <p>SHOW-RESOURCE-CATEGORY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SHOW-RESOURCE-CATEGORY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-SHOW-CATEGORY"/>
 *     &lt;enumeration value="SHOW-CATEGORY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SHOW-RESOURCE-CATEGORY-ENUM--SIMPLE")
@XmlEnum
public enum SHOWRESOURCECATEGORYENUMSIMPLE {


    /**
     * The category of the target is '''not''' rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("NO-SHOW-CATEGORY")
    NO___SHOW___CATEGORY("NO-SHOW-CATEGORY"),

    /**
     * The category of the target is  rendered at the place of the reference.
     * 
     */
    @XmlEnumValue("SHOW-CATEGORY")
    SHOW___CATEGORY("SHOW-CATEGORY");
    private final String value;

    SHOWRESOURCECATEGORYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SHOWRESOURCECATEGORYENUMSIMPLE fromValue(String v) {
        for (SHOWRESOURCECATEGORYENUMSIMPLE c: SHOWRESOURCECATEGORYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
