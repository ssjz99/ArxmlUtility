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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>CAN-COMMUNICATION-CONTROLLER-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-COMMUNICATION-CONTROLLER-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-CAN-COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-COMMUNICATION-CONTROLLER-CONDITIONAL"/>
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
@XmlType(name = "CAN-COMMUNICATION-CONTROLLER-CONDITIONAL", propOrder = {
    "wakeupbycontrollersupported",
    "cancontrollerattributes",
    "variationpoint"
})
public class CANCOMMUNICATIONCONTROLLERCONDITIONAL {

    @XmlElement(name = "WAKE-UP-BY-CONTROLLER-SUPPORTED")
    protected BOOLEAN wakeupbycontrollersupported;
    @XmlElement(name = "CAN-CONTROLLER-ATTRIBUTES")
    protected CANCOMMUNICATIONCONTROLLERCONDITIONAL.CANCONTROLLERATTRIBUTES cancontrollerattributes;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??wakeupbycontrollersupported?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getWAKEUPBYCONTROLLERSUPPORTED() {
        return wakeupbycontrollersupported;
    }

    /**
     * ??wakeupbycontrollersupported?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setWAKEUPBYCONTROLLERSUPPORTED(BOOLEAN value) {
        this.wakeupbycontrollersupported = value;
    }

    /**
     * ??cancontrollerattributes?????
     * 
     * @return
     *     possible object is
     *     {@link CANCOMMUNICATIONCONTROLLERCONDITIONAL.CANCONTROLLERATTRIBUTES }
     *     
     */
    public CANCOMMUNICATIONCONTROLLERCONDITIONAL.CANCONTROLLERATTRIBUTES getCANCONTROLLERATTRIBUTES() {
        return cancontrollerattributes;
    }

    /**
     * ??cancontrollerattributes?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANCOMMUNICATIONCONTROLLERCONDITIONAL.CANCONTROLLERATTRIBUTES }
     *     
     */
    public void setCANCONTROLLERATTRIBUTES(CANCOMMUNICATIONCONTROLLERCONDITIONAL.CANCONTROLLERATTRIBUTES value) {
        this.cancontrollerattributes = value;
    }

    /**
     * ??variationpoint?????
     * 
     * @return
     *     possible object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public VARIATIONPOINT getVARIATIONPOINT() {
        return variationpoint;
    }

    /**
     * ??variationpoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public void setVARIATIONPOINT(VARIATIONPOINT value) {
        this.variationpoint = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element name="CAN-CONTROLLER-CONFIGURATION" type="{http://autosar.org/schema/r4.0}CAN-CONTROLLER-CONFIGURATION"/>
     *         &lt;element name="CAN-CONTROLLER-CONFIGURATION-REQUIREMENTS" type="{http://autosar.org/schema/r4.0}CAN-CONTROLLER-CONFIGURATION-REQUIREMENTS"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cancontrollerconfigurationOrCANCONTROLLERCONFIGURATIONREQUIREMENTS"
    })
    public static class CANCONTROLLERATTRIBUTES {

        @XmlElements({
            @XmlElement(name = "CAN-CONTROLLER-CONFIGURATION", type = CANCONTROLLERCONFIGURATION.class),
            @XmlElement(name = "CAN-CONTROLLER-CONFIGURATION-REQUIREMENTS", type = CANCONTROLLERCONFIGURATIONREQUIREMENTS.class)
        })
        protected Object cancontrollerconfigurationOrCANCONTROLLERCONFIGURATIONREQUIREMENTS;

        /**
         * ??cancontrollerconfigurationOrCANCONTROLLERCONFIGURATIONREQUIREMENTS?????
         * 
         * @return
         *     possible object is
         *     {@link CANCONTROLLERCONFIGURATION }
         *     {@link CANCONTROLLERCONFIGURATIONREQUIREMENTS }
         *     
         */
        public Object getCANCONTROLLERCONFIGURATIONOrCANCONTROLLERCONFIGURATIONREQUIREMENTS() {
            return cancontrollerconfigurationOrCANCONTROLLERCONFIGURATIONREQUIREMENTS;
        }

        /**
         * ??cancontrollerconfigurationOrCANCONTROLLERCONFIGURATIONREQUIREMENTS?????
         * 
         * @param value
         *     allowed object is
         *     {@link CANCONTROLLERCONFIGURATION }
         *     {@link CANCONTROLLERCONFIGURATIONREQUIREMENTS }
         *     
         */
        public void setCANCONTROLLERCONFIGURATIONOrCANCONTROLLERCONFIGURATIONREQUIREMENTS(Object value) {
            this.cancontrollerconfigurationOrCANCONTROLLERCONFIGURATIONREQUIREMENTS = value;
        }

    }

}
