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
 * <p>ETHERNET-COUPLING-PORT-SCHEDULER-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ETHERNET-COUPLING-PORT-SCHEDULER-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFICIT-ROUND-ROBIN"/>
 *     &lt;enumeration value="STRICT-PRIORITY"/>
 *     &lt;enumeration value="WEIGHTED-ROUND-ROBIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ETHERNET-COUPLING-PORT-SCHEDULER-ENUM--SIMPLE")
@XmlEnum
public enum ETHERNETCOUPLINGPORTSCHEDULERENUMSIMPLE {


    /**
     * Schedule algorithm "deficit round robin"
     * 
     */
    @XmlEnumValue("DEFICIT-ROUND-ROBIN")
    DEFICIT___ROUND___ROBIN("DEFICIT-ROUND-ROBIN"),

    /**
     * Schedule algorithm "strict priority"
     * 
     */
    @XmlEnumValue("STRICT-PRIORITY")
    STRICT___PRIORITY("STRICT-PRIORITY"),

    /**
     * Schedule algorithm "weighted round robin"
     * 
     */
    @XmlEnumValue("WEIGHTED-ROUND-ROBIN")
    WEIGHTED___ROUND___ROBIN("WEIGHTED-ROUND-ROBIN");
    private final String value;

    ETHERNETCOUPLINGPORTSCHEDULERENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ETHERNETCOUPLINGPORTSCHEDULERENUMSIMPLE fromValue(String v) {
        for (ETHERNETCOUPLINGPORTSCHEDULERENUMSIMPLE c: ETHERNETCOUPLINGPORTSCHEDULERENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
