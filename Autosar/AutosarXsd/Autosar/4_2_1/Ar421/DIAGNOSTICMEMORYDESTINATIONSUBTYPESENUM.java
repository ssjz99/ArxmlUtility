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
 * <p>DIAGNOSTIC-MEMORY-DESTINATION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-MEMORY-DESTINATION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-DESTINATION"/>
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-DESTINATION-MIRROR"/>
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY"/>
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-MEMORY-DESTINATION--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICMEMORYDESTINATIONSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION")
    DIAGNOSTIC___MEMORY___DESTINATION("DIAGNOSTIC-MEMORY-DESTINATION"),
    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-MIRROR")
    DIAGNOSTIC___MEMORY___DESTINATION___MIRROR("DIAGNOSTIC-MEMORY-DESTINATION-MIRROR"),
    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY")
    DIAGNOSTIC___MEMORY___DESTINATION___PRIMARY("DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY"),
    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED")
    DIAGNOSTIC___MEMORY___DESTINATION___USER___DEFINED("DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED");
    private final String value;

    DIAGNOSTICMEMORYDESTINATIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICMEMORYDESTINATIONSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICMEMORYDESTINATIONSUBTYPESENUM c: DIAGNOSTICMEMORYDESTINATIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
