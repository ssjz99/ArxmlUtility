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
 * <p>TRANSFER-PROPERTY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TRANSFER-PROPERTY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="TRIGGERED"/>
 *     &lt;enumeration value="TRIGGERED-ON-CHANGE"/>
 *     &lt;enumeration value="TRIGGERED-ON-CHANGE-WITHOUT-REPETITION"/>
 *     &lt;enumeration value="TRIGGERED-WITHOUT-REPETITION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TRANSFER-PROPERTY-ENUM--SIMPLE")
@XmlEnum
public enum TRANSFERPROPERTYENUMSIMPLE {


    /**
     * If the signal has the TransferProperty pending, then the function Com_SendSignal shall not perform a transmission of the IPdu associated with the signal.
     * 
     */
    PENDING("PENDING"),

    /**
     * The signal in the assigned IPdu is updated and a request for the IPdu's transmission is made.
     * 
     */
    TRIGGERED("TRIGGERED"),

    /**
     * The signal in the assigned IPdu is updated and a request for the IPdus transmission is made only if the signal value is different from the already stored signal value.
     * 
     */
    @XmlEnumValue("TRIGGERED-ON-CHANGE")
    TRIGGERED___ON___CHANGE("TRIGGERED-ON-CHANGE"),

    /**
     * The signal in the assigned IPdu is updated and a request for the IPdus transmission is made only if the signal value is different from the already stored signal value.  In the DIRECT/N-TIMES or MIXED transmission mode (EventControlledTiming) the IPdu will be transmitted just once without a repetition, independent of the defined NumberOfRepeats.
     * 
     */
    @XmlEnumValue("TRIGGERED-ON-CHANGE-WITHOUT-REPETITION")
    TRIGGERED___ON___CHANGE___WITHOUT___REPETITION("TRIGGERED-ON-CHANGE-WITHOUT-REPETITION"),

    /**
     * The signal in the assigned IPdu is updated and a request for the IPdu's transmission is made. In the DIRECT/N-TIMES or MIXED transmission mode (EventControlledTiming) the IPdu will be transmitted just once without a repetition, independent of the defined NumberOfRepeats.
     * 
     */
    @XmlEnumValue("TRIGGERED-WITHOUT-REPETITION")
    TRIGGERED___WITHOUT___REPETITION("TRIGGERED-WITHOUT-REPETITION");
    private final String value;

    TRANSFERPROPERTYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TRANSFERPROPERTYENUMSIMPLE fromValue(String v) {
        for (TRANSFERPROPERTYENUMSIMPLE c: TRANSFERPROPERTYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
