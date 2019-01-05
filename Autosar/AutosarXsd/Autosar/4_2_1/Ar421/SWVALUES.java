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
 * This meta-class represents a list of values. These values can either be the input values of a curve (abscissa values) or the associated values (ordinate values). 
 * 
 * In case of multidimensional structures, the values are ordered such that the lowest index runs the fastest. In particular for maps and cuboids etc. the resulting long value list can be subsectioned using ValueGroup. But the processing needs to be done as if vg is not there.
 * 
 * Note that numerical values and textual values should not be mixed.
 * 
 * <p>SW-VALUES complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-VALUES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-VALUES"/>
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
@XmlType(name = "SW-VALUES", propOrder = {
    "orVTFOrVFOrVT"
})
public class SWVALUES {

    @XmlElements({
        @XmlElement(name = "VTF", type = NUMERICALORTEXT.class),
        @XmlElement(name = "VF", type = NUMERICALVALUEVARIATIONPOINT.class),
        @XmlElement(name = "VT", type = VERBATIMSTRING.class),
        @XmlElement(name = "V", type = NUMERICALVALUE.class),
        @XmlElement(name = "VG", type = VALUEGROUP.class)
    })
    protected List<Object> orVTFOrVFOrVT;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the orVTFOrVFOrVT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orVTFOrVFOrVT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrVTFOrVFOrVT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NUMERICALORTEXT }
     * {@link NUMERICALVALUEVARIATIONPOINT }
     * {@link VERBATIMSTRING }
     * {@link NUMERICALVALUE }
     * {@link VALUEGROUP }
     * 
     * 
     */
    public List<Object> getOrVTFOrVFOrVT() {
        if (orVTFOrVFOrVT == null) {
            orVTFOrVFOrVT = new ArrayList<Object>();
        }
        return this.orVTFOrVFOrVT;
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
