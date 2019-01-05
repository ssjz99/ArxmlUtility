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
 * <p>DIAGNOSTIC-EVENT-KIND-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-EVENT-KIND-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BSW"/>
 *     &lt;enumeration value="SWC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-EVENT-KIND-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICEVENTKINDENUMSIMPLE {


    /**
     * The event is assigned to a BSW module.
     * 
     */
    BSW,

    /**
     * The event is assigned to a SWC.
     * 
     */
    SWC;

    public String value() {
        return name();
    }

    public static DIAGNOSTICEVENTKINDENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
