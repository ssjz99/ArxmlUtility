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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>LIN-MASTER-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIN-MASTER-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-MASTER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-MASTER-CONDITIONAL"/>
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
@XmlType(name = "LIN-MASTER-CONDITIONAL", propOrder = {
    "wakeupbycontrollersupported",
    "protocolversion",
    "linslaves",
    "timebase",
    "timebasejitter",
    "variationpoint"
})
public class LINMASTERCONDITIONAL {

    @XmlElement(name = "WAKE-UP-BY-CONTROLLER-SUPPORTED")
    protected BOOLEAN wakeupbycontrollersupported;
    @XmlElement(name = "PROTOCOL-VERSION")
    protected STRING protocolversion;
    @XmlElement(name = "LIN-SLAVES")
    protected LINMASTERCONDITIONAL.LINSLAVES linslaves;
    @XmlElement(name = "TIME-BASE")
    protected TIMEVALUE timebase;
    @XmlElement(name = "TIME-BASE-JITTER")
    protected TIMEVALUE timebasejitter;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??wakeupbycontrollersupported?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getWAKEUPBYCONTROLLERSUPPORTED() {
        return wakeupbycontrollersupported;
    }

    /**
     * ??wakeupbycontrollersupported?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setWAKEUPBYCONTROLLERSUPPORTED(BOOLEAN value) {
        this.wakeupbycontrollersupported = value;
    }

    /**
     * ??protocolversion?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getPROTOCOLVERSION() {
        return protocolversion;
    }

    /**
     * ??protocolversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setPROTOCOLVERSION(STRING value) {
        this.protocolversion = value;
    }

    /**
     * ??linslaves?????
     * 
     * @return
     *     possible object is
     *     {@link LINMASTERCONDITIONAL.LINSLAVES }
     *     
     */
    public LINMASTERCONDITIONAL.LINSLAVES getLINSLAVES() {
        return linslaves;
    }

    /**
     * ??linslaves?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINMASTERCONDITIONAL.LINSLAVES }
     *     
     */
    public void setLINSLAVES(LINMASTERCONDITIONAL.LINSLAVES value) {
        this.linslaves = value;
    }

    /**
     * ??timebase?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEBASE() {
        return timebase;
    }

    /**
     * ??timebase?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEBASE(TIMEVALUE value) {
        this.timebase = value;
    }

    /**
     * ??timebasejitter?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEBASEJITTER() {
        return timebasejitter;
    }

    /**
     * ??timebasejitter?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEBASEJITTER(TIMEVALUE value) {
        this.timebasejitter = value;
    }

    /**
     * ??variationpoint?????
     * 
     * @return
     *     possible object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public VARIATIONPOINT getVARIATIONPOINT() {
        return variationpoint;
    }

    /**
     * ??variationpoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public void setVARIATIONPOINT(VARIATIONPOINT value) {
        this.variationpoint = value;
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
     *         &lt;element name="LIN-SLAVE-CONFIG" type="{http://autosar.org/schema/r4.0}LIN-SLAVE-CONFIG"/>
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
        "linslaveconfig"
    })
    public static class LINSLAVES {

        @XmlElement(name = "LIN-SLAVE-CONFIG")
        protected List<LINSLAVECONFIG> linslaveconfig;

        /**
         * Gets the value of the linslaveconfig property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linslaveconfig property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLINSLAVECONFIG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LINSLAVECONFIG }
         * 
         * 
         */
        public List<LINSLAVECONFIG> getLINSLAVECONFIG() {
            if (linslaveconfig == null) {
                linslaveconfig = new ArrayList<LINSLAVECONFIG>();
            }
            return this.linslaveconfig;
        }

    }

}
