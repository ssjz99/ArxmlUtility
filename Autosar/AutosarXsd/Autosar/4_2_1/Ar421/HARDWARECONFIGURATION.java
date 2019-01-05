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
 * Describes in which mode the hardware is operating while needing this resource consumption.
 * 
 * <p>HARDWARE-CONFIGURATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="HARDWARE-CONFIGURATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}HARDWARE-CONFIGURATION"/>
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
@XmlType(name = "HARDWARE-CONFIGURATION", propOrder = {
    "additionalinformation",
    "processormode",
    "processorspeed"
})
public class HARDWARECONFIGURATION {

    @XmlElement(name = "ADDITIONAL-INFORMATION")
    protected STRING additionalinformation;
    @XmlElement(name = "PROCESSOR-MODE")
    protected STRING processormode;
    @XmlElement(name = "PROCESSOR-SPEED")
    protected STRING processorspeed;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??additionalinformation?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getADDITIONALINFORMATION() {
        return additionalinformation;
    }

    /**
     * ??additionalinformation?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setADDITIONALINFORMATION(STRING value) {
        this.additionalinformation = value;
    }

    /**
     * ??processormode?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getPROCESSORMODE() {
        return processormode;
    }

    /**
     * ??processormode?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setPROCESSORMODE(STRING value) {
        this.processormode = value;
    }

    /**
     * ??processorspeed?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getPROCESSORSPEED() {
        return processorspeed;
    }

    /**
     * ??processorspeed?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setPROCESSORSPEED(STRING value) {
        this.processorspeed = value;
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
