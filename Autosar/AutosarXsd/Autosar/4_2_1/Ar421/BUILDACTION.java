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
 * This meta-class represents the ability to specify a build action.
 * 
 * <p>BUILD-ACTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BUILD-ACTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BUILD-ACTION-ENTITY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BUILD-ACTION"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BUILD-ACTION", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "blueprintpolicys",
    "shortnamepattern",
    "deliveryartifacts",
    "invocation",
    "predecessoractionrefs",
    "followupactionrefs",
    "createddatas",
    "inputdatas",
    "modifieddatas",
    "requiredenvironmentref",
    "variationpoint"
})
public class BUILDACTION {

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
    @XmlElement(name = "BLUEPRINT-POLICYS")
    protected Ar421.FLATMAP.BLUEPRINTPOLICYS blueprintpolicys;
    @XmlElement(name = "SHORT-NAME-PATTERN")
    protected STRING shortnamepattern;
    @XmlElement(name = "DELIVERY-ARTIFACTS")
    protected BUILDACTION.DELIVERYARTIFACTS deliveryartifacts;
    @XmlElement(name = "INVOCATION")
    protected BUILDACTIONINVOCATOR invocation;
    @XmlElement(name = "PREDECESSOR-ACTION-REFS")
    protected BUILDACTION.PREDECESSORACTIONREFS predecessoractionrefs;
    @XmlElement(name = "FOLLOW-UP-ACTION-REFS")
    protected BUILDACTION.FOLLOWUPACTIONREFS followupactionrefs;
    @XmlElement(name = "CREATED-DATAS")
    protected BUILDACTION.CREATEDDATAS createddatas;
    @XmlElement(name = "INPUT-DATAS")
    protected BUILDACTION.INPUTDATAS inputdatas;
    @XmlElement(name = "MODIFIED-DATAS")
    protected BUILDACTION.MODIFIEDDATAS modifieddatas;
    @XmlElement(name = "REQUIRED-ENVIRONMENT-REF")
    protected BUILDACTION.REQUIREDENVIRONMENTREF requiredenvironmentref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "UUID")
    protected String uuid;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??deliveryartifacts?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTION.DELIVERYARTIFACTS }
     *     
     */
    public BUILDACTION.DELIVERYARTIFACTS getDELIVERYARTIFACTS() {
        return deliveryartifacts;
    }

    /**
     * ??deliveryartifacts?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTION.DELIVERYARTIFACTS }
     *     
     */
    public void setDELIVERYARTIFACTS(BUILDACTION.DELIVERYARTIFACTS value) {
        this.deliveryartifacts = value;
    }

    /**
     * ??invocation?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTIONINVOCATOR }
     *     
     */
    public BUILDACTIONINVOCATOR getINVOCATION() {
        return invocation;
    }

    /**
     * ??invocation?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTIONINVOCATOR }
     *     
     */
    public void setINVOCATION(BUILDACTIONINVOCATOR value) {
        this.invocation = value;
    }

    /**
     * ??predecessoractionrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTION.PREDECESSORACTIONREFS }
     *     
     */
    public BUILDACTION.PREDECESSORACTIONREFS getPREDECESSORACTIONREFS() {
        return predecessoractionrefs;
    }

    /**
     * ??predecessoractionrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTION.PREDECESSORACTIONREFS }
     *     
     */
    public void setPREDECESSORACTIONREFS(BUILDACTION.PREDECESSORACTIONREFS value) {
        this.predecessoractionrefs = value;
    }

    /**
     * ??followupactionrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTION.FOLLOWUPACTIONREFS }
     *     
     */
    public BUILDACTION.FOLLOWUPACTIONREFS getFOLLOWUPACTIONREFS() {
        return followupactionrefs;
    }

    /**
     * ??followupactionrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTION.FOLLOWUPACTIONREFS }
     *     
     */
    public void setFOLLOWUPACTIONREFS(BUILDACTION.FOLLOWUPACTIONREFS value) {
        this.followupactionrefs = value;
    }

    /**
     * ??createddatas?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTION.CREATEDDATAS }
     *     
     */
    public BUILDACTION.CREATEDDATAS getCREATEDDATAS() {
        return createddatas;
    }

    /**
     * ??createddatas?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTION.CREATEDDATAS }
     *     
     */
    public void setCREATEDDATAS(BUILDACTION.CREATEDDATAS value) {
        this.createddatas = value;
    }

    /**
     * ??inputdatas?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTION.INPUTDATAS }
     *     
     */
    public BUILDACTION.INPUTDATAS getINPUTDATAS() {
        return inputdatas;
    }

    /**
     * ??inputdatas?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTION.INPUTDATAS }
     *     
     */
    public void setINPUTDATAS(BUILDACTION.INPUTDATAS value) {
        this.inputdatas = value;
    }

    /**
     * ??modifieddatas?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTION.MODIFIEDDATAS }
     *     
     */
    public BUILDACTION.MODIFIEDDATAS getMODIFIEDDATAS() {
        return modifieddatas;
    }

    /**
     * ??modifieddatas?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTION.MODIFIEDDATAS }
     *     
     */
    public void setMODIFIEDDATAS(BUILDACTION.MODIFIEDDATAS value) {
        this.modifieddatas = value;
    }

    /**
     * ??requiredenvironmentref?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTION.REQUIREDENVIRONMENTREF }
     *     
     */
    public BUILDACTION.REQUIREDENVIRONMENTREF getREQUIREDENVIRONMENTREF() {
        return requiredenvironmentref;
    }

    /**
     * ??requiredenvironmentref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTION.REQUIREDENVIRONMENTREF }
     *     
     */
    public void setREQUIREDENVIRONMENTREF(BUILDACTION.REQUIREDENVIRONMENTREF value) {
        this.requiredenvironmentref = value;
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
     *         &lt;element name="BUILD-ACTION-IO-ELEMENT" type="{http://autosar.org/schema/r4.0}BUILD-ACTION-IO-ELEMENT"/>
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
        "buildactionioelement"
    })
    public static class CREATEDDATAS {

        @XmlElement(name = "BUILD-ACTION-IO-ELEMENT")
        protected List<BUILDACTIONIOELEMENT> buildactionioelement;

        /**
         * Gets the value of the buildactionioelement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the buildactionioelement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBUILDACTIONIOELEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDACTIONIOELEMENT }
         * 
         * 
         */
        public List<BUILDACTIONIOELEMENT> getBUILDACTIONIOELEMENT() {
            if (buildactionioelement == null) {
                buildactionioelement = new ArrayList<BUILDACTIONIOELEMENT>();
            }
            return this.buildactionioelement;
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
     *         &lt;element name="AUTOSAR-ENGINEERING-OBJECT" type="{http://autosar.org/schema/r4.0}AUTOSAR-ENGINEERING-OBJECT"/>
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
        "autosarengineeringobject"
    })
    public static class DELIVERYARTIFACTS {

        @XmlElement(name = "AUTOSAR-ENGINEERING-OBJECT")
        protected List<AUTOSARENGINEERINGOBJECT> autosarengineeringobject;

        /**
         * Gets the value of the autosarengineeringobject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autosarengineeringobject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAUTOSARENGINEERINGOBJECT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AUTOSARENGINEERINGOBJECT }
         * 
         * 
         */
        public List<AUTOSARENGINEERINGOBJECT> getAUTOSARENGINEERINGOBJECT() {
            if (autosarengineeringobject == null) {
                autosarengineeringobject = new ArrayList<AUTOSARENGINEERINGOBJECT>();
            }
            return this.autosarengineeringobject;
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
     *         &lt;element name="FOLLOW-UP-ACTION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "followupactionref"
    })
    public static class FOLLOWUPACTIONREFS {

        @XmlElement(name = "FOLLOW-UP-ACTION-REF")
        protected List<BUILDACTION.FOLLOWUPACTIONREFS.FOLLOWUPACTIONREF> followupactionref;

        /**
         * Gets the value of the followupactionref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the followupactionref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFOLLOWUPACTIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDACTION.FOLLOWUPACTIONREFS.FOLLOWUPACTIONREF }
         * 
         * 
         */
        public List<BUILDACTION.FOLLOWUPACTIONREFS.FOLLOWUPACTIONREF> getFOLLOWUPACTIONREF() {
            if (followupactionref == null) {
                followupactionref = new ArrayList<BUILDACTION.FOLLOWUPACTIONREFS.FOLLOWUPACTIONREF>();
            }
            return this.followupactionref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FOLLOWUPACTIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected BUILDACTIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link BUILDACTIONSUBTYPESENUM }
             *     
             */
            public BUILDACTIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDACTIONSUBTYPESENUM }
             *     
             */
            public void setDEST(BUILDACTIONSUBTYPESENUM value) {
                this.dest = value;
            }

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
     *         &lt;element name="BUILD-ACTION-IO-ELEMENT" type="{http://autosar.org/schema/r4.0}BUILD-ACTION-IO-ELEMENT"/>
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
        "buildactionioelement"
    })
    public static class INPUTDATAS {

        @XmlElement(name = "BUILD-ACTION-IO-ELEMENT")
        protected List<BUILDACTIONIOELEMENT> buildactionioelement;

        /**
         * Gets the value of the buildactionioelement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the buildactionioelement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBUILDACTIONIOELEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDACTIONIOELEMENT }
         * 
         * 
         */
        public List<BUILDACTIONIOELEMENT> getBUILDACTIONIOELEMENT() {
            if (buildactionioelement == null) {
                buildactionioelement = new ArrayList<BUILDACTIONIOELEMENT>();
            }
            return this.buildactionioelement;
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
     *         &lt;element name="BUILD-ACTION-IO-ELEMENT" type="{http://autosar.org/schema/r4.0}BUILD-ACTION-IO-ELEMENT"/>
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
        "buildactionioelement"
    })
    public static class MODIFIEDDATAS {

        @XmlElement(name = "BUILD-ACTION-IO-ELEMENT")
        protected List<BUILDACTIONIOELEMENT> buildactionioelement;

        /**
         * Gets the value of the buildactionioelement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the buildactionioelement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBUILDACTIONIOELEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDACTIONIOELEMENT }
         * 
         * 
         */
        public List<BUILDACTIONIOELEMENT> getBUILDACTIONIOELEMENT() {
            if (buildactionioelement == null) {
                buildactionioelement = new ArrayList<BUILDACTIONIOELEMENT>();
            }
            return this.buildactionioelement;
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
     *         &lt;element name="PREDECESSOR-ACTION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "predecessoractionref"
    })
    public static class PREDECESSORACTIONREFS {

        @XmlElement(name = "PREDECESSOR-ACTION-REF")
        protected List<BUILDACTION.PREDECESSORACTIONREFS.PREDECESSORACTIONREF> predecessoractionref;

        /**
         * Gets the value of the predecessoractionref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the predecessoractionref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPREDECESSORACTIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDACTION.PREDECESSORACTIONREFS.PREDECESSORACTIONREF }
         * 
         * 
         */
        public List<BUILDACTION.PREDECESSORACTIONREFS.PREDECESSORACTIONREF> getPREDECESSORACTIONREF() {
            if (predecessoractionref == null) {
                predecessoractionref = new ArrayList<BUILDACTION.PREDECESSORACTIONREFS.PREDECESSORACTIONREF>();
            }
            return this.predecessoractionref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PREDECESSORACTIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected BUILDACTIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link BUILDACTIONSUBTYPESENUM }
             *     
             */
            public BUILDACTIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDACTIONSUBTYPESENUM }
             *     
             */
            public void setDEST(BUILDACTIONSUBTYPESENUM value) {
                this.dest = value;
            }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION-ENVIRONMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class REQUIREDENVIRONMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BUILDACTIONENVIRONMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BUILDACTIONENVIRONMENTSUBTYPESENUM }
         *     
         */
        public BUILDACTIONENVIRONMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BUILDACTIONENVIRONMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(BUILDACTIONENVIRONMENTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
