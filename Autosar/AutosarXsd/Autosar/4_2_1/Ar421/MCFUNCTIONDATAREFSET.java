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
 * Refers to a set of data assigned to an McFunction in a particular role. The data are given
 * * either by entries in a FlatMap
 * * or by data instances that are part of MC support data.
 * These two possibilities are exclusive within a given McFunctionDataRefSet. Which one to use depends on the process and tool environment. 
 * 
 * The set is subject to variability because the same functional model may be used with various representation of the data.
 * 
 * <p>MC-FUNCTION-DATA-REF-SET complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MC-FUNCTION-DATA-REF-SET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MC-FUNCTION-DATA-REF-SET"/>
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
@XmlType(name = "MC-FUNCTION-DATA-REF-SET", propOrder = {
    "mcfunctiondatarefsetvariants"
})
public class MCFUNCTIONDATAREFSET {

    @XmlElement(name = "MC-FUNCTION-DATA-REF-SET-VARIANTS")
    protected MCFUNCTIONDATAREFSET.MCFUNCTIONDATAREFSETVARIANTS mcfunctiondatarefsetvariants;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??mcfunctiondatarefsetvariants?????
     * 
     * @return
     *     possible object is
     *     {@link MCFUNCTIONDATAREFSET.MCFUNCTIONDATAREFSETVARIANTS }
     *     
     */
    public MCFUNCTIONDATAREFSET.MCFUNCTIONDATAREFSETVARIANTS getMCFUNCTIONDATAREFSETVARIANTS() {
        return mcfunctiondatarefsetvariants;
    }

    /**
     * ??mcfunctiondatarefsetvariants?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCFUNCTIONDATAREFSET.MCFUNCTIONDATAREFSETVARIANTS }
     *     
     */
    public void setMCFUNCTIONDATAREFSETVARIANTS(MCFUNCTIONDATAREFSET.MCFUNCTIONDATAREFSETVARIANTS value) {
        this.mcfunctiondatarefsetvariants = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="MC-FUNCTION-DATA-REF-SET-CONDITIONAL" type="{http://autosar.org/schema/r4.0}MC-FUNCTION-DATA-REF-SET-CONDITIONAL"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mcfunctiondatarefsetconditional"
    })
    public static class MCFUNCTIONDATAREFSETVARIANTS {

        @XmlElement(name = "MC-FUNCTION-DATA-REF-SET-CONDITIONAL")
        protected List<MCFUNCTIONDATAREFSETCONDITIONAL> mcfunctiondatarefsetconditional;

        /**
         * Gets the value of the mcfunctiondatarefsetconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcfunctiondatarefsetconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCFUNCTIONDATAREFSETCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCFUNCTIONDATAREFSETCONDITIONAL }
         * 
         * 
         */
        public List<MCFUNCTIONDATAREFSETCONDITIONAL> getMCFUNCTIONDATAREFSETCONDITIONAL() {
            if (mcfunctiondatarefsetconditional == null) {
                mcfunctiondatarefsetconditional = new ArrayList<MCFUNCTIONDATAREFSETCONDITIONAL>();
            }
            return this.mcfunctiondatarefsetconditional;
        }

    }

}
