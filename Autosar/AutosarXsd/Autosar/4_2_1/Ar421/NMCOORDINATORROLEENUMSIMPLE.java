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
 * <p>NM-COORDINATOR-ROLE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="NM-COORDINATOR-ROLE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="PASSIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NM-COORDINATOR-ROLE-ENUM--SIMPLE")
@XmlEnum
public enum NMCOORDINATORROLEENUMSIMPLE {


    /**
     * Coordinator which "actively" performs NmCoordinator functionality at this channel
     * 
     */
    ACTIVE,

    /**
     * Coordinator which "passively" performs NmCoordinator functionality at this channel - used at NmCoordinatorSync use case.
     * 
     */
    PASSIVE;

    public String value() {
        return name();
    }

    public static NMCOORDINATORROLEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
