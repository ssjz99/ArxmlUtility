//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DIAGNOSTIC-ROUTINE-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-ROUTINE-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASYNCHRONOUS"/>
 *     &lt;enumeration value="SYNCHRONOUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-ROUTINE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICROUTINETYPEENUMSIMPLE {


    /**
     * This indicates that the diagnostic server is not blocked while the diagnostic routine is running.
     * 
     */
    ASYNCHRONOUS,

    /**
     * This indicates that the diagnostic routine blocks the diagnostic server in the ECU while the routine is running.
     * 
     */
    SYNCHRONOUS;

    public String value() {
        return name();
    }

    public static DIAGNOSTICROUTINETYPEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
