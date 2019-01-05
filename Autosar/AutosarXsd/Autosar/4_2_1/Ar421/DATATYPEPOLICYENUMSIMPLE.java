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
 * <p>DATA-TYPE-POLICY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DATA-TYPE-POLICY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEGACY"/>
 *     &lt;enumeration value="NETWORK-REPRESENTATION-FROM-COM-SPEC"/>
 *     &lt;enumeration value="OVERRIDE"/>
 *     &lt;enumeration value="PORT-INTERFACE-DEFINITION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DATA-TYPE-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum DATATYPEPOLICYENUMSIMPLE {


    /**
     * In case the System Description doesn't use a complete Software Component Description (VFB View) this value can be chosen. This supports the inclusion of legacy signals. 
     * 
     * The aggregation of SwDataDefProps shall be used to configure the "ComSignalDataInvalidValue" and the Data Semantics.
     * 
     */
    LEGACY("LEGACY"),

    /**
     * Ignore any networkRepresentationProps of this ISignal and use the networkRepresentation from the ComSpec.
     * 
     * Please note that the usage does not imply the existence of the SwDataDefProps in the role networkRepresentation aggregated by the SenderComSpec or ReceiverComSpec if an ImplementationDataType is defined.
     * 
     */
    @XmlEnumValue("NETWORK-REPRESENTATION-FROM-COM-SPEC")
    NETWORK___REPRESENTATION___FROM___COM___SPEC("NETWORK-REPRESENTATION-FROM-COM-SPEC"),

    /**
     * If this value is chosen the requirements specified in the ComSpec (networkRepresentationFromComSpec) are not fullfilled by the aggregated SwDataDefProps. In this case the networkRepresentation is specified by the aggregated swDataDefProps.
     * 
     */
    OVERRIDE("OVERRIDE"),

    /**
     * This enumeration literal is deprecated and will be removed in future.
     * 
     * Old description:
     * Ignore any networkRepresentationProps of this ISignal and use the networkRepresentation specified in the VariableDataPrototypes owned by PortInterface (portInterfaceDefinition).
     * 
     */
    @XmlEnumValue("PORT-INTERFACE-DEFINITION")
    PORT___INTERFACE___DEFINITION("PORT-INTERFACE-DEFINITION");
    private final String value;

    DATATYPEPOLICYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DATATYPEPOLICYENUMSIMPLE fromValue(String v) {
        for (DATATYPEPOLICYENUMSIMPLE c: DATATYPEPOLICYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
