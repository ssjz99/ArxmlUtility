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
 * <p>VARIABLE-ACCESS-IN-ECU-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="VARIABLE-ACCESS-IN-ECU-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}VARIABLE-ACCESS-IN-ECU-INSTANCE-REF"/>
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
@XmlType(name = "VARIABLE-ACCESS-IN-ECU-INSTANCE-REF", propOrder = {
    "contextrootcompositionref",
    "contextatomiccomponentref",
    "targetvariableaccessref"
})
public class VARIABLEACCESSINECUINSTANCEREF {

    @XmlElement(name = "CONTEXT-ROOT-COMPOSITION-REF")
    protected VARIABLEACCESSINECUINSTANCEREF.CONTEXTROOTCOMPOSITIONREF contextrootcompositionref;
    @XmlElement(name = "CONTEXT-ATOMIC-COMPONENT-REF")
    protected VARIABLEACCESSINECUINSTANCEREF.CONTEXTATOMICCOMPONENTREF contextatomiccomponentref;
    @XmlElement(name = "TARGET-VARIABLE-ACCESS-REF")
    protected VARIABLEACCESSINECUINSTANCEREF.TARGETVARIABLEACCESSREF targetvariableaccessref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextrootcompositionref?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEACCESSINECUINSTANCEREF.CONTEXTROOTCOMPOSITIONREF }
     *     
     */
    public VARIABLEACCESSINECUINSTANCEREF.CONTEXTROOTCOMPOSITIONREF getCONTEXTROOTCOMPOSITIONREF() {
        return contextrootcompositionref;
    }

    /**
     * ??contextrootcompositionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEACCESSINECUINSTANCEREF.CONTEXTROOTCOMPOSITIONREF }
     *     
     */
    public void setCONTEXTROOTCOMPOSITIONREF(VARIABLEACCESSINECUINSTANCEREF.CONTEXTROOTCOMPOSITIONREF value) {
        this.contextrootcompositionref = value;
    }

    /**
     * ??contextatomiccomponentref?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEACCESSINECUINSTANCEREF.CONTEXTATOMICCOMPONENTREF }
     *     
     */
    public VARIABLEACCESSINECUINSTANCEREF.CONTEXTATOMICCOMPONENTREF getCONTEXTATOMICCOMPONENTREF() {
        return contextatomiccomponentref;
    }

    /**
     * ??contextatomiccomponentref?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEACCESSINECUINSTANCEREF.CONTEXTATOMICCOMPONENTREF }
     *     
     */
    public void setCONTEXTATOMICCOMPONENTREF(VARIABLEACCESSINECUINSTANCEREF.CONTEXTATOMICCOMPONENTREF value) {
        this.contextatomiccomponentref = value;
    }

    /**
     * ??targetvariableaccessref?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEACCESSINECUINSTANCEREF.TARGETVARIABLEACCESSREF }
     *     
     */
    public VARIABLEACCESSINECUINSTANCEREF.TARGETVARIABLEACCESSREF getTARGETVARIABLEACCESSREF() {
        return targetvariableaccessref;
    }

    /**
     * ??targetvariableaccessref?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEACCESSINECUINSTANCEREF.TARGETVARIABLEACCESSREF }
     *     
     */
    public void setTARGETVARIABLEACCESSREF(VARIABLEACCESSINECUINSTANCEREF.TARGETVARIABLEACCESSREF value) {
        this.targetvariableaccessref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}VARIABLE-ACCESS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETVARIABLEACCESSREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected VARIABLEACCESSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link VARIABLEACCESSSUBTYPESENUM }
         *     
         */
        public VARIABLEACCESSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link VARIABLEACCESSSUBTYPESENUM }
         *     
         */
        public void setDEST(VARIABLEACCESSSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
