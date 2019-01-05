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
 * <p>TD-EVENT-OPERATION-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-OPERATION-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPERATION-CALL-RECEIVED"/>
 *     &lt;enumeration value="OPERATION-CALL-RESPONSE-RECEIVED"/>
 *     &lt;enumeration value="OPERATION-CALL-RESPONSE-SENT"/>
 *     &lt;enumeration value="OPERATION-CALLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-OPERATION-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TDEVENTOPERATIONTYPEENUMSIMPLE {


    /**
     * A point in time where the call of the referenced operation is received by the server SWC.
     * 
     */
    @XmlEnumValue("OPERATION-CALL-RECEIVED")
    OPERATION___CALL___RECEIVED("OPERATION-CALL-RECEIVED"),

    /**
     * A point in time where the client SWC has received the response of the referenced operation call.
     * 
     */
    @XmlEnumValue("OPERATION-CALL-RESPONSE-RECEIVED")
    OPERATION___CALL___RESPONSE___RECEIVED("OPERATION-CALL-RESPONSE-RECEIVED"),

    /**
     * A point in time where the server SWC has terminated with the execution of the referenced operation, and has sent out a response.
     * 
     */
    @XmlEnumValue("OPERATION-CALL-RESPONSE-SENT")
    OPERATION___CALL___RESPONSE___SENT("OPERATION-CALL-RESPONSE-SENT"),

    /**
     * A point in time where the referenced operation is called by the client SWC.
     * 
     */
    @XmlEnumValue("OPERATION-CALLED")
    OPERATION___CALLED("OPERATION-CALLED");
    private final String value;

    TDEVENTOPERATIONTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTOPERATIONTYPEENUMSIMPLE fromValue(String v) {
        for (TDEVENTOPERATIONTYPEENUMSIMPLE c: TDEVENTOPERATIONTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
