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
 * Represents a Container definition in the ECU Configuration Description.
 * 
 * <p>ECUC-CONTAINER-VALUE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-CONTAINER-VALUE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-INDEXABLE-VALUE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-CONTAINER-VALUE"/>
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
@XmlType(name = "ECUC-CONTAINER-VALUE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "index",
    "definitionref",
    "parametervalues",
    "referencevalues",
    "subcontainers",
    "variationpoint"
})
public class ECUCCONTAINERVALUE {

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
    @XmlElement(name = "INDEX")
    protected POSITIVEINTEGER index;
    @XmlElement(name = "DEFINITION-REF")
    protected ECUCCONTAINERVALUE.DEFINITIONREF definitionref;
    @XmlElement(name = "PARAMETER-VALUES")
    protected ECUCCONTAINERVALUE.PARAMETERVALUES parametervalues;
    @XmlElement(name = "REFERENCE-VALUES")
    protected ECUCCONTAINERVALUE.REFERENCEVALUES referencevalues;
    @XmlElement(name = "SUB-CONTAINERS")
    protected ECUCCONTAINERVALUE.SUBCONTAINERS subcontainers;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
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
     * ??index?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getINDEX() {
        return index;
    }

    /**
     * ??index?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setINDEX(POSITIVEINTEGER value) {
        this.index = value;
    }

    /**
     * ??definitionref?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONTAINERVALUE.DEFINITIONREF }
     *     
     */
    public ECUCCONTAINERVALUE.DEFINITIONREF getDEFINITIONREF() {
        return definitionref;
    }

    /**
     * ??definitionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONTAINERVALUE.DEFINITIONREF }
     *     
     */
    public void setDEFINITIONREF(ECUCCONTAINERVALUE.DEFINITIONREF value) {
        this.definitionref = value;
    }

    /**
     * ??parametervalues?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONTAINERVALUE.PARAMETERVALUES }
     *     
     */
    public ECUCCONTAINERVALUE.PARAMETERVALUES getPARAMETERVALUES() {
        return parametervalues;
    }

    /**
     * ??parametervalues?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONTAINERVALUE.PARAMETERVALUES }
     *     
     */
    public void setPARAMETERVALUES(ECUCCONTAINERVALUE.PARAMETERVALUES value) {
        this.parametervalues = value;
    }

    /**
     * ??referencevalues?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONTAINERVALUE.REFERENCEVALUES }
     *     
     */
    public ECUCCONTAINERVALUE.REFERENCEVALUES getREFERENCEVALUES() {
        return referencevalues;
    }

    /**
     * ??referencevalues?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONTAINERVALUE.REFERENCEVALUES }
     *     
     */
    public void setREFERENCEVALUES(ECUCCONTAINERVALUE.REFERENCEVALUES value) {
        this.referencevalues = value;
    }

    /**
     * ??subcontainers?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONTAINERVALUE.SUBCONTAINERS }
     *     
     */
    public ECUCCONTAINERVALUE.SUBCONTAINERS getSUBCONTAINERS() {
        return subcontainers;
    }

    /**
     * ??subcontainers?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONTAINERVALUE.SUBCONTAINERS }
     *     
     */
    public void setSUBCONTAINERS(ECUCCONTAINERVALUE.SUBCONTAINERS value) {
        this.subcontainers = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-CONTAINER-DEF--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DEFINITIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ECUCCONTAINERDEFSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ECUCCONTAINERDEFSUBTYPESENUM }
         *     
         */
        public ECUCCONTAINERDEFSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ECUCCONTAINERDEFSUBTYPESENUM }
         *     
         */
        public void setDEST(ECUCCONTAINERDEFSUBTYPESENUM value) {
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
     *         &lt;element name="ECUC-ADD-INFO-PARAM-VALUE" type="{http://autosar.org/schema/r4.0}ECUC-ADD-INFO-PARAM-VALUE"/>
     *         &lt;element name="ECUC-NUMERICAL-PARAM-VALUE" type="{http://autosar.org/schema/r4.0}ECUC-NUMERICAL-PARAM-VALUE"/>
     *         &lt;element name="ECUC-TEXTUAL-PARAM-VALUE" type="{http://autosar.org/schema/r4.0}ECUC-TEXTUAL-PARAM-VALUE"/>
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
        "ecucaddinfoparamvalueOrECUCNUMERICALPARAMVALUEOrECUCTEXTUALPARAMVALUE"
    })
    public static class PARAMETERVALUES {

        @XmlElements({
            @XmlElement(name = "ECUC-ADD-INFO-PARAM-VALUE", type = ECUCADDINFOPARAMVALUE.class),
            @XmlElement(name = "ECUC-NUMERICAL-PARAM-VALUE", type = ECUCNUMERICALPARAMVALUE.class),
            @XmlElement(name = "ECUC-TEXTUAL-PARAM-VALUE", type = ECUCTEXTUALPARAMVALUE.class)
        })
        protected List<Object> ecucaddinfoparamvalueOrECUCNUMERICALPARAMVALUEOrECUCTEXTUALPARAMVALUE;

        /**
         * Gets the value of the ecucaddinfoparamvalueOrECUCNUMERICALPARAMVALUEOrECUCTEXTUALPARAMVALUE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecucaddinfoparamvalueOrECUCNUMERICALPARAMVALUEOrECUCTEXTUALPARAMVALUE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUCADDINFOPARAMVALUEOrECUCNUMERICALPARAMVALUEOrECUCTEXTUALPARAMVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCADDINFOPARAMVALUE }
         * {@link ECUCNUMERICALPARAMVALUE }
         * {@link ECUCTEXTUALPARAMVALUE }
         * 
         * 
         */
        public List<Object> getECUCADDINFOPARAMVALUEOrECUCNUMERICALPARAMVALUEOrECUCTEXTUALPARAMVALUE() {
            if (ecucaddinfoparamvalueOrECUCNUMERICALPARAMVALUEOrECUCTEXTUALPARAMVALUE == null) {
                ecucaddinfoparamvalueOrECUCNUMERICALPARAMVALUEOrECUCTEXTUALPARAMVALUE = new ArrayList<Object>();
            }
            return this.ecucaddinfoparamvalueOrECUCNUMERICALPARAMVALUEOrECUCTEXTUALPARAMVALUE;
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
     *         &lt;element name="ECUC-INSTANCE-REFERENCE-VALUE" type="{http://autosar.org/schema/r4.0}ECUC-INSTANCE-REFERENCE-VALUE"/>
     *         &lt;element name="ECUC-REFERENCE-VALUE" type="{http://autosar.org/schema/r4.0}ECUC-REFERENCE-VALUE"/>
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
        "ecucinstancereferencevalueOrECUCREFERENCEVALUE"
    })
    public static class REFERENCEVALUES {

        @XmlElements({
            @XmlElement(name = "ECUC-INSTANCE-REFERENCE-VALUE", type = ECUCINSTANCEREFERENCEVALUE.class),
            @XmlElement(name = "ECUC-REFERENCE-VALUE", type = ECUCREFERENCEVALUE.class)
        })
        protected List<Object> ecucinstancereferencevalueOrECUCREFERENCEVALUE;

        /**
         * Gets the value of the ecucinstancereferencevalueOrECUCREFERENCEVALUE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecucinstancereferencevalueOrECUCREFERENCEVALUE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUCINSTANCEREFERENCEVALUEOrECUCREFERENCEVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCINSTANCEREFERENCEVALUE }
         * {@link ECUCREFERENCEVALUE }
         * 
         * 
         */
        public List<Object> getECUCINSTANCEREFERENCEVALUEOrECUCREFERENCEVALUE() {
            if (ecucinstancereferencevalueOrECUCREFERENCEVALUE == null) {
                ecucinstancereferencevalueOrECUCREFERENCEVALUE = new ArrayList<Object>();
            }
            return this.ecucinstancereferencevalueOrECUCREFERENCEVALUE;
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
     *         &lt;element name="ECUC-CONTAINER-VALUE" type="{http://autosar.org/schema/r4.0}ECUC-CONTAINER-VALUE"/>
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
        "ecuccontainervalue"
    })
    public static class SUBCONTAINERS {

        @XmlElement(name = "ECUC-CONTAINER-VALUE")
        protected List<ECUCCONTAINERVALUE> ecuccontainervalue;

        /**
         * Gets the value of the ecuccontainervalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecuccontainervalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUCCONTAINERVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCCONTAINERVALUE }
         * 
         * 
         */
        public List<ECUCCONTAINERVALUE> getECUCCONTAINERVALUE() {
            if (ecuccontainervalue == null) {
                ecuccontainervalue = new ArrayList<ECUCCONTAINERVALUE>();
            }
            return this.ecuccontainervalue;
        }

    }

}
