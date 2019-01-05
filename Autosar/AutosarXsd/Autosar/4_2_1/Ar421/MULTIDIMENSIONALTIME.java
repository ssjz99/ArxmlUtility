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
 * This is used to specify a multidimensional time value based on ASAM CSE codes. It is specified by a code which defined the basis of the time and a scaling factor which finally determines the time value.
 * 
 * If for example the cseCode is 100 and the cseCodeFactor is 360, it represents 360 angular degrees.
 * If the cseCode is 2 and the cseCodeFactor is 50 it represents 50 microseconds
 * 
 * <p>MULTIDIMENSIONAL-TIME complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MULTIDIMENSIONAL-TIME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTIDIMENSIONAL-TIME"/>
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
@XmlType(name = "MULTIDIMENSIONAL-TIME", propOrder = {
    "csecode",
    "csecodefactor"
})
public class MULTIDIMENSIONALTIME {

    @XmlElement(name = "CSE-CODE")
    protected CSECODETYPESTRING csecode;
    @XmlElement(name = "CSE-CODE-FACTOR")
    protected INTEGER csecodefactor;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??csecode?????
     * 
     * @return
     *     possible object is
     *     {@link CSECODETYPESTRING }
     *     
     */
    public CSECODETYPESTRING getCSECODE() {
        return csecode;
    }

    /**
     * ??csecode?????
     * 
     * @param value
     *     allowed object is
     *     {@link CSECODETYPESTRING }
     *     
     */
    public void setCSECODE(CSECODETYPESTRING value) {
        this.csecode = value;
    }

    /**
     * ??csecodefactor?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getCSECODEFACTOR() {
        return csecodefactor;
    }

    /**
     * ??csecodefactor?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setCSECODEFACTOR(INTEGER value) {
        this.csecodefactor = value;
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
