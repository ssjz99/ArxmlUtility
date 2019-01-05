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
 * <p>DIAGNOSTIC-ACCESS-PERMISSION-VALIDITY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-ACCESS-PERMISSION-VALIDITY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCES-PERRMISSION-SERVICE-CLASS"/>
 *     &lt;enumeration value="ACCESS-PERMISSION-INSTANCE-OVERRIDES-CLASS"/>
 *     &lt;enumeration value="ACCESS-PERMISSION-SERVICE-INSTANCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-ACCESS-PERMISSION-VALIDITY-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICACCESSPERMISSIONVALIDITYENUMSIMPLE {


    /**
     * This means that the DiagnosticServiceClass is in charge to define the accessPermission.
     * 
     */
    @XmlEnumValue("ACCES-PERRMISSION-SERVICE-CLASS")
    ACCES___PERRMISSION___SERVICE___CLASS("ACCES-PERRMISSION-SERVICE-CLASS"),

    /**
     * This means that accessPermission set at the DiagnosticServiceInstance will override the accessPermission defined at the DiagnosticServiceClass.
     * 
     */
    @XmlEnumValue("ACCESS-PERMISSION-INSTANCE-OVERRIDES-CLASS")
    ACCESS___PERMISSION___INSTANCE___OVERRIDES___CLASS("ACCESS-PERMISSION-INSTANCE-OVERRIDES-CLASS"),

    /**
     * This means that the DiagnosticServiceInstance is in charge of defining the accessPermission
     * 
     */
    @XmlEnumValue("ACCESS-PERMISSION-SERVICE-INSTANCE")
    ACCESS___PERMISSION___SERVICE___INSTANCE("ACCESS-PERMISSION-SERVICE-INSTANCE");
    private final String value;

    DIAGNOSTICACCESSPERMISSIONVALIDITYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICACCESSPERMISSIONVALIDITYENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICACCESSPERMISSIONVALIDITYENUMSIMPLE c: DIAGNOSTICACCESSPERMISSIONVALIDITYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
