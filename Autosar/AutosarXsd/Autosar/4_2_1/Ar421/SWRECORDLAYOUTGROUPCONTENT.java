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
 * This is the contents of a RecordLayout which is inserted for every iteration. Note that since this is atpMixed, multiple properties can be inserted for each iteration.
 * 
 * <p>SW-RECORD-LAYOUT-GROUP-CONTENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-RECORD-LAYOUT-GROUP-CONTENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-RECORD-LAYOUT-GROUP-CONTENT"/>
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
@XmlType(name = "SW-RECORD-LAYOUT-GROUP-CONTENT", propOrder = {
    "orSWRECORDLAYOUTREFOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP"
})
public class SWRECORDLAYOUTGROUPCONTENT {

    @XmlElements({
        @XmlElement(name = "SW-RECORD-LAYOUT-REF", type = SWRECORDLAYOUTGROUP.SWRECORDLAYOUTREF.class),
        @XmlElement(name = "SW-RECORD-LAYOUT-V", type = SWRECORDLAYOUTV.class),
        @XmlElement(name = "SW-RECORD-LAYOUT-GROUP", type = SWRECORDLAYOUTGROUP.class)
    })
    protected List<Object> orSWRECORDLAYOUTREFOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the orSWRECORDLAYOUTREFOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orSWRECORDLAYOUTREFOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrSWRECORDLAYOUTREFOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWRECORDLAYOUTGROUP.SWRECORDLAYOUTREF }
     * {@link SWRECORDLAYOUTV }
     * {@link SWRECORDLAYOUTGROUP }
     * 
     * 
     */
    public List<Object> getOrSWRECORDLAYOUTREFOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP() {
        if (orSWRECORDLAYOUTREFOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP == null) {
            orSWRECORDLAYOUTREFOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP = new ArrayList<Object>();
        }
        return this.orSWRECORDLAYOUTREFOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP;
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
