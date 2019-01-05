//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Static logical channel or VLAN binding to a switch-port.
 * 
 * <p>VLAN-MEMBERSHIP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="VLAN-MEMBERSHIP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}VLAN-MEMBERSHIP"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VLAN-MEMBERSHIP", propOrder = {
    "defaultpriority",
    "dhcpaddressassignment",
    "sendactivity",
    "vlanref"
})
public class VLANMEMBERSHIP {

    @XmlElement(name = "DEFAULT-PRIORITY")
    protected POSITIVEINTEGER defaultpriority;
    @XmlElement(name = "DHCP-ADDRESS-ASSIGNMENT")
    protected DHCPSERVERCONFIGURATION dhcpaddressassignment;
    @XmlElement(name = "SEND-ACTIVITY")
    protected ETHERNETSWITCHVLANEGRESSTAGGINGENUM sendactivity;
    @XmlElement(name = "VLAN-REF")
    protected VLANMEMBERSHIP.VLANREF vlanref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??defaultpriority?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDEFAULTPRIORITY() {
        return defaultpriority;
    }

    /**
     * ??defaultpriority?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDEFAULTPRIORITY(POSITIVEINTEGER value) {
        this.defaultpriority = value;
    }

    /**
     * ??dhcpaddressassignment?????
     * 
     * @return
     *     possible object is
     *     {@link DHCPSERVERCONFIGURATION }
     *     
     */
    public DHCPSERVERCONFIGURATION getDHCPADDRESSASSIGNMENT() {
        return dhcpaddressassignment;
    }

    /**
     * ??dhcpaddressassignment?????
     * 
     * @param value
     *     allowed object is
     *     {@link DHCPSERVERCONFIGURATION }
     *     
     */
    public void setDHCPADDRESSASSIGNMENT(DHCPSERVERCONFIGURATION value) {
        this.dhcpaddressassignment = value;
    }

    /**
     * ??sendactivity?????
     * 
     * @return
     *     possible object is
     *     {@link ETHERNETSWITCHVLANEGRESSTAGGINGENUM }
     *     
     */
    public ETHERNETSWITCHVLANEGRESSTAGGINGENUM getSENDACTIVITY() {
        return sendactivity;
    }

    /**
     * ??sendactivity?????
     * 
     * @param value
     *     allowed object is
     *     {@link ETHERNETSWITCHVLANEGRESSTAGGINGENUM }
     *     
     */
    public void setSENDACTIVITY(ETHERNETSWITCHVLANEGRESSTAGGINGENUM value) {
        this.sendactivity = value;
    }

    /**
     * ??vlanref?????
     * 
     * @return
     *     possible object is
     *     {@link VLANMEMBERSHIP.VLANREF }
     *     
     */
    public VLANMEMBERSHIP.VLANREF getVLANREF() {
        return vlanref;
    }

    /**
     * ??vlanref?????
     * 
     * @param value
     *     allowed object is
     *     {@link VLANMEMBERSHIP.VLANREF }
     *     
     */
    public void setVLANREF(VLANMEMBERSHIP.VLANREF value) {
        this.vlanref = value;
    }

    /**
     * ??s?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS() {
        return s;
    }

    /**
     * ??s?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS(String value) {
        this.s = value;
    }

    /**
     * ??t?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT() {
        return t;
    }

    /**
     * ??t?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT(String value) {
        this.t = value;
    }


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ETHERNET-PHYSICAL-CHANNEL--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VLANREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ETHERNETPHYSICALCHANNELSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ETHERNETPHYSICALCHANNELSUBTYPESENUM }
         *     
         */
        public ETHERNETPHYSICALCHANNELSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ETHERNETPHYSICALCHANNELSUBTYPESENUM }
         *     
         */
        public void setDEST(ETHERNETPHYSICALCHANNELSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
