//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DO-IP-ENTITY-ROLE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DO-IP-ENTITY-ROLE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EDGE-NODE"/>
 *     &lt;enumeration value="GATEWAY"/>
 *     &lt;enumeration value="NODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DO-IP-ENTITY-ROLE-ENUM--SIMPLE")
@XmlEnum
public enum DOIPENTITYROLEENUMSIMPLE {


    /**
     * Network node is a DoIP gateway that accepts external connections.
     * 
     */
    @XmlEnumValue("EDGE-NODE")
    EDGE___NODE("EDGE-NODE"),

    /**
     * Network node is a Gateway between the DoIP network and other networks.
     * 
     */
    GATEWAY("GATEWAY"),

    /**
     * Network node is a DoIp node.
     * 
     */
    NODE("NODE");
    private final String value;

    DOIPENTITYROLEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DOIPENTITYROLEENUMSIMPLE fromValue(String v) {
        for (DOIPENTITYROLEENUMSIMPLE c: DOIPENTITYROLEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
