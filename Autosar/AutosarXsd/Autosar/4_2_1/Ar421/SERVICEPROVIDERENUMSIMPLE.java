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
 * <p>SERVICE-PROVIDER-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SERVICE-PROVIDER-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY-STANDARDIZED"/>
 *     &lt;enumeration value="BASIC-SOFTWARE-MODE-MANAGER"/>
 *     &lt;enumeration value="COM-MANAGER"/>
 *     &lt;enumeration value="CRYPTO-SERVICE-MANAGER"/>
 *     &lt;enumeration value="DEVELOPMENT-ERROR-TRACER"/>
 *     &lt;enumeration value="DIAGNOSTIC-COMMUNICATION-MANAGER"/>
 *     &lt;enumeration value="DIAGNOSTIC-EVENT-MANAGER"/>
 *     &lt;enumeration value="DIAGNOSTIC-LOG-AND-TRACE"/>
 *     &lt;enumeration value="ECU-MANAGER"/>
 *     &lt;enumeration value="FUNCTION-INHIBITION-MANAGER"/>
 *     &lt;enumeration value="NON-VOLATILE-RAM-MANAGER"/>
 *     &lt;enumeration value="OPERATING-SYSTEM"/>
 *     &lt;enumeration value="SYNC-BASE-TIME-MANAGER"/>
 *     &lt;enumeration value="VENDOR-SPECIFIC"/>
 *     &lt;enumeration value="WATCH-DOG-MANAGER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SERVICE-PROVIDER-ENUM--SIMPLE")
@XmlEnum
public enum SERVICEPROVIDERENUMSIMPLE {


    /**
     * This value means that the specific nature is either unknown or it is not important for the given purpose. This is also the default value for any attribute of type ServiceProviderEnum
     * 
     */
    @XmlEnumValue("ANY-STANDARDIZED")
    ANY___STANDARDIZED("ANY-STANDARDIZED"),

    /**
     * The service relates to the Basic Software Mode Manager (BswM)
     * 
     */
    @XmlEnumValue("BASIC-SOFTWARE-MODE-MANAGER")
    BASIC___SOFTWARE___MODE___MANAGER("BASIC-SOFTWARE-MODE-MANAGER"),

    /**
     * The service relates to the COM Manager (ComM).
     * 
     */
    @XmlEnumValue("COM-MANAGER")
    COM___MANAGER("COM-MANAGER"),

    /**
     * The service relates to the Crypto Service Manager (CsM).
     * 
     */
    @XmlEnumValue("CRYPTO-SERVICE-MANAGER")
    CRYPTO___SERVICE___MANAGER("CRYPTO-SERVICE-MANAGER"),

    /**
     * The service relates to the Development Error Tracer (DET).
     * 
     */
    @XmlEnumValue("DEVELOPMENT-ERROR-TRACER")
    DEVELOPMENT___ERROR___TRACER("DEVELOPMENT-ERROR-TRACER"),

    /**
     * The service relates to the Diagnostic Communication Manager (DCM).
     * 
     */
    @XmlEnumValue("DIAGNOSTIC-COMMUNICATION-MANAGER")
    DIAGNOSTIC___COMMUNICATION___MANAGER("DIAGNOSTIC-COMMUNICATION-MANAGER"),

    /**
     * The service relates to the Diagnostic Event Manager (DEM).
     * 
     */
    @XmlEnumValue("DIAGNOSTIC-EVENT-MANAGER")
    DIAGNOSTIC___EVENT___MANAGER("DIAGNOSTIC-EVENT-MANAGER"),

    /**
     * The service relates to the Diagnostic Log and Trace (DLT).
     * 
     */
    @XmlEnumValue("DIAGNOSTIC-LOG-AND-TRACE")
    DIAGNOSTIC___LOG___AND___TRACE("DIAGNOSTIC-LOG-AND-TRACE"),

    /**
     * The service relates to the ECU Manager (EcuM).
     * 
     */
    @XmlEnumValue("ECU-MANAGER")
    ECU___MANAGER("ECU-MANAGER"),

    /**
     * The service relates to the Function Inhibition Manager (FIM).
     * 
     */
    @XmlEnumValue("FUNCTION-INHIBITION-MANAGER")
    FUNCTION___INHIBITION___MANAGER("FUNCTION-INHIBITION-MANAGER"),

    /**
     * The service relates to the Non-Volatile RAM Manager (NvM).
     * 
     */
    @XmlEnumValue("NON-VOLATILE-RAM-MANAGER")
    NON___VOLATILE___RAM___MANAGER("NON-VOLATILE-RAM-MANAGER"),

    /**
     * The service relates to the Operating System (OS).
     * 
     */
    @XmlEnumValue("OPERATING-SYSTEM")
    OPERATING___SYSTEM("OPERATING-SYSTEM"),

    /**
     * The service relates to the Sync Time Base Manager (StbM).
     * 
     */
    @XmlEnumValue("SYNC-BASE-TIME-MANAGER")
    SYNC___BASE___TIME___MANAGER("SYNC-BASE-TIME-MANAGER"),

    /**
     * This value denotes a vendor-specific service.
     * 
     */
    @XmlEnumValue("VENDOR-SPECIFIC")
    VENDOR___SPECIFIC("VENDOR-SPECIFIC"),

    /**
     * The service relates to the Watchdog Manager (WdgM).
     * 
     */
    @XmlEnumValue("WATCH-DOG-MANAGER")
    WATCH___DOG___MANAGER("WATCH-DOG-MANAGER");
    private final String value;

    SERVICEPROVIDERENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SERVICEPROVIDERENUMSIMPLE fromValue(String v) {
        for (SERVICEPROVIDERENUMSIMPLE c: SERVICEPROVIDERENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
