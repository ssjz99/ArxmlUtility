//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * This class represents the ability to express a numerical limit.  Note that this is in fact a NumericalValuationPoint but has the additional attribute intervalType.
 * 
 * Note that the xml.name is "LIMIT" for backward compatibility reasons.
 * 
 * <p>LIMIT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIMIT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FORMULA-EXPRESSION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-SYSTEMCONST-DEPENDENT-FORMULA"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATTRIBUTE-VALUE-VARIATION-POINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-NUMERICAL-VARIATION-POINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIMIT"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}LIMIT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}ATTRIBUTE-VALUE-VARIATION-POINT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIMIT", propOrder = {
    "content"
})
public class LIMIT {

    @XmlElementRefs({
        @XmlElementRef(name = "SYSC-REF", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SYSC-STRING-REF", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "INTERVAL-TYPE")
    protected INTERVALTYPEENUMSIMPLE intervaltype;
    @XmlAttribute(name = "BINDING-TIME")
    protected BINDINGTIMEENUMSIMPLE bindingtime;
    @XmlAttribute(name = "BLUEPRINT-VALUE")
    protected String blueprintvalue;
    @XmlAttribute(name = "SD")
    protected String sd;
    @XmlAttribute(name = "SHORT-LABEL")
    protected String shortlabel;

    /**
     * This class represents the ability to express a numerical limit.  Note that this is in fact a NumericalValuationPoint but has the additional attribute intervalType.
     * 
     * Note that the xml.name is "LIMIT" for backward compatibility reasons.Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Ar421.BLUEPRINTFORMULA.SYSCREF }{@code >}
     * {@link JAXBElement }{@code <}{@link Ar421.BLUEPRINTFORMULA.SYSCSTRINGREF }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
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
     * ??intervaltype?????
     * 
     * @return
     *     possible object is
     *     {@link INTERVALTYPEENUMSIMPLE }
     *     
     */
    public INTERVALTYPEENUMSIMPLE getINTERVALTYPE() {
        return intervaltype;
    }

    /**
     * ??intervaltype?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTERVALTYPEENUMSIMPLE }
     *     
     */
    public void setINTERVALTYPE(INTERVALTYPEENUMSIMPLE value) {
        this.intervaltype = value;
    }

    /**
     * ??bindingtime?????
     * 
     * @return
     *     possible object is
     *     {@link BINDINGTIMEENUMSIMPLE }
     *     
     */
    public BINDINGTIMEENUMSIMPLE getBINDINGTIME() {
        return bindingtime;
    }

    /**
     * ??bindingtime?????
     * 
     * @param value
     *     allowed object is
     *     {@link BINDINGTIMEENUMSIMPLE }
     *     
     */
    public void setBINDINGTIME(BINDINGTIMEENUMSIMPLE value) {
        this.bindingtime = value;
    }

    /**
     * ??blueprintvalue?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLUEPRINTVALUE() {
        return blueprintvalue;
    }

    /**
     * ??blueprintvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLUEPRINTVALUE(String value) {
        this.blueprintvalue = value;
    }

    /**
     * ??sd?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSD() {
        return sd;
    }

    /**
     * ??sd?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSD(String value) {
        this.sd = value;
    }

    /**
     * ??shortlabel?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHORTLABEL() {
        return shortlabel;
    }

    /**
     * ??shortlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHORTLABEL(String value) {
        this.shortlabel = value;
    }

}
