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
 * This class provides the alternative of a Topic with an MsrQuery which delivers a topic.
 * 
 * <p>TOPIC-OR-MSR-QUERY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TOPIC-OR-MSR-QUERY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TOPIC-OR-MSR-QUERY"/>
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
@XmlType(name = "TOPIC-OR-MSR-QUERY", propOrder = {
    "orTOPIC1OrMSRQUERYTOPIC1"
})
public class TOPICORMSRQUERY {

    @XmlElements({
        @XmlElement(name = "TOPIC-1", type = TOPIC1 .class),
        @XmlElement(name = "MSR-QUERY-TOPIC-1", type = MSRQUERYTOPIC1 .class)
    })
    protected List<Object> orTOPIC1OrMSRQUERYTOPIC1;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the orTOPIC1OrMSRQUERYTOPIC1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orTOPIC1OrMSRQUERYTOPIC1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrTOPIC1OrMSRQUERYTOPIC1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOPIC1 }
     * {@link MSRQUERYTOPIC1 }
     * 
     * 
     */
    public List<Object> getOrTOPIC1OrMSRQUERYTOPIC1() {
        if (orTOPIC1OrMSRQUERYTOPIC1 == null) {
            orTOPIC1OrMSRQUERYTOPIC1 = new ArrayList<Object>();
        }
        return this.orTOPIC1OrMSRQUERYTOPIC1;
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
