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
 * <p>PNC-GATEWAY-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PNC-GATEWAY-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="PASSIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PNC-GATEWAY-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum PNCGATEWAYTYPEENUMSIMPLE {


    /**
     * The active PncGateway functionality shall be performed
     * 
     */
    ACTIVE,

    /**
     * No PncGateway functionality shall be performed
     * 
     */
    NONE,

    /**
     * The passive PncGateway functionality shall be performed
     * 
     */
    PASSIVE;

    public String value() {
        return name();
    }

    public static PNCGATEWAYTYPEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
