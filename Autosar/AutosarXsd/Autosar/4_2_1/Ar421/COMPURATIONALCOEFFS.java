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
 * This meta-class represents the ability to express a rational function by specifying the coefficients of nominator and denominator.
 * 
 * <p>COMPU-RATIONAL-COEFFS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COMPU-RATIONAL-COEFFS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMPU-RATIONAL-COEFFS"/>
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
@XmlType(name = "COMPU-RATIONAL-COEFFS", propOrder = {
    "compunumerator",
    "compudenominator"
})
public class COMPURATIONALCOEFFS {

    @XmlElement(name = "COMPU-NUMERATOR")
    protected COMPUNOMINATORDENOMINATOR compunumerator;
    @XmlElement(name = "COMPU-DENOMINATOR")
    protected COMPUNOMINATORDENOMINATOR compudenominator;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??compunumerator?????
     * 
     * @return
     *     possible object is
     *     {@link COMPUNOMINATORDENOMINATOR }
     *     
     */
    public COMPUNOMINATORDENOMINATOR getCOMPUNUMERATOR() {
        return compunumerator;
    }

    /**
     * ??compunumerator?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPUNOMINATORDENOMINATOR }
     *     
     */
    public void setCOMPUNUMERATOR(COMPUNOMINATORDENOMINATOR value) {
        this.compunumerator = value;
    }

    /**
     * ??compudenominator?????
     * 
     * @return
     *     possible object is
     *     {@link COMPUNOMINATORDENOMINATOR }
     *     
     */
    public COMPUNOMINATORDENOMINATOR getCOMPUDENOMINATOR() {
        return compudenominator;
    }

    /**
     * ??compudenominator?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPUNOMINATORDENOMINATOR }
     *     
     */
    public void setCOMPUDENOMINATOR(COMPUNOMINATORDENOMINATOR value) {
        this.compudenominator = value;
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