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
 * Collects the information on the data provided to the AUTOSAR debug module.
 * 
 * <p>BSW-DEBUG-INFO complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-DEBUG-INFO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-DEBUG-INFO"/>
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
@XmlType(name = "BSW-DEBUG-INFO", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "localdebugdatas",
    "parameteraccessedfordebugrefs",
    "variableaccessedfordebugrefs",
    "variationpoint"
})
public class BSWDEBUGINFO {

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
    @XmlElement(name = "LOCAL-DEBUG-DATAS")
    protected BSWDEBUGINFO.LOCALDEBUGDATAS localdebugdatas;
    @XmlElement(name = "PARAMETER-ACCESSED-FOR-DEBUG-REFS")
    protected BSWDEBUGINFO.PARAMETERACCESSEDFORDEBUGREFS parameteraccessedfordebugrefs;
    @XmlElement(name = "VARIABLE-ACCESSED-FOR-DEBUG-REFS")
    protected BSWDEBUGINFO.VARIABLEACCESSEDFORDEBUGREFS variableaccessedfordebugrefs;
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
     * ??localdebugdatas?????
     * 
     * @return
     *     possible object is
     *     {@link BSWDEBUGINFO.LOCALDEBUGDATAS }
     *     
     */
    public BSWDEBUGINFO.LOCALDEBUGDATAS getLOCALDEBUGDATAS() {
        return localdebugdatas;
    }

    /**
     * ??localdebugdatas?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWDEBUGINFO.LOCALDEBUGDATAS }
     *     
     */
    public void setLOCALDEBUGDATAS(BSWDEBUGINFO.LOCALDEBUGDATAS value) {
        this.localdebugdatas = value;
    }

    /**
     * ??parameteraccessedfordebugrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWDEBUGINFO.PARAMETERACCESSEDFORDEBUGREFS }
     *     
     */
    public BSWDEBUGINFO.PARAMETERACCESSEDFORDEBUGREFS getPARAMETERACCESSEDFORDEBUGREFS() {
        return parameteraccessedfordebugrefs;
    }

    /**
     * ??parameteraccessedfordebugrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWDEBUGINFO.PARAMETERACCESSEDFORDEBUGREFS }
     *     
     */
    public void setPARAMETERACCESSEDFORDEBUGREFS(BSWDEBUGINFO.PARAMETERACCESSEDFORDEBUGREFS value) {
        this.parameteraccessedfordebugrefs = value;
    }

    /**
     * ??variableaccessedfordebugrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWDEBUGINFO.VARIABLEACCESSEDFORDEBUGREFS }
     *     
     */
    public BSWDEBUGINFO.VARIABLEACCESSEDFORDEBUGREFS getVARIABLEACCESSEDFORDEBUGREFS() {
        return variableaccessedfordebugrefs;
    }

    /**
     * ??variableaccessedfordebugrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWDEBUGINFO.VARIABLEACCESSEDFORDEBUGREFS }
     *     
     */
    public void setVARIABLEACCESSEDFORDEBUGREFS(BSWDEBUGINFO.VARIABLEACCESSEDFORDEBUGREFS value) {
        this.variableaccessedfordebugrefs = value;
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
     *         &lt;element name="IMPLEMENTATION-DATA-TYPE-ELEMENT" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE-ELEMENT"/>
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
        "implementationdatatypeelement"
    })
    public static class LOCALDEBUGDATAS {

        @XmlElement(name = "IMPLEMENTATION-DATA-TYPE-ELEMENT")
        protected List<IMPLEMENTATIONDATATYPEELEMENT> implementationdatatypeelement;

        /**
         * Gets the value of the implementationdatatypeelement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the implementationdatatypeelement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIMPLEMENTATIONDATATYPEELEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IMPLEMENTATIONDATATYPEELEMENT }
         * 
         * 
         */
        public List<IMPLEMENTATIONDATATYPEELEMENT> getIMPLEMENTATIONDATATYPEELEMENT() {
            if (implementationdatatypeelement == null) {
                implementationdatatypeelement = new ArrayList<IMPLEMENTATIONDATATYPEELEMENT>();
            }
            return this.implementationdatatypeelement;
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
     *         &lt;element name="PARAMETER-ACCESSED-FOR-DEBUG-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PARAMETER-DATA-PROTOTYPE--SUBTYPES-ENUM" />
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
        "parameteraccessedfordebugref"
    })
    public static class PARAMETERACCESSEDFORDEBUGREFS {

        @XmlElement(name = "PARAMETER-ACCESSED-FOR-DEBUG-REF")
        protected List<BSWDEBUGINFO.PARAMETERACCESSEDFORDEBUGREFS.PARAMETERACCESSEDFORDEBUGREF> parameteraccessedfordebugref;

        /**
         * Gets the value of the parameteraccessedfordebugref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameteraccessedfordebugref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPARAMETERACCESSEDFORDEBUGREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWDEBUGINFO.PARAMETERACCESSEDFORDEBUGREFS.PARAMETERACCESSEDFORDEBUGREF }
         * 
         * 
         */
        public List<BSWDEBUGINFO.PARAMETERACCESSEDFORDEBUGREFS.PARAMETERACCESSEDFORDEBUGREF> getPARAMETERACCESSEDFORDEBUGREF() {
            if (parameteraccessedfordebugref == null) {
                parameteraccessedfordebugref = new ArrayList<BSWDEBUGINFO.PARAMETERACCESSEDFORDEBUGREFS.PARAMETERACCESSEDFORDEBUGREF>();
            }
            return this.parameteraccessedfordebugref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PARAMETER-DATA-PROTOTYPE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PARAMETERACCESSEDFORDEBUGREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected PARAMETERDATAPROTOTYPESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link PARAMETERDATAPROTOTYPESUBTYPESENUM }
             *     
             */
            public PARAMETERDATAPROTOTYPESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link PARAMETERDATAPROTOTYPESUBTYPESENUM }
             *     
             */
            public void setDEST(PARAMETERDATAPROTOTYPESUBTYPESENUM value) {
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
     *         &lt;element name="VARIABLE-ACCESSED-FOR-DEBUG-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE--SUBTYPES-ENUM" />
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
        "variableaccessedfordebugref"
    })
    public static class VARIABLEACCESSEDFORDEBUGREFS {

        @XmlElement(name = "VARIABLE-ACCESSED-FOR-DEBUG-REF")
        protected List<BSWDEBUGINFO.VARIABLEACCESSEDFORDEBUGREFS.VARIABLEACCESSEDFORDEBUGREF> variableaccessedfordebugref;

        /**
         * Gets the value of the variableaccessedfordebugref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableaccessedfordebugref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEACCESSEDFORDEBUGREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWDEBUGINFO.VARIABLEACCESSEDFORDEBUGREFS.VARIABLEACCESSEDFORDEBUGREF }
         * 
         * 
         */
        public List<BSWDEBUGINFO.VARIABLEACCESSEDFORDEBUGREFS.VARIABLEACCESSEDFORDEBUGREF> getVARIABLEACCESSEDFORDEBUGREF() {
            if (variableaccessedfordebugref == null) {
                variableaccessedfordebugref = new ArrayList<BSWDEBUGINFO.VARIABLEACCESSEDFORDEBUGREFS.VARIABLEACCESSEDFORDEBUGREF>();
            }
            return this.variableaccessedfordebugref;
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
        public static class VARIABLEACCESSEDFORDEBUGREF
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

}
