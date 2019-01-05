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
 * Describes the specific properties of one data instance in order to support measurement and/or calibration of this data instance.
 * 
 * The most important attributes are:
 * * Its shortName is copied from the ECU Flat map (if applicable) and will be used as identifier and for display by the MC system.
 * * The category is copied from the corresponding data type (ApplicationDataType if defined, otherwise ImplementationDataType) as far as applicable.
 * * The symbol is the one used in the programming language. It will be used to find out the actual memory address by the final generation tool with the help of linker generated information.
 * 
 * It is assumed that in the M1 model this part and all the aggregated and referred elements (with the exception of the Flat Map and the references from ImplementationElementInParameterInstanceRef and McAccessDetails) are completely generated from "upstream" information. This means, that even if an element like e.g. a CompuMethod is only used via reference here, it will be copied into the M1 artifact which holds the complete McSupportData for a given Implementation.
 * 
 * <p>MC-DATA-INSTANCE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MC-DATA-INSTANCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MC-DATA-INSTANCE"/>
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
@XmlType(name = "MC-DATA-INSTANCE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "arraysize",
    "flatmapentryref",
    "instanceinmemory",
    "mcdataaccessdetails",
    "mcdataassignments",
    "resultingproperties",
    "role",
    "subelements",
    "symbol",
    "variationpoint"
})
public class MCDATAINSTANCE {

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
    @XmlElement(name = "ARRAY-SIZE")
    protected POSITIVEINTEGER arraysize;
    @XmlElement(name = "FLAT-MAP-ENTRY-REF")
    protected MCDATAINSTANCE.FLATMAPENTRYREF flatmapentryref;
    @XmlElement(name = "INSTANCE-IN-MEMORY")
    protected IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF instanceinmemory;
    @XmlElement(name = "MC-DATA-ACCESS-DETAILS")
    protected MCDATAACCESSDETAILS mcdataaccessdetails;
    @XmlElement(name = "MC-DATA-ASSIGNMENTS")
    protected MCDATAINSTANCE.MCDATAASSIGNMENTS mcdataassignments;
    @XmlElement(name = "RESULTING-PROPERTIES")
    protected SWDATADEFPROPS resultingproperties;
    @XmlElement(name = "ROLE")
    protected IDENTIFIER role;
    @XmlElement(name = "SUB-ELEMENTS")
    protected MCDATAINSTANCE.SUBELEMENTS subelements;
    @XmlElement(name = "SYMBOL")
    protected SYMBOLSTRING symbol;
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
     * ??arraysize?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getARRAYSIZE() {
        return arraysize;
    }

    /**
     * ??arraysize?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setARRAYSIZE(POSITIVEINTEGER value) {
        this.arraysize = value;
    }

    /**
     * ??flatmapentryref?????
     * 
     * @return
     *     possible object is
     *     {@link MCDATAINSTANCE.FLATMAPENTRYREF }
     *     
     */
    public MCDATAINSTANCE.FLATMAPENTRYREF getFLATMAPENTRYREF() {
        return flatmapentryref;
    }

    /**
     * ??flatmapentryref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCDATAINSTANCE.FLATMAPENTRYREF }
     *     
     */
    public void setFLATMAPENTRYREF(MCDATAINSTANCE.FLATMAPENTRYREF value) {
        this.flatmapentryref = value;
    }

    /**
     * ??instanceinmemory?????
     * 
     * @return
     *     possible object is
     *     {@link IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF }
     *     
     */
    public IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF getINSTANCEINMEMORY() {
        return instanceinmemory;
    }

    /**
     * ??instanceinmemory?????
     * 
     * @param value
     *     allowed object is
     *     {@link IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF }
     *     
     */
    public void setINSTANCEINMEMORY(IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF value) {
        this.instanceinmemory = value;
    }

    /**
     * ??mcdataaccessdetails?????
     * 
     * @return
     *     possible object is
     *     {@link MCDATAACCESSDETAILS }
     *     
     */
    public MCDATAACCESSDETAILS getMCDATAACCESSDETAILS() {
        return mcdataaccessdetails;
    }

    /**
     * ??mcdataaccessdetails?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCDATAACCESSDETAILS }
     *     
     */
    public void setMCDATAACCESSDETAILS(MCDATAACCESSDETAILS value) {
        this.mcdataaccessdetails = value;
    }

    /**
     * ??mcdataassignments?????
     * 
     * @return
     *     possible object is
     *     {@link MCDATAINSTANCE.MCDATAASSIGNMENTS }
     *     
     */
    public MCDATAINSTANCE.MCDATAASSIGNMENTS getMCDATAASSIGNMENTS() {
        return mcdataassignments;
    }

    /**
     * ??mcdataassignments?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCDATAINSTANCE.MCDATAASSIGNMENTS }
     *     
     */
    public void setMCDATAASSIGNMENTS(MCDATAINSTANCE.MCDATAASSIGNMENTS value) {
        this.mcdataassignments = value;
    }

    /**
     * ??resultingproperties?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public SWDATADEFPROPS getRESULTINGPROPERTIES() {
        return resultingproperties;
    }

    /**
     * ??resultingproperties?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public void setRESULTINGPROPERTIES(SWDATADEFPROPS value) {
        this.resultingproperties = value;
    }

    /**
     * ??role?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getROLE() {
        return role;
    }

    /**
     * ??role?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setROLE(IDENTIFIER value) {
        this.role = value;
    }

    /**
     * ??subelements?????
     * 
     * @return
     *     possible object is
     *     {@link MCDATAINSTANCE.SUBELEMENTS }
     *     
     */
    public MCDATAINSTANCE.SUBELEMENTS getSUBELEMENTS() {
        return subelements;
    }

    /**
     * ??subelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCDATAINSTANCE.SUBELEMENTS }
     *     
     */
    public void setSUBELEMENTS(MCDATAINSTANCE.SUBELEMENTS value) {
        this.subelements = value;
    }

    /**
     * ??symbol?????
     * 
     * @return
     *     possible object is
     *     {@link SYMBOLSTRING }
     *     
     */
    public SYMBOLSTRING getSYMBOL() {
        return symbol;
    }

    /**
     * ??symbol?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYMBOLSTRING }
     *     
     */
    public void setSYMBOL(SYMBOLSTRING value) {
        this.symbol = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLAT-INSTANCE-DESCRIPTOR--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FLATMAPENTRYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FLATINSTANCEDESCRIPTORSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FLATINSTANCEDESCRIPTORSUBTYPESENUM }
         *     
         */
        public FLATINSTANCEDESCRIPTORSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FLATINSTANCEDESCRIPTORSUBTYPESENUM }
         *     
         */
        public void setDEST(FLATINSTANCEDESCRIPTORSUBTYPESENUM value) {
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
     *         &lt;element name="ROLE-BASED-MC-DATA-ASSIGNMENT" type="{http://autosar.org/schema/r4.0}ROLE-BASED-MC-DATA-ASSIGNMENT"/>
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
        "rolebasedmcdataassignment"
    })
    public static class MCDATAASSIGNMENTS {

        @XmlElement(name = "ROLE-BASED-MC-DATA-ASSIGNMENT")
        protected List<ROLEBASEDMCDATAASSIGNMENT> rolebasedmcdataassignment;

        /**
         * Gets the value of the rolebasedmcdataassignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rolebasedmcdataassignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROLEBASEDMCDATAASSIGNMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ROLEBASEDMCDATAASSIGNMENT }
         * 
         * 
         */
        public List<ROLEBASEDMCDATAASSIGNMENT> getROLEBASEDMCDATAASSIGNMENT() {
            if (rolebasedmcdataassignment == null) {
                rolebasedmcdataassignment = new ArrayList<ROLEBASEDMCDATAASSIGNMENT>();
            }
            return this.rolebasedmcdataassignment;
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
     *         &lt;element name="MC-DATA-INSTANCE" type="{http://autosar.org/schema/r4.0}MC-DATA-INSTANCE"/>
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
        "mcdatainstance"
    })
    public static class SUBELEMENTS {

        @XmlElement(name = "MC-DATA-INSTANCE")
        protected List<MCDATAINSTANCE> mcdatainstance;

        /**
         * Gets the value of the mcdatainstance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcdatainstance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCDATAINSTANCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCDATAINSTANCE }
         * 
         * 
         */
        public List<MCDATAINSTANCE> getMCDATAINSTANCE() {
            if (mcdatainstance == null) {
                mcdatainstance = new ArrayList<MCDATAINSTANCE>();
            }
            return this.mcdatainstance;
        }

    }

}
