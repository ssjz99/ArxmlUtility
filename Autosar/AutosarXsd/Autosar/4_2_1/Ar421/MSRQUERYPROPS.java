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
 * This metaclass represents the ability to specificy a query which yields some documentation text. The qualities of the result are determined by the context in which the query is used.
 * 
 * <p>MSR-QUERY-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MSR-QUERY-PROPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MSR-QUERY-PROPS"/>
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
@XmlType(name = "MSR-QUERY-PROPS", propOrder = {
    "msrqueryname",
    "msrqueryarg",
    "comment"
})
public class MSRQUERYPROPS {

    @XmlElement(name = "MSR-QUERY-NAME")
    protected STRING msrqueryname;
    @XmlElement(name = "MSR-QUERY-ARG")
    protected List<MSRQUERYARG> msrqueryarg;
    @XmlElement(name = "COMMENT")
    protected STRING comment;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??msrqueryname?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getMSRQUERYNAME() {
        return msrqueryname;
    }

    /**
     * ??msrqueryname?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setMSRQUERYNAME(STRING value) {
        this.msrqueryname = value;
    }

    /**
     * Gets the value of the msrqueryarg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msrqueryarg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMSRQUERYARG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MSRQUERYARG }
     * 
     * 
     */
    public List<MSRQUERYARG> getMSRQUERYARG() {
        if (msrqueryarg == null) {
            msrqueryarg = new ArrayList<MSRQUERYARG>();
        }
        return this.msrqueryarg;
    }

    /**
     * ??comment?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getCOMMENT() {
        return comment;
    }

    /**
     * ??comment?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setCOMMENT(STRING value) {
        this.comment = value;
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
