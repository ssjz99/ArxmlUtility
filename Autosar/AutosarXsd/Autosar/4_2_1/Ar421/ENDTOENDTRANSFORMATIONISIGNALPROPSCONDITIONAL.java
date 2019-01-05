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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSFORMATION-I-SIGNAL-PROPS-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL"/>
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
@XmlType(name = "END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL", propOrder = {
    "transformerref",
    "dataids",
    "datalength",
    "maxdatalength",
    "mindatalength",
    "variationpoint"
})
public class ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL {

    @XmlElement(name = "TRANSFORMER-REF")
    protected ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.TRANSFORMERREF transformerref;
    @XmlElement(name = "DATA-IDS")
    protected ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.DATAIDS dataids;
    @XmlElement(name = "DATA-LENGTH")
    protected POSITIVEINTEGER datalength;
    @XmlElement(name = "MAX-DATA-LENGTH")
    protected POSITIVEINTEGER maxdatalength;
    @XmlElement(name = "MIN-DATA-LENGTH")
    protected POSITIVEINTEGER mindatalength;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??transformerref?????
     * 
     * @return
     *     possible object is
     *     {@link ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.TRANSFORMERREF }
     *     
     */
    public ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.TRANSFORMERREF getTRANSFORMERREF() {
        return transformerref;
    }

    /**
     * ??transformerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.TRANSFORMERREF }
     *     
     */
    public void setTRANSFORMERREF(ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.TRANSFORMERREF value) {
        this.transformerref = value;
    }

    /**
     * ??dataids?????
     * 
     * @return
     *     possible object is
     *     {@link ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.DATAIDS }
     *     
     */
    public ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.DATAIDS getDATAIDS() {
        return dataids;
    }

    /**
     * ??dataids?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.DATAIDS }
     *     
     */
    public void setDATAIDS(ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.DATAIDS value) {
        this.dataids = value;
    }

    /**
     * ??datalength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDATALENGTH() {
        return datalength;
    }

    /**
     * ??datalength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDATALENGTH(POSITIVEINTEGER value) {
        this.datalength = value;
    }

    /**
     * ??maxdatalength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXDATALENGTH() {
        return maxdatalength;
    }

    /**
     * ??maxdatalength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXDATALENGTH(POSITIVEINTEGER value) {
        this.maxdatalength = value;
    }

    /**
     * ??mindatalength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMINDATALENGTH() {
        return mindatalength;
    }

    /**
     * ??mindatalength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMINDATALENGTH(POSITIVEINTEGER value) {
        this.mindatalength = value;
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
     *         &lt;element name="DATA-ID" type="{http://autosar.org/schema/r4.0}POSITIVE-INTEGER"/>
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
        "dataid"
    })
    public static class DATAIDS {

        @XmlElement(name = "DATA-ID")
        protected List<POSITIVEINTEGER> dataid;

        /**
         * Gets the value of the dataid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATAID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link POSITIVEINTEGER }
         * 
         * 
         */
        public List<POSITIVEINTEGER> getDATAID() {
            if (dataid == null) {
                dataid = new ArrayList<POSITIVEINTEGER>();
            }
            return this.dataid;
        }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TRANSFORMATION-TECHNOLOGY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TRANSFORMERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TRANSFORMATIONTECHNOLOGYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TRANSFORMATIONTECHNOLOGYSUBTYPESENUM }
         *     
         */
        public TRANSFORMATIONTECHNOLOGYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TRANSFORMATIONTECHNOLOGYSUBTYPESENUM }
         *     
         */
        public void setDEST(TRANSFORMATIONTECHNOLOGYSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
