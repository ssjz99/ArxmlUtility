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
 * This class represents a specific mapping between two PhysicalDimensions.
 * 
 * <p>PHYSICAL-DIMENSION-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PHYSICAL-DIMENSION-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PHYSICAL-DIMENSION-MAPPING"/>
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
@XmlType(name = "PHYSICAL-DIMENSION-MAPPING", propOrder = {
    "firstphysicaldimensionref",
    "secondphysicaldimensionref"
})
public class PHYSICALDIMENSIONMAPPING {

    @XmlElement(name = "FIRST-PHYSICAL-DIMENSION-REF")
    protected PHYSICALDIMENSIONMAPPING.FIRSTPHYSICALDIMENSIONREF firstphysicaldimensionref;
    @XmlElement(name = "SECOND-PHYSICAL-DIMENSION-REF")
    protected PHYSICALDIMENSIONMAPPING.SECONDPHYSICALDIMENSIONREF secondphysicaldimensionref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??firstphysicaldimensionref?????
     * 
     * @return
     *     possible object is
     *     {@link PHYSICALDIMENSIONMAPPING.FIRSTPHYSICALDIMENSIONREF }
     *     
     */
    public PHYSICALDIMENSIONMAPPING.FIRSTPHYSICALDIMENSIONREF getFIRSTPHYSICALDIMENSIONREF() {
        return firstphysicaldimensionref;
    }

    /**
     * ??firstphysicaldimensionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PHYSICALDIMENSIONMAPPING.FIRSTPHYSICALDIMENSIONREF }
     *     
     */
    public void setFIRSTPHYSICALDIMENSIONREF(PHYSICALDIMENSIONMAPPING.FIRSTPHYSICALDIMENSIONREF value) {
        this.firstphysicaldimensionref = value;
    }

    /**
     * ??secondphysicaldimensionref?????
     * 
     * @return
     *     possible object is
     *     {@link PHYSICALDIMENSIONMAPPING.SECONDPHYSICALDIMENSIONREF }
     *     
     */
    public PHYSICALDIMENSIONMAPPING.SECONDPHYSICALDIMENSIONREF getSECONDPHYSICALDIMENSIONREF() {
        return secondphysicaldimensionref;
    }

    /**
     * ??secondphysicaldimensionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PHYSICALDIMENSIONMAPPING.SECONDPHYSICALDIMENSIONREF }
     *     
     */
    public void setSECONDPHYSICALDIMENSIONREF(PHYSICALDIMENSIONMAPPING.SECONDPHYSICALDIMENSIONREF value) {
        this.secondphysicaldimensionref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PHYSICAL-DIMENSION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FIRSTPHYSICALDIMENSIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PHYSICALDIMENSIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PHYSICALDIMENSIONSUBTYPESENUM }
         *     
         */
        public PHYSICALDIMENSIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PHYSICALDIMENSIONSUBTYPESENUM }
         *     
         */
        public void setDEST(PHYSICALDIMENSIONSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PHYSICAL-DIMENSION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SECONDPHYSICALDIMENSIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PHYSICALDIMENSIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PHYSICALDIMENSIONSUBTYPESENUM }
         *     
         */
        public PHYSICALDIMENSIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PHYSICALDIMENSIONSUBTYPESENUM }
         *     
         */
        public void setDEST(PHYSICALDIMENSIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
