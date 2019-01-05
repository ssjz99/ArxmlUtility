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
 * <p>DISCOVERY-TECHNOLOGY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DISCOVERY-TECHNOLOGY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BONJOUR"/>
 *     &lt;enumeration value="DLNA"/>
 *     &lt;enumeration value="SLP"/>
 *     &lt;enumeration value="SOMEIP"/>
 *     &lt;enumeration value="SSDP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DISCOVERY-TECHNOLOGY-ENUM--SIMPLE")
@XmlEnum
public enum DISCOVERYTECHNOLOGYENUMSIMPLE {


    /**
     * Bonjour Service Discovery
     * 
     */
    BONJOUR,

    /**
     * DLNA UPnP Device Control Protocol Framework
     * 
     */
    DLNA,

    /**
     * Service Location Protocol
     * 
     */
    SLP,

    /**
     * Header format to be used with Remote Procedure Call (RPC) Messages in Client/Server-Communication as well as Sender/Receiver Messages.
     * 
     */
    SOMEIP,

    /**
     * Simple Service Discovery Protocol (SSDP)
     * 
     */
    SSDP;

    public String value() {
        return name();
    }

    public static DISCOVERYTECHNOLOGYENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
