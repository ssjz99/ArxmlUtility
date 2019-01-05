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
 * <p>DIAGNOSTIC-OCCURRENCE-COUNTER-PROCESSING-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-OCCURRENCE-COUNTER-PROCESSING-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFIRMED-DTC-BIT"/>
 *     &lt;enumeration value="TEST-FAILED-BIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-OCCURRENCE-COUNTER-PROCESSING-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICOCCURRENCECOUNTERPROCESSINGENUMSIMPLE {


    /**
     * The occurrence counter is triggered by the TestFailed bit if the fault confirmation was successful (ConfirmedDTC bit is set).
     * 
     */
    @XmlEnumValue("CONFIRMED-DTC-BIT")
    CONFIRMED___DTC___BIT("CONFIRMED-DTC-BIT"),

    /**
     * The occurrence counter is only triggered by the TestFailed bit (and the fault confirmation is not considered).
     * 
     */
    @XmlEnumValue("TEST-FAILED-BIT")
    TEST___FAILED___BIT("TEST-FAILED-BIT");
    private final String value;

    DIAGNOSTICOCCURRENCECOUNTERPROCESSINGENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICOCCURRENCECOUNTERPROCESSINGENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICOCCURRENCECOUNTERPROCESSINGENUMSIMPLE c: DIAGNOSTICOCCURRENCECOUNTERPROCESSINGENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
