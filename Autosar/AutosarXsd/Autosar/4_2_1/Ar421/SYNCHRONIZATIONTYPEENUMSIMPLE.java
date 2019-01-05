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
 * <p>SYNCHRONIZATION-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SYNCHRONIZATION-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESPONSE-SYNCHRONIZATION"/>
 *     &lt;enumeration value="STIMULUS-SYNCHRONIZATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SYNCHRONIZATION-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum SYNCHRONIZATIONTYPEENUMSIMPLE {


    /**
     * In case that the Synchronization Timing Constraint is specified for event chains, the response events of the associated event chains must occur synchronously with respect to the specified tolerance. All associated event chains must have the same stimulus event.
     * 
     * In case that the Synchronization Timing Constraint is specified for events, the associated events must occur synchronously with respect to the specified tolerance. All associated events represent the response events of a common stimulus event, even such a stimulus event is not known yet or not available in the scope of the model.
     * 
     */
    @XmlEnumValue("RESPONSE-SYNCHRONIZATION")
    RESPONSE___SYNCHRONIZATION("RESPONSE-SYNCHRONIZATION"),

    /**
     * In case that the Synchronization Timing Constraint is specified for event chains, the stimulus events of the associated event chains must occur synchronously with respect to the specified tolerance. All associated event chains must have the same response event.
     * 
     * In case that the Synchronization Timing Constraint is specified for events, the associated events must occur synchronously with respect to the specified tolerance. All associated events represent the stimulus events of a common response event, even such a response event is not known yet or not available in the scope of the model.
     * 
     */
    @XmlEnumValue("STIMULUS-SYNCHRONIZATION")
    STIMULUS___SYNCHRONIZATION("STIMULUS-SYNCHRONIZATION");
    private final String value;

    SYNCHRONIZATIONTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SYNCHRONIZATIONTYPEENUMSIMPLE fromValue(String v) {
        for (SYNCHRONIZATIONTYPEENUMSIMPLE c: SYNCHRONIZATIONTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
