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
 * This metaclass represents the fact that it is a numerical parameter.
 * 
 * <p>PRM-CHAR-NUMERICAL-CONTENTS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PRM-CHAR-NUMERICAL-CONTENTS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PRM-CHAR-CONTENTS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PRM-CHAR-NUMERICAL-CONTENTS"/>
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
@XmlType(name = "PRM-CHAR-NUMERICAL-CONTENTS", propOrder = {
    "absAndTOLOrMIN",
    "prmunit"
})
public class PRMCHARNUMERICALCONTENTS {

    @XmlElementRefs({
        @XmlElementRef(name = "MIN", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TOL", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TYP", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MAX", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ABS", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<NUMERICALVALUE>> absAndTOLOrMIN;
    @XmlElement(name = "PRM-UNIT")
    protected SINGLELANGUAGEUNITNAMES prmunit;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * {@link JAXBElement }{@code <}{@link NUMERICALVALUE }{@code >}
     * {@link JAXBElement }{@code <}{@link NUMERICALVALUE }{@code >}
     * {@link JAXBElement }{@code <}{@link NUMERICALVALUE }{@code >}
     * 
     * 
     */
    public List<JAXBElement<NUMERICALVALUE>> getABSAndTOLOrMIN() {
        if (absAndTOLOrMIN == null) {
            absAndTOLOrMIN = new ArrayList<JAXBElement<NUMERICALVALUE>>();
        }
        return this.absAndTOLOrMIN;
    }

    /**
     * ??prmunit?????
     * 
     * @return
     *     possible object is
     *     {@link SINGLELANGUAGEUNITNAMES }
     *     
     */
    public SINGLELANGUAGEUNITNAMES getPRMUNIT() {
        return prmunit;
    }

    /**
     * ??prmunit?????
     * 
     * @param value
     *     allowed object is
     *     {@link SINGLELANGUAGEUNITNAMES }
     *     
     */
    public void setPRMUNIT(SINGLELANGUAGEUNITNAMES value) {
        this.prmunit = value;
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
