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
 * This is an emphasized text. As a compromise it contains some rendering oriented attributes such as color and font.
 * 
 * <p>EMPHASIS-TEXT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="EMPHASIS-TEXT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EMPHASIS-TEXT"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}EMPHASIS-TEXT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMPHASIS-TEXT", propOrder = {
    "content"
})
public class EMPHASISTEXT {

    @XmlElementRefs({
        @XmlElementRef(name = "SUB", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SUP", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "COLOR")
    protected String color;
    @XmlAttribute(name = "FONT")
    protected EENUMFONTSIMPLE font;
    @XmlAttribute(name = "TYPE")
    protected EENUMSIMPLE type;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * This is an emphasized text. As a compromise it contains some rendering oriented attributes such as color and font.Gets the value of the content property.
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
     * {@link JAXBElement }{@code <}{@link SUPSCRIPT }{@code >}
     * {@link JAXBElement }{@code <}{@link SUPSCRIPT }{@code >}
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
     * ??color?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLOR() {
        return color;
    }

    /**
     * ??color?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLOR(String value) {
        this.color = value;
    }

    /**
     * ??font?????
     * 
     * @return
     *     possible object is
     *     {@link EENUMFONTSIMPLE }
     *     
     */
    public EENUMFONTSIMPLE getFONT() {
        return font;
    }

    /**
     * ??font?????
     * 
     * @param value
     *     allowed object is
     *     {@link EENUMFONTSIMPLE }
     *     
     */
    public void setFONT(EENUMFONTSIMPLE value) {
        this.font = value;
    }

    /**
     * ??type?????
     * 
     * @return
     *     possible object is
     *     {@link EENUMSIMPLE }
     *     
     */
    public EENUMSIMPLE getTYPE() {
        return type;
    }

    /**
     * ??type?????
     * 
     * @param value
     *     allowed object is
     *     {@link EENUMSIMPLE }
     *     
     */
    public void setTYPE(EENUMSIMPLE value) {
        this.type = value;
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
