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
 * <p>FM-ATTRIBUTE-VALUE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FM-ATTRIBUTE-VALUE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FM-ATTRIBUTE-VALUE"/>
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
@XmlType(name = "FM-ATTRIBUTE-VALUE", propOrder = {
    "definitionref",
    "value"
})
public class FMATTRIBUTEVALUE {

    @XmlElement(name = "DEFINITION-REF")
    protected FMATTRIBUTEVALUE.DEFINITIONREF definitionref;
    @XmlElement(name = "VALUE")
    protected NUMERICALVALUE value;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??definitionref?????
     * 
     * @return
     *     possible object is
     *     {@link FMATTRIBUTEVALUE.DEFINITIONREF }
     *     
     */
    public FMATTRIBUTEVALUE.DEFINITIONREF getDEFINITIONREF() {
        return definitionref;
    }

    /**
     * ??definitionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FMATTRIBUTEVALUE.DEFINITIONREF }
     *     
     */
    public void setDEFINITIONREF(FMATTRIBUTEVALUE.DEFINITIONREF value) {
        this.definitionref = value;
    }

    /**
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link NUMERICALVALUE }
     *     
     */
    public NUMERICALVALUE getVALUE() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link NUMERICALVALUE }
     *     
     */
    public void setVALUE(NUMERICALVALUE value) {
        this.value = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FM-ATTRIBUTE-DEF--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DEFINITIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FMATTRIBUTEDEFSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FMATTRIBUTEDEFSUBTYPESENUM }
         *     
         */
        public FMATTRIBUTEDEFSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FMATTRIBUTEDEFSUBTYPESENUM }
         *     
         */
        public void setDEST(FMATTRIBUTEDEFSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
