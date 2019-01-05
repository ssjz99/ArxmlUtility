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
 * <p>ATP-BLUEPRINT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ATP-BLUEPRINT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AR-PACKAGE"/>
 *     &lt;enumeration value="ACL-OBJECT-SET"/>
 *     &lt;enumeration value="ACL-OPERATION"/>
 *     &lt;enumeration value="ACL-PERMISSION"/>
 *     &lt;enumeration value="ACL-ROLE"/>
 *     &lt;enumeration value="ALIAS-NAME-SET"/>
 *     &lt;enumeration value="APPLICATION-ARRAY-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-COMPOSITE-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-PRIMITIVE-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-RECORD-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ATOMIC-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ATP-BLUEPRINT"/>
 *     &lt;enumeration value="BSW-MODULE-DESCRIPTION"/>
 *     &lt;enumeration value="BSW-MODULE-ENTRY"/>
 *     &lt;enumeration value="BUILD-ACTION"/>
 *     &lt;enumeration value="BUILD-ACTION-ENTITY"/>
 *     &lt;enumeration value="BUILD-ACTION-ENVIRONMENT"/>
 *     &lt;enumeration value="BUILD-ACTION-MANIFEST"/>
 *     &lt;enumeration value="CLIENT-SERVER-INTERFACE"/>
 *     &lt;enumeration value="CLIENT-SERVER-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="COMPOSITION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="COMPU-METHOD"/>
 *     &lt;enumeration value="CONSISTENCY-NEEDS"/>
 *     &lt;enumeration value="DATA-CONSTR"/>
 *     &lt;enumeration value="DATA-INTERFACE"/>
 *     &lt;enumeration value="DATA-TYPE-MAPPING-SET"/>
 *     &lt;enumeration value="ECU-ABSTRACTION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ECUC-DEFINITION-COLLECTION"/>
 *     &lt;enumeration value="ECUC-DESTINATION-URI-DEF-SET"/>
 *     &lt;enumeration value="ECUC-MODULE-DEF"/>
 *     &lt;enumeration value="FLAT-MAP"/>
 *     &lt;enumeration value="IMPLEMENTATION-DATA-TYPE"/>
 *     &lt;enumeration value="KEYWORD-SET"/>
 *     &lt;enumeration value="LIFE-CYCLE-STATE"/>
 *     &lt;enumeration value="LIFE-CYCLE-STATE-DEFINITION-GROUP"/>
 *     &lt;enumeration value="MODE-DECLARATION-GROUP"/>
 *     &lt;enumeration value="MODE-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="MODE-SWITCH-INTERFACE"/>
 *     &lt;enumeration value="NV-BLOCK-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="NV-DATA-INTERFACE"/>
 *     &lt;enumeration value="PARAMETER-INTERFACE"/>
 *     &lt;enumeration value="PARAMETER-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="PORT-INTERFACE"/>
 *     &lt;enumeration value="PORT-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="PORT-INTERFACE-MAPPING-SET"/>
 *     &lt;enumeration value="PORT-PROTOTYPE-BLUEPRINT"/>
 *     &lt;enumeration value="SENDER-RECEIVER-INTERFACE"/>
 *     &lt;enumeration value="SENSOR-ACTUATOR-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SERVICE-PROXY-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SERVICE-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SW-ADDR-METHOD"/>
 *     &lt;enumeration value="SW-BASE-TYPE"/>
 *     &lt;enumeration value="SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="TRIGGER-INTERFACE"/>
 *     &lt;enumeration value="TRIGGER-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="VARIABLE-AND-PARAMETER-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="VFB-TIMING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ATP-BLUEPRINT--SUBTYPES-ENUM")
@XmlEnum
public enum ATPBLUEPRINTSUBTYPESENUM {

    @XmlEnumValue("AR-PACKAGE")
    AR___PACKAGE("AR-PACKAGE"),
    @XmlEnumValue("ACL-OBJECT-SET")
    ACL___OBJECT___SET("ACL-OBJECT-SET"),
    @XmlEnumValue("ACL-OPERATION")
    ACL___OPERATION("ACL-OPERATION"),
    @XmlEnumValue("ACL-PERMISSION")
    ACL___PERMISSION("ACL-PERMISSION"),
    @XmlEnumValue("ACL-ROLE")
    ACL___ROLE("ACL-ROLE"),
    @XmlEnumValue("ALIAS-NAME-SET")
    ALIAS___NAME___SET("ALIAS-NAME-SET"),
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
    @XmlEnumValue("ATOMIC-SW-COMPONENT-TYPE")
    ATOMIC___SW___COMPONENT___TYPE("ATOMIC-SW-COMPONENT-TYPE"),
    @XmlEnumValue("ATP-BLUEPRINT")
    ATP___BLUEPRINT("ATP-BLUEPRINT"),
    @XmlEnumValue("BSW-MODULE-DESCRIPTION")
    BSW___MODULE___DESCRIPTION("BSW-MODULE-DESCRIPTION"),
    @XmlEnumValue("BSW-MODULE-ENTRY")
    BSW___MODULE___ENTRY("BSW-MODULE-ENTRY"),
    @XmlEnumValue("BUILD-ACTION")
    BUILD___ACTION("BUILD-ACTION"),
    @XmlEnumValue("BUILD-ACTION-ENTITY")
    BUILD___ACTION___ENTITY("BUILD-ACTION-ENTITY"),
    @XmlEnumValue("BUILD-ACTION-ENVIRONMENT")
    BUILD___ACTION___ENVIRONMENT("BUILD-ACTION-ENVIRONMENT"),
    @XmlEnumValue("BUILD-ACTION-MANIFEST")
    BUILD___ACTION___MANIFEST("BUILD-ACTION-MANIFEST"),
    @XmlEnumValue("CLIENT-SERVER-INTERFACE")
    CLIENT___SERVER___INTERFACE("CLIENT-SERVER-INTERFACE"),
    @XmlEnumValue("CLIENT-SERVER-INTERFACE-MAPPING")
    CLIENT___SERVER___INTERFACE___MAPPING("CLIENT-SERVER-INTERFACE-MAPPING"),
    @XmlEnumValue("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE")
    COMPLEX___DEVICE___DRIVER___SW___COMPONENT___TYPE("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"),
    @XmlEnumValue("COMPOSITION-SW-COMPONENT-TYPE")
    COMPOSITION___SW___COMPONENT___TYPE("COMPOSITION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("COMPU-METHOD")
    COMPU___METHOD("COMPU-METHOD"),
    @XmlEnumValue("CONSISTENCY-NEEDS")
    CONSISTENCY___NEEDS("CONSISTENCY-NEEDS"),
    @XmlEnumValue("DATA-CONSTR")
    DATA___CONSTR("DATA-CONSTR"),
    @XmlEnumValue("DATA-INTERFACE")
    DATA___INTERFACE("DATA-INTERFACE"),
    @XmlEnumValue("DATA-TYPE-MAPPING-SET")
    DATA___TYPE___MAPPING___SET("DATA-TYPE-MAPPING-SET"),
    @XmlEnumValue("ECU-ABSTRACTION-SW-COMPONENT-TYPE")
    ECU___ABSTRACTION___SW___COMPONENT___TYPE("ECU-ABSTRACTION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("ECUC-DEFINITION-COLLECTION")
    ECUC___DEFINITION___COLLECTION("ECUC-DEFINITION-COLLECTION"),
    @XmlEnumValue("ECUC-DESTINATION-URI-DEF-SET")
    ECUC___DESTINATION___URI___DEF___SET("ECUC-DESTINATION-URI-DEF-SET"),
    @XmlEnumValue("ECUC-MODULE-DEF")
    ECUC___MODULE___DEF("ECUC-MODULE-DEF"),
    @XmlEnumValue("FLAT-MAP")
    FLAT___MAP("FLAT-MAP"),
    @XmlEnumValue("IMPLEMENTATION-DATA-TYPE")
    IMPLEMENTATION___DATA___TYPE("IMPLEMENTATION-DATA-TYPE"),
    @XmlEnumValue("KEYWORD-SET")
    KEYWORD___SET("KEYWORD-SET"),
    @XmlEnumValue("LIFE-CYCLE-STATE")
    LIFE___CYCLE___STATE("LIFE-CYCLE-STATE"),
    @XmlEnumValue("LIFE-CYCLE-STATE-DEFINITION-GROUP")
    LIFE___CYCLE___STATE___DEFINITION___GROUP("LIFE-CYCLE-STATE-DEFINITION-GROUP"),
    @XmlEnumValue("MODE-DECLARATION-GROUP")
    MODE___DECLARATION___GROUP("MODE-DECLARATION-GROUP"),
    @XmlEnumValue("MODE-INTERFACE-MAPPING")
    MODE___INTERFACE___MAPPING("MODE-INTERFACE-MAPPING"),
    @XmlEnumValue("MODE-SWITCH-INTERFACE")
    MODE___SWITCH___INTERFACE("MODE-SWITCH-INTERFACE"),
    @XmlEnumValue("NV-BLOCK-SW-COMPONENT-TYPE")
    NV___BLOCK___SW___COMPONENT___TYPE("NV-BLOCK-SW-COMPONENT-TYPE"),
    @XmlEnumValue("NV-DATA-INTERFACE")
    NV___DATA___INTERFACE("NV-DATA-INTERFACE"),
    @XmlEnumValue("PARAMETER-INTERFACE")
    PARAMETER___INTERFACE("PARAMETER-INTERFACE"),
    @XmlEnumValue("PARAMETER-SW-COMPONENT-TYPE")
    PARAMETER___SW___COMPONENT___TYPE("PARAMETER-SW-COMPONENT-TYPE"),
    @XmlEnumValue("PORT-INTERFACE")
    PORT___INTERFACE("PORT-INTERFACE"),
    @XmlEnumValue("PORT-INTERFACE-MAPPING")
    PORT___INTERFACE___MAPPING("PORT-INTERFACE-MAPPING"),
    @XmlEnumValue("PORT-INTERFACE-MAPPING-SET")
    PORT___INTERFACE___MAPPING___SET("PORT-INTERFACE-MAPPING-SET"),
    @XmlEnumValue("PORT-PROTOTYPE-BLUEPRINT")
    PORT___PROTOTYPE___BLUEPRINT("PORT-PROTOTYPE-BLUEPRINT"),
    @XmlEnumValue("SENDER-RECEIVER-INTERFACE")
    SENDER___RECEIVER___INTERFACE("SENDER-RECEIVER-INTERFACE"),
    @XmlEnumValue("SENSOR-ACTUATOR-SW-COMPONENT-TYPE")
    SENSOR___ACTUATOR___SW___COMPONENT___TYPE("SENSOR-ACTUATOR-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SERVICE-PROXY-SW-COMPONENT-TYPE")
    SERVICE___PROXY___SW___COMPONENT___TYPE("SERVICE-PROXY-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SERVICE-SW-COMPONENT-TYPE")
    SERVICE___SW___COMPONENT___TYPE("SERVICE-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SW-ADDR-METHOD")
    SW___ADDR___METHOD("SW-ADDR-METHOD"),
    @XmlEnumValue("SW-BASE-TYPE")
    SW___BASE___TYPE("SW-BASE-TYPE"),
    @XmlEnumValue("SW-COMPONENT-TYPE")
    SW___COMPONENT___TYPE("SW-COMPONENT-TYPE"),
    @XmlEnumValue("TRIGGER-INTERFACE")
    TRIGGER___INTERFACE("TRIGGER-INTERFACE"),
    @XmlEnumValue("TRIGGER-INTERFACE-MAPPING")
    TRIGGER___INTERFACE___MAPPING("TRIGGER-INTERFACE-MAPPING"),
    @XmlEnumValue("VARIABLE-AND-PARAMETER-INTERFACE-MAPPING")
    VARIABLE___AND___PARAMETER___INTERFACE___MAPPING("VARIABLE-AND-PARAMETER-INTERFACE-MAPPING"),
    @XmlEnumValue("VFB-TIMING")
    VFB___TIMING("VFB-TIMING");
    private final String value;

    ATPBLUEPRINTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ATPBLUEPRINTSUBTYPESENUM fromValue(String v) {
        for (ATPBLUEPRINTSUBTYPESENUM c: ATPBLUEPRINTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
