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
 * This is used to specify a filter on the occurrences of TimingDescriptionEvents by means of a TDEventOccurrenceExpressionFormula.
 * Filter criteria can be variable and argument values, i.e. the timing event only occurs for specific values, as well as the temporal characteristics of the occurrences of arbitrary timing events.
 * 
 * <p>TD-EVENT-OCCURRENCE-EXPRESSION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TD-EVENT-OCCURRENCE-EXPRESSION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TD-EVENT-OCCURRENCE-EXPRESSION"/>
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
@XmlType(name = "TD-EVENT-OCCURRENCE-EXPRESSION", propOrder = {
    "arguments",
    "formula",
    "variables"
})
public class TDEVENTOCCURRENCEEXPRESSION {

    @XmlElement(name = "ARGUMENTS")
    protected TDEVENTOCCURRENCEEXPRESSION.ARGUMENTS arguments;
    @XmlElement(name = "FORMULA")
    protected TDEVENTOCCURRENCEEXPRESSIONFORMULA formula;
    @XmlElement(name = "VARIABLES")
    protected TDEVENTOCCURRENCEEXPRESSION.VARIABLES variables;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??arguments?????
     * 
     * @return
     *     possible object is
     *     {@link TDEVENTOCCURRENCEEXPRESSION.ARGUMENTS }
     *     
     */
    public TDEVENTOCCURRENCEEXPRESSION.ARGUMENTS getARGUMENTS() {
        return arguments;
    }

    /**
     * ??arguments?????
     * 
     * @param value
     *     allowed object is
     *     {@link TDEVENTOCCURRENCEEXPRESSION.ARGUMENTS }
     *     
     */
    public void setARGUMENTS(TDEVENTOCCURRENCEEXPRESSION.ARGUMENTS value) {
        this.arguments = value;
    }

    /**
     * ??formula?????
     * 
     * @return
     *     possible object is
     *     {@link TDEVENTOCCURRENCEEXPRESSIONFORMULA }
     *     
     */
    public TDEVENTOCCURRENCEEXPRESSIONFORMULA getFORMULA() {
        return formula;
    }

    /**
     * ??formula?????
     * 
     * @param value
     *     allowed object is
     *     {@link TDEVENTOCCURRENCEEXPRESSIONFORMULA }
     *     
     */
    public void setFORMULA(TDEVENTOCCURRENCEEXPRESSIONFORMULA value) {
        this.formula = value;
    }

    /**
     * ??variables?????
     * 
     * @return
     *     possible object is
     *     {@link TDEVENTOCCURRENCEEXPRESSION.VARIABLES }
     *     
     */
    public TDEVENTOCCURRENCEEXPRESSION.VARIABLES getVARIABLES() {
        return variables;
    }

    /**
     * ??variables?????
     * 
     * @param value
     *     allowed object is
     *     {@link TDEVENTOCCURRENCEEXPRESSION.VARIABLES }
     *     
     */
    public void setVARIABLES(TDEVENTOCCURRENCEEXPRESSION.VARIABLES value) {
        this.variables = value;
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
     *         &lt;element name="AUTOSAR-OPERATION-ARGUMENT-INSTANCE" type="{http://autosar.org/schema/r4.0}AUTOSAR-OPERATION-ARGUMENT-INSTANCE"/>
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
        "autosaroperationargumentinstance"
    })
    public static class ARGUMENTS {

        @XmlElement(name = "AUTOSAR-OPERATION-ARGUMENT-INSTANCE")
        protected List<AUTOSAROPERATIONARGUMENTINSTANCE> autosaroperationargumentinstance;

        /**
         * Gets the value of the autosaroperationargumentinstance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autosaroperationargumentinstance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAUTOSAROPERATIONARGUMENTINSTANCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AUTOSAROPERATIONARGUMENTINSTANCE }
         * 
         * 
         */
        public List<AUTOSAROPERATIONARGUMENTINSTANCE> getAUTOSAROPERATIONARGUMENTINSTANCE() {
            if (autosaroperationargumentinstance == null) {
                autosaroperationargumentinstance = new ArrayList<AUTOSAROPERATIONARGUMENTINSTANCE>();
            }
            return this.autosaroperationargumentinstance;
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
     *         &lt;element name="AUTOSAR-VARIABLE-INSTANCE" type="{http://autosar.org/schema/r4.0}AUTOSAR-VARIABLE-INSTANCE"/>
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
        "autosarvariableinstance"
    })
    public static class VARIABLES {

        @XmlElement(name = "AUTOSAR-VARIABLE-INSTANCE")
        protected List<AUTOSARVARIABLEINSTANCE> autosarvariableinstance;

        /**
         * Gets the value of the autosarvariableinstance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autosarvariableinstance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAUTOSARVARIABLEINSTANCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AUTOSARVARIABLEINSTANCE }
         * 
         * 
         */
        public List<AUTOSARVARIABLEINSTANCE> getAUTOSARVARIABLEINSTANCE() {
            if (autosarvariableinstance == null) {
                autosarvariableinstance = new ArrayList<AUTOSARVARIABLEINSTANCE>();
            }
            return this.autosarvariableinstance;
        }

    }

}
