//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A BurstPatternEventTriggering describes the maximum number of occurrences of the same event in a given time interval.
 * This is typically used to model a worst case activation scenario.
 * 
 * <p>BURST-PATTERN-EVENT-TRIGGERING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BURST-PATTERN-EVENT-TRIGGERING">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BURST-PATTERN-EVENT-TRIGGERING"/>
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
@XmlType(name = "BURST-PATTERN-EVENT-TRIGGERING", propOrder = {
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
    "maxnumberofoccurrences",
    "minimuminterarrivaltime",
    "patternjitter",
    "patternlength",
    "patternperiod",
    "minnumberofoccurrences"
})
public class BURSTPATTERNEVENTTRIGGERING {

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
    @XmlElement(name = "MAX-NUMBER-OF-OCCURRENCES")
    protected POSITIVEINTEGER maxnumberofoccurrences;
    @XmlElement(name = "MINIMUM-INTER-ARRIVAL-TIME")
    protected MULTIDIMENSIONALTIME minimuminterarrivaltime;
    @XmlElement(name = "PATTERN-JITTER")
    protected MULTIDIMENSIONALTIME patternjitter;
    @XmlElement(name = "PATTERN-LENGTH")
    protected MULTIDIMENSIONALTIME patternlength;
    @XmlElement(name = "PATTERN-PERIOD")
    protected MULTIDIMENSIONALTIME patternperiod;
    @XmlElement(name = "MIN-NUMBER-OF-OCCURRENCES")
    protected POSITIVEINTEGER minnumberofoccurrences;
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
     * ??maxnumberofoccurrences?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXNUMBEROFOCCURRENCES() {
        return maxnumberofoccurrences;
    }

    /**
     * ??maxnumberofoccurrences?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXNUMBEROFOCCURRENCES(POSITIVEINTEGER value) {
        this.maxnumberofoccurrences = value;
    }

    /**
     * ??minimuminterarrivaltime?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getMINIMUMINTERARRIVALTIME() {
        return minimuminterarrivaltime;
    }

    /**
     * ??minimuminterarrivaltime?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setMINIMUMINTERARRIVALTIME(MULTIDIMENSIONALTIME value) {
        this.minimuminterarrivaltime = value;
    }

    /**
     * ??patternjitter?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getPATTERNJITTER() {
        return patternjitter;
    }

    /**
     * ??patternjitter?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setPATTERNJITTER(MULTIDIMENSIONALTIME value) {
        this.patternjitter = value;
    }

    /**
     * ??patternlength?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getPATTERNLENGTH() {
        return patternlength;
    }

    /**
     * ??patternlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setPATTERNLENGTH(MULTIDIMENSIONALTIME value) {
        this.patternlength = value;
    }

    /**
     * ??patternperiod?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getPATTERNPERIOD() {
        return patternperiod;
    }

    /**
     * ??patternperiod?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setPATTERNPERIOD(MULTIDIMENSIONALTIME value) {
        this.patternperiod = value;
    }

    /**
     * ??minnumberofoccurrences?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMINNUMBEROFOCCURRENCES() {
        return minnumberofoccurrences;
    }

    /**
     * ??minnumberofoccurrences?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMINNUMBEROFOCCURRENCES(POSITIVEINTEGER value) {
        this.minnumberofoccurrences = value;
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

}
