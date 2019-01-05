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
 * <p>DATA-LIMIT-KIND-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DATA-LIMIT-KIND-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAX"/>
 *     &lt;enumeration value="MIN"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DATA-LIMIT-KIND-ENUM--SIMPLE")
@XmlEnum
public enum DATALIMITKINDENUMSIMPLE {


    /**
     * Limitation to maximum value
     * 
     */
    MAX,

    /**
     * Limitation to minimum value
     * 
     */
    MIN,

    /**
     * No limitation applicable
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static DATALIMITKINDENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
