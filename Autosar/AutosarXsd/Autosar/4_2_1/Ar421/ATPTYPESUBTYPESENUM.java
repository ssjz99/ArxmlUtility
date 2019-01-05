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
 * <p>ATP-TYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ATP-TYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLICATION-ARRAY-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-COMPOSITE-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-PRIMITIVE-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-RECORD-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ATOMIC-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ATP-TYPE"/>
 *     &lt;enumeration value="AUTOSAR-DATA-TYPE"/>
 *     &lt;enumeration value="CLIENT-SERVER-INTERFACE"/>
 *     &lt;enumeration value="COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="COMPOSITION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="DATA-INTERFACE"/>
 *     &lt;enumeration value="ECU-ABSTRACTION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="IMPLEMENTATION-DATA-TYPE"/>
 *     &lt;enumeration value="MODE-DECLARATION-GROUP"/>
 *     &lt;enumeration value="MODE-DECLARATION-MAPPING-SET"/>
 *     &lt;enumeration value="MODE-SWITCH-INTERFACE"/>
 *     &lt;enumeration value="NV-BLOCK-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="NV-DATA-INTERFACE"/>
 *     &lt;enumeration value="PARAMETER-INTERFACE"/>
 *     &lt;enumeration value="PARAMETER-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="PORT-INTERFACE"/>
 *     &lt;enumeration value="SENDER-RECEIVER-INTERFACE"/>
 *     &lt;enumeration value="SENSOR-ACTUATOR-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SERVICE-PROXY-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SERVICE-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="TRIGGER-INTERFACE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ATP-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ATPTYPESUBTYPESENUM {

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
    @XmlEnumValue("ATP-TYPE")
    ATP___TYPE("ATP-TYPE"),
    @XmlEnumValue("AUTOSAR-DATA-TYPE")
    AUTOSAR___DATA___TYPE("AUTOSAR-DATA-TYPE"),
    @XmlEnumValue("CLIENT-SERVER-INTERFACE")
    CLIENT___SERVER___INTERFACE("CLIENT-SERVER-INTERFACE"),
    @XmlEnumValue("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE")
    COMPLEX___DEVICE___DRIVER___SW___COMPONENT___TYPE("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"),
    @XmlEnumValue("COMPOSITION-SW-COMPONENT-TYPE")
    COMPOSITION___SW___COMPONENT___TYPE("COMPOSITION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("DATA-INTERFACE")
    DATA___INTERFACE("DATA-INTERFACE"),
    @XmlEnumValue("ECU-ABSTRACTION-SW-COMPONENT-TYPE")
    ECU___ABSTRACTION___SW___COMPONENT___TYPE("ECU-ABSTRACTION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("IMPLEMENTATION-DATA-TYPE")
    IMPLEMENTATION___DATA___TYPE("IMPLEMENTATION-DATA-TYPE"),
    @XmlEnumValue("MODE-DECLARATION-GROUP")
    MODE___DECLARATION___GROUP("MODE-DECLARATION-GROUP"),
    @XmlEnumValue("MODE-DECLARATION-MAPPING-SET")
    MODE___DECLARATION___MAPPING___SET("MODE-DECLARATION-MAPPING-SET"),
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
    @XmlEnumValue("SENDER-RECEIVER-INTERFACE")
    SENDER___RECEIVER___INTERFACE("SENDER-RECEIVER-INTERFACE"),
    @XmlEnumValue("SENSOR-ACTUATOR-SW-COMPONENT-TYPE")
    SENSOR___ACTUATOR___SW___COMPONENT___TYPE("SENSOR-ACTUATOR-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SERVICE-PROXY-SW-COMPONENT-TYPE")
    SERVICE___PROXY___SW___COMPONENT___TYPE("SERVICE-PROXY-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SERVICE-SW-COMPONENT-TYPE")
    SERVICE___SW___COMPONENT___TYPE("SERVICE-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SW-COMPONENT-TYPE")
    SW___COMPONENT___TYPE("SW-COMPONENT-TYPE"),
    @XmlEnumValue("TRIGGER-INTERFACE")
    TRIGGER___INTERFACE("TRIGGER-INTERFACE");
    private final String value;

    ATPTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ATPTYPESUBTYPESENUM fromValue(String v) {
        for (ATPTYPESUBTYPESENUM c: ATPTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
