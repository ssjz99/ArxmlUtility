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
 * Connection between two CouplingPorts (firstPort and secondPort).
 * 
 * <p>COUPLING-PORT-CONNECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COUPLING-PORT-CONNECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COUPLING-PORT-CONNECTION"/>
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
@XmlType(name = "COUPLING-PORT-CONNECTION", propOrder = {
    "firstportref",
    "secondportref"
})
public class COUPLINGPORTCONNECTION {

    @XmlElement(name = "FIRST-PORT-REF")
    protected COUPLINGPORTCONNECTION.FIRSTPORTREF firstportref;
    @XmlElement(name = "SECOND-PORT-REF")
    protected COUPLINGPORTCONNECTION.SECONDPORTREF secondportref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??firstportref?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORTCONNECTION.FIRSTPORTREF }
     *     
     */
    public COUPLINGPORTCONNECTION.FIRSTPORTREF getFIRSTPORTREF() {
        return firstportref;
    }

    /**
     * ??firstportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORTCONNECTION.FIRSTPORTREF }
     *     
     */
    public void setFIRSTPORTREF(COUPLINGPORTCONNECTION.FIRSTPORTREF value) {
        this.firstportref = value;
    }

    /**
     * ??secondportref?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORTCONNECTION.SECONDPORTREF }
     *     
     */
    public COUPLINGPORTCONNECTION.SECONDPORTREF getSECONDPORTREF() {
        return secondportref;
    }

    /**
     * ??secondportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORTCONNECTION.SECONDPORTREF }
     *     
     */
    public void setSECONDPORTREF(COUPLINGPORTCONNECTION.SECONDPORTREF value) {
        this.secondportref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COUPLING-PORT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FIRSTPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COUPLINGPORTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COUPLINGPORTSUBTYPESENUM }
         *     
         */
        public COUPLINGPORTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COUPLINGPORTSUBTYPESENUM }
         *     
         */
        public void setDEST(COUPLINGPORTSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COUPLING-PORT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SECONDPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COUPLINGPORTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COUPLINGPORTSUBTYPESENUM }
         *     
         */
        public COUPLINGPORTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COUPLINGPORTSUBTYPESENUM }
         *     
         */
        public void setDEST(COUPLINGPORTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
