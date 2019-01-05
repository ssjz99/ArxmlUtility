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
 * Denotes a group of calibration parameters which are handled by the RTE as one data structure.
 * 
 * <p>MC-PARAMETER-ELEMENT-GROUP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MC-PARAMETER-ELEMENT-GROUP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MC-PARAMETER-ELEMENT-GROUP"/>
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
@XmlType(name = "MC-PARAMETER-ELEMENT-GROUP", propOrder = {
    "shortlabel",
    "ramlocationref",
    "romlocationref"
})
public class MCPARAMETERELEMENTGROUP {

    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "RAM-LOCATION-REF")
    protected MCPARAMETERELEMENTGROUP.RAMLOCATIONREF ramlocationref;
    @XmlElement(name = "ROM-LOCATION-REF")
    protected MCPARAMETERELEMENTGROUP.ROMLOCATIONREF romlocationref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortlabel?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTLABEL() {
        return shortlabel;
    }

    /**
     * ??shortlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTLABEL(IDENTIFIER value) {
        this.shortlabel = value;
    }

    /**
     * ??ramlocationref?????
     * 
     * @return
     *     possible object is
     *     {@link MCPARAMETERELEMENTGROUP.RAMLOCATIONREF }
     *     
     */
    public MCPARAMETERELEMENTGROUP.RAMLOCATIONREF getRAMLOCATIONREF() {
        return ramlocationref;
    }

    /**
     * ??ramlocationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCPARAMETERELEMENTGROUP.RAMLOCATIONREF }
     *     
     */
    public void setRAMLOCATIONREF(MCPARAMETERELEMENTGROUP.RAMLOCATIONREF value) {
        this.ramlocationref = value;
    }

    /**
     * ??romlocationref?????
     * 
     * @return
     *     possible object is
     *     {@link MCPARAMETERELEMENTGROUP.ROMLOCATIONREF }
     *     
     */
    public MCPARAMETERELEMENTGROUP.ROMLOCATIONREF getROMLOCATIONREF() {
        return romlocationref;
    }

    /**
     * ??romlocationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCPARAMETERELEMENTGROUP.ROMLOCATIONREF }
     *     
     */
    public void setROMLOCATIONREF(MCPARAMETERELEMENTGROUP.ROMLOCATIONREF value) {
        this.romlocationref = value;
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
    public static class RAMLOCATIONREF
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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PARAMETER-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ROMLOCATIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PARAMETERDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PARAMETERDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public PARAMETERDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PARAMETERDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(PARAMETERDATAPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
