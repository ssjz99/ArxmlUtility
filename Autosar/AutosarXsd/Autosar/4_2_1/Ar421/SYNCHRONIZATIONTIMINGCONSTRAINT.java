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
 * This constraint is used to restrict the timing behavior of different, but correlated events or event chains, with regard to synchronization.
 * 
 * Thereby, in case of imposing a synchronization timing constraint on events or event chains the following two scenarios are supported:
 * 
 *  1) [synchronizationConstraintType=responseSynchronization] Events: An arbitrary number of correlated events which play the role of responses shall occur synchronously with respect to a predefined tolerance. Event Chains: An arbitrary number of correlated event chains with a common stimulus, but different responses, where the responses shall occur synchronously with respect to a predefined tolerance.
 * 
 *  2) [synchronizationConstraintType=stimulusSynchronization] Events: An arbitrary number of correlated events which play the role of stimuli shall occur synchronously with respect to a predefined tolerance. Event Chains: An arbitrary number of correlated event chains with a common response, but different stimuli, where the stimuli shall occur synchronously with respect to a predefined tolerance.
 * 
 * In case of imposing a synchronization timing constraint on events the following two scenarios are supported:
 * 
 *  1) [eventOccurrenceKind=singleOccurrence] Any of the events shall occur only once in the given time interval.
 * 
 *  2) [eventOccurrenceKind=multipleOccurrences] Any of the events may occur more than once in the given time interval. In other words multiple occurrences of an event within the given time interval are permitted.
 * 
 * <p>SYNCHRONIZATION-TIMING-CONSTRAINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SYNCHRONIZATION-TIMING-CONSTRAINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRACEABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIMING-CONSTRAINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SYNCHRONIZATION-TIMING-CONSTRAINT"/>
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
@XmlType(name = "SYNCHRONIZATION-TIMING-CONSTRAINT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "tracerefs",
    "variationpoint",
    "eventoccurrencekind",
    "scopeeventrefs",
    "scoperefs",
    "synchronizationconstrainttype",
    "tolerance"
})
public class SYNCHRONIZATIONTIMINGCONSTRAINT {

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
    @XmlElement(name = "EVENT-OCCURRENCE-KIND")
    protected EVENTOCCURRENCEKINDENUM eventoccurrencekind;
    @XmlElement(name = "SCOPE-EVENT-REFS")
    protected SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEEVENTREFS scopeeventrefs;
    @XmlElement(name = "SCOPE-REFS")
    protected SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEREFS scoperefs;
    @XmlElement(name = "SYNCHRONIZATION-CONSTRAINT-TYPE")
    protected SYNCHRONIZATIONTYPEENUM synchronizationconstrainttype;
    @XmlElement(name = "TOLERANCE")
    protected MULTIDIMENSIONALTIME tolerance;
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
     * ??eventoccurrencekind?????
     * 
     * @return
     *     possible object is
     *     {@link EVENTOCCURRENCEKINDENUM }
     *     
     */
    public EVENTOCCURRENCEKINDENUM getEVENTOCCURRENCEKIND() {
        return eventoccurrencekind;
    }

    /**
     * ??eventoccurrencekind?????
     * 
     * @param value
     *     allowed object is
     *     {@link EVENTOCCURRENCEKINDENUM }
     *     
     */
    public void setEVENTOCCURRENCEKIND(EVENTOCCURRENCEKINDENUM value) {
        this.eventoccurrencekind = value;
    }

    /**
     * ??scopeeventrefs?????
     * 
     * @return
     *     possible object is
     *     {@link SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEEVENTREFS }
     *     
     */
    public SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEEVENTREFS getSCOPEEVENTREFS() {
        return scopeeventrefs;
    }

    /**
     * ??scopeeventrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEEVENTREFS }
     *     
     */
    public void setSCOPEEVENTREFS(SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEEVENTREFS value) {
        this.scopeeventrefs = value;
    }

    /**
     * ??scoperefs?????
     * 
     * @return
     *     possible object is
     *     {@link SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEREFS }
     *     
     */
    public SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEREFS getSCOPEREFS() {
        return scoperefs;
    }

    /**
     * ??scoperefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEREFS }
     *     
     */
    public void setSCOPEREFS(SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEREFS value) {
        this.scoperefs = value;
    }

    /**
     * ??synchronizationconstrainttype?????
     * 
     * @return
     *     possible object is
     *     {@link SYNCHRONIZATIONTYPEENUM }
     *     
     */
    public SYNCHRONIZATIONTYPEENUM getSYNCHRONIZATIONCONSTRAINTTYPE() {
        return synchronizationconstrainttype;
    }

    /**
     * ??synchronizationconstrainttype?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYNCHRONIZATIONTYPEENUM }
     *     
     */
    public void setSYNCHRONIZATIONCONSTRAINTTYPE(SYNCHRONIZATIONTYPEENUM value) {
        this.synchronizationconstrainttype = value;
    }

    /**
     * ??tolerance?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getTOLERANCE() {
        return tolerance;
    }

    /**
     * ??tolerance?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setTOLERANCE(MULTIDIMENSIONALTIME value) {
        this.tolerance = value;
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
     *         &lt;element name="SCOPE-EVENT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TIMING-DESCRIPTION-EVENT--SUBTYPES-ENUM" />
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
        "scopeeventref"
    })
    public static class SCOPEEVENTREFS {

        @XmlElement(name = "SCOPE-EVENT-REF")
        protected List<SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEEVENTREFS.SCOPEEVENTREF> scopeeventref;

        /**
         * Gets the value of the scopeeventref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scopeeventref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSCOPEEVENTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEEVENTREFS.SCOPEEVENTREF }
         * 
         * 
         */
        public List<SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEEVENTREFS.SCOPEEVENTREF> getSCOPEEVENTREF() {
            if (scopeeventref == null) {
                scopeeventref = new ArrayList<SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEEVENTREFS.SCOPEEVENTREF>();
            }
            return this.scopeeventref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TIMING-DESCRIPTION-EVENT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SCOPEEVENTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected TIMINGDESCRIPTIONEVENTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link TIMINGDESCRIPTIONEVENTSUBTYPESENUM }
             *     
             */
            public TIMINGDESCRIPTIONEVENTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link TIMINGDESCRIPTIONEVENTSUBTYPESENUM }
             *     
             */
            public void setDEST(TIMINGDESCRIPTIONEVENTSUBTYPESENUM value) {
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
     *         &lt;element name="SCOPE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TIMING-DESCRIPTION-EVENT-CHAIN--SUBTYPES-ENUM" />
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
        "scoperef"
    })
    public static class SCOPEREFS {

        @XmlElement(name = "SCOPE-REF")
        protected List<SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEREFS.SCOPEREF> scoperef;

        /**
         * Gets the value of the scoperef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scoperef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSCOPEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEREFS.SCOPEREF }
         * 
         * 
         */
        public List<SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEREFS.SCOPEREF> getSCOPEREF() {
            if (scoperef == null) {
                scoperef = new ArrayList<SYNCHRONIZATIONTIMINGCONSTRAINT.SCOPEREFS.SCOPEREF>();
            }
            return this.scoperef;
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

}
