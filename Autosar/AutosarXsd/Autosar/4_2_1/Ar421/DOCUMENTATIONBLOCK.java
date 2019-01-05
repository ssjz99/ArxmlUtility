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
 * This class represents a documentation block. It is made of basic text structure elements which can be displayed in a table cell.
 * 
 * <p>DOCUMENTATION-BLOCK complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DOCUMENTATION-BLOCK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DOCUMENTATION-BLOCK"/>
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
@XmlType(name = "DOCUMENTATION-BLOCK", propOrder = {
    "orPOrVERBATIMOrLIST"
})
public class DOCUMENTATIONBLOCK {

    @XmlElements({
        @XmlElement(name = "P", type = MULTILANGUAGEPARAGRAPH.class),
        @XmlElement(name = "VERBATIM", type = MULTILANGUAGEVERBATIM.class),
        @XmlElement(name = "LIST", type = LIST.class),
        @XmlElement(name = "DEF-LIST", type = DEFLIST.class),
        @XmlElement(name = "LABELED-LIST", type = LABELEDLIST.class),
        @XmlElement(name = "FORMULA", type = MLFORMULA.class),
        @XmlElement(name = "FIGURE", type = MLFIGURE.class),
        @XmlElement(name = "NOTE", type = NOTE.class),
        @XmlElement(name = "TRACE", type = TRACEABLETEXT.class),
        @XmlElement(name = "STRUCTURED-REQ", type = STRUCTUREDREQ.class)
    })
    protected List<Object> orPOrVERBATIMOrLIST;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the orPOrVERBATIMOrLIST property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orPOrVERBATIMOrLIST property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrPOrVERBATIMOrLIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
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
     * 
     * 
     */
    public List<Object> getOrPOrVERBATIMOrLIST() {
        if (orPOrVERBATIMOrLIST == null) {
            orPOrVERBATIMOrLIST = new ArrayList<Object>();
        }
        return this.orPOrVERBATIMOrLIST;
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