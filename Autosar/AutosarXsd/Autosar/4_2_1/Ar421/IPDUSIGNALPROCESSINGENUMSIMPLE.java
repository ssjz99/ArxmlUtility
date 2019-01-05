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
 * <p>I-PDU-SIGNAL-PROCESSING-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="I-PDU-SIGNAL-PROCESSING-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFERRED"/>
 *     &lt;enumeration value="IMMEDIATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "I-PDU-SIGNAL-PROCESSING-ENUM--SIMPLE")
@XmlEnum
public enum IPDUSIGNALPROCESSINGENUMSIMPLE {


    /**
     * The signal indications / confirmations are deferred.
     * 
     */
    DEFERRED,

    /**
     * The signal indications / confirmations are performed.
     * 
     */
    IMMEDIATE;

    public String value() {
        return name();
    }

    public static IPDUSIGNALPROCESSINGENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
