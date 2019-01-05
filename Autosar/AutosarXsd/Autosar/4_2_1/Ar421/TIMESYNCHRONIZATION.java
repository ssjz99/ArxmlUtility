//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the servers / clients in a time synchronised network.
 * 
 * <p>TIME-SYNCHRONIZATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TIME-SYNCHRONIZATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIME-SYNCHRONIZATION"/>
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
@XmlType(name = "TIME-SYNCHRONIZATION", propOrder = {
    "timesyncclient",
    "timesyncserver"
})
public class TIMESYNCHRONIZATION {

    @XmlElement(name = "TIME-SYNC-CLIENT")
    protected TIMESYNCCLIENTCONFIGURATION timesyncclient;
    @XmlElement(name = "TIME-SYNC-SERVER")
    protected TIMESYNCSERVERCONFIGURATION timesyncserver;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??timesyncclient?????
     * 
     * @return
     *     possible object is
     *     {@link TIMESYNCCLIENTCONFIGURATION }
     *     
     */
    public TIMESYNCCLIENTCONFIGURATION getTIMESYNCCLIENT() {
        return timesyncclient;
    }

    /**
     * ??timesyncclient?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMESYNCCLIENTCONFIGURATION }
     *     
     */
    public void setTIMESYNCCLIENT(TIMESYNCCLIENTCONFIGURATION value) {
        this.timesyncclient = value;
    }

    /**
     * ??timesyncserver?????
     * 
     * @return
     *     possible object is
     *     {@link TIMESYNCSERVERCONFIGURATION }
     *     
     */
    public TIMESYNCSERVERCONFIGURATION getTIMESYNCSERVER() {
        return timesyncserver;
    }

    /**
     * ??timesyncserver?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMESYNCSERVERCONFIGURATION }
     *     
     */
    public void setTIMESYNCSERVER(TIMESYNCSERVERCONFIGURATION value) {
        this.timesyncserver = value;
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
