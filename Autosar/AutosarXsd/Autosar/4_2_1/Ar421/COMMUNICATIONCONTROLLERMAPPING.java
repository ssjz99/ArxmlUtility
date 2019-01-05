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
 * CommunicationControllerMapping specifies the CommunicationPeripheral
 * hardware (defined in the ECU Resource Template) to realize the specified CommunicationController in a physical topology.
 * 
 * <p>COMMUNICATION-CONTROLLER-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COMMUNICATION-CONTROLLER-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CONTROLLER-MAPPING"/>
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
@XmlType(name = "COMMUNICATION-CONTROLLER-MAPPING", propOrder = {
    "communicationcontrollerref",
    "hwcommunicationcontrollerref"
})
public class COMMUNICATIONCONTROLLERMAPPING {

    @XmlElement(name = "COMMUNICATION-CONTROLLER-REF")
    protected COMMUNICATIONCONTROLLERMAPPING.COMMUNICATIONCONTROLLERREF communicationcontrollerref;
    @XmlElement(name = "HW-COMMUNICATION-CONTROLLER-REF")
    protected COMMUNICATIONCONTROLLERMAPPING.HWCOMMUNICATIONCONTROLLERREF hwcommunicationcontrollerref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??communicationcontrollerref?????
     * 
     * @return
     *     possible object is
     *     {@link COMMUNICATIONCONTROLLERMAPPING.COMMUNICATIONCONTROLLERREF }
     *     
     */
    public COMMUNICATIONCONTROLLERMAPPING.COMMUNICATIONCONTROLLERREF getCOMMUNICATIONCONTROLLERREF() {
        return communicationcontrollerref;
    }

    /**
     * ??communicationcontrollerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMMUNICATIONCONTROLLERMAPPING.COMMUNICATIONCONTROLLERREF }
     *     
     */
    public void setCOMMUNICATIONCONTROLLERREF(COMMUNICATIONCONTROLLERMAPPING.COMMUNICATIONCONTROLLERREF value) {
        this.communicationcontrollerref = value;
    }

    /**
     * ??hwcommunicationcontrollerref?????
     * 
     * @return
     *     possible object is
     *     {@link COMMUNICATIONCONTROLLERMAPPING.HWCOMMUNICATIONCONTROLLERREF }
     *     
     */
    public COMMUNICATIONCONTROLLERMAPPING.HWCOMMUNICATIONCONTROLLERREF getHWCOMMUNICATIONCONTROLLERREF() {
        return hwcommunicationcontrollerref;
    }

    /**
     * ??hwcommunicationcontrollerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMMUNICATIONCONTROLLERMAPPING.HWCOMMUNICATIONCONTROLLERREF }
     *     
     */
    public void setHWCOMMUNICATIONCONTROLLERREF(COMMUNICATIONCONTROLLERMAPPING.HWCOMMUNICATIONCONTROLLERREF value) {
        this.hwcommunicationcontrollerref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMMUNICATION-CONTROLLER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class COMMUNICATIONCONTROLLERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COMMUNICATIONCONTROLLERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COMMUNICATIONCONTROLLERSUBTYPESENUM }
         *     
         */
        public COMMUNICATIONCONTROLLERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COMMUNICATIONCONTROLLERSUBTYPESENUM }
         *     
         */
        public void setDEST(COMMUNICATIONCONTROLLERSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}HW-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HWCOMMUNICATIONCONTROLLERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected HWELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link HWELEMENTSUBTYPESENUM }
         *     
         */
        public HWELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link HWELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(HWELEMENTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
