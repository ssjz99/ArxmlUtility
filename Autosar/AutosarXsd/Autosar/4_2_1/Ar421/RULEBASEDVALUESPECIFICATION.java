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
 * This meta-class is used to support a rule-based initialization approach for data types with an array-nature (ApplicationArrayDataType and ImplementationDataType of category ARRAY) or a compound ApplicationPrimitiveDataType (which also boils down to an array-nature).
 * 
 * <p>RULE-BASED-VALUE-SPECIFICATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="RULE-BASED-VALUE-SPECIFICATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RULE-BASED-VALUE-SPECIFICATION"/>
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
@XmlType(name = "RULE-BASED-VALUE-SPECIFICATION", propOrder = {
    "rule",
    "argumentss",
    "maxsizetofill"
})
public class RULEBASEDVALUESPECIFICATION {

    @XmlElement(name = "RULE")
    protected IDENTIFIER rule;
    @XmlElement(name = "ARGUMENTSS")
    protected RULEBASEDVALUESPECIFICATION.ARGUMENTSS argumentss;
    @XmlElement(name = "MAX-SIZE-TO-FILL")
    protected INTEGER maxsizetofill;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??rule?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getRULE() {
        return rule;
    }

    /**
     * ??rule?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setRULE(IDENTIFIER value) {
        this.rule = value;
    }

    /**
     * ??argumentss?????
     * 
     * @return
     *     possible object is
     *     {@link RULEBASEDVALUESPECIFICATION.ARGUMENTSS }
     *     
     */
    public RULEBASEDVALUESPECIFICATION.ARGUMENTSS getARGUMENTSS() {
        return argumentss;
    }

    /**
     * ??argumentss?????
     * 
     * @param value
     *     allowed object is
     *     {@link RULEBASEDVALUESPECIFICATION.ARGUMENTSS }
     *     
     */
    public void setARGUMENTSS(RULEBASEDVALUESPECIFICATION.ARGUMENTSS value) {
        this.argumentss = value;
    }

    /**
     * ??maxsizetofill?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXSIZETOFILL() {
        return maxsizetofill;
    }

    /**
     * ??maxsizetofill?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXSIZETOFILL(INTEGER value) {
        this.maxsizetofill = value;
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
     *         &lt;element name="RULE-ARGUMENTS" type="{http://autosar.org/schema/r4.0}RULE-ARGUMENTS"/>
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
        "rulearguments"
    })
    public static class ARGUMENTSS {

        @XmlElement(name = "RULE-ARGUMENTS")
        protected List<RULEARGUMENTS> rulearguments;

        /**
         * Gets the value of the rulearguments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rulearguments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRULEARGUMENTS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RULEARGUMENTS }
         * 
         * 
         */
        public List<RULEARGUMENTS> getRULEARGUMENTS() {
            if (rulearguments == null) {
                rulearguments = new ArrayList<RULEARGUMENTS>();
            }
            return this.rulearguments;
        }

    }

}
