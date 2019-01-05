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
 * <p>TD-EVENT-FRAME-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-FRAME-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FRAME-QUEUED-FOR-TRANSMISSION"/>
 *     &lt;enumeration value="FRAME-RECEIVED-BY-IF"/>
 *     &lt;enumeration value="FRAME-TRANSMITTED-ON-BUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-FRAME-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TDEVENTFRAMETYPEENUMSIMPLE {


    /**
     * A point in time where the frame containing the named signal / I-PDU is queued for transmission within the related Communication Driver.
     * 
     */
    @XmlEnumValue("FRAME-QUEUED-FOR-TRANSMISSION")
    FRAME___QUEUED___FOR___TRANSMISSION("FRAME-QUEUED-FOR-TRANSMISSION"),

    /**
     * A point in time where the frame is pushed from the subscriber's communication controller to the corresponding (FlexRay / CAN / LIN) Interface BSW module.
     * 
     */
    @XmlEnumValue("FRAME-RECEIVED-BY-IF")
    FRAME___RECEIVED___BY___IF("FRAME-RECEIVED-BY-IF"),

    /**
     * A point in time where the transmission of the frame completes successfully, and the subscriber's communication controller receives the frame from the bus.
     * 
     */
    @XmlEnumValue("FRAME-TRANSMITTED-ON-BUS")
    FRAME___TRANSMITTED___ON___BUS("FRAME-TRANSMITTED-ON-BUS");
    private final String value;

    TDEVENTFRAMETYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTFRAMETYPEENUMSIMPLE fromValue(String v) {
        for (TDEVENTFRAMETYPEENUMSIMPLE c: TDEVENTFRAMETYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
