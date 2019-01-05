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
 * <p>REPORT-BEHAVIOR-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="REPORT-BEHAVIOR-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REPORT-AFTER-INIT"/>
 *     &lt;enumeration value="REPORT-BEFORE-INIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "REPORT-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum REPORTBEHAVIORENUMSIMPLE {


    /**
     * This allows reporting related events after initialization
     * 
     */
    @XmlEnumValue("REPORT-AFTER-INIT")
    REPORT___AFTER___INIT("REPORT-AFTER-INIT"),

    /**
     * This allows reporting related events before initialization
     * 
     */
    @XmlEnumValue("REPORT-BEFORE-INIT")
    REPORT___BEFORE___INIT("REPORT-BEFORE-INIT");
    private final String value;

    REPORTBEHAVIORENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static REPORTBEHAVIORENUMSIMPLE fromValue(String v) {
        for (REPORTBEHAVIORENUMSIMPLE c: REPORTBEHAVIORENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
