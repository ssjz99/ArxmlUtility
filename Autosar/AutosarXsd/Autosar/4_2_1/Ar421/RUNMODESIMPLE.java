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
 * <p>RUN-MODE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="RUN-MODE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RUN-CONTINUOUS"/>
 *     &lt;enumeration value="RUN-ONCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RUN-MODE--SIMPLE")
@XmlEnum
public enum RUNMODESIMPLE {


    /**
     * RUN_CONTINUOUS run mode
     * 
     */
    @XmlEnumValue("RUN-CONTINUOUS")
    RUN___CONTINUOUS("RUN-CONTINUOUS"),

    /**
     * RUN_ONCE run mode
     * 
     */
    @XmlEnumValue("RUN-ONCE")
    RUN___ONCE("RUN-ONCE");
    private final String value;

    RUNMODESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RUNMODESIMPLE fromValue(String v) {
        for (RUNMODESIMPLE c: RUNMODESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
