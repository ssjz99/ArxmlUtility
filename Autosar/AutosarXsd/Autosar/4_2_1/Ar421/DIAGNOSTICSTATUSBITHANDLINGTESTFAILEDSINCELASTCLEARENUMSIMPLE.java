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
 * <p>DIAGNOSTIC-STATUS-BIT-HANDLING-TEST-FAILED-SINCE-LAST-CLEAR-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-STATUS-BIT-HANDLING-TEST-FAILED-SINCE-LAST-CLEAR-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STATUS-BIT-AGING-AND-DISPLACEMENT"/>
 *     &lt;enumeration value="STATUS-BIT-NORMAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-STATUS-BIT-HANDLING-TEST-FAILED-SINCE-LAST-CLEAR-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEARENUMSIMPLE {

    @XmlEnumValue("STATUS-BIT-AGING-AND-DISPLACEMENT")
    STATUS___BIT___AGING___AND___DISPLACEMENT("STATUS-BIT-AGING-AND-DISPLACEMENT"),
    @XmlEnumValue("STATUS-BIT-NORMAL")
    STATUS___BIT___NORMAL("STATUS-BIT-NORMAL");
    private final String value;

    DIAGNOSTICSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEARENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEARENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEARENUMSIMPLE c: DIAGNOSTICSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEARENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
