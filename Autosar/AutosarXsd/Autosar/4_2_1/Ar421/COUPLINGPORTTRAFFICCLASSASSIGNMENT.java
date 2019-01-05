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
 * Defines the assignment of Traffic Class to a frame.
 * 
 * Two use-cases are supported:
 *  1. Only one ethernetTrafficClassAssignment is defined and NO priority is given:
 * --&gt; all frames on this ingress port get assigned the trafficClass.
 *  2. for each ethernetTrafficClass WITH a priority the frames which are coming in with this priority get assigned the trafficClass.
 * 
 * Constraint: 1 and 2 can not be combined for one CouplingPortDetails.
 * 
 * <p>COUPLING-PORT-TRAFFIC-CLASS-ASSIGNMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COUPLING-PORT-TRAFFIC-CLASS-ASSIGNMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COUPLING-PORT-TRAFFIC-CLASS-ASSIGNMENT"/>
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
@XmlType(name = "COUPLING-PORT-TRAFFIC-CLASS-ASSIGNMENT", propOrder = {
    "shortname",
    "prioritys",
    "trafficclass"
})
public class COUPLINGPORTTRAFFICCLASSASSIGNMENT {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "PRIORITYS")
    protected COUPLINGPORTTRAFFICCLASSASSIGNMENT.PRIORITYS prioritys;
    @XmlElement(name = "TRAFFIC-CLASS")
    protected POSITIVEINTEGER trafficclass;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??prioritys?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORTTRAFFICCLASSASSIGNMENT.PRIORITYS }
     *     
     */
    public COUPLINGPORTTRAFFICCLASSASSIGNMENT.PRIORITYS getPRIORITYS() {
        return prioritys;
    }

    /**
     * ??prioritys?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORTTRAFFICCLASSASSIGNMENT.PRIORITYS }
     *     
     */
    public void setPRIORITYS(COUPLINGPORTTRAFFICCLASSASSIGNMENT.PRIORITYS value) {
        this.prioritys = value;
    }

    /**
     * ??trafficclass?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getTRAFFICCLASS() {
        return trafficclass;
    }

    /**
     * ??trafficclass?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setTRAFFICCLASS(POSITIVEINTEGER value) {
        this.trafficclass = value;
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
     *       &lt;choice maxOccurs="8" minOccurs="0">
     *         &lt;element name="PRIORITY" type="{http://autosar.org/schema/r4.0}POSITIVE-INTEGER"/>
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
        "priority"
    })
    public static class PRIORITYS {

        @XmlElement(name = "PRIORITY")
        protected List<POSITIVEINTEGER> priority;

        /**
         * Gets the value of the priority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRIORITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link POSITIVEINTEGER }
         * 
         * 
         */
        public List<POSITIVEINTEGER> getPRIORITY() {
            if (priority == null) {
                priority = new ArrayList<POSITIVEINTEGER>();
            }
            return this.priority;
        }

    }

}
