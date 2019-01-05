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
 * Base class for data filters. The type of the filter is specified in attribute dataFilterType. Some of the filter types require additional arguments which are specified as attributes of this class.
 * 
 * <p>DATA-FILTER complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DATA-FILTER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DATA-FILTER"/>
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
@XmlType(name = "DATA-FILTER", propOrder = {
    "datafiltertype",
    "mask",
    "max",
    "min",
    "offset",
    "period",
    "x"
})
public class DATAFILTER {

    @XmlElement(name = "DATA-FILTER-TYPE")
    protected DATAFILTERTYPEENUM datafiltertype;
    @XmlElement(name = "MASK")
    protected UNLIMITEDINTEGER mask;
    @XmlElement(name = "MAX")
    protected UNLIMITEDINTEGER max;
    @XmlElement(name = "MIN")
    protected UNLIMITEDINTEGER min;
    @XmlElement(name = "OFFSET")
    protected POSITIVEINTEGER offset;
    @XmlElement(name = "PERIOD")
    protected POSITIVEINTEGER period;
    @XmlElement(name = "X")
    protected UNLIMITEDINTEGER x;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??datafiltertype?????
     * 
     * @return
     *     possible object is
     *     {@link DATAFILTERTYPEENUM }
     *     
     */
    public DATAFILTERTYPEENUM getDATAFILTERTYPE() {
        return datafiltertype;
    }

    /**
     * ??datafiltertype?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATAFILTERTYPEENUM }
     *     
     */
    public void setDATAFILTERTYPE(DATAFILTERTYPEENUM value) {
        this.datafiltertype = value;
    }

    /**
     * ??mask?????
     * 
     * @return
     *     possible object is
     *     {@link UNLIMITEDINTEGER }
     *     
     */
    public UNLIMITEDINTEGER getMASK() {
        return mask;
    }

    /**
     * ??mask?????
     * 
     * @param value
     *     allowed object is
     *     {@link UNLIMITEDINTEGER }
     *     
     */
    public void setMASK(UNLIMITEDINTEGER value) {
        this.mask = value;
    }

    /**
     * ??max?????
     * 
     * @return
     *     possible object is
     *     {@link UNLIMITEDINTEGER }
     *     
     */
    public UNLIMITEDINTEGER getMAX() {
        return max;
    }

    /**
     * ??max?????
     * 
     * @param value
     *     allowed object is
     *     {@link UNLIMITEDINTEGER }
     *     
     */
    public void setMAX(UNLIMITEDINTEGER value) {
        this.max = value;
    }

    /**
     * ??min?????
     * 
     * @return
     *     possible object is
     *     {@link UNLIMITEDINTEGER }
     *     
     */
    public UNLIMITEDINTEGER getMIN() {
        return min;
    }

    /**
     * ??min?????
     * 
     * @param value
     *     allowed object is
     *     {@link UNLIMITEDINTEGER }
     *     
     */
    public void setMIN(UNLIMITEDINTEGER value) {
        this.min = value;
    }

    /**
     * ??offset?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getOFFSET() {
        return offset;
    }

    /**
     * ??offset?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setOFFSET(POSITIVEINTEGER value) {
        this.offset = value;
    }

    /**
     * ??period?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPERIOD() {
        return period;
    }

    /**
     * ??period?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPERIOD(POSITIVEINTEGER value) {
        this.period = value;
    }

    /**
     * ??x?????
     * 
     * @return
     *     possible object is
     *     {@link UNLIMITEDINTEGER }
     *     
     */
    public UNLIMITEDINTEGER getX() {
        return x;
    }

    /**
     * ??x?????
     * 
     * @param value
     *     allowed object is
     *     {@link UNLIMITEDINTEGER }
     *     
     */
    public void setX(UNLIMITEDINTEGER value) {
        this.x = value;
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
