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
 * <p>BSW-EXECUTION-CONTEXT--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="BSW-EXECUTION-CONTEXT--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOOK"/>
 *     &lt;enumeration value="INTERRUPT-CAT-1"/>
 *     &lt;enumeration value="INTERRUPT-CAT-2"/>
 *     &lt;enumeration value="TASK"/>
 *     &lt;enumeration value="UNSPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BSW-EXECUTION-CONTEXT--SIMPLE")
@XmlEnum
public enum BSWEXECUTIONCONTEXTSIMPLE {


    /**
     * Context of an OS "hook" routine always
     * 
     */
    HOOK("HOOK"),

    /**
     * CAT1 interrupt context always
     * 
     */
    @XmlEnumValue("INTERRUPT-CAT-1")
    INTERRUPT___CAT___1("INTERRUPT-CAT-1"),

    /**
     * CAT2 interrupt context always
     * 
     */
    @XmlEnumValue("INTERRUPT-CAT-2")
    INTERRUPT___CAT___2("INTERRUPT-CAT-2"),

    /**
     * Task context always
     * 
     */
    TASK("TASK"),

    /**
     * The execution context is not specified by the API
     * 
     */
    UNSPECIFIED("UNSPECIFIED");
    private final String value;

    BSWEXECUTIONCONTEXTSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BSWEXECUTIONCONTEXTSIMPLE fromValue(String v) {
        for (BSWEXECUTIONCONTEXTSIMPLE c: BSWEXECUTIONCONTEXTSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
