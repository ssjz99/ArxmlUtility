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
 * This is used to describe timing events related to sender-receiver communication at VFB level.
 * 
 * <p>TD-EVENT-VARIABLE-DATA-PROTOTYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TD-EVENT-VARIABLE-DATA-PROTOTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIMING-DESCRIPTION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIMING-DESCRIPTION-EVENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TD-EVENT-VFB"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TD-EVENT-VFB-PORT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TD-EVENT-VARIABLE-DATA-PROTOTYPE"/>
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
@XmlType(name = "TD-EVENT-VARIABLE-DATA-PROTOTYPE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "occurrenceexpression",
    "componentiref",
    "isexternal",
    "portprototypeblueprintref",
    "portref",
    "dataelementref",
    "tdeventvariabledataprototypetype"
})
public class TDEVENTVARIABLEDATAPROTOTYPE {

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
    @XmlElement(name = "OCCURRENCE-EXPRESSION")
    protected TDEVENTOCCURRENCEEXPRESSION occurrenceexpression;
    @XmlElement(name = "COMPONENT-IREF")
    protected COMPONENTINCOMPOSITIONINSTANCEREF componentiref;
    @XmlElement(name = "IS-EXTERNAL")
    protected BOOLEAN isexternal;
    @XmlElement(name = "PORT-PROTOTYPE-BLUEPRINT-REF")
    protected Ar421.TDEVENTOPERATION.PORTPROTOTYPEBLUEPRINTREF portprototypeblueprintref;
    @XmlElement(name = "PORT-REF")
    protected Ar421.TDEVENTOPERATION.PORTREF portref;
    @XmlElement(name = "DATA-ELEMENT-REF")
    protected TDEVENTVARIABLEDATAPROTOTYPE.DATAELEMENTREF dataelementref;
    @XmlElement(name = "TD-EVENT-VARIABLE-DATA-PROTOTYPE-TYPE")
    protected TDEVENTVARIABLEDATAPROTOTYPETYPEENUM tdeventvariabledataprototypetype;
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
     * ??occurrenceexpression?????
     * 
     * @return
     *     possible object is
     *     {@link TDEVENTOCCURRENCEEXPRESSION }
     *     
     */
    public TDEVENTOCCURRENCEEXPRESSION getOCCURRENCEEXPRESSION() {
        return occurrenceexpression;
    }

    /**
     * ??occurrenceexpression?????
     * 
     * @param value
     *     allowed object is
     *     {@link TDEVENTOCCURRENCEEXPRESSION }
     *     
     */
    public void setOCCURRENCEEXPRESSION(TDEVENTOCCURRENCEEXPRESSION value) {
        this.occurrenceexpression = value;
    }

    /**
     * ??componentiref?????
     * 
     * @return
     *     possible object is
     *     {@link COMPONENTINCOMPOSITIONINSTANCEREF }
     *     
     */
    public COMPONENTINCOMPOSITIONINSTANCEREF getCOMPONENTIREF() {
        return componentiref;
    }

    /**
     * ??componentiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPONENTINCOMPOSITIONINSTANCEREF }
     *     
     */
    public void setCOMPONENTIREF(COMPONENTINCOMPOSITIONINSTANCEREF value) {
        this.componentiref = value;
    }

    /**
     * ??isexternal?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getISEXTERNAL() {
        return isexternal;
    }

    /**
     * ??isexternal?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setISEXTERNAL(BOOLEAN value) {
        this.isexternal = value;
    }

    /**
     * ??portprototypeblueprintref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.TDEVENTOPERATION.PORTPROTOTYPEBLUEPRINTREF }
     *     
     */
    public Ar421.TDEVENTOPERATION.PORTPROTOTYPEBLUEPRINTREF getPORTPROTOTYPEBLUEPRINTREF() {
        return portprototypeblueprintref;
    }

    /**
     * ??portprototypeblueprintref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.TDEVENTOPERATION.PORTPROTOTYPEBLUEPRINTREF }
     *     
     */
    public void setPORTPROTOTYPEBLUEPRINTREF(Ar421.TDEVENTOPERATION.PORTPROTOTYPEBLUEPRINTREF value) {
        this.portprototypeblueprintref = value;
    }

    /**
     * ??portref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.TDEVENTOPERATION.PORTREF }
     *     
     */
    public Ar421.TDEVENTOPERATION.PORTREF getPORTREF() {
        return portref;
    }

    /**
     * ??portref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.TDEVENTOPERATION.PORTREF }
     *     
     */
    public void setPORTREF(Ar421.TDEVENTOPERATION.PORTREF value) {
        this.portref = value;
    }

    /**
     * ??dataelementref?????
     * 
     * @return
     *     possible object is
     *     {@link TDEVENTVARIABLEDATAPROTOTYPE.DATAELEMENTREF }
     *     
     */
    public TDEVENTVARIABLEDATAPROTOTYPE.DATAELEMENTREF getDATAELEMENTREF() {
        return dataelementref;
    }

    /**
     * ??dataelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link TDEVENTVARIABLEDATAPROTOTYPE.DATAELEMENTREF }
     *     
     */
    public void setDATAELEMENTREF(TDEVENTVARIABLEDATAPROTOTYPE.DATAELEMENTREF value) {
        this.dataelementref = value;
    }

    /**
     * ??tdeventvariabledataprototypetype?????
     * 
     * @return
     *     possible object is
     *     {@link TDEVENTVARIABLEDATAPROTOTYPETYPEENUM }
     *     
     */
    public TDEVENTVARIABLEDATAPROTOTYPETYPEENUM getTDEVENTVARIABLEDATAPROTOTYPETYPE() {
        return tdeventvariabledataprototypetype;
    }

    /**
     * ??tdeventvariabledataprototypetype?????
     * 
     * @param value
     *     allowed object is
     *     {@link TDEVENTVARIABLEDATAPROTOTYPETYPEENUM }
     *     
     */
    public void setTDEVENTVARIABLEDATAPROTOTYPETYPE(TDEVENTVARIABLEDATAPROTOTYPETYPEENUM value) {
        this.tdeventvariabledataprototypetype = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DATAELEMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected VARIABLEDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public VARIABLEDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(VARIABLEDATAPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
