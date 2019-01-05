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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * This meta-class represents the ability to denote a particular chapter or a query returning a chapter.
 * 
 * <p>CHAPTER-OR-MSR-QUERY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CHAPTER-OR-MSR-QUERY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CHAPTER-OR-MSR-QUERY"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHAPTER-OR-MSR-QUERY", propOrder = {
    "orCHAPTEROrMSRQUERYCHAPTER"
})
public class CHAPTERORMSRQUERY {

    @XmlElements({
        @XmlElement(name = "CHAPTER", type = CHAPTER.class),
        @XmlElement(name = "MSR-QUERY-CHAPTER", type = MSRQUERYCHAPTER.class)
    })
    protected List<Object> orCHAPTEROrMSRQUERYCHAPTER;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the orCHAPTEROrMSRQUERYCHAPTER property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orCHAPTEROrMSRQUERYCHAPTER property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrCHAPTEROrMSRQUERYCHAPTER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHAPTER }
     * {@link MSRQUERYCHAPTER }
     * 
     * 
     */
    public List<Object> getOrCHAPTEROrMSRQUERYCHAPTER() {
        if (orCHAPTEROrMSRQUERYCHAPTER == null) {
            orCHAPTEROrMSRQUERYCHAPTER = new ArrayList<Object>();
        }
        return this.orCHAPTEROrMSRQUERYCHAPTER;
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
