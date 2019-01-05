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
 * <p>COMMUNICATION-DIRECTION-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="COMMUNICATION-DIRECTION-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="OUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COMMUNICATION-DIRECTION-TYPE--SIMPLE")
@XmlEnum
public enum COMMUNICATIONDIRECTIONTYPESIMPLE {


    /**
     * Reception (Input)
     * 
     */
    IN,

    /**
     * Transmission (Output)
     * 
     */
    OUT;

    public String value() {
        return name();
    }

    public static COMMUNICATIONDIRECTIONTYPESIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
