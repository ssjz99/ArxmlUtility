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
 * Specifies the abstract needs of a component or module on the configuration of OBD Services in relation to a particular "ratio monitoring" which is supported by this component or module.
 * 
 * <p>OBD-RATIO-SERVICE-NEEDS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="OBD-RATIO-SERVICE-NEEDS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SERVICE-NEEDS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CAPABILITY-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}OBD-RATIO-SERVICE-NEEDS"/>
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
@XmlType(name = "OBD-RATIO-SERVICE-NEEDS", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "audiences",
    "diagrequirement",
    "securityaccesslevel",
    "connectiontype",
    "iumprgroup",
    "ratebasedmonitoredeventref",
    "usedfidref",
    "usedsecondaryfidrefs"
})
public class OBDRATIOSERVICENEEDS {

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
    @XmlElement(name = "AUDIENCES")
    protected Ar421.DIAGNOSTICSTORAGECONDITIONNEEDS.AUDIENCES audiences;
    @XmlElement(name = "DIAG-REQUIREMENT")
    protected DIAGREQUIREMENTIDSTRING diagrequirement;
    @XmlElement(name = "SECURITY-ACCESS-LEVEL")
    protected POSITIVEINTEGER securityaccesslevel;
    @XmlElement(name = "CONNECTION-TYPE")
    protected OBDRATIOCONNECTIONKINDENUM connectiontype;
    @XmlElement(name = "IUMPR-GROUP")
    protected NMTOKENSTRING iumprgroup;
    @XmlElement(name = "RATE-BASED-MONITORED-EVENT-REF")
    protected OBDRATIOSERVICENEEDS.RATEBASEDMONITOREDEVENTREF ratebasedmonitoredeventref;
    @XmlElement(name = "USED-FID-REF")
    protected OBDRATIOSERVICENEEDS.USEDFIDREF usedfidref;
    @XmlElement(name = "USED-SECONDARY-FID-REFS")
    protected OBDRATIOSERVICENEEDS.USEDSECONDARYFIDREFS usedsecondaryfidrefs;
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
     * ??audiences?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.DIAGNOSTICSTORAGECONDITIONNEEDS.AUDIENCES }
     *     
     */
    public Ar421.DIAGNOSTICSTORAGECONDITIONNEEDS.AUDIENCES getAUDIENCES() {
        return audiences;
    }

    /**
     * ??audiences?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.DIAGNOSTICSTORAGECONDITIONNEEDS.AUDIENCES }
     *     
     */
    public void setAUDIENCES(Ar421.DIAGNOSTICSTORAGECONDITIONNEEDS.AUDIENCES value) {
        this.audiences = value;
    }

    /**
     * ??diagrequirement?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGREQUIREMENTIDSTRING }
     *     
     */
    public DIAGREQUIREMENTIDSTRING getDIAGREQUIREMENT() {
        return diagrequirement;
    }

    /**
     * ??diagrequirement?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGREQUIREMENTIDSTRING }
     *     
     */
    public void setDIAGREQUIREMENT(DIAGREQUIREMENTIDSTRING value) {
        this.diagrequirement = value;
    }

    /**
     * ??securityaccesslevel?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSECURITYACCESSLEVEL() {
        return securityaccesslevel;
    }

    /**
     * ??securityaccesslevel?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSECURITYACCESSLEVEL(POSITIVEINTEGER value) {
        this.securityaccesslevel = value;
    }

    /**
     * ??connectiontype?????
     * 
     * @return
     *     possible object is
     *     {@link OBDRATIOCONNECTIONKINDENUM }
     *     
     */
    public OBDRATIOCONNECTIONKINDENUM getCONNECTIONTYPE() {
        return connectiontype;
    }

    /**
     * ??connectiontype?????
     * 
     * @param value
     *     allowed object is
     *     {@link OBDRATIOCONNECTIONKINDENUM }
     *     
     */
    public void setCONNECTIONTYPE(OBDRATIOCONNECTIONKINDENUM value) {
        this.connectiontype = value;
    }

    /**
     * ??iumprgroup?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getIUMPRGROUP() {
        return iumprgroup;
    }

    /**
     * ??iumprgroup?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setIUMPRGROUP(NMTOKENSTRING value) {
        this.iumprgroup = value;
    }

    /**
     * ??ratebasedmonitoredeventref?????
     * 
     * @return
     *     possible object is
     *     {@link OBDRATIOSERVICENEEDS.RATEBASEDMONITOREDEVENTREF }
     *     
     */
    public OBDRATIOSERVICENEEDS.RATEBASEDMONITOREDEVENTREF getRATEBASEDMONITOREDEVENTREF() {
        return ratebasedmonitoredeventref;
    }

    /**
     * ??ratebasedmonitoredeventref?????
     * 
     * @param value
     *     allowed object is
     *     {@link OBDRATIOSERVICENEEDS.RATEBASEDMONITOREDEVENTREF }
     *     
     */
    public void setRATEBASEDMONITOREDEVENTREF(OBDRATIOSERVICENEEDS.RATEBASEDMONITOREDEVENTREF value) {
        this.ratebasedmonitoredeventref = value;
    }

    /**
     * ??usedfidref?????
     * 
     * @return
     *     possible object is
     *     {@link OBDRATIOSERVICENEEDS.USEDFIDREF }
     *     
     */
    public OBDRATIOSERVICENEEDS.USEDFIDREF getUSEDFIDREF() {
        return usedfidref;
    }

    /**
     * ??usedfidref?????
     * 
     * @param value
     *     allowed object is
     *     {@link OBDRATIOSERVICENEEDS.USEDFIDREF }
     *     
     */
    public void setUSEDFIDREF(OBDRATIOSERVICENEEDS.USEDFIDREF value) {
        this.usedfidref = value;
    }

    /**
     * ??usedsecondaryfidrefs?????
     * 
     * @return
     *     possible object is
     *     {@link OBDRATIOSERVICENEEDS.USEDSECONDARYFIDREFS }
     *     
     */
    public OBDRATIOSERVICENEEDS.USEDSECONDARYFIDREFS getUSEDSECONDARYFIDREFS() {
        return usedsecondaryfidrefs;
    }

    /**
     * ??usedsecondaryfidrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link OBDRATIOSERVICENEEDS.USEDSECONDARYFIDREFS }
     *     
     */
    public void setUSEDSECONDARYFIDREFS(OBDRATIOSERVICENEEDS.USEDSECONDARYFIDREFS value) {
        this.usedsecondaryfidrefs = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-NEEDS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RATEBASEDMONITOREDEVENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICEVENTNEEDSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICEVENTNEEDSSUBTYPESENUM }
         *     
         */
        public DIAGNOSTICEVENTNEEDSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICEVENTNEEDSSUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICEVENTNEEDSSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FUNCTION-INHIBITION-NEEDS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class USEDFIDREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FUNCTIONINHIBITIONNEEDSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FUNCTIONINHIBITIONNEEDSSUBTYPESENUM }
         *     
         */
        public FUNCTIONINHIBITIONNEEDSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FUNCTIONINHIBITIONNEEDSSUBTYPESENUM }
         *     
         */
        public void setDEST(FUNCTIONINHIBITIONNEEDSSUBTYPESENUM value) {
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
     *         &lt;element name="USED-SECONDARY-FID-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FUNCTION-INHIBITION-NEEDS--SUBTYPES-ENUM" />
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
        "usedsecondaryfidref"
    })
    public static class USEDSECONDARYFIDREFS {

        @XmlElement(name = "USED-SECONDARY-FID-REF")
        protected List<OBDRATIOSERVICENEEDS.USEDSECONDARYFIDREFS.USEDSECONDARYFIDREF> usedsecondaryfidref;

        /**
         * Gets the value of the usedsecondaryfidref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usedsecondaryfidref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUSEDSECONDARYFIDREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OBDRATIOSERVICENEEDS.USEDSECONDARYFIDREFS.USEDSECONDARYFIDREF }
         * 
         * 
         */
        public List<OBDRATIOSERVICENEEDS.USEDSECONDARYFIDREFS.USEDSECONDARYFIDREF> getUSEDSECONDARYFIDREF() {
            if (usedsecondaryfidref == null) {
                usedsecondaryfidref = new ArrayList<OBDRATIOSERVICENEEDS.USEDSECONDARYFIDREFS.USEDSECONDARYFIDREF>();
            }
            return this.usedsecondaryfidref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FUNCTION-INHIBITION-NEEDS--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class USEDSECONDARYFIDREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected FUNCTIONINHIBITIONNEEDSSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link FUNCTIONINHIBITIONNEEDSSUBTYPESENUM }
             *     
             */
            public FUNCTIONINHIBITIONNEEDSSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link FUNCTIONINHIBITIONNEEDSSUBTYPESENUM }
             *     
             */
            public void setDEST(FUNCTIONINHIBITIONNEEDSSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
