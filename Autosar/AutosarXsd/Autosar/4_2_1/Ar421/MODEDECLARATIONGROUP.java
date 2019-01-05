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
 * A collection of Mode Declarations. Also, the initial mode is explicitly identified.
 * 
 * <p>MODE-DECLARATION-GROUP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MODE-DECLARATION-GROUP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-CLASSIFIER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-TYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP"/>
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
@XmlType(name = "MODE-DECLARATION-GROUP", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "blueprintpolicys",
    "shortnamepattern",
    "initialmoderef",
    "modedeclarations",
    "modemanagererrorbehavior",
    "modetransitions",
    "modeusererrorbehavior",
    "ontransitionvalue"
})
public class MODEDECLARATIONGROUP {

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
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "BLUEPRINT-POLICYS")
    protected Ar421.FLATMAP.BLUEPRINTPOLICYS blueprintpolicys;
    @XmlElement(name = "SHORT-NAME-PATTERN")
    protected STRING shortnamepattern;
    @XmlElement(name = "INITIAL-MODE-REF")
    protected MODEDECLARATIONGROUP.INITIALMODEREF initialmoderef;
    @XmlElement(name = "MODE-DECLARATIONS")
    protected MODEDECLARATIONGROUP.MODEDECLARATIONS modedeclarations;
    @XmlElement(name = "MODE-MANAGER-ERROR-BEHAVIOR")
    protected MODEERRORBEHAVIOR modemanagererrorbehavior;
    @XmlElement(name = "MODE-TRANSITIONS")
    protected MODEDECLARATIONGROUP.MODETRANSITIONS modetransitions;
    @XmlElement(name = "MODE-USER-ERROR-BEHAVIOR")
    protected MODEERRORBEHAVIOR modeusererrorbehavior;
    @XmlElement(name = "ON-TRANSITION-VALUE")
    protected POSITIVEINTEGER ontransitionvalue;
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
     * ??blueprintpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public Ar421.FLATMAP.BLUEPRINTPOLICYS getBLUEPRINTPOLICYS() {
        return blueprintpolicys;
    }

    /**
     * ??blueprintpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public void setBLUEPRINTPOLICYS(Ar421.FLATMAP.BLUEPRINTPOLICYS value) {
        this.blueprintpolicys = value;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getSHORTNAMEPATTERN() {
        return shortnamepattern;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setSHORTNAMEPATTERN(STRING value) {
        this.shortnamepattern = value;
    }

    /**
     * ??initialmoderef?????
     * 
     * @return
     *     possible object is
     *     {@link MODEDECLARATIONGROUP.INITIALMODEREF }
     *     
     */
    public MODEDECLARATIONGROUP.INITIALMODEREF getINITIALMODEREF() {
        return initialmoderef;
    }

    /**
     * ??initialmoderef?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEDECLARATIONGROUP.INITIALMODEREF }
     *     
     */
    public void setINITIALMODEREF(MODEDECLARATIONGROUP.INITIALMODEREF value) {
        this.initialmoderef = value;
    }

    /**
     * ??modedeclarations?????
     * 
     * @return
     *     possible object is
     *     {@link MODEDECLARATIONGROUP.MODEDECLARATIONS }
     *     
     */
    public MODEDECLARATIONGROUP.MODEDECLARATIONS getMODEDECLARATIONS() {
        return modedeclarations;
    }

    /**
     * ??modedeclarations?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEDECLARATIONGROUP.MODEDECLARATIONS }
     *     
     */
    public void setMODEDECLARATIONS(MODEDECLARATIONGROUP.MODEDECLARATIONS value) {
        this.modedeclarations = value;
    }

    /**
     * ??modemanagererrorbehavior?????
     * 
     * @return
     *     possible object is
     *     {@link MODEERRORBEHAVIOR }
     *     
     */
    public MODEERRORBEHAVIOR getMODEMANAGERERRORBEHAVIOR() {
        return modemanagererrorbehavior;
    }

    /**
     * ??modemanagererrorbehavior?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEERRORBEHAVIOR }
     *     
     */
    public void setMODEMANAGERERRORBEHAVIOR(MODEERRORBEHAVIOR value) {
        this.modemanagererrorbehavior = value;
    }

    /**
     * ??modetransitions?????
     * 
     * @return
     *     possible object is
     *     {@link MODEDECLARATIONGROUP.MODETRANSITIONS }
     *     
     */
    public MODEDECLARATIONGROUP.MODETRANSITIONS getMODETRANSITIONS() {
        return modetransitions;
    }

    /**
     * ??modetransitions?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEDECLARATIONGROUP.MODETRANSITIONS }
     *     
     */
    public void setMODETRANSITIONS(MODEDECLARATIONGROUP.MODETRANSITIONS value) {
        this.modetransitions = value;
    }

    /**
     * ??modeusererrorbehavior?????
     * 
     * @return
     *     possible object is
     *     {@link MODEERRORBEHAVIOR }
     *     
     */
    public MODEERRORBEHAVIOR getMODEUSERERRORBEHAVIOR() {
        return modeusererrorbehavior;
    }

    /**
     * ??modeusererrorbehavior?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEERRORBEHAVIOR }
     *     
     */
    public void setMODEUSERERRORBEHAVIOR(MODEERRORBEHAVIOR value) {
        this.modeusererrorbehavior = value;
    }

    /**
     * ??ontransitionvalue?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getONTRANSITIONVALUE() {
        return ontransitionvalue;
    }

    /**
     * ??ontransitionvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setONTRANSITIONVALUE(POSITIVEINTEGER value) {
        this.ontransitionvalue = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class INITIALMODEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MODEDECLARATIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MODEDECLARATIONSUBTYPESENUM }
         *     
         */
        public MODEDECLARATIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MODEDECLARATIONSUBTYPESENUM }
         *     
         */
        public void setDEST(MODEDECLARATIONSUBTYPESENUM value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="MODE-DECLARATION" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION"/>
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
        "modedeclaration"
    })
    public static class MODEDECLARATIONS {

        @XmlElement(name = "MODE-DECLARATION")
        protected List<MODEDECLARATION> modedeclaration;

        /**
         * Gets the value of the modedeclaration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modedeclaration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEDECLARATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODEDECLARATION }
         * 
         * 
         */
        public List<MODEDECLARATION> getMODEDECLARATION() {
            if (modedeclaration == null) {
                modedeclaration = new ArrayList<MODEDECLARATION>();
            }
            return this.modedeclaration;
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
     *         &lt;element name="MODE-TRANSITION" type="{http://autosar.org/schema/r4.0}MODE-TRANSITION"/>
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
        "modetransition"
    })
    public static class MODETRANSITIONS {

        @XmlElement(name = "MODE-TRANSITION")
        protected List<MODETRANSITION> modetransition;

        /**
         * Gets the value of the modetransition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modetransition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODETRANSITION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODETRANSITION }
         * 
         * 
         */
        public List<MODETRANSITION> getMODETRANSITION() {
            if (modetransition == null) {
                modetransition = new ArrayList<MODETRANSITION>();
            }
            return this.modetransition;
        }

    }

}
