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
 * <p>STORAGE-CONDITION-STATUS-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="STORAGE-CONDITION-STATUS-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVENT-STORAGE-DISABLED"/>
 *     &lt;enumeration value="EVENT-STORAGE-ENABLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "STORAGE-CONDITION-STATUS-ENUM--SIMPLE")
@XmlEnum
public enum STORAGECONDITIONSTATUSENUMSIMPLE {


    /**
     * Storage of a diagnostic event is disabled.
     * 
     */
    @XmlEnumValue("EVENT-STORAGE-DISABLED")
    EVENT___STORAGE___DISABLED("EVENT-STORAGE-DISABLED"),

    /**
     * Storage of a diagnostic event is enabled.
     * 
     */
    @XmlEnumValue("EVENT-STORAGE-ENABLED")
    EVENT___STORAGE___ENABLED("EVENT-STORAGE-ENABLED");
    private final String value;

    STORAGECONDITIONSTATUSENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STORAGECONDITIONSTATUSENUMSIMPLE fromValue(String v) {
        for (STORAGECONDITIONSTATUSENUMSIMPLE c: STORAGECONDITIONSTATUSENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
