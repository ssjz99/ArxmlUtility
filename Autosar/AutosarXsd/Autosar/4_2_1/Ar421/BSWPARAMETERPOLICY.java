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
 * The perInstanceParameter for which the BSW Scheduler using this policy.
 * 
 * <p>BSW-PARAMETER-POLICY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-PARAMETER-POLICY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-API-OPTIONS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-PARAMETER-POLICY"/>
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
@XmlType(name = "BSW-PARAMETER-POLICY", propOrder = {
    "enabletakeaddress",
    "perinstanceparameterref",
    "variationpoint"
})
public class BSWPARAMETERPOLICY {

    @XmlElement(name = "ENABLE-TAKE-ADDRESS")
    protected BOOLEAN enabletakeaddress;
    @XmlElement(name = "PER-INSTANCE-PARAMETER-REF")
    protected BSWPARAMETERPOLICY.PERINSTANCEPARAMETERREF perinstanceparameterref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??enabletakeaddress?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getENABLETAKEADDRESS() {
        return enabletakeaddress;
    }

    /**
     * ??enabletakeaddress?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setENABLETAKEADDRESS(BOOLEAN value) {
        this.enabletakeaddress = value;
    }

    /**
     * ??perinstanceparameterref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWPARAMETERPOLICY.PERINSTANCEPARAMETERREF }
     *     
     */
    public BSWPARAMETERPOLICY.PERINSTANCEPARAMETERREF getPERINSTANCEPARAMETERREF() {
        return perinstanceparameterref;
    }

    /**
     * ??perinstanceparameterref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWPARAMETERPOLICY.PERINSTANCEPARAMETERREF }
     *     
     */
    public void setPERINSTANCEPARAMETERREF(BSWPARAMETERPOLICY.PERINSTANCEPARAMETERREF value) {
        this.perinstanceparameterref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PARAMETER-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PERINSTANCEPARAMETERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PARAMETERDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PARAMETERDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public PARAMETERDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PARAMETERDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(PARAMETERDATAPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
