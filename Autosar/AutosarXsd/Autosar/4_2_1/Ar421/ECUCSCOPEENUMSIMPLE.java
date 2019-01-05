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
 * <p>ECUC-SCOPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECUC-SCOPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECU"/>
 *     &lt;enumeration value="LOCAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECUC-SCOPE-ENUM--SIMPLE")
@XmlEnum
public enum ECUCSCOPEENUMSIMPLE {


    /**
     * An element may be shared with other modules.
     * 
     */
    ECU,

    /**
     * An element is only be applicable for the module it is defined in.
     * 
     */
    LOCAL;

    public String value() {
        return name();
    }

    public static ECUCSCOPEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
