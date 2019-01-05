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
 * This meta-class represents the ability to express one particular computation.
 * 
 * <p>COMPU complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COMPU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMPU"/>
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
@XmlType(name = "COMPU", propOrder = {
    "compuscales",
    "compudefaultvalue"
})
public class COMPU {

    @XmlElement(name = "COMPU-SCALES")
    protected Ar421.COMPUT_SCALES_COMPLEX.COMPUSCALES compuscales;
    @XmlElement(name = "COMPU-DEFAULT-VALUE")
    protected COMPUCONST compudefaultvalue;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??compuscales?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.COMPUT_SCALES_COMPLEX.COMPUSCALES }
     *     
     */
    public Ar421.COMPUT_SCALES_COMPLEX.COMPUSCALES getCOMPUSCALES() {
        return compuscales;
    }

    /**
     * ??compuscales?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.COMPUT_SCALES_COMPLEX.COMPUSCALES }
     *     
     */
    public void setCOMPUSCALES(Ar421.COMPUT_SCALES_COMPLEX.COMPUSCALES value) {
        this.compuscales = value;
    }

    /**
     * ??compudefaultvalue?????
     * 
     * @return
     *     possible object is
     *     {@link COMPUCONST }
     *     
     */
    public COMPUCONST getCOMPUDEFAULTVALUE() {
        return compudefaultvalue;
    }

    /**
     * ??compudefaultvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPUCONST }
     *     
     */
    public void setCOMPUDEFAULTVALUE(COMPUCONST value) {
        this.compudefaultvalue = value;
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
