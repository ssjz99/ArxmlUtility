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
 * The IoHwAbstractionServerAnnotation will only be used from a sensor- or an actuator component while interacting with the IoHwAbstraction layer.
 * 
 * Note that the "server" in the name of this meta-class is not meant to restrict the usage to ClientServerInterfaces.
 * 
 * <p>IO-HW-ABSTRACTION-SERVER-ANNOTATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="IO-HW-ABSTRACTION-SERVER-ANNOTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}GENERAL-ANNOTATION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IO-HW-ABSTRACTION-SERVER-ANNOTATION"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IO-HW-ABSTRACTION-SERVER-ANNOTATION", propOrder = {
    "label",
    "annotationorigin",
    "annotationtext",
    "age",
    "argumentref",
    "bswresolution",
    "dataelementref",
    "failuremonitoringref",
    "filteringdebouncing",
    "pulsetest",
    "triggerref"
})
public class IOHWABSTRACTIONSERVERANNOTATION {

    @XmlElement(name = "LABEL")
    protected MULTILANGUAGELONGNAME label;
    @XmlElement(name = "ANNOTATION-ORIGIN")
    protected STRING annotationorigin;
    @XmlElement(name = "ANNOTATION-TEXT")
    protected DOCUMENTATIONBLOCK annotationtext;
    @XmlElement(name = "AGE")
    protected MULTIDIMENSIONALTIME age;
    @XmlElement(name = "ARGUMENT-REF")
    protected IOHWABSTRACTIONSERVERANNOTATION.ARGUMENTREF argumentref;
    @XmlElement(name = "BSW-RESOLUTION")
    protected FLOAT bswresolution;
    @XmlElement(name = "DATA-ELEMENT-REF")
    protected IOHWABSTRACTIONSERVERANNOTATION.DATAELEMENTREF dataelementref;
    @XmlElement(name = "FAILURE-MONITORING-REF")
    protected IOHWABSTRACTIONSERVERANNOTATION.FAILUREMONITORINGREF failuremonitoringref;
    @XmlElement(name = "FILTERING-DEBOUNCING")
    protected FILTERDEBOUNCINGENUM filteringdebouncing;
    @XmlElement(name = "PULSE-TEST")
    protected PULSETESTENUM pulsetest;
    @XmlElement(name = "TRIGGER-REF")
    protected IOHWABSTRACTIONSERVERANNOTATION.TRIGGERREF triggerref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??label?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public MULTILANGUAGELONGNAME getLABEL() {
        return label;
    }

    /**
     * ??label?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public void setLABEL(MULTILANGUAGELONGNAME value) {
        this.label = value;
    }

    /**
     * ??annotationorigin?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getANNOTATIONORIGIN() {
        return annotationorigin;
    }

    /**
     * ??annotationorigin?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setANNOTATIONORIGIN(STRING value) {
        this.annotationorigin = value;
    }

    /**
     * ??annotationtext?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getANNOTATIONTEXT() {
        return annotationtext;
    }

    /**
     * ??annotationtext?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setANNOTATIONTEXT(DOCUMENTATIONBLOCK value) {
        this.annotationtext = value;
    }

    /**
     * ??age?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getAGE() {
        return age;
    }

    /**
     * ??age?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setAGE(MULTIDIMENSIONALTIME value) {
        this.age = value;
    }

    /**
     * ??argumentref?????
     * 
     * @return
     *     possible object is
     *     {@link IOHWABSTRACTIONSERVERANNOTATION.ARGUMENTREF }
     *     
     */
    public IOHWABSTRACTIONSERVERANNOTATION.ARGUMENTREF getARGUMENTREF() {
        return argumentref;
    }

    /**
     * ??argumentref?????
     * 
     * @param value
     *     allowed object is
     *     {@link IOHWABSTRACTIONSERVERANNOTATION.ARGUMENTREF }
     *     
     */
    public void setARGUMENTREF(IOHWABSTRACTIONSERVERANNOTATION.ARGUMENTREF value) {
        this.argumentref = value;
    }

    /**
     * ??bswresolution?????
     * 
     * @return
     *     possible object is
     *     {@link FLOAT }
     *     
     */
    public FLOAT getBSWRESOLUTION() {
        return bswresolution;
    }

    /**
     * ??bswresolution?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLOAT }
     *     
     */
    public void setBSWRESOLUTION(FLOAT value) {
        this.bswresolution = value;
    }

    /**
     * ??dataelementref?????
     * 
     * @return
     *     possible object is
     *     {@link IOHWABSTRACTIONSERVERANNOTATION.DATAELEMENTREF }
     *     
     */
    public IOHWABSTRACTIONSERVERANNOTATION.DATAELEMENTREF getDATAELEMENTREF() {
        return dataelementref;
    }

    /**
     * ??dataelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link IOHWABSTRACTIONSERVERANNOTATION.DATAELEMENTREF }
     *     
     */
    public void setDATAELEMENTREF(IOHWABSTRACTIONSERVERANNOTATION.DATAELEMENTREF value) {
        this.dataelementref = value;
    }

    /**
     * ??failuremonitoringref?????
     * 
     * @return
     *     possible object is
     *     {@link IOHWABSTRACTIONSERVERANNOTATION.FAILUREMONITORINGREF }
     *     
     */
    public IOHWABSTRACTIONSERVERANNOTATION.FAILUREMONITORINGREF getFAILUREMONITORINGREF() {
        return failuremonitoringref;
    }

    /**
     * ??failuremonitoringref?????
     * 
     * @param value
     *     allowed object is
     *     {@link IOHWABSTRACTIONSERVERANNOTATION.FAILUREMONITORINGREF }
     *     
     */
    public void setFAILUREMONITORINGREF(IOHWABSTRACTIONSERVERANNOTATION.FAILUREMONITORINGREF value) {
        this.failuremonitoringref = value;
    }

    /**
     * ??filteringdebouncing?????
     * 
     * @return
     *     possible object is
     *     {@link FILTERDEBOUNCINGENUM }
     *     
     */
    public FILTERDEBOUNCINGENUM getFILTERINGDEBOUNCING() {
        return filteringdebouncing;
    }

    /**
     * ??filteringdebouncing?????
     * 
     * @param value
     *     allowed object is
     *     {@link FILTERDEBOUNCINGENUM }
     *     
     */
    public void setFILTERINGDEBOUNCING(FILTERDEBOUNCINGENUM value) {
        this.filteringdebouncing = value;
    }

    /**
     * ??pulsetest?????
     * 
     * @return
     *     possible object is
     *     {@link PULSETESTENUM }
     *     
     */
    public PULSETESTENUM getPULSETEST() {
        return pulsetest;
    }

    /**
     * ??pulsetest?????
     * 
     * @param value
     *     allowed object is
     *     {@link PULSETESTENUM }
     *     
     */
    public void setPULSETEST(PULSETESTENUM value) {
        this.pulsetest = value;
    }

    /**
     * ??triggerref?????
     * 
     * @return
     *     possible object is
     *     {@link IOHWABSTRACTIONSERVERANNOTATION.TRIGGERREF }
     *     
     */
    public IOHWABSTRACTIONSERVERANNOTATION.TRIGGERREF getTRIGGERREF() {
        return triggerref;
    }

    /**
     * ??triggerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link IOHWABSTRACTIONSERVERANNOTATION.TRIGGERREF }
     *     
     */
    public void setTRIGGERREF(IOHWABSTRACTIONSERVERANNOTATION.TRIGGERREF value) {
        this.triggerref = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ARGUMENT-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ARGUMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ARGUMENTDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ARGUMENTDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public ARGUMENTDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ARGUMENTDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(ARGUMENTDATAPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DATAELEMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected VARIABLEDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public VARIABLEDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(VARIABLEDATAPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FAILUREMONITORINGREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PORTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public PORTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(PORTPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TRIGGER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TRIGGERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TRIGGERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TRIGGERSUBTYPESENUM }
         *     
         */
        public TRIGGERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TRIGGERSUBTYPESENUM }
         *     
         */
        public void setDEST(TRIGGERSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
