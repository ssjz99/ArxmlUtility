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
 * <p>INTERVAL-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="INTERVAL-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="INFINITE"/>
 *     &lt;enumeration value="OPEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "INTERVAL-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum INTERVALTYPEENUMSIMPLE {


    /**
     * The area is limited by the value given. The value itself is included.
     * 
     */
    CLOSED,

    /**
     * This indicates that the limit is infinite. Note, it is obsolete. Use INF / -INF as value of the limit.
     * 
     */
    INFINITE,

    /**
     * The area is limited by the value given. The value itself is not included.
     * 
     */
    OPEN;

    public String value() {
        return name();
    }

    public static INTERVALTYPEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
