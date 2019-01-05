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
 * Configuration of the buffer properties the transformer needs to work.
 * 
 * <p>BUFFER-PROPERTIES complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BUFFER-PROPERTIES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BUFFER-PROPERTIES"/>
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
@XmlType(name = "BUFFER-PROPERTIES", propOrder = {
    "buffercomputation",
    "headerlength",
    "inplace"
})
public class BUFFERPROPERTIES {

    @XmlElement(name = "BUFFER-COMPUTATION")
    protected COMPUSCALE buffercomputation;
    @XmlElement(name = "HEADER-LENGTH")
    protected INTEGER headerlength;
    @XmlElement(name = "IN-PLACE")
    protected BOOLEAN inplace;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??buffercomputation?????
     * 
     * @return
     *     possible object is
     *     {@link COMPUSCALE }
     *     
     */
    public COMPUSCALE getBUFFERCOMPUTATION() {
        return buffercomputation;
    }

    /**
     * ??buffercomputation?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPUSCALE }
     *     
     */
    public void setBUFFERCOMPUTATION(COMPUSCALE value) {
        this.buffercomputation = value;
    }

    /**
     * ??headerlength?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getHEADERLENGTH() {
        return headerlength;
    }

    /**
     * ??headerlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setHEADERLENGTH(INTEGER value) {
        this.headerlength = value;
    }

    /**
     * ??inplace?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getINPLACE() {
        return inplace;
    }

    /**
     * ??inplace?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setINPLACE(BOOLEAN value) {
        this.inplace = value;
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
