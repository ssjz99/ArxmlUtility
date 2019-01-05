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
 * This meta-class represents the possible contents of a special data group. It can be an arbitrary mix of references, of primitive special data and nested special data groups.
 * 
 * <p>SDG-CONTENTS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SDG-CONTENTS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SDG-CONTENTS"/>
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
@XmlType(name = "SDG-CONTENTS", propOrder = {
    "orSDXREFOrSDXFOrSD"
})
public class SDGCONTENTS {

    @XmlElements({
        @XmlElement(name = "SDX-REF", type = SDGCONTENTS.SDXREF.class),
        @XmlElement(name = "SDXF", type = REFERRABLEREFCONDITIONAL.class),
        @XmlElement(name = "SD", type = SD.class),
        @XmlElement(name = "SDG", type = SDG.class),
        @XmlElement(name = "SDF", type = SDF.class)
    })
    protected List<Object> orSDXREFOrSDXFOrSD;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the orSDXREFOrSDXFOrSD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orSDXREFOrSDXFOrSD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrSDXREFOrSDXFOrSD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SDGCONTENTS.SDXREF }
     * {@link REFERRABLEREFCONDITIONAL }
     * {@link SD }
     * {@link SDG }
     * {@link SDF }
     * 
     * 
     */
    public List<Object> getOrSDXREFOrSDXFOrSD() {
        if (orSDXREFOrSDXFOrSD == null) {
            orSDXREFOrSDXFOrSD = new ArrayList<Object>();
        }
        return this.orSDXREFOrSDXFOrSD;
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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SDXREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected REFERRABLESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link REFERRABLESUBTYPESENUM }
         *     
         */
        public REFERRABLESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link REFERRABLESUBTYPESENUM }
         *     
         */
        public void setDEST(REFERRABLESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
