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
 * DiagnosticConncection that is used to describe the relationship between several TP connections.
 * 
 * <p>DIAGNOSTIC-CONNECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-CONNECTION">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CONNECTION"/>
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
@XmlType(name = "DIAGNOSTIC-CONNECTION", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "functionalrequestrefs",
    "periodicresponseuudtrefs",
    "physicalrequestref",
    "responseoneventref",
    "responseref"
})
public class DIAGNOSTICCONNECTION {

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
    @XmlElement(name = "FUNCTIONAL-REQUEST-REFS")
    protected DIAGNOSTICCONNECTION.FUNCTIONALREQUESTREFS functionalrequestrefs;
    @XmlElement(name = "PERIODIC-RESPONSE-UUDT-REFS")
    protected DIAGNOSTICCONNECTION.PERIODICRESPONSEUUDTREFS periodicresponseuudtrefs;
    @XmlElement(name = "PHYSICAL-REQUEST-REF")
    protected DIAGNOSTICCONNECTION.PHYSICALREQUESTREF physicalrequestref;
    @XmlElement(name = "RESPONSE-ON-EVENT-REF")
    protected DIAGNOSTICCONNECTION.RESPONSEONEVENTREF responseoneventref;
    @XmlElement(name = "RESPONSE-REF")
    protected DIAGNOSTICCONNECTION.RESPONSEREF responseref;
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
     * ??functionalrequestrefs?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCONNECTION.FUNCTIONALREQUESTREFS }
     *     
     */
    public DIAGNOSTICCONNECTION.FUNCTIONALREQUESTREFS getFUNCTIONALREQUESTREFS() {
        return functionalrequestrefs;
    }

    /**
     * ??functionalrequestrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCONNECTION.FUNCTIONALREQUESTREFS }
     *     
     */
    public void setFUNCTIONALREQUESTREFS(DIAGNOSTICCONNECTION.FUNCTIONALREQUESTREFS value) {
        this.functionalrequestrefs = value;
    }

    /**
     * ??periodicresponseuudtrefs?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCONNECTION.PERIODICRESPONSEUUDTREFS }
     *     
     */
    public DIAGNOSTICCONNECTION.PERIODICRESPONSEUUDTREFS getPERIODICRESPONSEUUDTREFS() {
        return periodicresponseuudtrefs;
    }

    /**
     * ??periodicresponseuudtrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCONNECTION.PERIODICRESPONSEUUDTREFS }
     *     
     */
    public void setPERIODICRESPONSEUUDTREFS(DIAGNOSTICCONNECTION.PERIODICRESPONSEUUDTREFS value) {
        this.periodicresponseuudtrefs = value;
    }

    /**
     * ??physicalrequestref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCONNECTION.PHYSICALREQUESTREF }
     *     
     */
    public DIAGNOSTICCONNECTION.PHYSICALREQUESTREF getPHYSICALREQUESTREF() {
        return physicalrequestref;
    }

    /**
     * ??physicalrequestref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCONNECTION.PHYSICALREQUESTREF }
     *     
     */
    public void setPHYSICALREQUESTREF(DIAGNOSTICCONNECTION.PHYSICALREQUESTREF value) {
        this.physicalrequestref = value;
    }

    /**
     * ??responseoneventref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCONNECTION.RESPONSEONEVENTREF }
     *     
     */
    public DIAGNOSTICCONNECTION.RESPONSEONEVENTREF getRESPONSEONEVENTREF() {
        return responseoneventref;
    }

    /**
     * ??responseoneventref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCONNECTION.RESPONSEONEVENTREF }
     *     
     */
    public void setRESPONSEONEVENTREF(DIAGNOSTICCONNECTION.RESPONSEONEVENTREF value) {
        this.responseoneventref = value;
    }

    /**
     * ??responseref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCONNECTION.RESPONSEREF }
     *     
     */
    public DIAGNOSTICCONNECTION.RESPONSEREF getRESPONSEREF() {
        return responseref;
    }

    /**
     * ??responseref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCONNECTION.RESPONSEREF }
     *     
     */
    public void setRESPONSEREF(DIAGNOSTICCONNECTION.RESPONSEREF value) {
        this.responseref = value;
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
     *         &lt;element name="FUNCTIONAL-REQUEST-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TP-CONNECTION-IDENT--SUBTYPES-ENUM" />
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
        "functionalrequestref"
    })
    public static class FUNCTIONALREQUESTREFS {

        @XmlElement(name = "FUNCTIONAL-REQUEST-REF")
        protected List<DIAGNOSTICCONNECTION.FUNCTIONALREQUESTREFS.FUNCTIONALREQUESTREF> functionalrequestref;

        /**
         * Gets the value of the functionalrequestref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the functionalrequestref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFUNCTIONALREQUESTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICCONNECTION.FUNCTIONALREQUESTREFS.FUNCTIONALREQUESTREF }
         * 
         * 
         */
        public List<DIAGNOSTICCONNECTION.FUNCTIONALREQUESTREFS.FUNCTIONALREQUESTREF> getFUNCTIONALREQUESTREF() {
            if (functionalrequestref == null) {
                functionalrequestref = new ArrayList<DIAGNOSTICCONNECTION.FUNCTIONALREQUESTREFS.FUNCTIONALREQUESTREF>();
            }
            return this.functionalrequestref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TP-CONNECTION-IDENT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FUNCTIONALREQUESTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected TPCONNECTIONIDENTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link TPCONNECTIONIDENTSUBTYPESENUM }
             *     
             */
            public TPCONNECTIONIDENTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link TPCONNECTIONIDENTSUBTYPESENUM }
             *     
             */
            public void setDEST(TPCONNECTIONIDENTSUBTYPESENUM value) {
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
     *         &lt;element name="PERIODIC-RESPONSE-UUDT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PDU-TRIGGERING--SUBTYPES-ENUM" />
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
        "periodicresponseuudtref"
    })
    public static class PERIODICRESPONSEUUDTREFS {

        @XmlElement(name = "PERIODIC-RESPONSE-UUDT-REF")
        protected List<DIAGNOSTICCONNECTION.PERIODICRESPONSEUUDTREFS.PERIODICRESPONSEUUDTREF> periodicresponseuudtref;

        /**
         * Gets the value of the periodicresponseuudtref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the periodicresponseuudtref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPERIODICRESPONSEUUDTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICCONNECTION.PERIODICRESPONSEUUDTREFS.PERIODICRESPONSEUUDTREF }
         * 
         * 
         */
        public List<DIAGNOSTICCONNECTION.PERIODICRESPONSEUUDTREFS.PERIODICRESPONSEUUDTREF> getPERIODICRESPONSEUUDTREF() {
            if (periodicresponseuudtref == null) {
                periodicresponseuudtref = new ArrayList<DIAGNOSTICCONNECTION.PERIODICRESPONSEUUDTREFS.PERIODICRESPONSEUUDTREF>();
            }
            return this.periodicresponseuudtref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PDU-TRIGGERING--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PERIODICRESPONSEUUDTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected PDUTRIGGERINGSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link PDUTRIGGERINGSUBTYPESENUM }
             *     
             */
            public PDUTRIGGERINGSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link PDUTRIGGERINGSUBTYPESENUM }
             *     
             */
            public void setDEST(PDUTRIGGERINGSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TP-CONNECTION-IDENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PHYSICALREQUESTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TPCONNECTIONIDENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TPCONNECTIONIDENTSUBTYPESENUM }
         *     
         */
        public TPCONNECTIONIDENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TPCONNECTIONIDENTSUBTYPESENUM }
         *     
         */
        public void setDEST(TPCONNECTIONIDENTSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TP-CONNECTION-IDENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RESPONSEONEVENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TPCONNECTIONIDENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TPCONNECTIONIDENTSUBTYPESENUM }
         *     
         */
        public TPCONNECTIONIDENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TPCONNECTIONIDENTSUBTYPESENUM }
         *     
         */
        public void setDEST(TPCONNECTIONIDENTSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TP-CONNECTION-IDENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RESPONSEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TPCONNECTIONIDENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TPCONNECTIONIDENTSUBTYPESENUM }
         *     
         */
        public TPCONNECTIONIDENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TPCONNECTIONIDENTSUBTYPESENUM }
         *     
         */
        public void setDEST(TPCONNECTIONIDENTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}