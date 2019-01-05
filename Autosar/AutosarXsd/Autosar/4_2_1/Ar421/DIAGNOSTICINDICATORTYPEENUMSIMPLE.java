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
 * <p>DIAGNOSTIC-INDICATOR-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-INDICATOR-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMBER-WARNING"/>
 *     &lt;enumeration value="MALFUNCTION"/>
 *     &lt;enumeration value="PROTECT-LAMP"/>
 *     &lt;enumeration value="RED-STOP-LAMP"/>
 *     &lt;enumeration value="WARNING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-INDICATOR-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICINDICATORTYPEENUMSIMPLE {


    /**
     * Amber Warning Lamp
     * 
     */
    @XmlEnumValue("AMBER-WARNING")
    AMBER___WARNING("AMBER-WARNING"),

    /**
     * Malfunction Indicator Lamp
     * 
     */
    MALFUNCTION("MALFUNCTION"),

    /**
     * Protect Lamp
     * 
     */
    @XmlEnumValue("PROTECT-LAMP")
    PROTECT___LAMP("PROTECT-LAMP"),

    /**
     * Red Stop Lamp
     * 
     */
    @XmlEnumValue("RED-STOP-LAMP")
    RED___STOP___LAMP("RED-STOP-LAMP"),

    /**
     * Warning
     * 
     */
    WARNING("WARNING");
    private final String value;

    DIAGNOSTICINDICATORTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICINDICATORTYPEENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICINDICATORTYPEENUMSIMPLE c: DIAGNOSTICINDICATORTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
