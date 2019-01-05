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
 * <p>ATP-CLASSIFIER--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ATP-CLASSIFIER--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLICATION-ARRAY-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-COMPOSITE-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-PRIMITIVE-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-RECORD-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ASSEMBLY-SW-CONNECTOR"/>
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-POINT"/>
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-RESULT-POINT"/>
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"/>
 *     &lt;enumeration value="ATOMIC-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ATP-CLASSIFIER"/>
 *     &lt;enumeration value="ATP-STRUCTURE-ELEMENT"/>
 *     &lt;enumeration value="ATP-TYPE"/>
 *     &lt;enumeration value="AUTOSAR-DATA-TYPE"/>
 *     &lt;enumeration value="BACKGROUND-EVENT"/>
 *     &lt;enumeration value="BSW-INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="BSW-MODULE-DESCRIPTION"/>
 *     &lt;enumeration value="BSW-SERVICE-DEPENDENCY-IDENT"/>
 *     &lt;enumeration value="CLIENT-SERVER-INTERFACE"/>
 *     &lt;enumeration value="CLIENT-SERVER-OPERATION"/>
 *     &lt;enumeration value="COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="COMPOSITION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="DATA-INTERFACE"/>
 *     &lt;enumeration value="DATA-PROTOTYPE-GROUP"/>
 *     &lt;enumeration value="DATA-RECEIVE-ERROR-EVENT"/>
 *     &lt;enumeration value="DATA-RECEIVED-EVENT"/>
 *     &lt;enumeration value="DATA-SEND-COMPLETED-EVENT"/>
 *     &lt;enumeration value="DATA-WRITE-COMPLETED-EVENT"/>
 *     &lt;enumeration value="DELEGATION-SW-CONNECTOR"/>
 *     &lt;enumeration value="ECU-ABSTRACTION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="EXTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="EXTERNAL-TRIGGERING-POINT-IDENT"/>
 *     &lt;enumeration value="IDENT-CAPTION"/>
 *     &lt;enumeration value="IMPLEMENTATION-DATA-TYPE"/>
 *     &lt;enumeration value="INIT-EVENT"/>
 *     &lt;enumeration value="INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="INTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="INTERNAL-TRIGGERING-POINT"/>
 *     &lt;enumeration value="MODE-ACCESS-POINT-IDENT"/>
 *     &lt;enumeration value="MODE-DECLARATION"/>
 *     &lt;enumeration value="MODE-DECLARATION-GROUP"/>
 *     &lt;enumeration value="MODE-DECLARATION-MAPPING"/>
 *     &lt;enumeration value="MODE-DECLARATION-MAPPING-SET"/>
 *     &lt;enumeration value="MODE-SWITCH-INTERFACE"/>
 *     &lt;enumeration value="MODE-SWITCH-POINT"/>
 *     &lt;enumeration value="MODE-SWITCHED-ACK-EVENT"/>
 *     &lt;enumeration value="MODE-TRANSITION"/>
 *     &lt;enumeration value="NV-BLOCK-DESCRIPTOR"/>
 *     &lt;enumeration value="NV-BLOCK-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="NV-DATA-INTERFACE"/>
 *     &lt;enumeration value="OPERATION-INVOKED-EVENT"/>
 *     &lt;enumeration value="PARAMETER-ACCESS"/>
 *     &lt;enumeration value="PARAMETER-INTERFACE"/>
 *     &lt;enumeration value="PARAMETER-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="PASS-THROUGH-SW-CONNECTOR"/>
 *     &lt;enumeration value="PER-INSTANCE-MEMORY"/>
 *     &lt;enumeration value="PORT-GROUP"/>
 *     &lt;enumeration value="PORT-INTERFACE"/>
 *     &lt;enumeration value="PORT-PROTOTYPE-BLUEPRINT"/>
 *     &lt;enumeration value="RTE-EVENT"/>
 *     &lt;enumeration value="RUNNABLE-ENTITY"/>
 *     &lt;enumeration value="RUNNABLE-ENTITY-GROUP"/>
 *     &lt;enumeration value="SENDER-RECEIVER-INTERFACE"/>
 *     &lt;enumeration value="SENSOR-ACTUATOR-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SERVER-CALL-POINT"/>
 *     &lt;enumeration value="SERVICE-PROXY-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SERVICE-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SW-CONNECTOR"/>
 *     &lt;enumeration value="SWC-BSW-MAPPING"/>
 *     &lt;enumeration value="SWC-INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="SWC-MODE-MANAGER-ERROR-EVENT"/>
 *     &lt;enumeration value="SWC-MODE-SWITCH-EVENT"/>
 *     &lt;enumeration value="SWC-SERVICE-DEPENDENCY"/>
 *     &lt;enumeration value="SYNCHRONOUS-SERVER-CALL-POINT"/>
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="TIMING-EVENT"/>
 *     &lt;enumeration value="TRANSFORMER-HARD-ERROR-EVENT"/>
 *     &lt;enumeration value="TRIGGER"/>
 *     &lt;enumeration value="TRIGGER-INTERFACE"/>
 *     &lt;enumeration value="VARIABLE-ACCESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ATP-CLASSIFIER--SUBTYPES-ENUM")
@XmlEnum
public enum ATPCLASSIFIERSUBTYPESENUM {

    @XmlEnumValue("APPLICATION-ARRAY-DATA-TYPE")
    APPLICATION___ARRAY___DATA___TYPE("APPLICATION-ARRAY-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-COMPOSITE-DATA-TYPE")
    APPLICATION___COMPOSITE___DATA___TYPE("APPLICATION-COMPOSITE-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-DATA-TYPE")
    APPLICATION___DATA___TYPE("APPLICATION-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-PRIMITIVE-DATA-TYPE")
    APPLICATION___PRIMITIVE___DATA___TYPE("APPLICATION-PRIMITIVE-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-RECORD-DATA-TYPE")
    APPLICATION___RECORD___DATA___TYPE("APPLICATION-RECORD-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-SW-COMPONENT-TYPE")
    APPLICATION___SW___COMPONENT___TYPE("APPLICATION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("ASSEMBLY-SW-CONNECTOR")
    ASSEMBLY___SW___CONNECTOR("ASSEMBLY-SW-CONNECTOR"),
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-POINT")
    ASYNCHRONOUS___SERVER___CALL___POINT("ASYNCHRONOUS-SERVER-CALL-POINT"),
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
    ASYNCHRONOUS___SERVER___CALL___RESULT___POINT("ASYNCHRONOUS-SERVER-CALL-RESULT-POINT"),
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
    ASYNCHRONOUS___SERVER___CALL___RETURNS___EVENT("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"),
    @XmlEnumValue("ATOMIC-SW-COMPONENT-TYPE")
    ATOMIC___SW___COMPONENT___TYPE("ATOMIC-SW-COMPONENT-TYPE"),
    @XmlEnumValue("ATP-CLASSIFIER")
    ATP___CLASSIFIER("ATP-CLASSIFIER"),
    @XmlEnumValue("ATP-STRUCTURE-ELEMENT")
    ATP___STRUCTURE___ELEMENT("ATP-STRUCTURE-ELEMENT"),
    @XmlEnumValue("ATP-TYPE")
    ATP___TYPE("ATP-TYPE"),
    @XmlEnumValue("AUTOSAR-DATA-TYPE")
    AUTOSAR___DATA___TYPE("AUTOSAR-DATA-TYPE"),
    @XmlEnumValue("BACKGROUND-EVENT")
    BACKGROUND___EVENT("BACKGROUND-EVENT"),
    @XmlEnumValue("BSW-INTERNAL-BEHAVIOR")
    BSW___INTERNAL___BEHAVIOR("BSW-INTERNAL-BEHAVIOR"),
    @XmlEnumValue("BSW-MODULE-DESCRIPTION")
    BSW___MODULE___DESCRIPTION("BSW-MODULE-DESCRIPTION"),
    @XmlEnumValue("BSW-SERVICE-DEPENDENCY-IDENT")
    BSW___SERVICE___DEPENDENCY___IDENT("BSW-SERVICE-DEPENDENCY-IDENT"),
    @XmlEnumValue("CLIENT-SERVER-INTERFACE")
    CLIENT___SERVER___INTERFACE("CLIENT-SERVER-INTERFACE"),
    @XmlEnumValue("CLIENT-SERVER-OPERATION")
    CLIENT___SERVER___OPERATION("CLIENT-SERVER-OPERATION"),
    @XmlEnumValue("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE")
    COMPLEX___DEVICE___DRIVER___SW___COMPONENT___TYPE("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"),
    @XmlEnumValue("COMPOSITION-SW-COMPONENT-TYPE")
    COMPOSITION___SW___COMPONENT___TYPE("COMPOSITION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("DATA-INTERFACE")
    DATA___INTERFACE("DATA-INTERFACE"),
    @XmlEnumValue("DATA-PROTOTYPE-GROUP")
    DATA___PROTOTYPE___GROUP("DATA-PROTOTYPE-GROUP"),
    @XmlEnumValue("DATA-RECEIVE-ERROR-EVENT")
    DATA___RECEIVE___ERROR___EVENT("DATA-RECEIVE-ERROR-EVENT"),
    @XmlEnumValue("DATA-RECEIVED-EVENT")
    DATA___RECEIVED___EVENT("DATA-RECEIVED-EVENT"),
    @XmlEnumValue("DATA-SEND-COMPLETED-EVENT")
    DATA___SEND___COMPLETED___EVENT("DATA-SEND-COMPLETED-EVENT"),
    @XmlEnumValue("DATA-WRITE-COMPLETED-EVENT")
    DATA___WRITE___COMPLETED___EVENT("DATA-WRITE-COMPLETED-EVENT"),
    @XmlEnumValue("DELEGATION-SW-CONNECTOR")
    DELEGATION___SW___CONNECTOR("DELEGATION-SW-CONNECTOR"),
    @XmlEnumValue("ECU-ABSTRACTION-SW-COMPONENT-TYPE")
    ECU___ABSTRACTION___SW___COMPONENT___TYPE("ECU-ABSTRACTION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("EXTERNAL-TRIGGER-OCCURRED-EVENT")
    EXTERNAL___TRIGGER___OCCURRED___EVENT("EXTERNAL-TRIGGER-OCCURRED-EVENT"),
    @XmlEnumValue("EXTERNAL-TRIGGERING-POINT-IDENT")
    EXTERNAL___TRIGGERING___POINT___IDENT("EXTERNAL-TRIGGERING-POINT-IDENT"),
    @XmlEnumValue("IDENT-CAPTION")
    IDENT___CAPTION("IDENT-CAPTION"),
    @XmlEnumValue("IMPLEMENTATION-DATA-TYPE")
    IMPLEMENTATION___DATA___TYPE("IMPLEMENTATION-DATA-TYPE"),
    @XmlEnumValue("INIT-EVENT")
    INIT___EVENT("INIT-EVENT"),
    @XmlEnumValue("INTERNAL-BEHAVIOR")
    INTERNAL___BEHAVIOR("INTERNAL-BEHAVIOR"),
    @XmlEnumValue("INTERNAL-TRIGGER-OCCURRED-EVENT")
    INTERNAL___TRIGGER___OCCURRED___EVENT("INTERNAL-TRIGGER-OCCURRED-EVENT"),
    @XmlEnumValue("INTERNAL-TRIGGERING-POINT")
    INTERNAL___TRIGGERING___POINT("INTERNAL-TRIGGERING-POINT"),
    @XmlEnumValue("MODE-ACCESS-POINT-IDENT")
    MODE___ACCESS___POINT___IDENT("MODE-ACCESS-POINT-IDENT"),
    @XmlEnumValue("MODE-DECLARATION")
    MODE___DECLARATION("MODE-DECLARATION"),
    @XmlEnumValue("MODE-DECLARATION-GROUP")
    MODE___DECLARATION___GROUP("MODE-DECLARATION-GROUP"),
    @XmlEnumValue("MODE-DECLARATION-MAPPING")
    MODE___DECLARATION___MAPPING("MODE-DECLARATION-MAPPING"),
    @XmlEnumValue("MODE-DECLARATION-MAPPING-SET")
    MODE___DECLARATION___MAPPING___SET("MODE-DECLARATION-MAPPING-SET"),
    @XmlEnumValue("MODE-SWITCH-INTERFACE")
    MODE___SWITCH___INTERFACE("MODE-SWITCH-INTERFACE"),
    @XmlEnumValue("MODE-SWITCH-POINT")
    MODE___SWITCH___POINT("MODE-SWITCH-POINT"),
    @XmlEnumValue("MODE-SWITCHED-ACK-EVENT")
    MODE___SWITCHED___ACK___EVENT("MODE-SWITCHED-ACK-EVENT"),
    @XmlEnumValue("MODE-TRANSITION")
    MODE___TRANSITION("MODE-TRANSITION"),
    @XmlEnumValue("NV-BLOCK-DESCRIPTOR")
    NV___BLOCK___DESCRIPTOR("NV-BLOCK-DESCRIPTOR"),
    @XmlEnumValue("NV-BLOCK-SW-COMPONENT-TYPE")
    NV___BLOCK___SW___COMPONENT___TYPE("NV-BLOCK-SW-COMPONENT-TYPE"),
    @XmlEnumValue("NV-DATA-INTERFACE")
    NV___DATA___INTERFACE("NV-DATA-INTERFACE"),
    @XmlEnumValue("OPERATION-INVOKED-EVENT")
    OPERATION___INVOKED___EVENT("OPERATION-INVOKED-EVENT"),
    @XmlEnumValue("PARAMETER-ACCESS")
    PARAMETER___ACCESS("PARAMETER-ACCESS"),
    @XmlEnumValue("PARAMETER-INTERFACE")
    PARAMETER___INTERFACE("PARAMETER-INTERFACE"),
    @XmlEnumValue("PARAMETER-SW-COMPONENT-TYPE")
    PARAMETER___SW___COMPONENT___TYPE("PARAMETER-SW-COMPONENT-TYPE"),
    @XmlEnumValue("PASS-THROUGH-SW-CONNECTOR")
    PASS___THROUGH___SW___CONNECTOR("PASS-THROUGH-SW-CONNECTOR"),
    @XmlEnumValue("PER-INSTANCE-MEMORY")
    PER___INSTANCE___MEMORY("PER-INSTANCE-MEMORY"),
    @XmlEnumValue("PORT-GROUP")
    PORT___GROUP("PORT-GROUP"),
    @XmlEnumValue("PORT-INTERFACE")
    PORT___INTERFACE("PORT-INTERFACE"),
    @XmlEnumValue("PORT-PROTOTYPE-BLUEPRINT")
    PORT___PROTOTYPE___BLUEPRINT("PORT-PROTOTYPE-BLUEPRINT"),
    @XmlEnumValue("RTE-EVENT")
    RTE___EVENT("RTE-EVENT"),
    @XmlEnumValue("RUNNABLE-ENTITY")
    RUNNABLE___ENTITY("RUNNABLE-ENTITY"),
    @XmlEnumValue("RUNNABLE-ENTITY-GROUP")
    RUNNABLE___ENTITY___GROUP("RUNNABLE-ENTITY-GROUP"),
    @XmlEnumValue("SENDER-RECEIVER-INTERFACE")
    SENDER___RECEIVER___INTERFACE("SENDER-RECEIVER-INTERFACE"),
    @XmlEnumValue("SENSOR-ACTUATOR-SW-COMPONENT-TYPE")
    SENSOR___ACTUATOR___SW___COMPONENT___TYPE("SENSOR-ACTUATOR-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SERVER-CALL-POINT")
    SERVER___CALL___POINT("SERVER-CALL-POINT"),
    @XmlEnumValue("SERVICE-PROXY-SW-COMPONENT-TYPE")
    SERVICE___PROXY___SW___COMPONENT___TYPE("SERVICE-PROXY-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SERVICE-SW-COMPONENT-TYPE")
    SERVICE___SW___COMPONENT___TYPE("SERVICE-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SW-COMPONENT-TYPE")
    SW___COMPONENT___TYPE("SW-COMPONENT-TYPE"),
    @XmlEnumValue("SW-CONNECTOR")
    SW___CONNECTOR("SW-CONNECTOR"),
    @XmlEnumValue("SWC-BSW-MAPPING")
    SWC___BSW___MAPPING("SWC-BSW-MAPPING"),
    @XmlEnumValue("SWC-INTERNAL-BEHAVIOR")
    SWC___INTERNAL___BEHAVIOR("SWC-INTERNAL-BEHAVIOR"),
    @XmlEnumValue("SWC-MODE-MANAGER-ERROR-EVENT")
    SWC___MODE___MANAGER___ERROR___EVENT("SWC-MODE-MANAGER-ERROR-EVENT"),
    @XmlEnumValue("SWC-MODE-SWITCH-EVENT")
    SWC___MODE___SWITCH___EVENT("SWC-MODE-SWITCH-EVENT"),
    @XmlEnumValue("SWC-SERVICE-DEPENDENCY")
    SWC___SERVICE___DEPENDENCY("SWC-SERVICE-DEPENDENCY"),
    @XmlEnumValue("SYNCHRONOUS-SERVER-CALL-POINT")
    SYNCHRONOUS___SERVER___CALL___POINT("SYNCHRONOUS-SERVER-CALL-POINT"),
    SYSTEM("SYSTEM"),
    @XmlEnumValue("TIMING-EVENT")
    TIMING___EVENT("TIMING-EVENT"),
    @XmlEnumValue("TRANSFORMER-HARD-ERROR-EVENT")
    TRANSFORMER___HARD___ERROR___EVENT("TRANSFORMER-HARD-ERROR-EVENT"),
    TRIGGER("TRIGGER"),
    @XmlEnumValue("TRIGGER-INTERFACE")
    TRIGGER___INTERFACE("TRIGGER-INTERFACE"),
    @XmlEnumValue("VARIABLE-ACCESS")
    VARIABLE___ACCESS("VARIABLE-ACCESS");
    private final String value;

    ATPCLASSIFIERSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ATPCLASSIFIERSUBTYPESENUM fromValue(String v) {
        for (ATPCLASSIFIERSUBTYPESENUM c: ATPCLASSIFIERSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
