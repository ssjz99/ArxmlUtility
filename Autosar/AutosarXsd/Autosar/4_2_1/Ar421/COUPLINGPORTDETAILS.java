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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines details of a CouplingPort.
 * 
 * May be used to configure the structures of a switch.
 * 
 * <p>COUPLING-PORT-DETAILS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COUPLING-PORT-DETAILS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COUPLING-PORT-DETAILS"/>
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
@XmlType(name = "COUPLING-PORT-DETAILS", propOrder = {
    "couplingportstructuralelements",
    "ethernetpriorityregenerations",
    "ethernettrafficclassassignments",
    "lastegressschedulerref"
})
public class COUPLINGPORTDETAILS {

    @XmlElement(name = "COUPLING-PORT-STRUCTURAL-ELEMENTS")
    protected COUPLINGPORTDETAILS.COUPLINGPORTSTRUCTURALELEMENTS couplingportstructuralelements;
    @XmlElement(name = "ETHERNET-PRIORITY-REGENERATIONS")
    protected COUPLINGPORTDETAILS.ETHERNETPRIORITYREGENERATIONS ethernetpriorityregenerations;
    @XmlElement(name = "ETHERNET-TRAFFIC-CLASS-ASSIGNMENTS")
    protected COUPLINGPORTDETAILS.ETHERNETTRAFFICCLASSASSIGNMENTS ethernettrafficclassassignments;
    @XmlElement(name = "LAST-EGRESS-SCHEDULER-REF")
    protected COUPLINGPORTDETAILS.LASTEGRESSSCHEDULERREF lastegressschedulerref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??couplingportstructuralelements?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORTDETAILS.COUPLINGPORTSTRUCTURALELEMENTS }
     *     
     */
    public COUPLINGPORTDETAILS.COUPLINGPORTSTRUCTURALELEMENTS getCOUPLINGPORTSTRUCTURALELEMENTS() {
        return couplingportstructuralelements;
    }

    /**
     * ??couplingportstructuralelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORTDETAILS.COUPLINGPORTSTRUCTURALELEMENTS }
     *     
     */
    public void setCOUPLINGPORTSTRUCTURALELEMENTS(COUPLINGPORTDETAILS.COUPLINGPORTSTRUCTURALELEMENTS value) {
        this.couplingportstructuralelements = value;
    }

    /**
     * ??ethernetpriorityregenerations?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORTDETAILS.ETHERNETPRIORITYREGENERATIONS }
     *     
     */
    public COUPLINGPORTDETAILS.ETHERNETPRIORITYREGENERATIONS getETHERNETPRIORITYREGENERATIONS() {
        return ethernetpriorityregenerations;
    }

    /**
     * ??ethernetpriorityregenerations?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORTDETAILS.ETHERNETPRIORITYREGENERATIONS }
     *     
     */
    public void setETHERNETPRIORITYREGENERATIONS(COUPLINGPORTDETAILS.ETHERNETPRIORITYREGENERATIONS value) {
        this.ethernetpriorityregenerations = value;
    }

    /**
     * ??ethernettrafficclassassignments?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORTDETAILS.ETHERNETTRAFFICCLASSASSIGNMENTS }
     *     
     */
    public COUPLINGPORTDETAILS.ETHERNETTRAFFICCLASSASSIGNMENTS getETHERNETTRAFFICCLASSASSIGNMENTS() {
        return ethernettrafficclassassignments;
    }

    /**
     * ??ethernettrafficclassassignments?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORTDETAILS.ETHERNETTRAFFICCLASSASSIGNMENTS }
     *     
     */
    public void setETHERNETTRAFFICCLASSASSIGNMENTS(COUPLINGPORTDETAILS.ETHERNETTRAFFICCLASSASSIGNMENTS value) {
        this.ethernettrafficclassassignments = value;
    }

    /**
     * ??lastegressschedulerref?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORTDETAILS.LASTEGRESSSCHEDULERREF }
     *     
     */
    public COUPLINGPORTDETAILS.LASTEGRESSSCHEDULERREF getLASTEGRESSSCHEDULERREF() {
        return lastegressschedulerref;
    }

    /**
     * ??lastegressschedulerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORTDETAILS.LASTEGRESSSCHEDULERREF }
     *     
     */
    public void setLASTEGRESSSCHEDULERREF(COUPLINGPORTDETAILS.LASTEGRESSSCHEDULERREF value) {
        this.lastegressschedulerref = value;
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
     *         &lt;element name="COUPLING-PORT-FIFO" type="{http://autosar.org/schema/r4.0}COUPLING-PORT-FIFO"/>
     *         &lt;element name="COUPLING-PORT-SCHEDULER" type="{http://autosar.org/schema/r4.0}COUPLING-PORT-SCHEDULER"/>
     *         &lt;element name="COUPLING-PORT-SHAPER" type="{http://autosar.org/schema/r4.0}COUPLING-PORT-SHAPER"/>
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
        "couplingportfifoOrCOUPLINGPORTSCHEDULEROrCOUPLINGPORTSHAPER"
    })
    public static class COUPLINGPORTSTRUCTURALELEMENTS {

        @XmlElements({
            @XmlElement(name = "COUPLING-PORT-FIFO", type = COUPLINGPORTFIFO.class),
            @XmlElement(name = "COUPLING-PORT-SCHEDULER", type = COUPLINGPORTSCHEDULER.class),
            @XmlElement(name = "COUPLING-PORT-SHAPER", type = COUPLINGPORTSHAPER.class)
        })
        protected List<Object> couplingportfifoOrCOUPLINGPORTSCHEDULEROrCOUPLINGPORTSHAPER;

        /**
         * Gets the value of the couplingportfifoOrCOUPLINGPORTSCHEDULEROrCOUPLINGPORTSHAPER property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couplingportfifoOrCOUPLINGPORTSCHEDULEROrCOUPLINGPORTSHAPER property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOUPLINGPORTFIFOOrCOUPLINGPORTSCHEDULEROrCOUPLINGPORTSHAPER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COUPLINGPORTFIFO }
         * {@link COUPLINGPORTSCHEDULER }
         * {@link COUPLINGPORTSHAPER }
         * 
         * 
         */
        public List<Object> getCOUPLINGPORTFIFOOrCOUPLINGPORTSCHEDULEROrCOUPLINGPORTSHAPER() {
            if (couplingportfifoOrCOUPLINGPORTSCHEDULEROrCOUPLINGPORTSHAPER == null) {
                couplingportfifoOrCOUPLINGPORTSCHEDULEROrCOUPLINGPORTSHAPER = new ArrayList<Object>();
            }
            return this.couplingportfifoOrCOUPLINGPORTSCHEDULEROrCOUPLINGPORTSHAPER;
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
     *       &lt;choice maxOccurs="8" minOccurs="0">
     *         &lt;element name="ETHERNET-PRIORITY-REGENERATION" type="{http://autosar.org/schema/r4.0}ETHERNET-PRIORITY-REGENERATION"/>
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
        "ethernetpriorityregeneration"
    })
    public static class ETHERNETPRIORITYREGENERATIONS {

        @XmlElement(name = "ETHERNET-PRIORITY-REGENERATION")
        protected List<ETHERNETPRIORITYREGENERATION> ethernetpriorityregeneration;

        /**
         * Gets the value of the ethernetpriorityregeneration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ethernetpriorityregeneration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETHERNETPRIORITYREGENERATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ETHERNETPRIORITYREGENERATION }
         * 
         * 
         */
        public List<ETHERNETPRIORITYREGENERATION> getETHERNETPRIORITYREGENERATION() {
            if (ethernetpriorityregeneration == null) {
                ethernetpriorityregeneration = new ArrayList<ETHERNETPRIORITYREGENERATION>();
            }
            return this.ethernetpriorityregeneration;
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
     *       &lt;choice maxOccurs="8" minOccurs="0">
     *         &lt;element name="COUPLING-PORT-TRAFFIC-CLASS-ASSIGNMENT" type="{http://autosar.org/schema/r4.0}COUPLING-PORT-TRAFFIC-CLASS-ASSIGNMENT"/>
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
        "couplingporttrafficclassassignment"
    })
    public static class ETHERNETTRAFFICCLASSASSIGNMENTS {

        @XmlElement(name = "COUPLING-PORT-TRAFFIC-CLASS-ASSIGNMENT")
        protected List<COUPLINGPORTTRAFFICCLASSASSIGNMENT> couplingporttrafficclassassignment;

        /**
         * Gets the value of the couplingporttrafficclassassignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couplingporttrafficclassassignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOUPLINGPORTTRAFFICCLASSASSIGNMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COUPLINGPORTTRAFFICCLASSASSIGNMENT }
         * 
         * 
         */
        public List<COUPLINGPORTTRAFFICCLASSASSIGNMENT> getCOUPLINGPORTTRAFFICCLASSASSIGNMENT() {
            if (couplingporttrafficclassassignment == null) {
                couplingporttrafficclassassignment = new ArrayList<COUPLINGPORTTRAFFICCLASSASSIGNMENT>();
            }
            return this.couplingporttrafficclassassignment;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COUPLING-PORT-SCHEDULER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LASTEGRESSSCHEDULERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COUPLINGPORTSCHEDULERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COUPLINGPORTSCHEDULERSUBTYPESENUM }
         *     
         */
        public COUPLINGPORTSCHEDULERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COUPLINGPORTSCHEDULERSUBTYPESENUM }
         *     
         */
        public void setDEST(COUPLINGPORTSCHEDULERSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
