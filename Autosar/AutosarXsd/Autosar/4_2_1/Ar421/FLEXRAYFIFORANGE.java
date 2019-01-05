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
 * FIFO Frame Id range acceptance criteria.
 * 
 * <p>FLEXRAY-FIFO-RANGE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-FIFO-RANGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-FIFO-RANGE"/>
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
@XmlType(name = "FLEXRAY-FIFO-RANGE", propOrder = {
    "rangemax",
    "rangemin"
})
public class FLEXRAYFIFORANGE {

    @XmlElement(name = "RANGE-MAX")
    protected INTEGER rangemax;
    @XmlElement(name = "RANGE-MIN")
    protected INTEGER rangemin;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??rangemax?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getRANGEMAX() {
        return rangemax;
    }

    /**
     * ??rangemax?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setRANGEMAX(INTEGER value) {
        this.rangemax = value;
    }

    /**
     * ??rangemin?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getRANGEMIN() {
        return rangemin;
    }

    /**
     * ??rangemin?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setRANGEMIN(INTEGER value) {
        this.rangemin = value;
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
