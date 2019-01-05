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
 * <p>REQUEST-METHOD-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="REQUEST-METHOD-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONNECT"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="GET"/>
 *     &lt;enumeration value="HEAD"/>
 *     &lt;enumeration value="OPTIONS"/>
 *     &lt;enumeration value="POST"/>
 *     &lt;enumeration value="PUT"/>
 *     &lt;enumeration value="TRACE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "REQUEST-METHOD-ENUM--SIMPLE")
@XmlEnum
public enum REQUESTMETHODENUMSIMPLE {

    CONNECT,
    DELETE,
    GET,
    HEAD,
    OPTIONS,
    POST,
    PUT,
    TRACE;

    public String value() {
        return name();
    }

    public static REQUESTMETHODENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
