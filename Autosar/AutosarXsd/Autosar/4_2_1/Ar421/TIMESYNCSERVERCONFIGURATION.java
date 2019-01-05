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
 * Defines the configuration of the time synchronisation server.
 * 
 * <p>TIME-SYNC-SERVER-CONFIGURATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TIME-SYNC-SERVER-CONFIGURATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIME-SYNC-SERVER-CONFIGURATION"/>
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
@XmlType(name = "TIME-SYNC-SERVER-CONFIGURATION", propOrder = {
    "shortname",
    "priority",
    "syncinterval",
    "timesyncserveridentifier",
    "timesynctechnology"
})
public class TIMESYNCSERVERCONFIGURATION {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "PRIORITY")
    protected POSITIVEINTEGER priority;
    @XmlElement(name = "SYNC-INTERVAL")
    protected TIMEVALUE syncinterval;
    @XmlElement(name = "TIME-SYNC-SERVER-IDENTIFIER")
    protected STRING timesyncserveridentifier;
    @XmlElement(name = "TIME-SYNC-TECHNOLOGY")
    protected TIMESYNCTECHNOLOGYENUM timesynctechnology;
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
     * ??priority?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPRIORITY() {
        return priority;
    }

    /**
     * ??priority?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPRIORITY(POSITIVEINTEGER value) {
        this.priority = value;
    }

    /**
     * ??syncinterval?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getSYNCINTERVAL() {
        return syncinterval;
    }

    /**
     * ??syncinterval?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setSYNCINTERVAL(TIMEVALUE value) {
        this.syncinterval = value;
    }

    /**
     * ??timesyncserveridentifier?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getTIMESYNCSERVERIDENTIFIER() {
        return timesyncserveridentifier;
    }

    /**
     * ??timesyncserveridentifier?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setTIMESYNCSERVERIDENTIFIER(STRING value) {
        this.timesyncserveridentifier = value;
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

}
