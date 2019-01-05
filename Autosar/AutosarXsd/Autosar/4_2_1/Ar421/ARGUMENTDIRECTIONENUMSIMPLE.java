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
 * <p>ARGUMENT-DIRECTION-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ARGUMENT-DIRECTION-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="INOUT"/>
 *     &lt;enumeration value="OUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ARGUMENT-DIRECTION-ENUM--SIMPLE")
@XmlEnum
public enum ARGUMENTDIRECTIONENUMSIMPLE {


    /**
     * The argument value is passed to the callee.
     * 
     */
    IN,

    /**
     * The argument value is passed to the callee but also passed back from the callee to the caller.
     * 
     */
    INOUT,

    /**
     * The argument value is passed from the callee  to the caller.
     * 
     */
    OUT;

    public String value() {
        return name();
    }

    public static ARGUMENTDIRECTIONENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
