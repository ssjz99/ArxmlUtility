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
 * This constraint type restricts the time duration between the occurrence of the stimulus and the occurrence of the corresponding response of that chain.
 * 
 * Two latency constraint types are of interest for automotive systems. These are the age of a certain response and the reaction to a certain stimulus.
 * 
 * In contrast to OffsetTimingConstraint, a causal dependency between the stimulus and response event of the associated event chain is required.
 * 
 * <p>LATENCY-TIMING-CONSTRAINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LATENCY-TIMING-CONSTRAINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRACEABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIMING-CONSTRAINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LATENCY-TIMING-CONSTRAINT"/>
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
@XmlType(name = "LATENCY-TIMING-CONSTRAINT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "tracerefs",
    "variationpoint",
    "latencyconstrainttype",
    "scoperef",
    "minimum",
    "maximum",
    "nominal"
})
public class LATENCYTIMINGCONSTRAINT {

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
    @XmlElement(name = "LATENCY-CONSTRAINT-TYPE")
    protected LATENCYCONSTRAINTTYPEENUM latencyconstrainttype;
    @XmlElement(name = "SCOPE-REF")
    protected LATENCYTIMINGCONSTRAINT.SCOPEREF scoperef;
    @XmlElement(name = "MINIMUM")
    protected MULTIDIMENSIONALTIME minimum;
    @XmlElement(name = "MAXIMUM")
    protected MULTIDIMENSIONALTIME maximum;
    @XmlElement(name = "NOMINAL")
    protected MULTIDIMENSIONALTIME nominal;
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
     * ??latencyconstrainttype?????
     * 
     * @return
     *     possible object is
     *     {@link LATENCYCONSTRAINTTYPEENUM }
     *     
     */
    public LATENCYCONSTRAINTTYPEENUM getLATENCYCONSTRAINTTYPE() {
        return latencyconstrainttype;
    }

    /**
     * ??latencyconstrainttype?????
     * 
     * @param value
     *     allowed object is
     *     {@link LATENCYCONSTRAINTTYPEENUM }
     *     
     */
    public void setLATENCYCONSTRAINTTYPE(LATENCYCONSTRAINTTYPEENUM value) {
        this.latencyconstrainttype = value;
    }

    /**
     * ??scoperef?????
     * 
     * @return
     *     possible object is
     *     {@link LATENCYTIMINGCONSTRAINT.SCOPEREF }
     *     
     */
    public LATENCYTIMINGCONSTRAINT.SCOPEREF getSCOPEREF() {
        return scoperef;
    }

    /**
     * ??scoperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link LATENCYTIMINGCONSTRAINT.SCOPEREF }
     *     
     */
    public void setSCOPEREF(LATENCYTIMINGCONSTRAINT.SCOPEREF value) {
        this.scoperef = value;
    }

    /**
     * ??minimum?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getMINIMUM() {
        return minimum;
    }

    /**
     * ??minimum?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setMINIMUM(MULTIDIMENSIONALTIME value) {
        this.minimum = value;
    }

    /**
     * ??maximum?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getMAXIMUM() {
        return maximum;
    }

    /**
     * ??maximum?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setMAXIMUM(MULTIDIMENSIONALTIME value) {
        this.maximum = value;
    }

    /**
     * ??nominal?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getNOMINAL() {
        return nominal;
    }

    /**
     * ??nominal?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setNOMINAL(MULTIDIMENSIONALTIME value) {
        this.nominal = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TIMING-DESCRIPTION-EVENT-CHAIN--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SCOPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TIMINGDESCRIPTIONEVENTCHAINSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TIMINGDESCRIPTIONEVENTCHAINSUBTYPESENUM }
         *     
         */
        public TIMINGDESCRIPTIONEVENTCHAINSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TIMINGDESCRIPTIONEVENTCHAINSUBTYPESENUM }
         *     
         */
        public void setDEST(TIMINGDESCRIPTIONEVENTCHAINSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
