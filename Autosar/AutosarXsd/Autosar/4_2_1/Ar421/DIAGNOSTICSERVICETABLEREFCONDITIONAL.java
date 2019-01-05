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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>DIAGNOSTIC-SERVICE-TABLE-REF-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-SERVICE-TABLE-REF-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-TABLE-REF-CONDITIONAL"/>
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
@XmlType(name = "DIAGNOSTIC-SERVICE-TABLE-REF-CONDITIONAL", propOrder = {
    "diagnosticservicetableref",
    "variationpoint"
})
public class DIAGNOSTICSERVICETABLEREFCONDITIONAL {

    @XmlElement(name = "DIAGNOSTIC-SERVICE-TABLE-REF")
    protected DIAGNOSTICSERVICETABLEREFCONDITIONAL.DIAGNOSTICSERVICETABLEREF diagnosticservicetableref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??diagnosticservicetableref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICSERVICETABLEREFCONDITIONAL.DIAGNOSTICSERVICETABLEREF }
     *     
     */
    public DIAGNOSTICSERVICETABLEREFCONDITIONAL.DIAGNOSTICSERVICETABLEREF getDIAGNOSTICSERVICETABLEREF() {
        return diagnosticservicetableref;
    }

    /**
     * ??diagnosticservicetableref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICSERVICETABLEREFCONDITIONAL.DIAGNOSTICSERVICETABLEREF }
     *     
     */
    public void setDIAGNOSTICSERVICETABLEREF(DIAGNOSTICSERVICETABLEREFCONDITIONAL.DIAGNOSTICSERVICETABLEREF value) {
        this.diagnosticservicetableref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-TABLE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DIAGNOSTICSERVICETABLEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICSERVICETABLESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICSERVICETABLESUBTYPESENUM }
         *     
         */
        public DIAGNOSTICSERVICETABLESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICSERVICETABLESUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICSERVICETABLESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
