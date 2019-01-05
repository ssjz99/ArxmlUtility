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
 * <p>HANDLE-TIMEOUT-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="HANDLE-TIMEOUT-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="REPLACE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HANDLE-TIMEOUT-ENUM--SIMPLE")
@XmlEnum
public enum HANDLETIMEOUTENUMSIMPLE {


    /**
     * If set to none no replacement shall take place.
     * 
     */
    NONE,

    /**
     * If set to replace, the replacement value used shall be the  ComInitValue.
     * 
     */
    REPLACE;

    public String value() {
        return name();
    }

    public static HANDLETIMEOUTENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
