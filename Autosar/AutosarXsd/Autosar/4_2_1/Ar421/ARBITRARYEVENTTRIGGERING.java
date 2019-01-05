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
 * The ArbitraryEventTriggering describes that an event occurs occasionally, singly, irregularly or randomly.
 * 
 * The primary purpose of this event triggering is to abstract event occurrences captured by data acquisition tools (background debugger, trace analyzer, etc.) during system runtime.
 * 
 * <p>ARBITRARY-EVENT-TRIGGERING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ARBITRARY-EVENT-TRIGGERING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRACEABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIMING-CONSTRAINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EVENT-TRIGGERING-CONSTRAINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ARBITRARY-EVENT-TRIGGERING"/>
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
@XmlType(name = "ARBITRARY-EVENT-TRIGGERING", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "tracerefs",
    "variationpoint",
    "eventref",
    "minimumdistances",
    "maximumdistances",
    "confidenceintervals"
})
public class ARBITRARYEVENTTRIGGERING {

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
    @XmlElement(name = "TRACE-REFS")
    protected Ar421.AGECONSTRAINT.TRACEREFS tracerefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "EVENT-REF")
    protected Ar421.SPORADICEVENTTRIGGERING.EVENTREF eventref;
    @XmlElement(name = "MINIMUM-DISTANCES")
    protected ARBITRARYEVENTTRIGGERING.MINIMUMDISTANCES minimumdistances;
    @XmlElement(name = "MAXIMUM-DISTANCES")
    protected ARBITRARYEVENTTRIGGERING.MAXIMUMDISTANCES maximumdistances;
    @XmlElement(name = "CONFIDENCE-INTERVALS")
    protected ARBITRARYEVENTTRIGGERING.CONFIDENCEINTERVALS confidenceintervals;
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
     * ??tracerefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.AGECONSTRAINT.TRACEREFS }
     *     
     */
    public Ar421.AGECONSTRAINT.TRACEREFS getTRACEREFS() {
        return tracerefs;
    }

    /**
     * ??tracerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.AGECONSTRAINT.TRACEREFS }
     *     
     */
    public void setTRACEREFS(Ar421.AGECONSTRAINT.TRACEREFS value) {
        this.tracerefs = value;
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
     * ??eventref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SPORADICEVENTTRIGGERING.EVENTREF }
     *     
     */
    public Ar421.SPORADICEVENTTRIGGERING.EVENTREF getEVENTREF() {
        return eventref;
    }

    /**
     * ??eventref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SPORADICEVENTTRIGGERING.EVENTREF }
     *     
     */
    public void setEVENTREF(Ar421.SPORADICEVENTTRIGGERING.EVENTREF value) {
        this.eventref = value;
    }

    /**
     * ??minimumdistances?????
     * 
     * @return
     *     possible object is
     *     {@link ARBITRARYEVENTTRIGGERING.MINIMUMDISTANCES }
     *     
     */
    public ARBITRARYEVENTTRIGGERING.MINIMUMDISTANCES getMINIMUMDISTANCES() {
        return minimumdistances;
    }

    /**
     * ??minimumdistances?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARBITRARYEVENTTRIGGERING.MINIMUMDISTANCES }
     *     
     */
    public void setMINIMUMDISTANCES(ARBITRARYEVENTTRIGGERING.MINIMUMDISTANCES value) {
        this.minimumdistances = value;
    }

    /**
     * ??maximumdistances?????
     * 
     * @return
     *     possible object is
     *     {@link ARBITRARYEVENTTRIGGERING.MAXIMUMDISTANCES }
     *     
     */
    public ARBITRARYEVENTTRIGGERING.MAXIMUMDISTANCES getMAXIMUMDISTANCES() {
        return maximumdistances;
    }

    /**
     * ??maximumdistances?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARBITRARYEVENTTRIGGERING.MAXIMUMDISTANCES }
     *     
     */
    public void setMAXIMUMDISTANCES(ARBITRARYEVENTTRIGGERING.MAXIMUMDISTANCES value) {
        this.maximumdistances = value;
    }

    /**
     * ??confidenceintervals?????
     * 
     * @return
     *     possible object is
     *     {@link ARBITRARYEVENTTRIGGERING.CONFIDENCEINTERVALS }
     *     
     */
    public ARBITRARYEVENTTRIGGERING.CONFIDENCEINTERVALS getCONFIDENCEINTERVALS() {
        return confidenceintervals;
    }

    /**
     * ??confidenceintervals?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARBITRARYEVENTTRIGGERING.CONFIDENCEINTERVALS }
     *     
     */
    public void setCONFIDENCEINTERVALS(ARBITRARYEVENTTRIGGERING.CONFIDENCEINTERVALS value) {
        this.confidenceintervals = value;
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
     *         &lt;element name="CONFIDENCE-INTERVAL" type="{http://autosar.org/schema/r4.0}CONFIDENCE-INTERVAL"/>
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
        "confidenceinterval"
    })
    public static class CONFIDENCEINTERVALS {

        @XmlElement(name = "CONFIDENCE-INTERVAL")
        protected List<CONFIDENCEINTERVAL> confidenceinterval;

        /**
         * Gets the value of the confidenceinterval property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the confidenceinterval property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONFIDENCEINTERVAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CONFIDENCEINTERVAL }
         * 
         * 
         */
        public List<CONFIDENCEINTERVAL> getCONFIDENCEINTERVAL() {
            if (confidenceinterval == null) {
                confidenceinterval = new ArrayList<CONFIDENCEINTERVAL>();
            }
            return this.confidenceinterval;
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
     *         &lt;element name="TIME-VALUE" type="{http://autosar.org/schema/r4.0}MULTIDIMENSIONAL-TIME"/>
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
        "timevalue"
    })
    public static class MAXIMUMDISTANCES {

        @XmlElement(name = "TIME-VALUE")
        protected List<MULTIDIMENSIONALTIME> timevalue;

        /**
         * Gets the value of the timevalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timevalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTIMEVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MULTIDIMENSIONALTIME }
         * 
         * 
         */
        public List<MULTIDIMENSIONALTIME> getTIMEVALUE() {
            if (timevalue == null) {
                timevalue = new ArrayList<MULTIDIMENSIONALTIME>();
            }
            return this.timevalue;
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
     *         &lt;element name="TIME-VALUE" type="{http://autosar.org/schema/r4.0}MULTIDIMENSIONAL-TIME"/>
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
        "timevalue"
    })
    public static class MINIMUMDISTANCES {

        @XmlElement(name = "TIME-VALUE")
        protected List<MULTIDIMENSIONALTIME> timevalue;

        /**
         * Gets the value of the timevalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timevalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTIMEVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MULTIDIMENSIONALTIME }
         * 
         * 
         */
        public List<MULTIDIMENSIONALTIME> getTIMEVALUE() {
            if (timevalue == null) {
                timevalue = new ArrayList<MULTIDIMENSIONALTIME>();
            }
            return this.timevalue;
        }

    }

}
