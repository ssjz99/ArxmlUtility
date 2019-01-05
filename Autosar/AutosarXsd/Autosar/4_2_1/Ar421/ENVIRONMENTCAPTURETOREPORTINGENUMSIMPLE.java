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
 * <p>ENVIRONMENT-CAPTURE-TO-REPORTING-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ENVIRONMENT-CAPTURE-TO-REPORTING-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAPTURE-ASYNCHRONOUS-TO-REPORTING"/>
 *     &lt;enumeration value="CAPTURE-SYNCHRONOUS-TO-REPORTING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ENVIRONMENT-CAPTURE-TO-REPORTING-ENUM--SIMPLE")
@XmlEnum
public enum ENVIRONMENTCAPTURETOREPORTINGENUMSIMPLE {


    /**
     * The data capturing is postponed to the next cycle of the Dem_Mainfunction. (This means that there is a minimum delay between report of the failure and capturing the data.
     * 
     */
    @XmlEnumValue("CAPTURE-ASYNCHRONOUS-TO-REPORTING")
    CAPTURE___ASYNCHRONOUS___TO___REPORTING("CAPTURE-ASYNCHRONOUS-TO-REPORTING"),

    /**
     * The data is captured immediately within the reporting function (i.e. in the context of the setEventStatus/reportErrorStatus function).
     * 
     */
    @XmlEnumValue("CAPTURE-SYNCHRONOUS-TO-REPORTING")
    CAPTURE___SYNCHRONOUS___TO___REPORTING("CAPTURE-SYNCHRONOUS-TO-REPORTING");
    private final String value;

    ENVIRONMENTCAPTURETOREPORTINGENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ENVIRONMENTCAPTURETOREPORTINGENUMSIMPLE fromValue(String v) {
        for (ENVIRONMENTCAPTURETOREPORTINGENUMSIMPLE c: ENVIRONMENTCAPTURETOREPORTINGENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
