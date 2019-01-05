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
 * <p>PULSE-TEST-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PULSE-TEST-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISABLE"/>
 *     &lt;enumeration value="ENABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PULSE-TEST-ENUM--SIMPLE")
@XmlEnum
public enum PULSETESTENUMSIMPLE {


    /**
     * Disables the pulse test
     * 
     */
    DISABLE,

    /**
     * Enables the pulse test
     * 
     */
    ENABLE;

    public String value() {
        return name();
    }

    public static PULSETESTENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
