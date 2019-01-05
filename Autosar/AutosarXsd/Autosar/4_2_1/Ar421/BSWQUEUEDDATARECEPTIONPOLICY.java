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
 * Reception policy attributes specific for queued receiving.
 * 
 * <p>BSW-QUEUED-DATA-RECEPTION-POLICY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-QUEUED-DATA-RECEPTION-POLICY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-API-OPTIONS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-DATA-RECEPTION-POLICY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-QUEUED-DATA-RECEPTION-POLICY"/>
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
@XmlType(name = "BSW-QUEUED-DATA-RECEPTION-POLICY", propOrder = {
    "enabletakeaddress",
    "receiveddataref",
    "variationpoint",
    "queuelength"
})
public class BSWQUEUEDDATARECEPTIONPOLICY {

    @XmlElement(name = "ENABLE-TAKE-ADDRESS")
    protected BOOLEAN enabletakeaddress;
    @XmlElement(name = "RECEIVED-DATA-REF")
    protected BSWQUEUEDDATARECEPTIONPOLICY.RECEIVEDDATAREF receiveddataref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "QUEUE-LENGTH")
    protected POSITIVEINTEGER queuelength;
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
     * ??receiveddataref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWQUEUEDDATARECEPTIONPOLICY.RECEIVEDDATAREF }
     *     
     */
    public BSWQUEUEDDATARECEPTIONPOLICY.RECEIVEDDATAREF getRECEIVEDDATAREF() {
        return receiveddataref;
    }

    /**
     * ??receiveddataref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWQUEUEDDATARECEPTIONPOLICY.RECEIVEDDATAREF }
     *     
     */
    public void setRECEIVEDDATAREF(BSWQUEUEDDATARECEPTIONPOLICY.RECEIVEDDATAREF value) {
        this.receiveddataref = value;
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
     * ??queuelength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getQUEUELENGTH() {
        return queuelength;
    }

    /**
     * ??queuelength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setQUEUELENGTH(POSITIVEINTEGER value) {
        this.queuelength = value;
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
    public static class RECEIVEDDATAREF
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
