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
 * <p>END-TO-END-PROFILE-BEHAVIOR-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="END-TO-END-PROFILE-BEHAVIOR-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRE--R-4--2"/>
 *     &lt;enumeration value="R-4--2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "END-TO-END-PROFILE-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum ENDTOENDPROFILEBEHAVIORENUMSIMPLE {


    /**
     * Check has the legacy behavior, before AUTOSAR Release 4.2.
     * 
     */
    @XmlEnumValue("PRE--R-4--2")
    PRE____R___4____2("PRE--R-4--2"),

    /**
     * Check behaves like new P4/P5/P6 profiles introduced in AUTOSAR Release 4.2.
     * 
     */
    @XmlEnumValue("R-4--2")
    R___4____2("R-4--2");
    private final String value;

    ENDTOENDPROFILEBEHAVIORENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ENDTOENDPROFILEBEHAVIORENUMSIMPLE fromValue(String v) {
        for (ENDTOENDPROFILEBEHAVIORENUMSIMPLE c: ENDTOENDPROFILEBEHAVIORENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
