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
 * <p>EXECUTION-TIME-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="EXECUTION-TIME-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GROSS"/>
 *     &lt;enumeration value="NET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EXECUTION-TIME-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum EXECUTIONTIMETYPEENUMSIMPLE {


    /**
     * Indicates that the given execution time is the time used to execute the ExecutableEntity without any interruption and and including external calls.
     * 
     */
    GROSS,

    /**
     * Indicates that the given execution time is the time used to execute the ExecutableEntity without any interruption and without any external calls.
     * 
     */
    NET;

    public String value() {
        return name();
    }

    public static EXECUTIONTIMETYPEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
