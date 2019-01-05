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
 * <p>SW-VARIABLE-ACCESS-IMPL-POLICY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SW-VARIABLE-ACCESS-IMPL-POLICY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIRECT"/>
 *     &lt;enumeration value="OPTIMIZED"/>
 *     &lt;enumeration value="SELECTABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SW-VARIABLE-ACCESS-IMPL-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum SWVARIABLEACCESSIMPLPOLICYENUMSIMPLE {


    /**
     * Messages with DIRECT access are read but ignored by data consistency tool. Data consistency
     * is not guaranteed.
     * 
     */
    DIRECT,

    /**
     * A Tool handles data consistency. 
     * 
     * In SwService, where a message is referenced, only OPTIMIZED access (also default
     * value inside SwServcie) is possible.
     * 
     */
    OPTIMIZED,

    /**
     * The user can decide inside each single service, where these message is referenced, if
     * access to that shall be OPTIMIZED or DIRECT.
     * 
     */
    SELECTABLE;

    public String value() {
        return name();
    }

    public static SWVARIABLEACCESSIMPLPOLICYENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
