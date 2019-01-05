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
 * <p>HANDLE-TERMINATION-AND-RESTART-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="HANDLE-TERMINATION-AND-RESTART-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAN-BE-TERMINATED"/>
 *     &lt;enumeration value="CAN-BE-TERMINATED-AND-RESTARTED"/>
 *     &lt;enumeration value="NO-SUPPORT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HANDLE-TERMINATION-AND-RESTART-ENUM--SIMPLE")
@XmlEnum
public enum HANDLETERMINATIONANDRESTARTENUMSIMPLE {


    /**
     * Supports termination.
     * 
     */
    @XmlEnumValue("CAN-BE-TERMINATED")
    CAN___BE___TERMINATED("CAN-BE-TERMINATED"),

    /**
     * Supports termination and restarting.
     * 
     */
    @XmlEnumValue("CAN-BE-TERMINATED-AND-RESTARTED")
    CAN___BE___TERMINATED___AND___RESTARTED("CAN-BE-TERMINATED-AND-RESTARTED"),

    /**
     * Stop and restart is not supported at all.
     * 
     */
    @XmlEnumValue("NO-SUPPORT")
    NO___SUPPORT("NO-SUPPORT");
    private final String value;

    HANDLETERMINATIONANDRESTARTENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HANDLETERMINATIONANDRESTARTENUMSIMPLE fromValue(String v) {
        for (HANDLETERMINATIONANDRESTARTENUMSIMPLE c: HANDLETERMINATIONANDRESTARTENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
