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
 * Time to wait before answering the query.
 * 
 * <p>REQUEST-RESPONSE-DELAY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="REQUEST-RESPONSE-DELAY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REQUEST-RESPONSE-DELAY"/>
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
@XmlType(name = "REQUEST-RESPONSE-DELAY", propOrder = {
    "maxvalue",
    "minvalue"
})
public class REQUESTRESPONSEDELAY {

    @XmlElement(name = "MAX-VALUE")
    protected TIMEVALUE maxvalue;
    @XmlElement(name = "MIN-VALUE")
    protected TIMEVALUE minvalue;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??maxvalue?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getMAXVALUE() {
        return maxvalue;
    }

    /**
     * ??maxvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setMAXVALUE(TIMEVALUE value) {
        this.maxvalue = value;
    }

    /**
     * ??minvalue?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getMINVALUE() {
        return minvalue;
    }

    /**
     * ??minvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setMINVALUE(TIMEVALUE value) {
        this.minvalue = value;
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
