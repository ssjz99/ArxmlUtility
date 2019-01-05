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
 * <p>CAN-ADDRESSING-MODE-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CAN-ADDRESSING-MODE-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXTENDED"/>
 *     &lt;enumeration value="STANDARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CAN-ADDRESSING-MODE-TYPE--SIMPLE")
@XmlEnum
public enum CANADDRESSINGMODETYPESIMPLE {


    /**
     * Extended 29-bit-identifiers are used (CAN 2.0B)
     * 
     */
    EXTENDED,

    /**
     * Standard 11-bit-identifiers are used (CAN 2.0A)
     * 
     */
    STANDARD;

    public String value() {
        return name();
    }

    public static CANADDRESSINGMODETYPESIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
