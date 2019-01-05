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
 * <p>DIAGNOSTIC-CONTRIBUTION-SET complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-CONTRIBUTION-SET">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CONTRIBUTION-SET"/>
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
@XmlType(name = "DIAGNOSTIC-CONTRIBUTION-SET", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "commonproperties",
    "ecuinstancerefs",
    "elements",
    "servicetables"
})
public class DIAGNOSTICCONTRIBUTIONSET {

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
    @XmlElement(name = "COMMON-PROPERTIES")
    protected DIAGNOSTICCOMMONPROPS commonproperties;
    @XmlElement(name = "ECU-INSTANCE-REFS")
    protected DIAGNOSTICCONTRIBUTIONSET.ECUINSTANCEREFS ecuinstancerefs;
    @XmlElement(name = "ELEMENTS")
    protected DIAGNOSTICCONTRIBUTIONSET.ELEMENTS elements;
    @XmlElement(name = "SERVICE-TABLES")
    protected DIAGNOSTICCONTRIBUTIONSET.SERVICETABLES servicetables;
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
     * ??commonproperties?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCOMMONPROPS }
     *     
     */
    public DIAGNOSTICCOMMONPROPS getCOMMONPROPERTIES() {
        return commonproperties;
    }

    /**
     * ??commonproperties?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCOMMONPROPS }
     *     
     */
    public void setCOMMONPROPERTIES(DIAGNOSTICCOMMONPROPS value) {
        this.commonproperties = value;
    }

    /**
     * ??ecuinstancerefs?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCONTRIBUTIONSET.ECUINSTANCEREFS }
     *     
     */
    public DIAGNOSTICCONTRIBUTIONSET.ECUINSTANCEREFS getECUINSTANCEREFS() {
        return ecuinstancerefs;
    }

    /**
     * ??ecuinstancerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCONTRIBUTIONSET.ECUINSTANCEREFS }
     *     
     */
    public void setECUINSTANCEREFS(DIAGNOSTICCONTRIBUTIONSET.ECUINSTANCEREFS value) {
        this.ecuinstancerefs = value;
    }

    /**
     * ??elements?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCONTRIBUTIONSET.ELEMENTS }
     *     
     */
    public DIAGNOSTICCONTRIBUTIONSET.ELEMENTS getELEMENTS() {
        return elements;
    }

    /**
     * ??elements?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCONTRIBUTIONSET.ELEMENTS }
     *     
     */
    public void setELEMENTS(DIAGNOSTICCONTRIBUTIONSET.ELEMENTS value) {
        this.elements = value;
    }

    /**
     * ??servicetables?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCONTRIBUTIONSET.SERVICETABLES }
     *     
     */
    public DIAGNOSTICCONTRIBUTIONSET.SERVICETABLES getSERVICETABLES() {
        return servicetables;
    }

    /**
     * ??servicetables?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCONTRIBUTIONSET.SERVICETABLES }
     *     
     */
    public void setSERVICETABLES(DIAGNOSTICCONTRIBUTIONSET.SERVICETABLES value) {
        this.servicetables = value;
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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="ECU-INSTANCE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECU-INSTANCE--SUBTYPES-ENUM" />
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
        "ecuinstanceref"
    })
    public static class ECUINSTANCEREFS {

        @XmlElement(name = "ECU-INSTANCE-REF")
        protected List<DIAGNOSTICCONTRIBUTIONSET.ECUINSTANCEREFS.ECUINSTANCEREF> ecuinstanceref;

        /**
         * Gets the value of the ecuinstanceref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecuinstanceref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUINSTANCEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICCONTRIBUTIONSET.ECUINSTANCEREFS.ECUINSTANCEREF }
         * 
         * 
         */
        public List<DIAGNOSTICCONTRIBUTIONSET.ECUINSTANCEREFS.ECUINSTANCEREF> getECUINSTANCEREF() {
            if (ecuinstanceref == null) {
                ecuinstanceref = new ArrayList<DIAGNOSTICCONTRIBUTIONSET.ECUINSTANCEREFS.ECUINSTANCEREF>();
            }
            return this.ecuinstanceref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECU-INSTANCE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ECUINSTANCEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ECUINSTANCESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ECUINSTANCESUBTYPESENUM }
             *     
             */
            public ECUINSTANCESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ECUINSTANCESUBTYPESENUM }
             *     
             */
            public void setDEST(ECUINSTANCESUBTYPESENUM value) {
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
     *         &lt;element name="DIAGNOSTIC-COMMON-ELEMENT-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-ELEMENT-REF-CONDITIONAL"/>
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
        "diagnosticcommonelementrefconditional"
    })
    public static class ELEMENTS {

        @XmlElement(name = "DIAGNOSTIC-COMMON-ELEMENT-REF-CONDITIONAL")
        protected List<DIAGNOSTICCOMMONELEMENTREFCONDITIONAL> diagnosticcommonelementrefconditional;

        /**
         * Gets the value of the diagnosticcommonelementrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticcommonelementrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGNOSTICCOMMONELEMENTREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICCOMMONELEMENTREFCONDITIONAL }
         * 
         * 
         */
        public List<DIAGNOSTICCOMMONELEMENTREFCONDITIONAL> getDIAGNOSTICCOMMONELEMENTREFCONDITIONAL() {
            if (diagnosticcommonelementrefconditional == null) {
                diagnosticcommonelementrefconditional = new ArrayList<DIAGNOSTICCOMMONELEMENTREFCONDITIONAL>();
            }
            return this.diagnosticcommonelementrefconditional;
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
     *         &lt;element name="DIAGNOSTIC-SERVICE-TABLE-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-TABLE-REF-CONDITIONAL"/>
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
        "diagnosticservicetablerefconditional"
    })
    public static class SERVICETABLES {

        @XmlElement(name = "DIAGNOSTIC-SERVICE-TABLE-REF-CONDITIONAL")
        protected List<DIAGNOSTICSERVICETABLEREFCONDITIONAL> diagnosticservicetablerefconditional;

        /**
         * Gets the value of the diagnosticservicetablerefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticservicetablerefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGNOSTICSERVICETABLEREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICSERVICETABLEREFCONDITIONAL }
         * 
         * 
         */
        public List<DIAGNOSTICSERVICETABLEREFCONDITIONAL> getDIAGNOSTICSERVICETABLEREFCONDITIONAL() {
            if (diagnosticservicetablerefconditional == null) {
                diagnosticservicetablerefconditional = new ArrayList<DIAGNOSTICSERVICETABLEREFCONDITIONAL>();
            }
            return this.diagnosticservicetablerefconditional;
        }

    }

}
