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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>ECUC-MULTILINE-STRING-PARAM-DEF-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-MULTILINE-STRING-PARAM-DEF-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-ABSTRACT-STRING-PARAM-DEF-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-MULTILINE-STRING-PARAM-DEF-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-MULTILINE-STRING-PARAM-DEF-CONDITIONAL"/>
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
@XmlType(name = "ECUC-MULTILINE-STRING-PARAM-DEF-CONDITIONAL", propOrder = {
    "defaultvalue",
    "maxlength",
    "minlength",
    "regularexpression",
    "variationpoint"
})
public class ECUCMULTILINESTRINGPARAMDEFCONDITIONAL {

    @XmlElement(name = "DEFAULT-VALUE")
    protected VERBATIMSTRING defaultvalue;
    @XmlElement(name = "MAX-LENGTH")
    protected POSITIVEINTEGER maxlength;
    @XmlElement(name = "MIN-LENGTH")
    protected POSITIVEINTEGER minlength;
    @XmlElement(name = "REGULAR-EXPRESSION")
    protected REGULAREXPRESSION regularexpression;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??defaultvalue?????
     * 
     * @return
     *     possible object is
     *     {@link VERBATIMSTRING }
     *     
     */
    public VERBATIMSTRING getDEFAULTVALUE() {
        return defaultvalue;
    }

    /**
     * ??defaultvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link VERBATIMSTRING }
     *     
     */
    public void setDEFAULTVALUE(VERBATIMSTRING value) {
        this.defaultvalue = value;
    }

    /**
     * ??maxlength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXLENGTH() {
        return maxlength;
    }

    /**
     * ??maxlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXLENGTH(POSITIVEINTEGER value) {
        this.maxlength = value;
    }

    /**
     * ??minlength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMINLENGTH() {
        return minlength;
    }

    /**
     * ??minlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMINLENGTH(POSITIVEINTEGER value) {
        this.minlength = value;
    }

    /**
     * ??regularexpression?????
     * 
     * @return
     *     possible object is
     *     {@link REGULAREXPRESSION }
     *     
     */
    public REGULAREXPRESSION getREGULAREXPRESSION() {
        return regularexpression;
    }

    /**
     * ??regularexpression?????
     * 
     * @param value
     *     allowed object is
     *     {@link REGULAREXPRESSION }
     *     
     */
    public void setREGULAREXPRESSION(REGULAREXPRESSION value) {
        this.regularexpression = value;
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

}
