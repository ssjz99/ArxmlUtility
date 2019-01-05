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
 * <p>DIAGNOSTIC-ENABLE-CONDITION-REF-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-ENABLE-CONDITION-REF-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ENABLE-CONDITION-REF-CONDITIONAL"/>
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
@XmlType(name = "DIAGNOSTIC-ENABLE-CONDITION-REF-CONDITIONAL", propOrder = {
    "diagnosticenableconditionref",
    "variationpoint"
})
public class DIAGNOSTICENABLECONDITIONREFCONDITIONAL {

    @XmlElement(name = "DIAGNOSTIC-ENABLE-CONDITION-REF")
    protected DIAGNOSTICENABLECONDITIONREFCONDITIONAL.DIAGNOSTICENABLECONDITIONREF diagnosticenableconditionref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??diagnosticenableconditionref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICENABLECONDITIONREFCONDITIONAL.DIAGNOSTICENABLECONDITIONREF }
     *     
     */
    public DIAGNOSTICENABLECONDITIONREFCONDITIONAL.DIAGNOSTICENABLECONDITIONREF getDIAGNOSTICENABLECONDITIONREF() {
        return diagnosticenableconditionref;
    }

    /**
     * ??diagnosticenableconditionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICENABLECONDITIONREFCONDITIONAL.DIAGNOSTICENABLECONDITIONREF }
     *     
     */
    public void setDIAGNOSTICENABLECONDITIONREF(DIAGNOSTICENABLECONDITIONREFCONDITIONAL.DIAGNOSTICENABLECONDITIONREF value) {
        this.diagnosticenableconditionref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ENABLE-CONDITION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DIAGNOSTICENABLECONDITIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICENABLECONDITIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICENABLECONDITIONSUBTYPESENUM }
         *     
         */
        public DIAGNOSTICENABLECONDITIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICENABLECONDITIONSUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICENABLECONDITIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
