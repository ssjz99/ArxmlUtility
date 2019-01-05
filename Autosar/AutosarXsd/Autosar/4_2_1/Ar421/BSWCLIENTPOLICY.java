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
 * The requiredClientServerEntry for which the BSW Scheduler using this policy.
 * 
 * <p>BSW-CLIENT-POLICY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-CLIENT-POLICY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-API-OPTIONS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-CLIENT-POLICY"/>
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
@XmlType(name = "BSW-CLIENT-POLICY", propOrder = {
    "enabletakeaddress",
    "requiredclientserverentryref",
    "variationpoint"
})
public class BSWCLIENTPOLICY {

    @XmlElement(name = "ENABLE-TAKE-ADDRESS")
    protected BOOLEAN enabletakeaddress;
    @XmlElement(name = "REQUIRED-CLIENT-SERVER-ENTRY-REF")
    protected BSWCLIENTPOLICY.REQUIREDCLIENTSERVERENTRYREF requiredclientserverentryref;
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
     * ??requiredclientserverentryref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWCLIENTPOLICY.REQUIREDCLIENTSERVERENTRYREF }
     *     
     */
    public BSWCLIENTPOLICY.REQUIREDCLIENTSERVERENTRYREF getREQUIREDCLIENTSERVERENTRYREF() {
        return requiredclientserverentryref;
    }

    /**
     * ??requiredclientserverentryref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWCLIENTPOLICY.REQUIREDCLIENTSERVERENTRYREF }
     *     
     */
    public void setREQUIREDCLIENTSERVERENTRYREF(BSWCLIENTPOLICY.REQUIREDCLIENTSERVERENTRYREF value) {
        this.requiredclientserverentryref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-MODULE-CLIENT-SERVER-ENTRY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class REQUIREDCLIENTSERVERENTRYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWMODULECLIENTSERVERENTRYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWMODULECLIENTSERVERENTRYSUBTYPESENUM }
         *     
         */
        public BSWMODULECLIENTSERVERENTRYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWMODULECLIENTSERVERENTRYSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWMODULECLIENTSERVERENTRYSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
