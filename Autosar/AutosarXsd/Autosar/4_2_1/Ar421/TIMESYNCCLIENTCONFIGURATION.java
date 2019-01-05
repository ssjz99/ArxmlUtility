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
 * Defines the configuration of the time synchronisation client.
 * 
 * <p>TIME-SYNC-CLIENT-CONFIGURATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TIME-SYNC-CLIENT-CONFIGURATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIME-SYNC-CLIENT-CONFIGURATION"/>
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
@XmlType(name = "TIME-SYNC-CLIENT-CONFIGURATION", propOrder = {
    "orderedmasterlist",
    "timesynctechnology"
})
public class TIMESYNCCLIENTCONFIGURATION {

    @XmlElement(name = "ORDERED-MASTER-LIST")
    protected TIMESYNCCLIENTCONFIGURATION.ORDEREDMASTERLIST orderedmasterlist;
    @XmlElement(name = "TIME-SYNC-TECHNOLOGY")
    protected TIMESYNCTECHNOLOGYENUM timesynctechnology;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??orderedmasterlist?????
     * 
     * @return
     *     possible object is
     *     {@link TIMESYNCCLIENTCONFIGURATION.ORDEREDMASTERLIST }
     *     
     */
    public TIMESYNCCLIENTCONFIGURATION.ORDEREDMASTERLIST getORDEREDMASTERLIST() {
        return orderedmasterlist;
    }

    /**
     * ??orderedmasterlist?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMESYNCCLIENTCONFIGURATION.ORDEREDMASTERLIST }
     *     
     */
    public void setORDEREDMASTERLIST(TIMESYNCCLIENTCONFIGURATION.ORDEREDMASTERLIST value) {
        this.orderedmasterlist = value;
    }

    /**
     * ??timesynctechnology?????
     * 
     * @return
     *     possible object is
     *     {@link TIMESYNCTECHNOLOGYENUM }
     *     
     */
    public TIMESYNCTECHNOLOGYENUM getTIMESYNCTECHNOLOGY() {
        return timesynctechnology;
    }

    /**
     * ??timesynctechnology?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMESYNCTECHNOLOGYENUM }
     *     
     */
    public void setTIMESYNCTECHNOLOGY(TIMESYNCTECHNOLOGYENUM value) {
        this.timesynctechnology = value;
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
     *         &lt;element name="ORDERED-MASTER" type="{http://autosar.org/schema/r4.0}ORDERED-MASTER"/>
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
        "orderedmaster"
    })
    public static class ORDEREDMASTERLIST {

        @XmlElement(name = "ORDERED-MASTER")
        protected List<ORDEREDMASTER> orderedmaster;

        /**
         * Gets the value of the orderedmaster property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderedmaster property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORDEREDMASTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ORDEREDMASTER }
         * 
         * 
         */
        public List<ORDEREDMASTER> getORDEREDMASTER() {
            if (orderedmaster == null) {
                orderedmaster = new ArrayList<ORDEREDMASTER>();
            }
            return this.orderedmaster;
        }

    }

}
