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
 * This event is raised upon a received mode change.
 * 
 * <p>SWC-MODE-SWITCH-EVENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-MODE-SWITCH-EVENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-EVENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-CLASSIFIER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-STRUCTURE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RTE-EVENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-MODE-SWITCH-EVENT"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWC-MODE-SWITCH-EVENT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "activationreasonrepresentationref",
    "disabledmodeirefs",
    "startoneventref",
    "variationpoint",
    "activation",
    "modeirefs"
})
public class SWCMODESWITCHEVENT {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "LONG-NAME")
    protected MULTILANGUAGELONGNAME longname;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ANNOTATIONS")
    protected Ar421.LINKER.ANNOTATIONS annotations;
    @XmlElement(name = "ACTIVATION-REASON-REPRESENTATION-REF")
    protected Ar421.MODESWITCHEDACKEVENT.ACTIVATIONREASONREPRESENTATIONREF activationreasonrepresentationref;
    @XmlElement(name = "DISABLED-MODE-IREFS")
    protected Ar421.MODESWITCHEDACKEVENT.DISABLEDMODEIREFS disabledmodeirefs;
    @XmlElement(name = "START-ON-EVENT-REF")
    protected Ar421.MODESWITCHEDACKEVENT.STARTONEVENTREF startoneventref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "ACTIVATION")
    protected MODEACTIVATIONKIND activation;
    @XmlElement(name = "MODE-IREFS")
    protected SWCMODESWITCHEVENT.MODEIREFS modeirefs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "UUID")
    protected String uuid;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??longname?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public MULTILANGUAGELONGNAME getLONGNAME() {
        return longname;
    }

    /**
     * ??longname?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public void setLONGNAME(MULTILANGUAGELONGNAME value) {
        this.longname = value;
    }

    /**
     * ??desc?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public MULTILANGUAGEOVERVIEWPARAGRAPH getDESC() {
        return desc;
    }

    /**
     * ??desc?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public void setDESC(MULTILANGUAGEOVERVIEWPARAGRAPH value) {
        this.desc = value;
    }

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public CATEGORYSTRING getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public void setCATEGORY(CATEGORYSTRING value) {
        this.category = value;
    }

    /**
     * ??admindata?????
     * 
     * @return
     *     possible object is
     *     {@link ADMINDATA }
     *     
     */
    public ADMINDATA getADMINDATA() {
        return admindata;
    }

    /**
     * ??admindata?????
     * 
     * @param value
     *     allowed object is
     *     {@link ADMINDATA }
     *     
     */
    public void setADMINDATA(ADMINDATA value) {
        this.admindata = value;
    }

    /**
     * ??introduction?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getINTRODUCTION() {
        return introduction;
    }

    /**
     * ??introduction?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setINTRODUCTION(DOCUMENTATIONBLOCK value) {
        this.introduction = value;
    }

    /**
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public Ar421.LINKER.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(Ar421.LINKER.ANNOTATIONS value) {
        this.annotations = value;
    }

    /**
     * ??activationreasonrepresentationref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.MODESWITCHEDACKEVENT.ACTIVATIONREASONREPRESENTATIONREF }
     *     
     */
    public Ar421.MODESWITCHEDACKEVENT.ACTIVATIONREASONREPRESENTATIONREF getACTIVATIONREASONREPRESENTATIONREF() {
        return activationreasonrepresentationref;
    }

    /**
     * ??activationreasonrepresentationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.MODESWITCHEDACKEVENT.ACTIVATIONREASONREPRESENTATIONREF }
     *     
     */
    public void setACTIVATIONREASONREPRESENTATIONREF(Ar421.MODESWITCHEDACKEVENT.ACTIVATIONREASONREPRESENTATIONREF value) {
        this.activationreasonrepresentationref = value;
    }

    /**
     * ??disabledmodeirefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.MODESWITCHEDACKEVENT.DISABLEDMODEIREFS }
     *     
     */
    public Ar421.MODESWITCHEDACKEVENT.DISABLEDMODEIREFS getDISABLEDMODEIREFS() {
        return disabledmodeirefs;
    }

    /**
     * ??disabledmodeirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.MODESWITCHEDACKEVENT.DISABLEDMODEIREFS }
     *     
     */
    public void setDISABLEDMODEIREFS(Ar421.MODESWITCHEDACKEVENT.DISABLEDMODEIREFS value) {
        this.disabledmodeirefs = value;
    }

    /**
     * ??startoneventref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.MODESWITCHEDACKEVENT.STARTONEVENTREF }
     *     
     */
    public Ar421.MODESWITCHEDACKEVENT.STARTONEVENTREF getSTARTONEVENTREF() {
        return startoneventref;
    }

    /**
     * ??startoneventref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.MODESWITCHEDACKEVENT.STARTONEVENTREF }
     *     
     */
    public void setSTARTONEVENTREF(Ar421.MODESWITCHEDACKEVENT.STARTONEVENTREF value) {
        this.startoneventref = value;
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
     * ??activation?????
     * 
     * @return
     *     possible object is
     *     {@link MODEACTIVATIONKIND }
     *     
     */
    public MODEACTIVATIONKIND getACTIVATION() {
        return activation;
    }

    /**
     * ??activation?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEACTIVATIONKIND }
     *     
     */
    public void setACTIVATION(MODEACTIVATIONKIND value) {
        this.activation = value;
    }

    /**
     * ??modeirefs?????
     * 
     * @return
     *     possible object is
     *     {@link SWCMODESWITCHEVENT.MODEIREFS }
     *     
     */
    public SWCMODESWITCHEVENT.MODEIREFS getMODEIREFS() {
        return modeirefs;
    }

    /**
     * ??modeirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCMODESWITCHEVENT.MODEIREFS }
     *     
     */
    public void setMODEIREFS(SWCMODESWITCHEVENT.MODEIREFS value) {
        this.modeirefs = value;
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
     * ??uuid?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * ??uuid?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
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
     *       &lt;choice maxOccurs="2" minOccurs="0">
     *         &lt;element name="MODE-IREF" type="{http://autosar.org/schema/r4.0}R-MODE-IN-ATOMIC-SWC-INSTANCE-REF"/>
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
        "modeiref"
    })
    public static class MODEIREFS {

        @XmlElement(name = "MODE-IREF")
        protected List<RMODEINATOMICSWCINSTANCEREF> modeiref;

        /**
         * Gets the value of the modeiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modeiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RMODEINATOMICSWCINSTANCEREF }
         * 
         * 
         */
        public List<RMODEINATOMICSWCINSTANCEREF> getMODEIREF() {
            if (modeiref == null) {
                modeiref = new ArrayList<RMODEINATOMICSWCINSTANCEREF>();
            }
            return this.modeiref;
        }

    }

}
