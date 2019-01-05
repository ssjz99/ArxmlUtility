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
 * An argument of an operation, much like a data element, but also carries direction information and is owned by a particular ClientServerOperation.
 * 
 * <p>ARGUMENT-DATA-PROTOTYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ARGUMENT-DATA-PROTOTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DATA-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AUTOSAR-DATA-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ARGUMENT-DATA-PROTOTYPE"/>
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
@XmlType(name = "ARGUMENT-DATA-PROTOTYPE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "swdatadefprops",
    "typetref",
    "direction",
    "serverargumentimplpolicy",
    "typeblueprints",
    "variationpoint"
})
public class ARGUMENTDATAPROTOTYPE {

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
    @XmlElement(name = "SW-DATA-DEF-PROPS")
    protected SWDATADEFPROPS swdatadefprops;
    @XmlElement(name = "TYPE-TREF")
    protected ARGUMENTDATAPROTOTYPE.TYPETREF typetref;
    @XmlElement(name = "DIRECTION")
    protected ARGUMENTDIRECTIONENUM direction;
    @XmlElement(name = "SERVER-ARGUMENT-IMPL-POLICY")
    protected SERVERARGUMENTIMPLPOLICYENUM serverargumentimplpolicy;
    @XmlElement(name = "TYPE-BLUEPRINTS")
    protected ARGUMENTDATAPROTOTYPE.TYPEBLUEPRINTS typeblueprints;
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
     * ??swdatadefprops?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public SWDATADEFPROPS getSWDATADEFPROPS() {
        return swdatadefprops;
    }

    /**
     * ??swdatadefprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public void setSWDATADEFPROPS(SWDATADEFPROPS value) {
        this.swdatadefprops = value;
    }

    /**
     * ??typetref?????
     * 
     * @return
     *     possible object is
     *     {@link ARGUMENTDATAPROTOTYPE.TYPETREF }
     *     
     */
    public ARGUMENTDATAPROTOTYPE.TYPETREF getTYPETREF() {
        return typetref;
    }

    /**
     * ??typetref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARGUMENTDATAPROTOTYPE.TYPETREF }
     *     
     */
    public void setTYPETREF(ARGUMENTDATAPROTOTYPE.TYPETREF value) {
        this.typetref = value;
    }

    /**
     * ??direction?????
     * 
     * @return
     *     possible object is
     *     {@link ARGUMENTDIRECTIONENUM }
     *     
     */
    public ARGUMENTDIRECTIONENUM getDIRECTION() {
        return direction;
    }

    /**
     * ??direction?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARGUMENTDIRECTIONENUM }
     *     
     */
    public void setDIRECTION(ARGUMENTDIRECTIONENUM value) {
        this.direction = value;
    }

    /**
     * ??serverargumentimplpolicy?????
     * 
     * @return
     *     possible object is
     *     {@link SERVERARGUMENTIMPLPOLICYENUM }
     *     
     */
    public SERVERARGUMENTIMPLPOLICYENUM getSERVERARGUMENTIMPLPOLICY() {
        return serverargumentimplpolicy;
    }

    /**
     * ??serverargumentimplpolicy?????
     * 
     * @param value
     *     allowed object is
     *     {@link SERVERARGUMENTIMPLPOLICYENUM }
     *     
     */
    public void setSERVERARGUMENTIMPLPOLICY(SERVERARGUMENTIMPLPOLICYENUM value) {
        this.serverargumentimplpolicy = value;
    }

    /**
     * ??typeblueprints?????
     * 
     * @return
     *     possible object is
     *     {@link ARGUMENTDATAPROTOTYPE.TYPEBLUEPRINTS }
     *     
     */
    public ARGUMENTDATAPROTOTYPE.TYPEBLUEPRINTS getTYPEBLUEPRINTS() {
        return typeblueprints;
    }

    /**
     * ??typeblueprints?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARGUMENTDATAPROTOTYPE.TYPEBLUEPRINTS }
     *     
     */
    public void setTYPEBLUEPRINTS(ARGUMENTDATAPROTOTYPE.TYPEBLUEPRINTS value) {
        this.typeblueprints = value;
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
     *         &lt;element name="AUTOSAR-DATA-TYPE-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}AUTOSAR-DATA-TYPE-REF-CONDITIONAL"/>
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
        "autosardatatyperefconditional"
    })
    public static class TYPEBLUEPRINTS {

        @XmlElement(name = "AUTOSAR-DATA-TYPE-REF-CONDITIONAL")
        protected List<AUTOSARDATATYPEREFCONDITIONAL> autosardatatyperefconditional;

        /**
         * Gets the value of the autosardatatyperefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autosardatatyperefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAUTOSARDATATYPEREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AUTOSARDATATYPEREFCONDITIONAL }
         * 
         * 
         */
        public List<AUTOSARDATATYPEREFCONDITIONAL> getAUTOSARDATATYPEREFCONDITIONAL() {
            if (autosardatatyperefconditional == null) {
                autosardatatyperefconditional = new ArrayList<AUTOSARDATATYPEREFCONDITIONAL>();
            }
            return this.autosardatatyperefconditional;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}AUTOSAR-DATA-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TYPETREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected AUTOSARDATATYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link AUTOSARDATATYPESUBTYPESENUM }
         *     
         */
        public AUTOSARDATATYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link AUTOSARDATATYPESUBTYPESENUM }
         *     
         */
        public void setDEST(AUTOSARDATATYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
