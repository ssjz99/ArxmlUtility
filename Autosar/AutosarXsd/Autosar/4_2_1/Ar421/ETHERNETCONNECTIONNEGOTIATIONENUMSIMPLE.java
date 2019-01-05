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
 * <p>ETHERNET-CONNECTION-NEGOTIATION-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ETHERNET-CONNECTION-NEGOTIATION-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTO"/>
 *     &lt;enumeration value="MASTER"/>
 *     &lt;enumeration value="SLAVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ETHERNET-CONNECTION-NEGOTIATION-ENUM--SIMPLE")
@XmlEnum
public enum ETHERNETCONNECTIONNEGOTIATIONENUMSIMPLE {


    /**
     * Automatic Negotiation
     * 
     */
    AUTO,

    /**
     * Master
     * 
     */
    MASTER,

    /**
     * Slave
     * 
     */
    SLAVE;

    public String value() {
        return name();
    }

    public static ETHERNETCONNECTIONNEGOTIATIONENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
