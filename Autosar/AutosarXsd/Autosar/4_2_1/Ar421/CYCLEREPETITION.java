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
 * The communication cycle where the frame is send is described by the
 * attributes baseCycle and cycleRepetition.
 * 
 * <p>CYCLE-REPETITION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CYCLE-REPETITION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CYCLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CYCLE-REPETITION"/>
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
@XmlType(name = "CYCLE-REPETITION", propOrder = {
    "basecycle",
    "cyclerepetition"
})
public class CYCLEREPETITION {

    @XmlElement(name = "BASE-CYCLE")
    protected INTEGER basecycle;
    @XmlElement(name = "CYCLE-REPETITION")
    protected CYCLEREPETITIONTYPE cyclerepetition;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??basecycle?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getBASECYCLE() {
        return basecycle;
    }

    /**
     * ??basecycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setBASECYCLE(INTEGER value) {
        this.basecycle = value;
    }

    /**
     * ??cyclerepetition?????
     * 
     * @return
     *     possible object is
     *     {@link CYCLEREPETITIONTYPE }
     *     
     */
    public CYCLEREPETITIONTYPE getCYCLEREPETITION() {
        return cyclerepetition;
    }

    /**
     * ??cyclerepetition?????
     * 
     * @param value
     *     allowed object is
     *     {@link CYCLEREPETITIONTYPE }
     *     
     */
    public void setCYCLEREPETITION(CYCLEREPETITIONTYPE value) {
        this.cyclerepetition = value;
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
