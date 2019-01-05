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
 * <p>SW-CALIBRATION-ACCESS-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SW-CALIBRATION-ACCESS-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT-ACCESSIBLE"/>
 *     &lt;enumeration value="READ-ONLY"/>
 *     &lt;enumeration value="READ-WRITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SW-CALIBRATION-ACCESS-ENUM--SIMPLE")
@XmlEnum
public enum SWCALIBRATIONACCESSENUMSIMPLE {


    /**
     * The element will not be accessible via MCD tools, i.e. will not appear in the ASAP file.
     * 
     */
    @XmlEnumValue("NOT-ACCESSIBLE")
    NOT___ACCESSIBLE("NOT-ACCESSIBLE"),

    /**
     * The element will only appear as read-only in an ASAP file.
     * 
     */
    @XmlEnumValue("READ-ONLY")
    READ___ONLY("READ-ONLY"),

    /**
     * The element will appear in the ASAP file with both read and write access.
     * 
     */
    @XmlEnumValue("READ-WRITE")
    READ___WRITE("READ-WRITE");
    private final String value;

    SWCALIBRATIONACCESSENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWCALIBRATIONACCESSENUMSIMPLE fromValue(String v) {
        for (SWCALIBRATIONACCESSENUMSIMPLE c: SWCALIBRATIONACCESSENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
