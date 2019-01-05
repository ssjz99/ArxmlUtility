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
 * This metaclass represents the ability to assign a hardware attribute value. Note that v and vt are mutually exclusive.
 * 
 * <p>HW-ATTRIBUTE-VALUE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="HW-ATTRIBUTE-VALUE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}HW-ATTRIBUTE-VALUE"/>
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
@XmlType(name = "HW-ATTRIBUTE-VALUE", propOrder = {
    "annotation",
    "hwattributedefref",
    "v",
    "vt",
    "variationpoint"
})
public class HWATTRIBUTEVALUE {

    @XmlElement(name = "ANNOTATION")
    protected ANNOTATION annotation;
    @XmlElement(name = "HW-ATTRIBUTE-DEF-REF")
    protected HWATTRIBUTEVALUE.HWATTRIBUTEDEFREF hwattributedefref;
    @XmlElement(name = "V")
    protected NUMERICALVALUEVARIATIONPOINT v;
    @XmlElement(name = "VT")
    protected VERBATIMSTRING vt;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??annotation?????
     * 
     * @return
     *     possible object is
     *     {@link ANNOTATION }
     *     
     */
    public ANNOTATION getANNOTATION() {
        return annotation;
    }

    /**
     * ??annotation?????
     * 
     * @param value
     *     allowed object is
     *     {@link ANNOTATION }
     *     
     */
    public void setANNOTATION(ANNOTATION value) {
        this.annotation = value;
    }

    /**
     * ??hwattributedefref?????
     * 
     * @return
     *     possible object is
     *     {@link HWATTRIBUTEVALUE.HWATTRIBUTEDEFREF }
     *     
     */
    public HWATTRIBUTEVALUE.HWATTRIBUTEDEFREF getHWATTRIBUTEDEFREF() {
        return hwattributedefref;
    }

    /**
     * ??hwattributedefref?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWATTRIBUTEVALUE.HWATTRIBUTEDEFREF }
     *     
     */
    public void setHWATTRIBUTEDEFREF(HWATTRIBUTEVALUE.HWATTRIBUTEDEFREF value) {
        this.hwattributedefref = value;
    }

    /**
     * ??v?????
     * 
     * @return
     *     possible object is
     *     {@link NUMERICALVALUEVARIATIONPOINT }
     *     
     */
    public NUMERICALVALUEVARIATIONPOINT getV() {
        return v;
    }

    /**
     * ??v?????
     * 
     * @param value
     *     allowed object is
     *     {@link NUMERICALVALUEVARIATIONPOINT }
     *     
     */
    public void setV(NUMERICALVALUEVARIATIONPOINT value) {
        this.v = value;
    }

    /**
     * ??vt?????
     * 
     * @return
     *     possible object is
     *     {@link VERBATIMSTRING }
     *     
     */
    public VERBATIMSTRING getVT() {
        return vt;
    }

    /**
     * ??vt?????
     * 
     * @param value
     *     allowed object is
     *     {@link VERBATIMSTRING }
     *     
     */
    public void setVT(VERBATIMSTRING value) {
        this.vt = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}HW-ATTRIBUTE-DEF--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HWATTRIBUTEDEFREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected HWATTRIBUTEDEFSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link HWATTRIBUTEDEFSUBTYPESENUM }
         *     
         */
        public HWATTRIBUTEDEFSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link HWATTRIBUTEDEFSUBTYPESENUM }
         *     
         */
        public void setDEST(HWATTRIBUTEDEFSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
