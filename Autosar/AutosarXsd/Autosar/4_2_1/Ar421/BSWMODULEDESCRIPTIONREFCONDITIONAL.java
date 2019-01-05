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
 * <p>BSW-MODULE-DESCRIPTION-REF-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-MODULE-DESCRIPTION-REF-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-MODULE-DESCRIPTION-REF-CONDITIONAL"/>
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
@XmlType(name = "BSW-MODULE-DESCRIPTION-REF-CONDITIONAL", propOrder = {
    "bswmoduledescriptionref",
    "variationpoint"
})
public class BSWMODULEDESCRIPTIONREFCONDITIONAL {

    @XmlElement(name = "BSW-MODULE-DESCRIPTION-REF")
    protected BSWMODULEDESCRIPTIONREFCONDITIONAL.BSWMODULEDESCRIPTIONREF bswmoduledescriptionref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??bswmoduledescriptionref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTIONREFCONDITIONAL.BSWMODULEDESCRIPTIONREF }
     *     
     */
    public BSWMODULEDESCRIPTIONREFCONDITIONAL.BSWMODULEDESCRIPTIONREF getBSWMODULEDESCRIPTIONREF() {
        return bswmoduledescriptionref;
    }

    /**
     * ??bswmoduledescriptionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTIONREFCONDITIONAL.BSWMODULEDESCRIPTIONREF }
     *     
     */
    public void setBSWMODULEDESCRIPTIONREF(BSWMODULEDESCRIPTIONREFCONDITIONAL.BSWMODULEDESCRIPTIONREF value) {
        this.bswmoduledescriptionref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-MODULE-DESCRIPTION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BSWMODULEDESCRIPTIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWMODULEDESCRIPTIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWMODULEDESCRIPTIONSUBTYPESENUM }
         *     
         */
        public BSWMODULEDESCRIPTIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWMODULEDESCRIPTIONSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWMODULEDESCRIPTIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}