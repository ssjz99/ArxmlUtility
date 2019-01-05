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
 * <p>DIAGNOSTIC-COMMON-ELEMENT-REF-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-COMMON-ELEMENT-REF-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-ELEMENT-REF-CONDITIONAL"/>
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
@XmlType(name = "DIAGNOSTIC-COMMON-ELEMENT-REF-CONDITIONAL", propOrder = {
    "diagnosticcommonelementref",
    "variationpoint"
})
public class DIAGNOSTICCOMMONELEMENTREFCONDITIONAL {

    @XmlElement(name = "DIAGNOSTIC-COMMON-ELEMENT-REF")
    protected DIAGNOSTICCOMMONELEMENTREFCONDITIONAL.DIAGNOSTICCOMMONELEMENTREF diagnosticcommonelementref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??diagnosticcommonelementref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCOMMONELEMENTREFCONDITIONAL.DIAGNOSTICCOMMONELEMENTREF }
     *     
     */
    public DIAGNOSTICCOMMONELEMENTREFCONDITIONAL.DIAGNOSTICCOMMONELEMENTREF getDIAGNOSTICCOMMONELEMENTREF() {
        return diagnosticcommonelementref;
    }

    /**
     * ??diagnosticcommonelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCOMMONELEMENTREFCONDITIONAL.DIAGNOSTICCOMMONELEMENTREF }
     *     
     */
    public void setDIAGNOSTICCOMMONELEMENTREF(DIAGNOSTICCOMMONELEMENTREFCONDITIONAL.DIAGNOSTICCOMMONELEMENTREF value) {
        this.diagnosticcommonelementref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DIAGNOSTICCOMMONELEMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICCOMMONELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICCOMMONELEMENTSUBTYPESENUM }
         *     
         */
        public DIAGNOSTICCOMMONELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICCOMMONELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICCOMMONELEMENTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
