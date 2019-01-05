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
 * <p>LATENCY-CONSTRAINT-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="LATENCY-CONSTRAINT-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGE"/>
 *     &lt;enumeration value="REACTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LATENCY-CONSTRAINT-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum LATENCYCONSTRAINTTYPEENUMSIMPLE {


    /**
     * In this case, the latency constraint is seen from the perspective of the response event of the associated event chain. Given a certain response event, the age interval of the latest stimulus is constrained.
     * 
     */
    AGE,

    /**
     * In this case, the latency constraint is seen from the perspective of the stimulus event of the associated event chain. Given a certain stimulus event, the reaction interval of the first response is constrained.
     * 
     */
    REACTION;

    public String value() {
        return name();
    }

    public static LATENCYCONSTRAINTTYPEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
