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
 * This meta-class represents the fact that the computation in this scale is represented as rational term.
 * 
 * <p>COMPU-SCALE-RATIONAL-FORMULA complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COMPU-SCALE-RATIONAL-FORMULA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMPU-SCALE-CONTENTS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMPU-SCALE-RATIONAL-FORMULA"/>
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
@XmlType(name = "COMPU-SCALE-RATIONAL-FORMULA", propOrder = {
    "compurationalcoeffs"
})
public class COMPUSCALERATIONALFORMULA {

    @XmlElement(name = "COMPU-RATIONAL-COEFFS")
    protected COMPURATIONALCOEFFS compurationalcoeffs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??compurationalcoeffs?????
     * 
     * @return
     *     possible object is
     *     {@link COMPURATIONALCOEFFS }
     *     
     */
    public COMPURATIONALCOEFFS getCOMPURATIONALCOEFFS() {
        return compurationalcoeffs;
    }

    /**
     * ??compurationalcoeffs?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPURATIONALCOEFFS }
     *     
     */
    public void setCOMPURATIONALCOEFFS(COMPURATIONALCOEFFS value) {
        this.compurationalcoeffs = value;
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
