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
 * This element contains the attributes that are used to configure the CAN bus off monitoring / recovery at system level.
 * 
 * <p>CAN-CLUSTER-BUS-OFF-RECOVERY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-CLUSTER-BUS-OFF-RECOVERY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-CLUSTER-BUS-OFF-RECOVERY"/>
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
@XmlType(name = "CAN-CLUSTER-BUS-OFF-RECOVERY", propOrder = {
    "borcounterl1TOL2",
    "bortimel1",
    "bortimel2",
    "bortimetxensured",
    "mainfunctionperiod"
})
public class CANCLUSTERBUSOFFRECOVERY {

    @XmlElement(name = "BOR-COUNTER-L-1-TO-L-2")
    protected POSITIVEINTEGER borcounterl1TOL2;
    @XmlElement(name = "BOR-TIME-L-1")
    protected TIMEVALUE bortimel1;
    @XmlElement(name = "BOR-TIME-L-2")
    protected TIMEVALUE bortimel2;
    @XmlElement(name = "BOR-TIME-TX-ENSURED")
    protected TIMEVALUE bortimetxensured;
    @XmlElement(name = "MAIN-FUNCTION-PERIOD")
    protected TIMEVALUE mainfunctionperiod;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??borcounterl1TOL2?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getBORCOUNTERL1TOL2() {
        return borcounterl1TOL2;
    }

    /**
     * ??borcounterl1TOL2?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setBORCOUNTERL1TOL2(POSITIVEINTEGER value) {
        this.borcounterl1TOL2 = value;
    }

    /**
     * ??bortimel1?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getBORTIMEL1() {
        return bortimel1;
    }

    /**
     * ??bortimel1?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setBORTIMEL1(TIMEVALUE value) {
        this.bortimel1 = value;
    }

    /**
     * ??bortimel2?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getBORTIMEL2() {
        return bortimel2;
    }

    /**
     * ??bortimel2?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setBORTIMEL2(TIMEVALUE value) {
        this.bortimel2 = value;
    }

    /**
     * ??bortimetxensured?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getBORTIMETXENSURED() {
        return bortimetxensured;
    }

    /**
     * ??bortimetxensured?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setBORTIMETXENSURED(TIMEVALUE value) {
        this.bortimetxensured = value;
    }

    /**
     * ??mainfunctionperiod?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getMAINFUNCTIONPERIOD() {
        return mainfunctionperiod;
    }

    /**
     * ??mainfunctionperiod?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setMAINFUNCTIONPERIOD(TIMEVALUE value) {
        this.mainfunctionperiod = value;
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
