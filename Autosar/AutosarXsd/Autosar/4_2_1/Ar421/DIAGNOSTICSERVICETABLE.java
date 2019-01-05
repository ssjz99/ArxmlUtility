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
 * <p>DIAGNOSTIC-SERVICE-TABLE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-SERVICE-TABLE">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-TABLE"/>
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
@XmlType(name = "DIAGNOSTIC-SERVICE-TABLE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "diagnosticconnections",
    "ecuinstanceref",
    "protocolkind",
    "serviceinstancerefs"
})
public class DIAGNOSTICSERVICETABLE {

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
    @XmlElement(name = "DIAGNOSTIC-CONNECTIONS")
    protected DIAGNOSTICSERVICETABLE.DIAGNOSTICCONNECTIONS diagnosticconnections;
    @XmlElement(name = "ECU-INSTANCE-REF")
    protected DIAGNOSTICSERVICETABLE.ECUINSTANCEREF ecuinstanceref;
    @XmlElement(name = "PROTOCOL-KIND")
    protected NMTOKENSTRING protocolkind;
    @XmlElement(name = "SERVICE-INSTANCE-REFS")
    protected DIAGNOSTICSERVICETABLE.SERVICEINSTANCEREFS serviceinstancerefs;
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
     * ??diagnosticconnections?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICSERVICETABLE.DIAGNOSTICCONNECTIONS }
     *     
     */
    public DIAGNOSTICSERVICETABLE.DIAGNOSTICCONNECTIONS getDIAGNOSTICCONNECTIONS() {
        return diagnosticconnections;
    }

    /**
     * ??diagnosticconnections?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICSERVICETABLE.DIAGNOSTICCONNECTIONS }
     *     
     */
    public void setDIAGNOSTICCONNECTIONS(DIAGNOSTICSERVICETABLE.DIAGNOSTICCONNECTIONS value) {
        this.diagnosticconnections = value;
    }

    /**
     * ??ecuinstanceref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICSERVICETABLE.ECUINSTANCEREF }
     *     
     */
    public DIAGNOSTICSERVICETABLE.ECUINSTANCEREF getECUINSTANCEREF() {
        return ecuinstanceref;
    }

    /**
     * ??ecuinstanceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICSERVICETABLE.ECUINSTANCEREF }
     *     
     */
    public void setECUINSTANCEREF(DIAGNOSTICSERVICETABLE.ECUINSTANCEREF value) {
        this.ecuinstanceref = value;
    }

    /**
     * ??protocolkind?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getPROTOCOLKIND() {
        return protocolkind;
    }

    /**
     * ??protocolkind?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setPROTOCOLKIND(NMTOKENSTRING value) {
        this.protocolkind = value;
    }

    /**
     * ??serviceinstancerefs?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICSERVICETABLE.SERVICEINSTANCEREFS }
     *     
     */
    public DIAGNOSTICSERVICETABLE.SERVICEINSTANCEREFS getSERVICEINSTANCEREFS() {
        return serviceinstancerefs;
    }

    /**
     * ??serviceinstancerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICSERVICETABLE.SERVICEINSTANCEREFS }
     *     
     */
    public void setSERVICEINSTANCEREFS(DIAGNOSTICSERVICETABLE.SERVICEINSTANCEREFS value) {
        this.serviceinstancerefs = value;
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
     *         &lt;element name="DIAGNOSTIC-CONNECTION-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CONNECTION-REF-CONDITIONAL"/>
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
        "diagnosticconnectionrefconditional"
    })
    public static class DIAGNOSTICCONNECTIONS {

        @XmlElement(name = "DIAGNOSTIC-CONNECTION-REF-CONDITIONAL")
        protected List<DIAGNOSTICCONNECTIONREFCONDITIONAL> diagnosticconnectionrefconditional;

        /**
         * Gets the value of the diagnosticconnectionrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticconnectionrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGNOSTICCONNECTIONREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICCONNECTIONREFCONDITIONAL }
         * 
         * 
         */
        public List<DIAGNOSTICCONNECTIONREFCONDITIONAL> getDIAGNOSTICCONNECTIONREFCONDITIONAL() {
            if (diagnosticconnectionrefconditional == null) {
                diagnosticconnectionrefconditional = new ArrayList<DIAGNOSTICCONNECTIONREFCONDITIONAL>();
            }
            return this.diagnosticconnectionrefconditional;
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
     *         &lt;element name="SERVICE-INSTANCE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-INSTANCE--SUBTYPES-ENUM" />
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
        "serviceinstanceref"
    })
    public static class SERVICEINSTANCEREFS {

        @XmlElement(name = "SERVICE-INSTANCE-REF")
        protected List<DIAGNOSTICSERVICETABLE.SERVICEINSTANCEREFS.SERVICEINSTANCEREF> serviceinstanceref;

        /**
         * Gets the value of the serviceinstanceref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceinstanceref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSERVICEINSTANCEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICSERVICETABLE.SERVICEINSTANCEREFS.SERVICEINSTANCEREF }
         * 
         * 
         */
        public List<DIAGNOSTICSERVICETABLE.SERVICEINSTANCEREFS.SERVICEINSTANCEREF> getSERVICEINSTANCEREF() {
            if (serviceinstanceref == null) {
                serviceinstanceref = new ArrayList<DIAGNOSTICSERVICETABLE.SERVICEINSTANCEREFS.SERVICEINSTANCEREF>();
            }
            return this.serviceinstanceref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-INSTANCE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SERVICEINSTANCEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected DIAGNOSTICSERVICEINSTANCESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link DIAGNOSTICSERVICEINSTANCESUBTYPESENUM }
             *     
             */
            public DIAGNOSTICSERVICEINSTANCESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link DIAGNOSTICSERVICEINSTANCESUBTYPESENUM }
             *     
             */
            public void setDEST(DIAGNOSTICSERVICEINSTANCESUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
