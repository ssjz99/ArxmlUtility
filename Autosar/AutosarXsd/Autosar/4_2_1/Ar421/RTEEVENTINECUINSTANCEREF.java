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
 * <p>RTE-EVENT-IN-ECU-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="RTE-EVENT-IN-ECU-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RTE-EVENT-IN-ECU-INSTANCE-REF"/>
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
@XmlType(name = "RTE-EVENT-IN-ECU-INSTANCE-REF", propOrder = {
    "contextrootcompositionref",
    "contextatomiccomponentref",
    "targetrteeventref"
})
public class RTEEVENTINECUINSTANCEREF {

    @XmlElement(name = "CONTEXT-ROOT-COMPOSITION-REF")
    protected RTEEVENTINECUINSTANCEREF.CONTEXTROOTCOMPOSITIONREF contextrootcompositionref;
    @XmlElement(name = "CONTEXT-ATOMIC-COMPONENT-REF")
    protected RTEEVENTINECUINSTANCEREF.CONTEXTATOMICCOMPONENTREF contextatomiccomponentref;
    @XmlElement(name = "TARGET-RTE-EVENT-REF")
    protected RTEEVENTINECUINSTANCEREF.TARGETRTEEVENTREF targetrteeventref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextrootcompositionref?????
     * 
     * @return
     *     possible object is
     *     {@link RTEEVENTINECUINSTANCEREF.CONTEXTROOTCOMPOSITIONREF }
     *     
     */
    public RTEEVENTINECUINSTANCEREF.CONTEXTROOTCOMPOSITIONREF getCONTEXTROOTCOMPOSITIONREF() {
        return contextrootcompositionref;
    }

    /**
     * ??contextrootcompositionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RTEEVENTINECUINSTANCEREF.CONTEXTROOTCOMPOSITIONREF }
     *     
     */
    public void setCONTEXTROOTCOMPOSITIONREF(RTEEVENTINECUINSTANCEREF.CONTEXTROOTCOMPOSITIONREF value) {
        this.contextrootcompositionref = value;
    }

    /**
     * ??contextatomiccomponentref?????
     * 
     * @return
     *     possible object is
     *     {@link RTEEVENTINECUINSTANCEREF.CONTEXTATOMICCOMPONENTREF }
     *     
     */
    public RTEEVENTINECUINSTANCEREF.CONTEXTATOMICCOMPONENTREF getCONTEXTATOMICCOMPONENTREF() {
        return contextatomiccomponentref;
    }

    /**
     * ??contextatomiccomponentref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RTEEVENTINECUINSTANCEREF.CONTEXTATOMICCOMPONENTREF }
     *     
     */
    public void setCONTEXTATOMICCOMPONENTREF(RTEEVENTINECUINSTANCEREF.CONTEXTATOMICCOMPONENTREF value) {
        this.contextatomiccomponentref = value;
    }

    /**
     * ??targetrteeventref?????
     * 
     * @return
     *     possible object is
     *     {@link RTEEVENTINECUINSTANCEREF.TARGETRTEEVENTREF }
     *     
     */
    public RTEEVENTINECUINSTANCEREF.TARGETRTEEVENTREF getTARGETRTEEVENTREF() {
        return targetrteeventref;
    }

    /**
     * ??targetrteeventref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RTEEVENTINECUINSTANCEREF.TARGETRTEEVENTREF }
     *     
     */
    public void setTARGETRTEEVENTREF(RTEEVENTINECUINSTANCEREF.TARGETRTEEVENTREF value) {
        this.targetrteeventref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-COMPONENT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTATOMICCOMPONENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWCOMPONENTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWCOMPONENTPROTOTYPESUBTYPESENUM }
         *     
         */
        public SWCOMPONENTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWCOMPONENTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(SWCOMPONENTPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ROOT-SW-COMPOSITION-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTROOTCOMPOSITIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM }
         *     
         */
        public ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}RTE-EVENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETRTEEVENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected RTEEVENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link RTEEVENTSUBTYPESENUM }
         *     
         */
        public RTEEVENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link RTEEVENTSUBTYPESENUM }
         *     
         */
        public void setDEST(RTEEVENTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
