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
 * <p>DIAGNOSTIC-SERVICE-REQUEST-CALLBACK-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-SERVICE-REQUEST-CALLBACK-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUEST-CALLBACK-TYPE-MANUFACTURER"/>
 *     &lt;enumeration value="REQUEST-CALLBACK-TYPE-SUPPLIER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-SERVICE-REQUEST-CALLBACK-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICSERVICEREQUESTCALLBACKTYPEENUMSIMPLE {


    /**
     * This represents the case that the usage of PortInterface ServiceRequestNotification has the characteristics of being used by a manufacturer.
     * 
     */
    @XmlEnumValue("REQUEST-CALLBACK-TYPE-MANUFACTURER")
    REQUEST___CALLBACK___TYPE___MANUFACTURER("REQUEST-CALLBACK-TYPE-MANUFACTURER"),

    /**
     * This represents the case that the usage of PortInterface ServiceRequestNotification has the characteristics of being used by a supplier.
     * 
     */
    @XmlEnumValue("REQUEST-CALLBACK-TYPE-SUPPLIER")
    REQUEST___CALLBACK___TYPE___SUPPLIER("REQUEST-CALLBACK-TYPE-SUPPLIER");
    private final String value;

    DIAGNOSTICSERVICEREQUESTCALLBACKTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICSERVICEREQUESTCALLBACKTYPEENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICSERVICEREQUESTCALLBACKTYPEENUMSIMPLE c: DIAGNOSTICSERVICEREQUESTCALLBACKTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
