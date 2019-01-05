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
 * Specifies the abstract needs on the configuration of the Diagnostic Event Manager for one diagnostic event. Its shortName can be regarded as a symbol identifying the diagnostic event from the viewpoint of the component or module which owns this element.
 * 
 * In case the diagnostic event specifies a production error, the shortName shall be the name of the production error.
 * 
 * <p>DIAGNOSTIC-EVENT-NEEDS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-EVENT-NEEDS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SERVICE-NEEDS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CAPABILITY-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-NEEDS"/>
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
@XmlType(name = "DIAGNOSTIC-EVENT-NEEDS", propOrder = {
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
    "considerptostatus",
    "deferringfidrefs",
    "diageventdebouncealgorithm",
    "dtckind",
    "dtcnumber",
    "inhibitingfidref",
    "inhibitingsecondaryfidrefs",
    "obddtcnumber",
    "reportbehavior",
    "udsdtcnumber"
})
public class DIAGNOSTICEVENTNEEDS {

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
    @XmlElement(name = "CONSIDER-PTO-STATUS")
    protected BOOLEAN considerptostatus;
    @XmlElement(name = "DEFERRING-FID-REFS")
    protected DIAGNOSTICEVENTNEEDS.DEFERRINGFIDREFS deferringfidrefs;
    @XmlElement(name = "DIAG-EVENT-DEBOUNCE-ALGORITHM")
    protected DIAGNOSTICEVENTNEEDS.DIAGEVENTDEBOUNCEALGORITHM diageventdebouncealgorithm;
    @XmlElement(name = "DTC-KIND")
    protected DTCKINDENUM dtckind;
    @XmlElement(name = "DTC-NUMBER")
    protected POSITIVEINTEGER dtcnumber;
    @XmlElement(name = "INHIBITING-FID-REF")
    protected DIAGNOSTICEVENTNEEDS.INHIBITINGFIDREF inhibitingfidref;
    @XmlElement(name = "INHIBITING-SECONDARY-FID-REFS")
    protected DIAGNOSTICEVENTNEEDS.INHIBITINGSECONDARYFIDREFS inhibitingsecondaryfidrefs;
    @XmlElement(name = "OBD-DTC-NUMBER")
    protected POSITIVEINTEGER obddtcnumber;
    @XmlElement(name = "REPORT-BEHAVIOR")
    protected REPORTBEHAVIORENUM reportbehavior;
    @XmlElement(name = "UDS-DTC-NUMBER")
    protected POSITIVEINTEGER udsdtcnumber;
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
     * ??considerptostatus?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getCONSIDERPTOSTATUS() {
        return considerptostatus;
    }

    /**
     * ??considerptostatus?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setCONSIDERPTOSTATUS(BOOLEAN value) {
        this.considerptostatus = value;
    }

    /**
     * ??deferringfidrefs?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICEVENTNEEDS.DEFERRINGFIDREFS }
     *     
     */
    public DIAGNOSTICEVENTNEEDS.DEFERRINGFIDREFS getDEFERRINGFIDREFS() {
        return deferringfidrefs;
    }

    /**
     * ??deferringfidrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICEVENTNEEDS.DEFERRINGFIDREFS }
     *     
     */
    public void setDEFERRINGFIDREFS(DIAGNOSTICEVENTNEEDS.DEFERRINGFIDREFS value) {
        this.deferringfidrefs = value;
    }

    /**
     * ??diageventdebouncealgorithm?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICEVENTNEEDS.DIAGEVENTDEBOUNCEALGORITHM }
     *     
     */
    public DIAGNOSTICEVENTNEEDS.DIAGEVENTDEBOUNCEALGORITHM getDIAGEVENTDEBOUNCEALGORITHM() {
        return diageventdebouncealgorithm;
    }

    /**
     * ??diageventdebouncealgorithm?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICEVENTNEEDS.DIAGEVENTDEBOUNCEALGORITHM }
     *     
     */
    public void setDIAGEVENTDEBOUNCEALGORITHM(DIAGNOSTICEVENTNEEDS.DIAGEVENTDEBOUNCEALGORITHM value) {
        this.diageventdebouncealgorithm = value;
    }

    /**
     * ??dtckind?????
     * 
     * @return
     *     possible object is
     *     {@link DTCKINDENUM }
     *     
     */
    public DTCKINDENUM getDTCKIND() {
        return dtckind;
    }

    /**
     * ??dtckind?????
     * 
     * @param value
     *     allowed object is
     *     {@link DTCKINDENUM }
     *     
     */
    public void setDTCKIND(DTCKINDENUM value) {
        this.dtckind = value;
    }

    /**
     * ??dtcnumber?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDTCNUMBER() {
        return dtcnumber;
    }

    /**
     * ??dtcnumber?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDTCNUMBER(POSITIVEINTEGER value) {
        this.dtcnumber = value;
    }

    /**
     * ??inhibitingfidref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICEVENTNEEDS.INHIBITINGFIDREF }
     *     
     */
    public DIAGNOSTICEVENTNEEDS.INHIBITINGFIDREF getINHIBITINGFIDREF() {
        return inhibitingfidref;
    }

    /**
     * ??inhibitingfidref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICEVENTNEEDS.INHIBITINGFIDREF }
     *     
     */
    public void setINHIBITINGFIDREF(DIAGNOSTICEVENTNEEDS.INHIBITINGFIDREF value) {
        this.inhibitingfidref = value;
    }

    /**
     * ??inhibitingsecondaryfidrefs?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICEVENTNEEDS.INHIBITINGSECONDARYFIDREFS }
     *     
     */
    public DIAGNOSTICEVENTNEEDS.INHIBITINGSECONDARYFIDREFS getINHIBITINGSECONDARYFIDREFS() {
        return inhibitingsecondaryfidrefs;
    }

    /**
     * ??inhibitingsecondaryfidrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICEVENTNEEDS.INHIBITINGSECONDARYFIDREFS }
     *     
     */
    public void setINHIBITINGSECONDARYFIDREFS(DIAGNOSTICEVENTNEEDS.INHIBITINGSECONDARYFIDREFS value) {
        this.inhibitingsecondaryfidrefs = value;
    }

    /**
     * ??obddtcnumber?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getOBDDTCNUMBER() {
        return obddtcnumber;
    }

    /**
     * ??obddtcnumber?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setOBDDTCNUMBER(POSITIVEINTEGER value) {
        this.obddtcnumber = value;
    }

    /**
     * ??reportbehavior?????
     * 
     * @return
     *     possible object is
     *     {@link REPORTBEHAVIORENUM }
     *     
     */
    public REPORTBEHAVIORENUM getREPORTBEHAVIOR() {
        return reportbehavior;
    }

    /**
     * ??reportbehavior?????
     * 
     * @param value
     *     allowed object is
     *     {@link REPORTBEHAVIORENUM }
     *     
     */
    public void setREPORTBEHAVIOR(REPORTBEHAVIORENUM value) {
        this.reportbehavior = value;
    }

    /**
     * ??udsdtcnumber?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getUDSDTCNUMBER() {
        return udsdtcnumber;
    }

    /**
     * ??udsdtcnumber?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setUDSDTCNUMBER(POSITIVEINTEGER value) {
        this.udsdtcnumber = value;
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
     *         &lt;element name="DEFERRING-FID-REF">
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
        "deferringfidref"
    })
    public static class DEFERRINGFIDREFS {

        @XmlElement(name = "DEFERRING-FID-REF")
        protected List<DIAGNOSTICEVENTNEEDS.DEFERRINGFIDREFS.DEFERRINGFIDREF> deferringfidref;

        /**
         * Gets the value of the deferringfidref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deferringfidref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDEFERRINGFIDREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICEVENTNEEDS.DEFERRINGFIDREFS.DEFERRINGFIDREF }
         * 
         * 
         */
        public List<DIAGNOSTICEVENTNEEDS.DEFERRINGFIDREFS.DEFERRINGFIDREF> getDEFERRINGFIDREF() {
            if (deferringfidref == null) {
                deferringfidref = new ArrayList<DIAGNOSTICEVENTNEEDS.DEFERRINGFIDREFS.DEFERRINGFIDREF>();
            }
            return this.deferringfidref;
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
        public static class DEFERRINGFIDREF
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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element name="DIAG-EVENT-DEBOUNCE-COUNTER-BASED" type="{http://autosar.org/schema/r4.0}DIAG-EVENT-DEBOUNCE-COUNTER-BASED"/>
     *         &lt;element name="DIAG-EVENT-DEBOUNCE-MONITOR-INTERNAL" type="{http://autosar.org/schema/r4.0}DIAG-EVENT-DEBOUNCE-MONITOR-INTERNAL"/>
     *         &lt;element name="DIAG-EVENT-DEBOUNCE-TIME-BASED" type="{http://autosar.org/schema/r4.0}DIAG-EVENT-DEBOUNCE-TIME-BASED"/>
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
        "diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED"
    })
    public static class DIAGEVENTDEBOUNCEALGORITHM {

        @XmlElements({
            @XmlElement(name = "DIAG-EVENT-DEBOUNCE-COUNTER-BASED", type = DIAGEVENTDEBOUNCECOUNTERBASED.class),
            @XmlElement(name = "DIAG-EVENT-DEBOUNCE-MONITOR-INTERNAL", type = DIAGEVENTDEBOUNCEMONITORINTERNAL.class),
            @XmlElement(name = "DIAG-EVENT-DEBOUNCE-TIME-BASED", type = DIAGEVENTDEBOUNCETIMEBASED.class)
        })
        protected Object diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED;

        /**
         * ??diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGEVENTDEBOUNCECOUNTERBASED }
         *     {@link DIAGEVENTDEBOUNCEMONITORINTERNAL }
         *     {@link DIAGEVENTDEBOUNCETIMEBASED }
         *     
         */
        public Object getDIAGEVENTDEBOUNCECOUNTERBASEDOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED() {
            return diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED;
        }

        /**
         * ??diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGEVENTDEBOUNCECOUNTERBASED }
         *     {@link DIAGEVENTDEBOUNCEMONITORINTERNAL }
         *     {@link DIAGEVENTDEBOUNCETIMEBASED }
         *     
         */
        public void setDIAGEVENTDEBOUNCECOUNTERBASEDOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED(Object value) {
            this.diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED = value;
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
    public static class INHIBITINGFIDREF
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
     *         &lt;element name="INHIBITING-SECONDARY-FID-REF">
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
        "inhibitingsecondaryfidref"
    })
    public static class INHIBITINGSECONDARYFIDREFS {

        @XmlElement(name = "INHIBITING-SECONDARY-FID-REF")
        protected List<DIAGNOSTICEVENTNEEDS.INHIBITINGSECONDARYFIDREFS.INHIBITINGSECONDARYFIDREF> inhibitingsecondaryfidref;

        /**
         * Gets the value of the inhibitingsecondaryfidref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inhibitingsecondaryfidref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINHIBITINGSECONDARYFIDREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICEVENTNEEDS.INHIBITINGSECONDARYFIDREFS.INHIBITINGSECONDARYFIDREF }
         * 
         * 
         */
        public List<DIAGNOSTICEVENTNEEDS.INHIBITINGSECONDARYFIDREFS.INHIBITINGSECONDARYFIDREF> getINHIBITINGSECONDARYFIDREF() {
            if (inhibitingsecondaryfidref == null) {
                inhibitingsecondaryfidref = new ArrayList<DIAGNOSTICEVENTNEEDS.INHIBITINGSECONDARYFIDREFS.INHIBITINGSECONDARYFIDREF>();
            }
            return this.inhibitingsecondaryfidref;
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
        public static class INHIBITINGSECONDARYFIDREF
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
