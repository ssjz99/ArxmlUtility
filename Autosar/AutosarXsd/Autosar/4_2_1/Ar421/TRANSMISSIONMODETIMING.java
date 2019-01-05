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
 * If the COM Transmission Mode is false the timing is aggregated by the TransmissionModeTiming element in the role of transmissionModeFalseTiming. If the COM Transmission Mode is true the timing is aggregated by the TransmissionModeTiming element in the role of transmissionModeTrueTiming.  
 * 
 * COM supports the following Transmission Modes: 
 * Periodic (Cyclic Timing)
 * Direct /n-times (EventControlledTiming)
 * Mixed (Cyclic and EventControlledTiming are assigned)
 * None (no timing is assigned)
 * 
 * <p>TRANSMISSION-MODE-TIMING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TRANSMISSION-MODE-TIMING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSMISSION-MODE-TIMING"/>
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
@XmlType(name = "TRANSMISSION-MODE-TIMING", propOrder = {
    "cyclictiming",
    "eventcontrolledtiming"
})
public class TRANSMISSIONMODETIMING {

    @XmlElement(name = "CYCLIC-TIMING")
    protected CYCLICTIMING cyclictiming;
    @XmlElement(name = "EVENT-CONTROLLED-TIMING")
    protected EVENTCONTROLLEDTIMING eventcontrolledtiming;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??cyclictiming?????
     * 
     * @return
     *     possible object is
     *     {@link CYCLICTIMING }
     *     
     */
    public CYCLICTIMING getCYCLICTIMING() {
        return cyclictiming;
    }

    /**
     * ??cyclictiming?????
     * 
     * @param value
     *     allowed object is
     *     {@link CYCLICTIMING }
     *     
     */
    public void setCYCLICTIMING(CYCLICTIMING value) {
        this.cyclictiming = value;
    }

    /**
     * ??eventcontrolledtiming?????
     * 
     * @return
     *     possible object is
     *     {@link EVENTCONTROLLEDTIMING }
     *     
     */
    public EVENTCONTROLLEDTIMING getEVENTCONTROLLEDTIMING() {
        return eventcontrolledtiming;
    }

    /**
     * ??eventcontrolledtiming?????
     * 
     * @param value
     *     allowed object is
     *     {@link EVENTCONTROLLEDTIMING }
     *     
     */
    public void setEVENTCONTROLLEDTIMING(EVENTCONTROLLEDTIMING value) {
        this.eventcontrolledtiming = value;
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
