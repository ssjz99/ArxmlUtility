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
 * This represents the ability to react on errors occurring during mode handling.
 * 
 * <p>BSW-MODE-MANAGER-ERROR-EVENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-MODE-MANAGER-ERROR-EVENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-EVENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-EVENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-SCHEDULE-EVENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-MODE-MANAGER-ERROR-EVENT"/>
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
@XmlType(name = "BSW-MODE-MANAGER-ERROR-EVENT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "activationreasonrepresentationref",
    "contextlimitationrefs",
    "disabledinmodeirefs",
    "startsoneventref",
    "variationpoint",
    "modegroupref"
})
public class BSWMODEMANAGERERROREVENT {

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
    @XmlElement(name = "CONTEXT-LIMITATION-REFS")
    protected Ar421.BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS contextlimitationrefs;
    @XmlElement(name = "DISABLED-IN-MODE-IREFS")
    protected Ar421.BSWOPERATIONINVOKEDEVENT.DISABLEDINMODEIREFS disabledinmodeirefs;
    @XmlElement(name = "STARTS-ON-EVENT-REF")
    protected Ar421.BSWOPERATIONINVOKEDEVENT.STARTSONEVENTREF startsoneventref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "MODE-GROUP-REF")
    protected BSWMODEMANAGERERROREVENT.MODEGROUPREF modegroupref;
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
     * ??contextlimitationrefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS }
     *     
     */
    public Ar421.BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS getCONTEXTLIMITATIONREFS() {
        return contextlimitationrefs;
    }

    /**
     * ??contextlimitationrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS }
     *     
     */
    public void setCONTEXTLIMITATIONREFS(Ar421.BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS value) {
        this.contextlimitationrefs = value;
    }

    /**
     * ??disabledinmodeirefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWOPERATIONINVOKEDEVENT.DISABLEDINMODEIREFS }
     *     
     */
    public Ar421.BSWOPERATIONINVOKEDEVENT.DISABLEDINMODEIREFS getDISABLEDINMODEIREFS() {
        return disabledinmodeirefs;
    }

    /**
     * ??disabledinmodeirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWOPERATIONINVOKEDEVENT.DISABLEDINMODEIREFS }
     *     
     */
    public void setDISABLEDINMODEIREFS(Ar421.BSWOPERATIONINVOKEDEVENT.DISABLEDINMODEIREFS value) {
        this.disabledinmodeirefs = value;
    }

    /**
     * ??startsoneventref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWOPERATIONINVOKEDEVENT.STARTSONEVENTREF }
     *     
     */
    public Ar421.BSWOPERATIONINVOKEDEVENT.STARTSONEVENTREF getSTARTSONEVENTREF() {
        return startsoneventref;
    }

    /**
     * ??startsoneventref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWOPERATIONINVOKEDEVENT.STARTSONEVENTREF }
     *     
     */
    public void setSTARTSONEVENTREF(Ar421.BSWOPERATIONINVOKEDEVENT.STARTSONEVENTREF value) {
        this.startsoneventref = value;
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
     * ??modegroupref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODEMANAGERERROREVENT.MODEGROUPREF }
     *     
     */
    public BSWMODEMANAGERERROREVENT.MODEGROUPREF getMODEGROUPREF() {
        return modegroupref;
    }

    /**
     * ??modegroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODEMANAGERERROREVENT.MODEGROUPREF }
     *     
     */
    public void setMODEGROUPREF(BSWMODEMANAGERERROREVENT.MODEGROUPREF value) {
        this.modegroupref = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MODEGROUPREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM }
         *     
         */
        public MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
