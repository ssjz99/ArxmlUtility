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
 * The callback point for an BswAsynchronousServerCallPoint i.e. the point at which the result can be retrieved from the BSW Scheduler.
 * 
 * <p>BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-MODULE-CALL-POINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT"/>
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
@XmlType(name = "BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT", propOrder = {
    "shortname",
    "contextlimitationrefs",
    "variationpoint",
    "asynchronousservercallpointref"
})
public class BSWASYNCHRONOUSSERVERCALLRESULTPOINT {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "CONTEXT-LIMITATION-REFS")
    protected Ar421.BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS contextlimitationrefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "ASYNCHRONOUS-SERVER-CALL-POINT-REF")
    protected BSWASYNCHRONOUSSERVERCALLRESULTPOINT.ASYNCHRONOUSSERVERCALLPOINTREF asynchronousservercallpointref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??contextlimitationrefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS }
     *     
     */
    public Ar421.BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS getCONTEXTLIMITATIONREFS() {
        return contextlimitationrefs;
    }

    /**
     * ??contextlimitationrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS }
     *     
     */
    public void setCONTEXTLIMITATIONREFS(Ar421.BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS value) {
        this.contextlimitationrefs = value;
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
     * ??asynchronousservercallpointref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWASYNCHRONOUSSERVERCALLRESULTPOINT.ASYNCHRONOUSSERVERCALLPOINTREF }
     *     
     */
    public BSWASYNCHRONOUSSERVERCALLRESULTPOINT.ASYNCHRONOUSSERVERCALLPOINTREF getASYNCHRONOUSSERVERCALLPOINTREF() {
        return asynchronousservercallpointref;
    }

    /**
     * ??asynchronousservercallpointref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWASYNCHRONOUSSERVERCALLRESULTPOINT.ASYNCHRONOUSSERVERCALLPOINTREF }
     *     
     */
    public void setASYNCHRONOUSSERVERCALLPOINTREF(BSWASYNCHRONOUSSERVERCALLRESULTPOINT.ASYNCHRONOUSSERVERCALLPOINTREF value) {
        this.asynchronousservercallpointref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-ASYNCHRONOUS-SERVER-CALL-POINT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ASYNCHRONOUSSERVERCALLPOINTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWASYNCHRONOUSSERVERCALLPOINTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWASYNCHRONOUSSERVERCALLPOINTSUBTYPESENUM }
         *     
         */
        public BSWASYNCHRONOUSSERVERCALLPOINTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWASYNCHRONOUSSERVERCALLPOINTSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWASYNCHRONOUSSERVERCALLPOINTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
