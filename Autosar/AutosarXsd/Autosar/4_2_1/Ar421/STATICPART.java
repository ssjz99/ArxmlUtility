//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Some parts/signals of the I-PDU may be the same regardless of the selector field. Such a part is called static part. The static part is optional.
 * 
 * <p>STATIC-PART complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="STATIC-PART">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTIPLEXED-PART"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}STATIC-PART"/>
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
@XmlType(name = "STATIC-PART", propOrder = {
    "segmentpositions",
    "ipduref",
    "variationpoint"
})
public class STATICPART {

    @XmlElement(name = "SEGMENT-POSITIONS")
    protected STATICPART.SEGMENTPOSITIONS segmentpositions;
    @XmlElement(name = "I-PDU-REF")
    protected STATICPART.IPDUREF ipduref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??segmentpositions?????
     * 
     * @return
     *     possible object is
     *     {@link STATICPART.SEGMENTPOSITIONS }
     *     
     */
    public STATICPART.SEGMENTPOSITIONS getSEGMENTPOSITIONS() {
        return segmentpositions;
    }

    /**
     * ??segmentpositions?????
     * 
     * @param value
     *     allowed object is
     *     {@link STATICPART.SEGMENTPOSITIONS }
     *     
     */
    public void setSEGMENTPOSITIONS(STATICPART.SEGMENTPOSITIONS value) {
        this.segmentpositions = value;
    }

    /**
     * ??ipduref?????
     * 
     * @return
     *     possible object is
     *     {@link STATICPART.IPDUREF }
     *     
     */
    public STATICPART.IPDUREF getIPDUREF() {
        return ipduref;
    }

    /**
     * ??ipduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link STATICPART.IPDUREF }
     *     
     */
    public void setIPDUREF(STATICPART.IPDUREF value) {
        this.ipduref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IPDUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ISIGNALIPDUSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ISIGNALIPDUSUBTYPESENUM }
         *     
         */
        public ISIGNALIPDUSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ISIGNALIPDUSUBTYPESENUM }
         *     
         */
        public void setDEST(ISIGNALIPDUSUBTYPESENUM value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SEGMENT-POSITION" type="{http://autosar.org/schema/r4.0}SEGMENT-POSITION"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "segmentposition"
    })
    public static class SEGMENTPOSITIONS {

        @XmlElement(name = "SEGMENT-POSITION")
        protected List<SEGMENTPOSITION> segmentposition;

        /**
         * Gets the value of the segmentposition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentposition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSEGMENTPOSITION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SEGMENTPOSITION }
         * 
         * 
         */
        public List<SEGMENTPOSITION> getSEGMENTPOSITION() {
            if (segmentposition == null) {
                segmentposition = new ArrayList<SEGMENTPOSITION>();
            }
            return this.segmentposition;
        }

    }

}
