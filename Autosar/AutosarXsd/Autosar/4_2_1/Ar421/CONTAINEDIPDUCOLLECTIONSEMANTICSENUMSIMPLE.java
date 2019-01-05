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
 * <p>CONTAINED-I-PDU-COLLECTION-SEMANTICS-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CONTAINED-I-PDU-COLLECTION-SEMANTICS-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LAST-IS-BEST"/>
 *     &lt;enumeration value="QUEUED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CONTAINED-I-PDU-COLLECTION-SEMANTICS-ENUM--SIMPLE")
@XmlEnum
public enum CONTAINEDIPDUCOLLECTIONSEMANTICSENUMSIMPLE {


    /**
     * The ContainedIPdu data will be fetched via TriggerTransmit just before the transmission executes.
     * 
     */
    @XmlEnumValue("LAST-IS-BEST")
    LAST___IS___BEST("LAST-IS-BEST"),

    /**
     * The ContainedIPdu data will instantly be stored to the ContainerIPdu in the context of the Transmit API.
     * 
     */
    QUEUED("QUEUED");
    private final String value;

    CONTAINEDIPDUCOLLECTIONSEMANTICSENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CONTAINEDIPDUCOLLECTIONSEMANTICSENUMSIMPLE fromValue(String v) {
        for (CONTAINEDIPDUCOLLECTIONSEMANTICSENUMSIMPLE c: CONTAINEDIPDUCOLLECTIONSEMANTICSENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
