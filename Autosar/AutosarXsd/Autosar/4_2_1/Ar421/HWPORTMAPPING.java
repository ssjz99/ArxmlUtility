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
 * HWPortMapping specifies the hwCommunicationPort (defined in the ECU Resource Template) to realize the specified CommunicationConnector in a physical topology.
 * 
 * <p>HW-PORT-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="HW-PORT-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}HW-PORT-MAPPING"/>
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
@XmlType(name = "HW-PORT-MAPPING", propOrder = {
    "communicationconnectorref",
    "hwcommunicationportref"
})
public class HWPORTMAPPING {

    @XmlElement(name = "COMMUNICATION-CONNECTOR-REF")
    protected HWPORTMAPPING.COMMUNICATIONCONNECTORREF communicationconnectorref;
    @XmlElement(name = "HW-COMMUNICATION-PORT-REF")
    protected HWPORTMAPPING.HWCOMMUNICATIONPORTREF hwcommunicationportref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??communicationconnectorref?????
     * 
     * @return
     *     possible object is
     *     {@link HWPORTMAPPING.COMMUNICATIONCONNECTORREF }
     *     
     */
    public HWPORTMAPPING.COMMUNICATIONCONNECTORREF getCOMMUNICATIONCONNECTORREF() {
        return communicationconnectorref;
    }

    /**
     * ??communicationconnectorref?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWPORTMAPPING.COMMUNICATIONCONNECTORREF }
     *     
     */
    public void setCOMMUNICATIONCONNECTORREF(HWPORTMAPPING.COMMUNICATIONCONNECTORREF value) {
        this.communicationconnectorref = value;
    }

    /**
     * ??hwcommunicationportref?????
     * 
     * @return
     *     possible object is
     *     {@link HWPORTMAPPING.HWCOMMUNICATIONPORTREF }
     *     
     */
    public HWPORTMAPPING.HWCOMMUNICATIONPORTREF getHWCOMMUNICATIONPORTREF() {
        return hwcommunicationportref;
    }

    /**
     * ??hwcommunicationportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWPORTMAPPING.HWCOMMUNICATIONPORTREF }
     *     
     */
    public void setHWCOMMUNICATIONPORTREF(HWPORTMAPPING.HWCOMMUNICATIONPORTREF value) {
        this.hwcommunicationportref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMMUNICATION-CONNECTOR--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class COMMUNICATIONCONNECTORREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COMMUNICATIONCONNECTORSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COMMUNICATIONCONNECTORSUBTYPESENUM }
         *     
         */
        public COMMUNICATIONCONNECTORSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COMMUNICATIONCONNECTORSUBTYPESENUM }
         *     
         */
        public void setDEST(COMMUNICATIONCONNECTORSUBTYPESENUM value) {
            this.dest = value;
        }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}HW-PIN-GROUP--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HWCOMMUNICATIONPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected HWPINGROUPSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link HWPINGROUPSUBTYPESENUM }
         *     
         */
        public HWPINGROUPSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link HWPINGROUPSUBTYPESENUM }
         *     
         */
        public void setDEST(HWPINGROUPSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
