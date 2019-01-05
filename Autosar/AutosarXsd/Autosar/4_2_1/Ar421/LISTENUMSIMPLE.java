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
 * <p>LIST-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="LIST-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="UNNUMBER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LIST-ENUM--SIMPLE")
@XmlEnum
public enum LISTENUMSIMPLE {


    /**
     * This indicates that the list is an numerated list.
     * 
     */
    NUMBER,

    /**
     * This indicates that it is an enumeration (bulleted list)
     * 
     */
    UNNUMBER;

    public String value() {
        return name();
    }

    public static LISTENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
