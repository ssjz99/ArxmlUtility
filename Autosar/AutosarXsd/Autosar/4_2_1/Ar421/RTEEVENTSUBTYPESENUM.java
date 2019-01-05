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
 * <p>RTE-EVENT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="RTE-EVENT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"/>
 *     &lt;enumeration value="BACKGROUND-EVENT"/>
 *     &lt;enumeration value="DATA-RECEIVE-ERROR-EVENT"/>
 *     &lt;enumeration value="DATA-RECEIVED-EVENT"/>
 *     &lt;enumeration value="DATA-SEND-COMPLETED-EVENT"/>
 *     &lt;enumeration value="DATA-WRITE-COMPLETED-EVENT"/>
 *     &lt;enumeration value="EXTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="INIT-EVENT"/>
 *     &lt;enumeration value="INTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="MODE-SWITCHED-ACK-EVENT"/>
 *     &lt;enumeration value="OPERATION-INVOKED-EVENT"/>
 *     &lt;enumeration value="RTE-EVENT"/>
 *     &lt;enumeration value="SWC-MODE-MANAGER-ERROR-EVENT"/>
 *     &lt;enumeration value="SWC-MODE-SWITCH-EVENT"/>
 *     &lt;enumeration value="TIMING-EVENT"/>
 *     &lt;enumeration value="TRANSFORMER-HARD-ERROR-EVENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RTE-EVENT--SUBTYPES-ENUM")
@XmlEnum
public enum RTEEVENTSUBTYPESENUM {

    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
    ASYNCHRONOUS___SERVER___CALL___RETURNS___EVENT("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"),
    @XmlEnumValue("BACKGROUND-EVENT")
    BACKGROUND___EVENT("BACKGROUND-EVENT"),
    @XmlEnumValue("DATA-RECEIVE-ERROR-EVENT")
    DATA___RECEIVE___ERROR___EVENT("DATA-RECEIVE-ERROR-EVENT"),
    @XmlEnumValue("DATA-RECEIVED-EVENT")
    DATA___RECEIVED___EVENT("DATA-RECEIVED-EVENT"),
    @XmlEnumValue("DATA-SEND-COMPLETED-EVENT")
    DATA___SEND___COMPLETED___EVENT("DATA-SEND-COMPLETED-EVENT"),
    @XmlEnumValue("DATA-WRITE-COMPLETED-EVENT")
    DATA___WRITE___COMPLETED___EVENT("DATA-WRITE-COMPLETED-EVENT"),
    @XmlEnumValue("EXTERNAL-TRIGGER-OCCURRED-EVENT")
    EXTERNAL___TRIGGER___OCCURRED___EVENT("EXTERNAL-TRIGGER-OCCURRED-EVENT"),
    @XmlEnumValue("INIT-EVENT")
    INIT___EVENT("INIT-EVENT"),
    @XmlEnumValue("INTERNAL-TRIGGER-OCCURRED-EVENT")
    INTERNAL___TRIGGER___OCCURRED___EVENT("INTERNAL-TRIGGER-OCCURRED-EVENT"),
    @XmlEnumValue("MODE-SWITCHED-ACK-EVENT")
    MODE___SWITCHED___ACK___EVENT("MODE-SWITCHED-ACK-EVENT"),
    @XmlEnumValue("OPERATION-INVOKED-EVENT")
    OPERATION___INVOKED___EVENT("OPERATION-INVOKED-EVENT"),
    @XmlEnumValue("RTE-EVENT")
    RTE___EVENT("RTE-EVENT"),
    @XmlEnumValue("SWC-MODE-MANAGER-ERROR-EVENT")
    SWC___MODE___MANAGER___ERROR___EVENT("SWC-MODE-MANAGER-ERROR-EVENT"),
    @XmlEnumValue("SWC-MODE-SWITCH-EVENT")
    SWC___MODE___SWITCH___EVENT("SWC-MODE-SWITCH-EVENT"),
    @XmlEnumValue("TIMING-EVENT")
    TIMING___EVENT("TIMING-EVENT"),
    @XmlEnumValue("TRANSFORMER-HARD-ERROR-EVENT")
    TRANSFORMER___HARD___ERROR___EVENT("TRANSFORMER-HARD-ERROR-EVENT");
    private final String value;

    RTEEVENTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RTEEVENTSUBTYPESENUM fromValue(String v) {
        for (RTEEVENTSUBTYPESENUM c: RTEEVENTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
