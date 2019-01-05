//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * This metaclass represents the ability to express the characteristics of one particular parameter. It can be exressed as numerical or as text parameter (provided as subclasses of PrmCharContents)
 * 
 * <p>PRM-CHAR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PRM-CHAR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PRM-CHAR"/>
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
@XmlType(name = "PRM-CHAR", propOrder = {
    "cond",
    "absAndTOLOrMIN",
    "remark"
})
public class PRMCHAR {

    @XmlElement(name = "COND")
    protected DOCUMENTATIONBLOCK cond;
    @XmlElementRefs({
        @XmlElementRef(name = "TOL", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MIN", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRM-UNIT", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TEXT", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MAX", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ABS", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TYP", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> absAndTOLOrMIN;
    @XmlElement(name = "REMARK")
    protected DOCUMENTATIONBLOCK remark;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??cond?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getCOND() {
        return cond;
    }

    /**
     * ??cond?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setCOND(DOCUMENTATIONBLOCK value) {
        this.cond = value;
    }

    /**
     * Gets the value of the absAndTOLOrMIN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absAndTOLOrMIN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getABSAndTOLOrMIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link NUMERICALVALUE }{@code >}
     * {@link JAXBElement }{@code <}{@link NUMERICALVALUE }{@code >}
     * {@link JAXBElement }{@code <}{@link SINGLELANGUAGEUNITNAMES }{@code >}
     * {@link JAXBElement }{@code <}{@link STRING }{@code >}
     * {@link JAXBElement }{@code <}{@link NUMERICALVALUE }{@code >}
     * {@link JAXBElement }{@code <}{@link NUMERICALVALUE }{@code >}
     * {@link JAXBElement }{@code <}{@link NUMERICALVALUE }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getABSAndTOLOrMIN() {
        if (absAndTOLOrMIN == null) {
            absAndTOLOrMIN = new ArrayList<JAXBElement<?>>();
        }
        return this.absAndTOLOrMIN;
    }

    /**
     * ??remark?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getREMARK() {
        return remark;
    }

    /**
     * ??remark?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setREMARK(DOCUMENTATIONBLOCK value) {
        this.remark = value;
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
