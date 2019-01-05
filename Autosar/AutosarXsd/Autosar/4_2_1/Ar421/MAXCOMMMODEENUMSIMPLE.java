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
 * <p>MAX-COMM-MODE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MAX-COMM-MODE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FULL"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SILENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MAX-COMM-MODE-ENUM--SIMPLE")
@XmlEnum
public enum MAXCOMMMODEENUMSIMPLE {


    /**
     * Full communication is requested.
     * 
     */
    FULL,

    /**
     * No communication is requested.
     * 
     */
    NONE,

    /**
     * Silent communication is requested: Only listening but not "talking".
     * 
     */
    SILENT;

    public String value() {
        return name();
    }

    public static MAXCOMMMODEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
