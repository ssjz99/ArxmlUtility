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
 * <p>PDU-COLLECTION-TRIGGER-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PDU-COLLECTION-TRIGGER-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALWAYS"/>
 *     &lt;enumeration value="NEVER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PDU-COLLECTION-TRIGGER-ENUM--SIMPLE")
@XmlEnum
public enum PDUCOLLECTIONTRIGGERENUMSIMPLE {


    /**
     * Pdu will trigger the transmission of the socket buffer.
     * 
     */
    ALWAYS,

    /**
     * Pdu will be buffered and will not trigger the transmission of the socket buffer.
     * 
     */
    NEVER;

    public String value() {
        return name();
    }

    public static PDUCOLLECTIONTRIGGERENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
