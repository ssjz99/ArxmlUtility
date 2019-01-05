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
 * <p>R-VARIABLE-IN-ATOMIC-SWC-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="R-VARIABLE-IN-ATOMIC-SWC-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}VARIABLE-IN-ATOMIC-SWC-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}R-VARIABLE-IN-ATOMIC-SWC-INSTANCE-REF"/>
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
@XmlType(name = "R-VARIABLE-IN-ATOMIC-SWC-INSTANCE-REF", propOrder = {
    "contextrportref",
    "targetdataelementref"
})
public class RVARIABLEINATOMICSWCINSTANCEREF {

    @XmlElement(name = "CONTEXT-R-PORT-REF")
    protected RVARIABLEINATOMICSWCINSTANCEREF.CONTEXTRPORTREF contextrportref;
    @XmlElement(name = "TARGET-DATA-ELEMENT-REF")
    protected RVARIABLEINATOMICSWCINSTANCEREF.TARGETDATAELEMENTREF targetdataelementref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextrportref?????
     * 
     * @return
     *     possible object is
     *     {@link RVARIABLEINATOMICSWCINSTANCEREF.CONTEXTRPORTREF }
     *     
     */
    public RVARIABLEINATOMICSWCINSTANCEREF.CONTEXTRPORTREF getCONTEXTRPORTREF() {
        return contextrportref;
    }

    /**
     * ??contextrportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RVARIABLEINATOMICSWCINSTANCEREF.CONTEXTRPORTREF }
     *     
     */
    public void setCONTEXTRPORTREF(RVARIABLEINATOMICSWCINSTANCEREF.CONTEXTRPORTREF value) {
        this.contextrportref = value;
    }

    /**
     * ??targetdataelementref?????
     * 
     * @return
     *     possible object is
     *     {@link RVARIABLEINATOMICSWCINSTANCEREF.TARGETDATAELEMENTREF }
     *     
     */
    public RVARIABLEINATOMICSWCINSTANCEREF.TARGETDATAELEMENTREF getTARGETDATAELEMENTREF() {
        return targetdataelementref;
    }

    /**
     * ??targetdataelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RVARIABLEINATOMICSWCINSTANCEREF.TARGETDATAELEMENTREF }
     *     
     */
    public void setTARGETDATAELEMENTREF(RVARIABLEINATOMICSWCINSTANCEREF.TARGETDATAELEMENTREF value) {
        this.targetdataelementref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ABSTRACT-REQUIRED-PORT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTRPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM value) {
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
    public static class TARGETDATAELEMENTREF
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

}
