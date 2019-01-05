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
 * This is the basic content model of a chapter except the Chapter title. This can be utilized in general chapters as well as in predefined chapters.
 * 
 * A chapter has content on three levels:
 * 
 *  1. chapter content
 * 
 *  2. topics
 * 
 *  3. subchapters
 * 
 * <p>CHAPTER-MODEL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CHAPTER-MODEL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CHAPTER-MODEL"/>
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
@XmlType(name = "CHAPTER-MODEL", propOrder = {
    "msrqueryp1OrPOrVERBATIM",
    "topic1OrMSRQUERYTOPIC1",
    "chapterOrMSRQUERYCHAPTER"
})
public class CHAPTERMODEL {

    @XmlElements({
        @XmlElement(name = "MSR-QUERY-P-1", type = MSRQUERYP1 .class),
        @XmlElement(name = "P", type = MULTILANGUAGEPARAGRAPH.class),
        @XmlElement(name = "VERBATIM", type = MULTILANGUAGEVERBATIM.class),
        @XmlElement(name = "LIST", type = LIST.class),
        @XmlElement(name = "DEF-LIST", type = DEFLIST.class),
        @XmlElement(name = "LABELED-LIST", type = LABELEDLIST.class),
        @XmlElement(name = "FORMULA", type = MLFORMULA.class),
        @XmlElement(name = "FIGURE", type = MLFIGURE.class),
        @XmlElement(name = "NOTE", type = NOTE.class),
        @XmlElement(name = "TRACE", type = TRACEABLETEXT.class),
        @XmlElement(name = "STRUCTURED-REQ", type = STRUCTUREDREQ.class),
        @XmlElement(name = "TABLE", type = TABLE.class),
        @XmlElement(name = "PRMS", type = PRMS.class)
    })
    protected List<Object> msrqueryp1OrPOrVERBATIM;
    @XmlElements({
        @XmlElement(name = "TOPIC-1", type = TOPIC1 .class),
        @XmlElement(name = "MSR-QUERY-TOPIC-1", type = MSRQUERYTOPIC1 .class)
    })
    protected List<Object> topic1OrMSRQUERYTOPIC1;
    @XmlElements({
        @XmlElement(name = "CHAPTER", type = CHAPTER.class),
        @XmlElement(name = "MSR-QUERY-CHAPTER", type = MSRQUERYCHAPTER.class)
    })
    protected List<Object> chapterOrMSRQUERYCHAPTER;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the msrqueryp1OrPOrVERBATIM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msrqueryp1OrPOrVERBATIM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMSRQUERYP1OrPOrVERBATIM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MSRQUERYP1 }
     * {@link MULTILANGUAGEPARAGRAPH }
     * {@link MULTILANGUAGEVERBATIM }
     * {@link LIST }
     * {@link DEFLIST }
     * {@link LABELEDLIST }
     * {@link MLFORMULA }
     * {@link MLFIGURE }
     * {@link NOTE }
     * {@link TRACEABLETEXT }
     * {@link STRUCTUREDREQ }
     * {@link TABLE }
     * {@link PRMS }
     * 
     * 
     */
    public List<Object> getMSRQUERYP1OrPOrVERBATIM() {
        if (msrqueryp1OrPOrVERBATIM == null) {
            msrqueryp1OrPOrVERBATIM = new ArrayList<Object>();
        }
        return this.msrqueryp1OrPOrVERBATIM;
    }

    /**
     * Gets the value of the topic1OrMSRQUERYTOPIC1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topic1OrMSRQUERYTOPIC1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOPIC1OrMSRQUERYTOPIC1().add(newItem);
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
    public List<Object> getTOPIC1OrMSRQUERYTOPIC1() {
        if (topic1OrMSRQUERYTOPIC1 == null) {
            topic1OrMSRQUERYTOPIC1 = new ArrayList<Object>();
        }
        return this.topic1OrMSRQUERYTOPIC1;
    }

    /**
     * Gets the value of the chapterOrMSRQUERYCHAPTER property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chapterOrMSRQUERYCHAPTER property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCHAPTEROrMSRQUERYCHAPTER().add(newItem);
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
    public List<Object> getCHAPTEROrMSRQUERYCHAPTER() {
        if (chapterOrMSRQUERYCHAPTER == null) {
            chapterOrMSRQUERYCHAPTER = new ArrayList<Object>();
        }
        return this.chapterOrMSRQUERYCHAPTER;
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
