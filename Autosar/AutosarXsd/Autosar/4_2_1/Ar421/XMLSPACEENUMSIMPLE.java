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
 * <p>XML-SPACE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="XML-SPACE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="preserve"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XML-SPACE-ENUM--SIMPLE")
@XmlEnum
public enum XMLSPACEENUMSIMPLE {


    /**
     * The value "default" signals that applications' default white-space processing modes are acceptable for this element.
     * 
     */
    @XmlEnumValue("default")
    DEFAULT("default"),

    /**
     * the value "preserve" indicates the intent that applications preserve all the white space.
     * 
     */
    @XmlEnumValue("preserve")
    PRESERVE("preserve");
    private final String value;

    XMLSPACEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XMLSPACEENUMSIMPLE fromValue(String v) {
        for (XMLSPACEENUMSIMPLE c: XMLSPACEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
