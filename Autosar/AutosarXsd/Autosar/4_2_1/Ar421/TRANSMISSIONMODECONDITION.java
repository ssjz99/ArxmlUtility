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
 * Possibility to attach a condition to each signal within an I-PDU.
 * 
 * If at least one condition evaluates to true, TRANSMISSION MODE True shall be used for this I-Pdu. In all other cases, the TRANSMISSION MODE FALSE shall be used.
 * 
 * <p>TRANSMISSION-MODE-CONDITION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TRANSMISSION-MODE-CONDITION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSMISSION-MODE-CONDITION"/>
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
@XmlType(name = "TRANSMISSION-MODE-CONDITION", propOrder = {
    "datafilter",
    "isignalinipduref"
})
public class TRANSMISSIONMODECONDITION {

    @XmlElement(name = "DATA-FILTER")
    protected DATAFILTER datafilter;
    @XmlElement(name = "I-SIGNAL-IN-I-PDU-REF")
    protected TRANSMISSIONMODECONDITION.ISIGNALINIPDUREF isignalinipduref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??datafilter?????
     * 
     * @return
     *     possible object is
     *     {@link DATAFILTER }
     *     
     */
    public DATAFILTER getDATAFILTER() {
        return datafilter;
    }

    /**
     * ??datafilter?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATAFILTER }
     *     
     */
    public void setDATAFILTER(DATAFILTER value) {
        this.datafilter = value;
    }

    /**
     * ??isignalinipduref?????
     * 
     * @return
     *     possible object is
     *     {@link TRANSMISSIONMODECONDITION.ISIGNALINIPDUREF }
     *     
     */
    public TRANSMISSIONMODECONDITION.ISIGNALINIPDUREF getISIGNALINIPDUREF() {
        return isignalinipduref;
    }

    /**
     * ??isignalinipduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSMISSIONMODECONDITION.ISIGNALINIPDUREF }
     *     
     */
    public void setISIGNALINIPDUREF(TRANSMISSIONMODECONDITION.ISIGNALINIPDUREF value) {
        this.isignalinipduref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-TO-I-PDU-MAPPING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ISIGNALINIPDUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ISIGNALTOIPDUMAPPINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ISIGNALTOIPDUMAPPINGSUBTYPESENUM }
         *     
         */
        public ISIGNALTOIPDUMAPPINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ISIGNALTOIPDUMAPPINGSUBTYPESENUM }
         *     
         */
        public void setDEST(ISIGNALTOIPDUMAPPINGSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
