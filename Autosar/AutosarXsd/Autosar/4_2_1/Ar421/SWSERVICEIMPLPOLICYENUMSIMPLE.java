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
 * <p>SW-SERVICE-IMPL-POLICY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SW-SERVICE-IMPL-POLICY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INLINE"/>
 *     &lt;enumeration value="INLINE-CONDITIONAL"/>
 *     &lt;enumeration value="MACRO"/>
 *     &lt;enumeration value="STANDARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SW-SERVICE-IMPL-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum SWSERVICEIMPLPOLICYENUMSIMPLE {


    /**
     * inline service definition.
     * 
     */
    INLINE("INLINE"),

    /**
     * The service (in AUTOSAR: BswModuleEntry) is implemented in a way that it either resolves to an inline function or to a standard function depending on conditions set at a later point in time.
     * 
     * This could be handled by using the AUTOSAR compiler abstraction macros (INLINE, LOCAL_INLINE) and/or by further compiler switches depending on ECU configuration values.
     * 
     */
    @XmlEnumValue("INLINE-CONDITIONAL")
    INLINE___CONDITIONAL("INLINE-CONDITIONAL"),

    /**
     * macro service definition.
     * 
     */
    MACRO("MACRO"),

    /**
     * Standard service and default value, if nothing is defined.
     * 
     */
    STANDARD("STANDARD");
    private final String value;

    SWSERVICEIMPLPOLICYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWSERVICEIMPLPOLICYENUMSIMPLE fromValue(String v) {
        for (SWSERVICEIMPLPOLICYENUMSIMPLE c: SWSERVICEIMPLPOLICYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
