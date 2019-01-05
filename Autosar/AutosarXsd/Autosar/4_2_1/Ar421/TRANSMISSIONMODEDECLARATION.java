//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AUTOSAR COM provides the possibility to define two different TRANSMISSION MODES (True and False) for each I-PDU.
 * 
 * As TransmissionMode selector the signal content can be evaluated via transmissionModeCondition (implemented directly in the COM module) or mode conditions can be defined with the modeDrivenTrueCondition or modeDrivenFalseCondition (evaluated by BswM and invoking Com_SwitchIpduTxMode COM API). If modeDrivenTrueCondition and modeDrivenFalseCondition are defined they shall never evaluate to true both at the same time. 
 * 
 * The mixing of Transmission Mode Switch via API and signal value is not allowed.
 * 
 * <p>TRANSMISSION-MODE-DECLARATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TRANSMISSION-MODE-DECLARATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSMISSION-MODE-DECLARATION"/>
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
@XmlType(name = "TRANSMISSION-MODE-DECLARATION", propOrder = {
    "modedrivenfalseconditions",
    "modedriventrueconditions",
    "transmissionmodeconditions",
    "transmissionmodefalsetiming",
    "transmissionmodetruetiming"
})
public class TRANSMISSIONMODEDECLARATION {

    @XmlElement(name = "MODE-DRIVEN-FALSE-CONDITIONS")
    protected TRANSMISSIONMODEDECLARATION.MODEDRIVENFALSECONDITIONS modedrivenfalseconditions;
    @XmlElement(name = "MODE-DRIVEN-TRUE-CONDITIONS")
    protected TRANSMISSIONMODEDECLARATION.MODEDRIVENTRUECONDITIONS modedriventrueconditions;
    @XmlElement(name = "TRANSMISSION-MODE-CONDITIONS")
    protected TRANSMISSIONMODEDECLARATION.TRANSMISSIONMODECONDITIONS transmissionmodeconditions;
    @XmlElement(name = "TRANSMISSION-MODE-FALSE-TIMING")
    protected TRANSMISSIONMODETIMING transmissionmodefalsetiming;
    @XmlElement(name = "TRANSMISSION-MODE-TRUE-TIMING")
    protected TRANSMISSIONMODETIMING transmissionmodetruetiming;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??modedrivenfalseconditions?????
     * 
     * @return
     *     possible object is
     *     {@link TRANSMISSIONMODEDECLARATION.MODEDRIVENFALSECONDITIONS }
     *     
     */
    public TRANSMISSIONMODEDECLARATION.MODEDRIVENFALSECONDITIONS getMODEDRIVENFALSECONDITIONS() {
        return modedrivenfalseconditions;
    }

    /**
     * ??modedrivenfalseconditions?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSMISSIONMODEDECLARATION.MODEDRIVENFALSECONDITIONS }
     *     
     */
    public void setMODEDRIVENFALSECONDITIONS(TRANSMISSIONMODEDECLARATION.MODEDRIVENFALSECONDITIONS value) {
        this.modedrivenfalseconditions = value;
    }

    /**
     * ??modedriventrueconditions?????
     * 
     * @return
     *     possible object is
     *     {@link TRANSMISSIONMODEDECLARATION.MODEDRIVENTRUECONDITIONS }
     *     
     */
    public TRANSMISSIONMODEDECLARATION.MODEDRIVENTRUECONDITIONS getMODEDRIVENTRUECONDITIONS() {
        return modedriventrueconditions;
    }

    /**
     * ??modedriventrueconditions?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSMISSIONMODEDECLARATION.MODEDRIVENTRUECONDITIONS }
     *     
     */
    public void setMODEDRIVENTRUECONDITIONS(TRANSMISSIONMODEDECLARATION.MODEDRIVENTRUECONDITIONS value) {
        this.modedriventrueconditions = value;
    }

    /**
     * ??transmissionmodeconditions?????
     * 
     * @return
     *     possible object is
     *     {@link TRANSMISSIONMODEDECLARATION.TRANSMISSIONMODECONDITIONS }
     *     
     */
    public TRANSMISSIONMODEDECLARATION.TRANSMISSIONMODECONDITIONS getTRANSMISSIONMODECONDITIONS() {
        return transmissionmodeconditions;
    }

    /**
     * ??transmissionmodeconditions?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSMISSIONMODEDECLARATION.TRANSMISSIONMODECONDITIONS }
     *     
     */
    public void setTRANSMISSIONMODECONDITIONS(TRANSMISSIONMODEDECLARATION.TRANSMISSIONMODECONDITIONS value) {
        this.transmissionmodeconditions = value;
    }

    /**
     * ??transmissionmodefalsetiming?????
     * 
     * @return
     *     possible object is
     *     {@link TRANSMISSIONMODETIMING }
     *     
     */
    public TRANSMISSIONMODETIMING getTRANSMISSIONMODEFALSETIMING() {
        return transmissionmodefalsetiming;
    }

    /**
     * ??transmissionmodefalsetiming?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSMISSIONMODETIMING }
     *     
     */
    public void setTRANSMISSIONMODEFALSETIMING(TRANSMISSIONMODETIMING value) {
        this.transmissionmodefalsetiming = value;
    }

    /**
     * ??transmissionmodetruetiming?????
     * 
     * @return
     *     possible object is
     *     {@link TRANSMISSIONMODETIMING }
     *     
     */
    public TRANSMISSIONMODETIMING getTRANSMISSIONMODETRUETIMING() {
        return transmissionmodetruetiming;
    }

    /**
     * ??transmissionmodetruetiming?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSMISSIONMODETIMING }
     *     
     */
    public void setTRANSMISSIONMODETRUETIMING(TRANSMISSIONMODETIMING value) {
        this.transmissionmodetruetiming = value;
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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="MODE-DRIVEN-TRANSMISSION-MODE-CONDITION" type="{http://autosar.org/schema/r4.0}MODE-DRIVEN-TRANSMISSION-MODE-CONDITION"/>
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
        "modedriventransmissionmodecondition"
    })
    public static class MODEDRIVENFALSECONDITIONS {

        @XmlElement(name = "MODE-DRIVEN-TRANSMISSION-MODE-CONDITION")
        protected List<MODEDRIVENTRANSMISSIONMODECONDITION> modedriventransmissionmodecondition;

        /**
         * Gets the value of the modedriventransmissionmodecondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modedriventransmissionmodecondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEDRIVENTRANSMISSIONMODECONDITION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODEDRIVENTRANSMISSIONMODECONDITION }
         * 
         * 
         */
        public List<MODEDRIVENTRANSMISSIONMODECONDITION> getMODEDRIVENTRANSMISSIONMODECONDITION() {
            if (modedriventransmissionmodecondition == null) {
                modedriventransmissionmodecondition = new ArrayList<MODEDRIVENTRANSMISSIONMODECONDITION>();
            }
            return this.modedriventransmissionmodecondition;
        }

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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="MODE-DRIVEN-TRANSMISSION-MODE-CONDITION" type="{http://autosar.org/schema/r4.0}MODE-DRIVEN-TRANSMISSION-MODE-CONDITION"/>
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
        "modedriventransmissionmodecondition"
    })
    public static class MODEDRIVENTRUECONDITIONS {

        @XmlElement(name = "MODE-DRIVEN-TRANSMISSION-MODE-CONDITION")
        protected List<MODEDRIVENTRANSMISSIONMODECONDITION> modedriventransmissionmodecondition;

        /**
         * Gets the value of the modedriventransmissionmodecondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modedriventransmissionmodecondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEDRIVENTRANSMISSIONMODECONDITION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODEDRIVENTRANSMISSIONMODECONDITION }
         * 
         * 
         */
        public List<MODEDRIVENTRANSMISSIONMODECONDITION> getMODEDRIVENTRANSMISSIONMODECONDITION() {
            if (modedriventransmissionmodecondition == null) {
                modedriventransmissionmodecondition = new ArrayList<MODEDRIVENTRANSMISSIONMODECONDITION>();
            }
            return this.modedriventransmissionmodecondition;
        }

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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="TRANSMISSION-MODE-CONDITION" type="{http://autosar.org/schema/r4.0}TRANSMISSION-MODE-CONDITION"/>
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
        "transmissionmodecondition"
    })
    public static class TRANSMISSIONMODECONDITIONS {

        @XmlElement(name = "TRANSMISSION-MODE-CONDITION")
        protected List<TRANSMISSIONMODECONDITION> transmissionmodecondition;

        /**
         * Gets the value of the transmissionmodecondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transmissionmodecondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTRANSMISSIONMODECONDITION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRANSMISSIONMODECONDITION }
         * 
         * 
         */
        public List<TRANSMISSIONMODECONDITION> getTRANSMISSIONMODECONDITION() {
            if (transmissionmodecondition == null) {
                transmissionmodecondition = new ArrayList<TRANSMISSIONMODECONDITION>();
            }
            return this.transmissionmodecondition;
        }

    }

}
