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
 * This parameter corresponds to EcucAddInfoParamDef.
 * 
 * <p>ECUC-ADD-INFO-PARAM-VALUE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-ADD-INFO-PARAM-VALUE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-INDEXABLE-VALUE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-PARAMETER-VALUE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-ADD-INFO-PARAM-VALUE"/>
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
@XmlType(name = "ECUC-ADD-INFO-PARAM-VALUE", propOrder = {
    "index",
    "definitionref",
    "annotations",
    "isautovalue",
    "variationpoint",
    "value"
})
public class ECUCADDINFOPARAMVALUE {

    @XmlElement(name = "INDEX")
    protected POSITIVEINTEGER index;
    @XmlElement(name = "DEFINITION-REF")
    protected ECUCADDINFOPARAMVALUE.DEFINITIONREF definitionref;
    @XmlElement(name = "ANNOTATIONS")
    protected ECUCADDINFOPARAMVALUE.ANNOTATIONS annotations;
    @XmlElement(name = "IS-AUTO-VALUE")
    protected BOOLEAN isautovalue;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "VALUE")
    protected DOCUMENTATIONBLOCK value;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??index?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getINDEX() {
        return index;
    }

    /**
     * ??index?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setINDEX(POSITIVEINTEGER value) {
        this.index = value;
    }

    /**
     * ??definitionref?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCADDINFOPARAMVALUE.DEFINITIONREF }
     *     
     */
    public ECUCADDINFOPARAMVALUE.DEFINITIONREF getDEFINITIONREF() {
        return definitionref;
    }

    /**
     * ??definitionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCADDINFOPARAMVALUE.DEFINITIONREF }
     *     
     */
    public void setDEFINITIONREF(ECUCADDINFOPARAMVALUE.DEFINITIONREF value) {
        this.definitionref = value;
    }

    /**
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCADDINFOPARAMVALUE.ANNOTATIONS }
     *     
     */
    public ECUCADDINFOPARAMVALUE.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCADDINFOPARAMVALUE.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(ECUCADDINFOPARAMVALUE.ANNOTATIONS value) {
        this.annotations = value;
    }

    /**
     * ??isautovalue?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getISAUTOVALUE() {
        return isautovalue;
    }

    /**
     * ??isautovalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setISAUTOVALUE(BOOLEAN value) {
        this.isautovalue = value;
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
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getVALUE() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setVALUE(DOCUMENTATIONBLOCK value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="ANNOTATION" type="{http://autosar.org/schema/r4.0}ANNOTATION"/>
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
        "annotation"
    })
    public static class ANNOTATIONS {

        @XmlElement(name = "ANNOTATION")
        protected List<ANNOTATION> annotation;

        /**
         * Gets the value of the annotation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annotation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getANNOTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ANNOTATION }
         * 
         * 
         */
        public List<ANNOTATION> getANNOTATION() {
            if (annotation == null) {
                annotation = new ArrayList<ANNOTATION>();
            }
            return this.annotation;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-PARAMETER-DEF--SUBTYPES-ENUM" />
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
        protected ECUCPARAMETERDEFSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ECUCPARAMETERDEFSUBTYPESENUM }
         *     
         */
        public ECUCPARAMETERDEFSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ECUCPARAMETERDEFSUBTYPESENUM }
         *     
         */
        public void setDEST(ECUCPARAMETERDEFSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
