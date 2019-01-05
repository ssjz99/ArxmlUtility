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
 * <p>CONTAINER-I-PDU-TRIGGER-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CONTAINER-I-PDU-TRIGGER-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT-TRIGGER"/>
 *     &lt;enumeration value="FIRST-CONTAINED-TRIGGER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CONTAINER-I-PDU-TRIGGER-ENUM--SIMPLE")
@XmlEnum
public enum CONTAINERIPDUTRIGGERENUMSIMPLE {


    /**
     * Defines that the transmission of the ContainerIPdu shall be requested when the default trigger conditions apply (e.g. timeout of threshold).
     * 
     */
    @XmlEnumValue("DEFAULT-TRIGGER")
    DEFAULT___TRIGGER("DEFAULT-TRIGGER"),

    /**
     * Defines that the transmission of the ContainerIPdu shall be requested right after the first ContainedIPdu was put into the ContainerIPdu.
     * 
     */
    @XmlEnumValue("FIRST-CONTAINED-TRIGGER")
    FIRST___CONTAINED___TRIGGER("FIRST-CONTAINED-TRIGGER");
    private final String value;

    CONTAINERIPDUTRIGGERENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CONTAINERIPDUTRIGGERENUMSIMPLE fromValue(String v) {
        for (CONTAINERIPDUTRIGGERENUMSIMPLE c: CONTAINERIPDUTRIGGERENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
