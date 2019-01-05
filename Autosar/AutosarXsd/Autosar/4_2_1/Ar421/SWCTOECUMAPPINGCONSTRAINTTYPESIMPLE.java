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
 * <p>SWC-TO-ECU-MAPPING-CONSTRAINT-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SWC-TO-ECU-MAPPING-CONSTRAINT-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEDICATED"/>
 *     &lt;enumeration value="EXCLUSIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SWC-TO-ECU-MAPPING-CONSTRAINT-TYPE--SIMPLE")
@XmlEnum
public enum SWCTOECUMAPPINGCONSTRAINTTYPESIMPLE {


    /**
     * Dedicated mapping means that the SW-C can only be mapped to the ECUs it is dedicated to.
     * 
     */
    DEDICATED,

    /**
     * Exclusive mapping means that the SW-C cannot be mapped to the ECUs it is excluded from.
     * 
     */
    EXCLUSIVE;

    public String value() {
        return name();
    }

    public static SWCTOECUMAPPINGCONSTRAINTTYPESIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
