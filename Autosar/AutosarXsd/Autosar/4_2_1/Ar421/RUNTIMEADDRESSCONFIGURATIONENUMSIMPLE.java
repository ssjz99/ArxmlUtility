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
 * <p>RUNTIME-ADDRESS-CONFIGURATION-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="RUNTIME-ADDRESS-CONFIGURATION-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RUNTIME-ADDRESS-CONFIGURATION-ENUM--SIMPLE")
@XmlEnum
public enum RUNTIMEADDRESSCONFIGURATIONENUMSIMPLE {


    /**
     * Static configuration is used to obtain the address information.
     * 
     */
    NONE,

    /**
     * AUTOSAR Service Discovery is used to obtain the address information.
     * 
     */
    SD;

    public String value() {
        return name();
    }

    public static RUNTIMEADDRESSCONFIGURATIONENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
