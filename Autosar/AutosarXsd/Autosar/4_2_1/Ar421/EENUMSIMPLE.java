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
 * <p>E-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="E-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOLD"/>
 *     &lt;enumeration value="BOLDITALIC"/>
 *     &lt;enumeration value="ITALIC"/>
 *     &lt;enumeration value="PLAIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "E-ENUM--SIMPLE")
@XmlEnum
public enum EENUMSIMPLE {


    /**
     * The emphasis is preferably represented in boldface font.
     * 
     */
    BOLD,

    /**
     * The emphasis is preferably represented in boldface plus italic font.
     * 
     */
    BOLDITALIC,

    /**
     * The emphasis is preferably represented in italic font.
     * 
     */
    ITALIC,

    /**
     * The emphasis has no specific rendering. It is used if e.g. semantic information is applied to the emphasis text.
     * 
     */
    PLAIN;

    public String value() {
        return name();
    }

    public static EENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
