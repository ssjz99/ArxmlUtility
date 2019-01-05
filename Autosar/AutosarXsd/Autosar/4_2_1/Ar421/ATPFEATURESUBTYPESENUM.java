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
 * <p>ATP-FEATURE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ATP-FEATURE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-PROVIDED-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="ABSTRACT-REQUIRED-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="APPLICATION-ARRAY-ELEMENT"/>
 *     &lt;enumeration value="APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="APPLICATION-RECORD-ELEMENT"/>
 *     &lt;enumeration value="ARGUMENT-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="ASSEMBLY-SW-CONNECTOR"/>
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-POINT"/>
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-RESULT-POINT"/>
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"/>
 *     &lt;enumeration value="ATP-FEATURE"/>
 *     &lt;enumeration value="ATP-PROTOTYPE"/>
 *     &lt;enumeration value="ATP-STRUCTURE-ELEMENT"/>
 *     &lt;enumeration value="AUTOSAR-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="BACKGROUND-EVENT"/>
 *     &lt;enumeration value="BSW-INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="BSW-MODULE-DESCRIPTION"/>
 *     &lt;enumeration value="BSW-SERVICE-DEPENDENCY-IDENT"/>
 *     &lt;enumeration value="CLIENT-SERVER-OPERATION"/>
 *     &lt;enumeration value="DATA-PROTOTYPE"/>
 *     &lt;enumeration value="DATA-PROTOTYPE-GROUP"/>
 *     &lt;enumeration value="DATA-RECEIVE-ERROR-EVENT"/>
 *     &lt;enumeration value="DATA-RECEIVED-EVENT"/>
 *     &lt;enumeration value="DATA-SEND-COMPLETED-EVENT"/>
 *     &lt;enumeration value="DATA-WRITE-COMPLETED-EVENT"/>
 *     &lt;enumeration value="DELEGATION-SW-CONNECTOR"/>
 *     &lt;enumeration value="EXTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="EXTERNAL-TRIGGERING-POINT-IDENT"/>
 *     &lt;enumeration value="IDENT-CAPTION"/>
 *     &lt;enumeration value="INIT-EVENT"/>
 *     &lt;enumeration value="INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="INTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="INTERNAL-TRIGGERING-POINT"/>
 *     &lt;enumeration value="MODE-ACCESS-POINT-IDENT"/>
 *     &lt;enumeration value="MODE-DECLARATION"/>
 *     &lt;enumeration value="MODE-DECLARATION-GROUP-PROTOTYPE"/>
 *     &lt;enumeration value="MODE-DECLARATION-MAPPING"/>
 *     &lt;enumeration value="MODE-SWITCH-POINT"/>
 *     &lt;enumeration value="MODE-SWITCHED-ACK-EVENT"/>
 *     &lt;enumeration value="MODE-TRANSITION"/>
 *     &lt;enumeration value="NV-BLOCK-DESCRIPTOR"/>
 *     &lt;enumeration value="OPERATION-INVOKED-EVENT"/>
 *     &lt;enumeration value="P-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PR-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PARAMETER-ACCESS"/>
 *     &lt;enumeration value="PARAMETER-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="PASS-THROUGH-SW-CONNECTOR"/>
 *     &lt;enumeration value="PER-INSTANCE-MEMORY"/>
 *     &lt;enumeration value="PORT-GROUP"/>
 *     &lt;enumeration value="PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PORT-PROTOTYPE-BLUEPRINT"/>
 *     &lt;enumeration value="R-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="RTE-EVENT"/>
 *     &lt;enumeration value="ROOT-SW-COMPOSITION-PROTOTYPE"/>
 *     &lt;enumeration value="RUNNABLE-ENTITY"/>
 *     &lt;enumeration value="RUNNABLE-ENTITY-GROUP"/>
 *     &lt;enumeration value="SERVER-CALL-POINT"/>
 *     &lt;enumeration value="SW-COMPONENT-PROTOTYPE"/>
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
 *     &lt;enumeration value="VARIABLE-ACCESS"/>
 *     &lt;enumeration value="VARIABLE-DATA-PROTOTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ATP-FEATURE--SUBTYPES-ENUM")
@XmlEnum
public enum ATPFEATURESUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-PROVIDED-PORT-PROTOTYPE")
    ABSTRACT___PROVIDED___PORT___PROTOTYPE("ABSTRACT-PROVIDED-PORT-PROTOTYPE"),
    @XmlEnumValue("ABSTRACT-REQUIRED-PORT-PROTOTYPE")
    ABSTRACT___REQUIRED___PORT___PROTOTYPE("ABSTRACT-REQUIRED-PORT-PROTOTYPE"),
    @XmlEnumValue("APPLICATION-ARRAY-ELEMENT")
    APPLICATION___ARRAY___ELEMENT("APPLICATION-ARRAY-ELEMENT"),
    @XmlEnumValue("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE")
    APPLICATION___COMPOSITE___ELEMENT___DATA___PROTOTYPE("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"),
    @XmlEnumValue("APPLICATION-RECORD-ELEMENT")
    APPLICATION___RECORD___ELEMENT("APPLICATION-RECORD-ELEMENT"),
    @XmlEnumValue("ARGUMENT-DATA-PROTOTYPE")
    ARGUMENT___DATA___PROTOTYPE("ARGUMENT-DATA-PROTOTYPE"),
    @XmlEnumValue("ASSEMBLY-SW-CONNECTOR")
    ASSEMBLY___SW___CONNECTOR("ASSEMBLY-SW-CONNECTOR"),
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-POINT")
    ASYNCHRONOUS___SERVER___CALL___POINT("ASYNCHRONOUS-SERVER-CALL-POINT"),
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
    ASYNCHRONOUS___SERVER___CALL___RESULT___POINT("ASYNCHRONOUS-SERVER-CALL-RESULT-POINT"),
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
    ASYNCHRONOUS___SERVER___CALL___RETURNS___EVENT("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"),
    @XmlEnumValue("ATP-FEATURE")
    ATP___FEATURE("ATP-FEATURE"),
    @XmlEnumValue("ATP-PROTOTYPE")
    ATP___PROTOTYPE("ATP-PROTOTYPE"),
    @XmlEnumValue("ATP-STRUCTURE-ELEMENT")
    ATP___STRUCTURE___ELEMENT("ATP-STRUCTURE-ELEMENT"),
    @XmlEnumValue("AUTOSAR-DATA-PROTOTYPE")
    AUTOSAR___DATA___PROTOTYPE("AUTOSAR-DATA-PROTOTYPE"),
    @XmlEnumValue("BACKGROUND-EVENT")
    BACKGROUND___EVENT("BACKGROUND-EVENT"),
    @XmlEnumValue("BSW-INTERNAL-BEHAVIOR")
    BSW___INTERNAL___BEHAVIOR("BSW-INTERNAL-BEHAVIOR"),
    @XmlEnumValue("BSW-MODULE-DESCRIPTION")
    BSW___MODULE___DESCRIPTION("BSW-MODULE-DESCRIPTION"),
    @XmlEnumValue("BSW-SERVICE-DEPENDENCY-IDENT")
    BSW___SERVICE___DEPENDENCY___IDENT("BSW-SERVICE-DEPENDENCY-IDENT"),
    @XmlEnumValue("CLIENT-SERVER-OPERATION")
    CLIENT___SERVER___OPERATION("CLIENT-SERVER-OPERATION"),
    @XmlEnumValue("DATA-PROTOTYPE")
    DATA___PROTOTYPE("DATA-PROTOTYPE"),
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
    @XmlEnumValue("EXTERNAL-TRIGGER-OCCURRED-EVENT")
    EXTERNAL___TRIGGER___OCCURRED___EVENT("EXTERNAL-TRIGGER-OCCURRED-EVENT"),
    @XmlEnumValue("EXTERNAL-TRIGGERING-POINT-IDENT")
    EXTERNAL___TRIGGERING___POINT___IDENT("EXTERNAL-TRIGGERING-POINT-IDENT"),
    @XmlEnumValue("IDENT-CAPTION")
    IDENT___CAPTION("IDENT-CAPTION"),
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
    @XmlEnumValue("MODE-DECLARATION-GROUP-PROTOTYPE")
    MODE___DECLARATION___GROUP___PROTOTYPE("MODE-DECLARATION-GROUP-PROTOTYPE"),
    @XmlEnumValue("MODE-DECLARATION-MAPPING")
    MODE___DECLARATION___MAPPING("MODE-DECLARATION-MAPPING"),
    @XmlEnumValue("MODE-SWITCH-POINT")
    MODE___SWITCH___POINT("MODE-SWITCH-POINT"),
    @XmlEnumValue("MODE-SWITCHED-ACK-EVENT")
    MODE___SWITCHED___ACK___EVENT("MODE-SWITCHED-ACK-EVENT"),
    @XmlEnumValue("MODE-TRANSITION")
    MODE___TRANSITION("MODE-TRANSITION"),
    @XmlEnumValue("NV-BLOCK-DESCRIPTOR")
    NV___BLOCK___DESCRIPTOR("NV-BLOCK-DESCRIPTOR"),
    @XmlEnumValue("OPERATION-INVOKED-EVENT")
    OPERATION___INVOKED___EVENT("OPERATION-INVOKED-EVENT"),
    @XmlEnumValue("P-PORT-PROTOTYPE")
    P___PORT___PROTOTYPE("P-PORT-PROTOTYPE"),
    @XmlEnumValue("PR-PORT-PROTOTYPE")
    PR___PORT___PROTOTYPE("PR-PORT-PROTOTYPE"),
    @XmlEnumValue("PARAMETER-ACCESS")
    PARAMETER___ACCESS("PARAMETER-ACCESS"),
    @XmlEnumValue("PARAMETER-DATA-PROTOTYPE")
    PARAMETER___DATA___PROTOTYPE("PARAMETER-DATA-PROTOTYPE"),
    @XmlEnumValue("PASS-THROUGH-SW-CONNECTOR")
    PASS___THROUGH___SW___CONNECTOR("PASS-THROUGH-SW-CONNECTOR"),
    @XmlEnumValue("PER-INSTANCE-MEMORY")
    PER___INSTANCE___MEMORY("PER-INSTANCE-MEMORY"),
    @XmlEnumValue("PORT-GROUP")
    PORT___GROUP("PORT-GROUP"),
    @XmlEnumValue("PORT-PROTOTYPE")
    PORT___PROTOTYPE("PORT-PROTOTYPE"),
    @XmlEnumValue("PORT-PROTOTYPE-BLUEPRINT")
    PORT___PROTOTYPE___BLUEPRINT("PORT-PROTOTYPE-BLUEPRINT"),
    @XmlEnumValue("R-PORT-PROTOTYPE")
    R___PORT___PROTOTYPE("R-PORT-PROTOTYPE"),
    @XmlEnumValue("RTE-EVENT")
    RTE___EVENT("RTE-EVENT"),
    @XmlEnumValue("ROOT-SW-COMPOSITION-PROTOTYPE")
    ROOT___SW___COMPOSITION___PROTOTYPE("ROOT-SW-COMPOSITION-PROTOTYPE"),
    @XmlEnumValue("RUNNABLE-ENTITY")
    RUNNABLE___ENTITY("RUNNABLE-ENTITY"),
    @XmlEnumValue("RUNNABLE-ENTITY-GROUP")
    RUNNABLE___ENTITY___GROUP("RUNNABLE-ENTITY-GROUP"),
    @XmlEnumValue("SERVER-CALL-POINT")
    SERVER___CALL___POINT("SERVER-CALL-POINT"),
    @XmlEnumValue("SW-COMPONENT-PROTOTYPE")
    SW___COMPONENT___PROTOTYPE("SW-COMPONENT-PROTOTYPE"),
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
    @XmlEnumValue("VARIABLE-ACCESS")
    VARIABLE___ACCESS("VARIABLE-ACCESS"),
    @XmlEnumValue("VARIABLE-DATA-PROTOTYPE")
    VARIABLE___DATA___PROTOTYPE("VARIABLE-DATA-PROTOTYPE");
    private final String value;

    ATPFEATURESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ATPFEATURESUBTYPESENUM fromValue(String v) {
        for (ATPFEATURESUBTYPESENUM c: ATPFEATURESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
