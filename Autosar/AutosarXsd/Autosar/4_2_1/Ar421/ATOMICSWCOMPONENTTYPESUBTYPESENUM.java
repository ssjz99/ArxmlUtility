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
 * <p>ATOMIC-SW-COMPONENT-TYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ATOMIC-SW-COMPONENT-TYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLICATION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ATOMIC-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ECU-ABSTRACTION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="NV-BLOCK-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SENSOR-ACTUATOR-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SERVICE-PROXY-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SERVICE-SW-COMPONENT-TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ATOMIC-SW-COMPONENT-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ATOMICSWCOMPONENTTYPESUBTYPESENUM {

    @XmlEnumValue("APPLICATION-SW-COMPONENT-TYPE")
    APPLICATION___SW___COMPONENT___TYPE("APPLICATION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("ATOMIC-SW-COMPONENT-TYPE")
    ATOMIC___SW___COMPONENT___TYPE("ATOMIC-SW-COMPONENT-TYPE"),
    @XmlEnumValue("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE")
    COMPLEX___DEVICE___DRIVER___SW___COMPONENT___TYPE("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"),
    @XmlEnumValue("ECU-ABSTRACTION-SW-COMPONENT-TYPE")
    ECU___ABSTRACTION___SW___COMPONENT___TYPE("ECU-ABSTRACTION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("NV-BLOCK-SW-COMPONENT-TYPE")
    NV___BLOCK___SW___COMPONENT___TYPE("NV-BLOCK-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SENSOR-ACTUATOR-SW-COMPONENT-TYPE")
    SENSOR___ACTUATOR___SW___COMPONENT___TYPE("SENSOR-ACTUATOR-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SERVICE-PROXY-SW-COMPONENT-TYPE")
    SERVICE___PROXY___SW___COMPONENT___TYPE("SERVICE-PROXY-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SERVICE-SW-COMPONENT-TYPE")
    SERVICE___SW___COMPONENT___TYPE("SERVICE-SW-COMPONENT-TYPE");
    private final String value;

    ATOMICSWCOMPONENTTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ATOMICSWCOMPONENTTYPESUBTYPESENUM fromValue(String v) {
        for (ATOMICSWCOMPONENTTYPESUBTYPESENUM c: ATOMICSWCOMPONENTTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
