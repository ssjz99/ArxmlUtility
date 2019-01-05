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
 * <p>SO-AD-PROTOCOL-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SO-AD-PROTOCOL-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TCP"/>
 *     &lt;enumeration value="UDP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SO-AD-PROTOCOL-TYPE--SIMPLE")
@XmlEnum
public enum SOADPROTOCOLTYPESIMPLE {


    /**
     * Transmission Control Protocol (TCP) enables two hosts to establish a connection and exchange streams of data.
     * 
     */
    TCP,

    /**
     * User Datagram Protocol (UDP) offers a connectionless way to send and receive datagrams over an IP network. It's used primarily for broadcasting messages over a network.
     * 
     */
    UDP;

    public String value() {
        return name();
    }

    public static SOADPROTOCOLTYPESIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
