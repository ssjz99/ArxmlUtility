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
 * <p>ABSTRACT-EVENT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ABSTRACT-EVENT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-EVENT"/>
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"/>
 *     &lt;enumeration value="BACKGROUND-EVENT"/>
 *     &lt;enumeration value="BSW-ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"/>
 *     &lt;enumeration value="BSW-BACKGROUND-EVENT"/>
 *     &lt;enumeration value="BSW-DATA-RECEIVED-EVENT"/>
 *     &lt;enumeration value="BSW-EVENT"/>
 *     &lt;enumeration value="BSW-EXTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="BSW-INTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="BSW-MODE-MANAGER-ERROR-EVENT"/>
 *     &lt;enumeration value="BSW-MODE-SWITCH-EVENT"/>
 *     &lt;enumeration value="BSW-MODE-SWITCHED-ACK-EVENT"/>
 *     &lt;enumeration value="BSW-OPERATION-INVOKED-EVENT"/>
 *     &lt;enumeration value="BSW-SCHEDULE-EVENT"/>
 *     &lt;enumeration value="BSW-TIMING-EVENT"/>
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
@XmlType(name = "ABSTRACT-EVENT--SUBTYPES-ENUM")
@XmlEnum
public enum ABSTRACTEVENTSUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-EVENT")
    ABSTRACT___EVENT("ABSTRACT-EVENT"),
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
    ASYNCHRONOUS___SERVER___CALL___RETURNS___EVENT("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"),
    @XmlEnumValue("BACKGROUND-EVENT")
    BACKGROUND___EVENT("BACKGROUND-EVENT"),
    @XmlEnumValue("BSW-ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
    BSW___ASYNCHRONOUS___SERVER___CALL___RETURNS___EVENT("BSW-ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"),
    @XmlEnumValue("BSW-BACKGROUND-EVENT")
    BSW___BACKGROUND___EVENT("BSW-BACKGROUND-EVENT"),
    @XmlEnumValue("BSW-DATA-RECEIVED-EVENT")
    BSW___DATA___RECEIVED___EVENT("BSW-DATA-RECEIVED-EVENT"),
    @XmlEnumValue("BSW-EVENT")
    BSW___EVENT("BSW-EVENT"),
    @XmlEnumValue("BSW-EXTERNAL-TRIGGER-OCCURRED-EVENT")
    BSW___EXTERNAL___TRIGGER___OCCURRED___EVENT("BSW-EXTERNAL-TRIGGER-OCCURRED-EVENT"),
    @XmlEnumValue("BSW-INTERNAL-TRIGGER-OCCURRED-EVENT")
    BSW___INTERNAL___TRIGGER___OCCURRED___EVENT("BSW-INTERNAL-TRIGGER-OCCURRED-EVENT"),
    @XmlEnumValue("BSW-MODE-MANAGER-ERROR-EVENT")
    BSW___MODE___MANAGER___ERROR___EVENT("BSW-MODE-MANAGER-ERROR-EVENT"),
    @XmlEnumValue("BSW-MODE-SWITCH-EVENT")
    BSW___MODE___SWITCH___EVENT("BSW-MODE-SWITCH-EVENT"),
    @XmlEnumValue("BSW-MODE-SWITCHED-ACK-EVENT")
    BSW___MODE___SWITCHED___ACK___EVENT("BSW-MODE-SWITCHED-ACK-EVENT"),
    @XmlEnumValue("BSW-OPERATION-INVOKED-EVENT")
    BSW___OPERATION___INVOKED___EVENT("BSW-OPERATION-INVOKED-EVENT"),
    @XmlEnumValue("BSW-SCHEDULE-EVENT")
    BSW___SCHEDULE___EVENT("BSW-SCHEDULE-EVENT"),
    @XmlEnumValue("BSW-TIMING-EVENT")
    BSW___TIMING___EVENT("BSW-TIMING-EVENT"),
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

    ABSTRACTEVENTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ABSTRACTEVENTSUBTYPESENUM fromValue(String v) {
        for (ABSTRACTEVENTSUBTYPESENUM c: ABSTRACTEVENTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
