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
 * Description of consumed resources by one implementation of a software.
 * 
 * <p>RESOURCE-CONSUMPTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="RESOURCE-CONSUMPTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RESOURCE-CONSUMPTION"/>
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
@XmlType(name = "RESOURCE-CONSUMPTION", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "executiontimes",
    "heapusages",
    "memorysections",
    "sectionnameprefixs",
    "stackusages"
})
public class RESOURCECONSUMPTION {

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
    @XmlElement(name = "EXECUTION-TIMES")
    protected RESOURCECONSUMPTION.EXECUTIONTIMES executiontimes;
    @XmlElement(name = "HEAP-USAGES")
    protected RESOURCECONSUMPTION.HEAPUSAGES heapusages;
    @XmlElement(name = "MEMORY-SECTIONS")
    protected RESOURCECONSUMPTION.MEMORYSECTIONS memorysections;
    @XmlElement(name = "SECTION-NAME-PREFIXS")
    protected RESOURCECONSUMPTION.SECTIONNAMEPREFIXS sectionnameprefixs;
    @XmlElement(name = "STACK-USAGES")
    protected RESOURCECONSUMPTION.STACKUSAGES stackusages;
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
     * ??executiontimes?????
     * 
     * @return
     *     possible object is
     *     {@link RESOURCECONSUMPTION.EXECUTIONTIMES }
     *     
     */
    public RESOURCECONSUMPTION.EXECUTIONTIMES getEXECUTIONTIMES() {
        return executiontimes;
    }

    /**
     * ??executiontimes?????
     * 
     * @param value
     *     allowed object is
     *     {@link RESOURCECONSUMPTION.EXECUTIONTIMES }
     *     
     */
    public void setEXECUTIONTIMES(RESOURCECONSUMPTION.EXECUTIONTIMES value) {
        this.executiontimes = value;
    }

    /**
     * ??heapusages?????
     * 
     * @return
     *     possible object is
     *     {@link RESOURCECONSUMPTION.HEAPUSAGES }
     *     
     */
    public RESOURCECONSUMPTION.HEAPUSAGES getHEAPUSAGES() {
        return heapusages;
    }

    /**
     * ??heapusages?????
     * 
     * @param value
     *     allowed object is
     *     {@link RESOURCECONSUMPTION.HEAPUSAGES }
     *     
     */
    public void setHEAPUSAGES(RESOURCECONSUMPTION.HEAPUSAGES value) {
        this.heapusages = value;
    }

    /**
     * ??memorysections?????
     * 
     * @return
     *     possible object is
     *     {@link RESOURCECONSUMPTION.MEMORYSECTIONS }
     *     
     */
    public RESOURCECONSUMPTION.MEMORYSECTIONS getMEMORYSECTIONS() {
        return memorysections;
    }

    /**
     * ??memorysections?????
     * 
     * @param value
     *     allowed object is
     *     {@link RESOURCECONSUMPTION.MEMORYSECTIONS }
     *     
     */
    public void setMEMORYSECTIONS(RESOURCECONSUMPTION.MEMORYSECTIONS value) {
        this.memorysections = value;
    }

    /**
     * ??sectionnameprefixs?????
     * 
     * @return
     *     possible object is
     *     {@link RESOURCECONSUMPTION.SECTIONNAMEPREFIXS }
     *     
     */
    public RESOURCECONSUMPTION.SECTIONNAMEPREFIXS getSECTIONNAMEPREFIXS() {
        return sectionnameprefixs;
    }

    /**
     * ??sectionnameprefixs?????
     * 
     * @param value
     *     allowed object is
     *     {@link RESOURCECONSUMPTION.SECTIONNAMEPREFIXS }
     *     
     */
    public void setSECTIONNAMEPREFIXS(RESOURCECONSUMPTION.SECTIONNAMEPREFIXS value) {
        this.sectionnameprefixs = value;
    }

    /**
     * ??stackusages?????
     * 
     * @return
     *     possible object is
     *     {@link RESOURCECONSUMPTION.STACKUSAGES }
     *     
     */
    public RESOURCECONSUMPTION.STACKUSAGES getSTACKUSAGES() {
        return stackusages;
    }

    /**
     * ??stackusages?????
     * 
     * @param value
     *     allowed object is
     *     {@link RESOURCECONSUMPTION.STACKUSAGES }
     *     
     */
    public void setSTACKUSAGES(RESOURCECONSUMPTION.STACKUSAGES value) {
        this.stackusages = value;
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
     *         &lt;element name="ANALYZED-EXECUTION-TIME" type="{http://autosar.org/schema/r4.0}ANALYZED-EXECUTION-TIME"/>
     *         &lt;element name="MEASURED-EXECUTION-TIME" type="{http://autosar.org/schema/r4.0}MEASURED-EXECUTION-TIME"/>
     *         &lt;element name="ROUGH-ESTIMATE-OF-EXECUTION-TIME" type="{http://autosar.org/schema/r4.0}ROUGH-ESTIMATE-OF-EXECUTION-TIME"/>
     *         &lt;element name="SIMULATED-EXECUTION-TIME" type="{http://autosar.org/schema/r4.0}SIMULATED-EXECUTION-TIME"/>
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
        "analyzedexecutiontimeOrMEASUREDEXECUTIONTIMEOrROUGHESTIMATEOFEXECUTIONTIME"
    })
    public static class EXECUTIONTIMES {

        @XmlElements({
            @XmlElement(name = "ANALYZED-EXECUTION-TIME", type = ANALYZEDEXECUTIONTIME.class),
            @XmlElement(name = "MEASURED-EXECUTION-TIME", type = MEASUREDEXECUTIONTIME.class),
            @XmlElement(name = "ROUGH-ESTIMATE-OF-EXECUTION-TIME", type = ROUGHESTIMATEOFEXECUTIONTIME.class),
            @XmlElement(name = "SIMULATED-EXECUTION-TIME", type = SIMULATEDEXECUTIONTIME.class)
        })
        protected List<Object> analyzedexecutiontimeOrMEASUREDEXECUTIONTIMEOrROUGHESTIMATEOFEXECUTIONTIME;

        /**
         * Gets the value of the analyzedexecutiontimeOrMEASUREDEXECUTIONTIMEOrROUGHESTIMATEOFEXECUTIONTIME property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the analyzedexecutiontimeOrMEASUREDEXECUTIONTIMEOrROUGHESTIMATEOFEXECUTIONTIME property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getANALYZEDEXECUTIONTIMEOrMEASUREDEXECUTIONTIMEOrROUGHESTIMATEOFEXECUTIONTIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ANALYZEDEXECUTIONTIME }
         * {@link MEASUREDEXECUTIONTIME }
         * {@link ROUGHESTIMATEOFEXECUTIONTIME }
         * {@link SIMULATEDEXECUTIONTIME }
         * 
         * 
         */
        public List<Object> getANALYZEDEXECUTIONTIMEOrMEASUREDEXECUTIONTIMEOrROUGHESTIMATEOFEXECUTIONTIME() {
            if (analyzedexecutiontimeOrMEASUREDEXECUTIONTIMEOrROUGHESTIMATEOFEXECUTIONTIME == null) {
                analyzedexecutiontimeOrMEASUREDEXECUTIONTIMEOrROUGHESTIMATEOFEXECUTIONTIME = new ArrayList<Object>();
            }
            return this.analyzedexecutiontimeOrMEASUREDEXECUTIONTIMEOrROUGHESTIMATEOFEXECUTIONTIME;
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
     *         &lt;element name="MEASURED-HEAP-USAGE" type="{http://autosar.org/schema/r4.0}MEASURED-HEAP-USAGE"/>
     *         &lt;element name="ROUGH-ESTIMATE-HEAP-USAGE" type="{http://autosar.org/schema/r4.0}ROUGH-ESTIMATE-HEAP-USAGE"/>
     *         &lt;element name="WORST-CASE-HEAP-USAGE" type="{http://autosar.org/schema/r4.0}WORST-CASE-HEAP-USAGE"/>
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
        "measuredheapusageOrROUGHESTIMATEHEAPUSAGEOrWORSTCASEHEAPUSAGE"
    })
    public static class HEAPUSAGES {

        @XmlElements({
            @XmlElement(name = "MEASURED-HEAP-USAGE", type = MEASUREDHEAPUSAGE.class),
            @XmlElement(name = "ROUGH-ESTIMATE-HEAP-USAGE", type = ROUGHESTIMATEHEAPUSAGE.class),
            @XmlElement(name = "WORST-CASE-HEAP-USAGE", type = WORSTCASEHEAPUSAGE.class)
        })
        protected List<Object> measuredheapusageOrROUGHESTIMATEHEAPUSAGEOrWORSTCASEHEAPUSAGE;

        /**
         * Gets the value of the measuredheapusageOrROUGHESTIMATEHEAPUSAGEOrWORSTCASEHEAPUSAGE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the measuredheapusageOrROUGHESTIMATEHEAPUSAGEOrWORSTCASEHEAPUSAGE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEASUREDHEAPUSAGEOrROUGHESTIMATEHEAPUSAGEOrWORSTCASEHEAPUSAGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MEASUREDHEAPUSAGE }
         * {@link ROUGHESTIMATEHEAPUSAGE }
         * {@link WORSTCASEHEAPUSAGE }
         * 
         * 
         */
        public List<Object> getMEASUREDHEAPUSAGEOrROUGHESTIMATEHEAPUSAGEOrWORSTCASEHEAPUSAGE() {
            if (measuredheapusageOrROUGHESTIMATEHEAPUSAGEOrWORSTCASEHEAPUSAGE == null) {
                measuredheapusageOrROUGHESTIMATEHEAPUSAGEOrWORSTCASEHEAPUSAGE = new ArrayList<Object>();
            }
            return this.measuredheapusageOrROUGHESTIMATEHEAPUSAGEOrWORSTCASEHEAPUSAGE;
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
     *         &lt;element name="MEMORY-SECTION" type="{http://autosar.org/schema/r4.0}MEMORY-SECTION"/>
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
        "memorysection"
    })
    public static class MEMORYSECTIONS {

        @XmlElement(name = "MEMORY-SECTION")
        protected List<MEMORYSECTION> memorysection;

        /**
         * Gets the value of the memorysection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memorysection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEMORYSECTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MEMORYSECTION }
         * 
         * 
         */
        public List<MEMORYSECTION> getMEMORYSECTION() {
            if (memorysection == null) {
                memorysection = new ArrayList<MEMORYSECTION>();
            }
            return this.memorysection;
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
     *         &lt;element name="SECTION-NAME-PREFIX" type="{http://autosar.org/schema/r4.0}SECTION-NAME-PREFIX"/>
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
        "sectionnameprefix"
    })
    public static class SECTIONNAMEPREFIXS {

        @XmlElement(name = "SECTION-NAME-PREFIX")
        protected List<SECTIONNAMEPREFIX> sectionnameprefix;

        /**
         * Gets the value of the sectionnameprefix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sectionnameprefix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSECTIONNAMEPREFIX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SECTIONNAMEPREFIX }
         * 
         * 
         */
        public List<SECTIONNAMEPREFIX> getSECTIONNAMEPREFIX() {
            if (sectionnameprefix == null) {
                sectionnameprefix = new ArrayList<SECTIONNAMEPREFIX>();
            }
            return this.sectionnameprefix;
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
     *         &lt;element name="MEASURED-STACK-USAGE" type="{http://autosar.org/schema/r4.0}MEASURED-STACK-USAGE"/>
     *         &lt;element name="ROUGH-ESTIMATE-STACK-USAGE" type="{http://autosar.org/schema/r4.0}ROUGH-ESTIMATE-STACK-USAGE"/>
     *         &lt;element name="WORST-CASE-STACK-USAGE" type="{http://autosar.org/schema/r4.0}WORST-CASE-STACK-USAGE"/>
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
        "measuredstackusageOrROUGHESTIMATESTACKUSAGEOrWORSTCASESTACKUSAGE"
    })
    public static class STACKUSAGES {

        @XmlElements({
            @XmlElement(name = "MEASURED-STACK-USAGE", type = MEASUREDSTACKUSAGE.class),
            @XmlElement(name = "ROUGH-ESTIMATE-STACK-USAGE", type = ROUGHESTIMATESTACKUSAGE.class),
            @XmlElement(name = "WORST-CASE-STACK-USAGE", type = WORSTCASESTACKUSAGE.class)
        })
        protected List<Object> measuredstackusageOrROUGHESTIMATESTACKUSAGEOrWORSTCASESTACKUSAGE;

        /**
         * Gets the value of the measuredstackusageOrROUGHESTIMATESTACKUSAGEOrWORSTCASESTACKUSAGE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the measuredstackusageOrROUGHESTIMATESTACKUSAGEOrWORSTCASESTACKUSAGE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEASUREDSTACKUSAGEOrROUGHESTIMATESTACKUSAGEOrWORSTCASESTACKUSAGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MEASUREDSTACKUSAGE }
         * {@link ROUGHESTIMATESTACKUSAGE }
         * {@link WORSTCASESTACKUSAGE }
         * 
         * 
         */
        public List<Object> getMEASUREDSTACKUSAGEOrROUGHESTIMATESTACKUSAGEOrWORSTCASESTACKUSAGE() {
            if (measuredstackusageOrROUGHESTIMATESTACKUSAGEOrWORSTCASESTACKUSAGE == null) {
                measuredstackusageOrROUGHESTIMATESTACKUSAGEOrWORSTCASESTACKUSAGE = new ArrayList<Object>();
            }
            return this.measuredstackusageOrROUGHESTIMATESTACKUSAGEOrWORSTCASESTACKUSAGE;
        }

    }

}
