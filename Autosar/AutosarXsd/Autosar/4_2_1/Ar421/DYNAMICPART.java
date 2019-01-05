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
 * Dynamic part of a multiplexed I-Pdu. 
 * Reserved space which is used to transport varying SignalIPdus at the same position, controlled by the corresponding selectorFieldCode.
 * 
 * <p>DYNAMIC-PART complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DYNAMIC-PART">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTIPLEXED-PART"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DYNAMIC-PART"/>
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
@XmlType(name = "DYNAMIC-PART", propOrder = {
    "segmentpositions",
    "dynamicpartalternatives",
    "variationpoint"
})
public class DYNAMICPART {

    @XmlElement(name = "SEGMENT-POSITIONS")
    protected Ar421.STATICPART.SEGMENTPOSITIONS segmentpositions;
    @XmlElement(name = "DYNAMIC-PART-ALTERNATIVES")
    protected DYNAMICPART.DYNAMICPARTALTERNATIVES dynamicpartalternatives;
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
     *     {@link Ar421.STATICPART.SEGMENTPOSITIONS }
     *     
     */
    public Ar421.STATICPART.SEGMENTPOSITIONS getSEGMENTPOSITIONS() {
        return segmentpositions;
    }

    /**
     * ??segmentpositions?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.STATICPART.SEGMENTPOSITIONS }
     *     
     */
    public void setSEGMENTPOSITIONS(Ar421.STATICPART.SEGMENTPOSITIONS value) {
        this.segmentpositions = value;
    }

    /**
     * ??dynamicpartalternatives?????
     * 
     * @return
     *     possible object is
     *     {@link DYNAMICPART.DYNAMICPARTALTERNATIVES }
     *     
     */
    public DYNAMICPART.DYNAMICPARTALTERNATIVES getDYNAMICPARTALTERNATIVES() {
        return dynamicpartalternatives;
    }

    /**
     * ??dynamicpartalternatives?????
     * 
     * @param value
     *     allowed object is
     *     {@link DYNAMICPART.DYNAMICPARTALTERNATIVES }
     *     
     */
    public void setDYNAMICPARTALTERNATIVES(DYNAMICPART.DYNAMICPARTALTERNATIVES value) {
        this.dynamicpartalternatives = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="DYNAMIC-PART-ALTERNATIVE" type="{http://autosar.org/schema/r4.0}DYNAMIC-PART-ALTERNATIVE"/>
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
        "dynamicpartalternative"
    })
    public static class DYNAMICPARTALTERNATIVES {

        @XmlElement(name = "DYNAMIC-PART-ALTERNATIVE")
        protected List<DYNAMICPARTALTERNATIVE> dynamicpartalternative;

        /**
         * Gets the value of the dynamicpartalternative property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dynamicpartalternative property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDYNAMICPARTALTERNATIVE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DYNAMICPARTALTERNATIVE }
         * 
         * 
         */
        public List<DYNAMICPARTALTERNATIVE> getDYNAMICPARTALTERNATIVE() {
            if (dynamicpartalternative == null) {
                dynamicpartalternative = new ArrayList<DYNAMICPARTALTERNATIVE>();
            }
            return this.dynamicpartalternative;
        }

    }

}
