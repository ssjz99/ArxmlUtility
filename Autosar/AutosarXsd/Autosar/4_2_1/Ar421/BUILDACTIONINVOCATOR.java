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
 * This meta-class represents the ability to specify the invocation of a task in a build action.
 * 
 * <p>BUILD-ACTION-INVOCATOR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BUILD-ACTION-INVOCATOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BUILD-ACTION-INVOCATOR"/>
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
@XmlType(name = "BUILD-ACTION-INVOCATOR", propOrder = {
    "command",
    "sdgs"
})
public class BUILDACTIONINVOCATOR {

    @XmlElement(name = "COMMAND")
    protected VERBATIMSTRING command;
    @XmlElement(name = "SDGS")
    protected BUILDACTIONINVOCATOR.SDGS sdgs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??command?????
     * 
     * @return
     *     possible object is
     *     {@link VERBATIMSTRING }
     *     
     */
    public VERBATIMSTRING getCOMMAND() {
        return command;
    }

    /**
     * ??command?????
     * 
     * @param value
     *     allowed object is
     *     {@link VERBATIMSTRING }
     *     
     */
    public void setCOMMAND(VERBATIMSTRING value) {
        this.command = value;
    }

    /**
     * ??sdgs?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTIONINVOCATOR.SDGS }
     *     
     */
    public BUILDACTIONINVOCATOR.SDGS getSDGS() {
        return sdgs;
    }

    /**
     * ??sdgs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTIONINVOCATOR.SDGS }
     *     
     */
    public void setSDGS(BUILDACTIONINVOCATOR.SDGS value) {
        this.sdgs = value;
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
     *         &lt;element name="SDG" type="{http://autosar.org/schema/r4.0}SDG"/>
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
        "sdg"
    })
    public static class SDGS {

        @XmlElement(name = "SDG")
        protected List<SDG> sdg;

        /**
         * Gets the value of the sdg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sdg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSDG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SDG }
         * 
         * 
         */
        public List<SDG> getSDG() {
            if (sdg == null) {
                sdg = new ArrayList<SDG>();
            }
            return this.sdg;
        }

    }

}
