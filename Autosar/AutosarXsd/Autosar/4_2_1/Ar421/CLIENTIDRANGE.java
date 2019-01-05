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
 * With this element it is possible to restrict the Client Identifier of the transaction handle that is generated by the client RTE for inter-Ecu Client/Server communication to an allowed range of numerical values.
 * 
 * <p>CLIENT-ID-RANGE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CLIENT-ID-RANGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CLIENT-ID-RANGE"/>
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
@XmlType(name = "CLIENT-ID-RANGE", propOrder = {
    "lowerlimit",
    "upperlimit"
})
public class CLIENTIDRANGE {

    @XmlElement(name = "LOWER-LIMIT")
    protected LIMIT lowerlimit;
    @XmlElement(name = "UPPER-LIMIT")
    protected LIMIT upperlimit;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??lowerlimit?????
     * 
     * @return
     *     possible object is
     *     {@link LIMIT }
     *     
     */
    public LIMIT getLOWERLIMIT() {
        return lowerlimit;
    }

    /**
     * ??lowerlimit?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIMIT }
     *     
     */
    public void setLOWERLIMIT(LIMIT value) {
        this.lowerlimit = value;
    }

    /**
     * ??upperlimit?????
     * 
     * @return
     *     possible object is
     *     {@link LIMIT }
     *     
     */
    public LIMIT getUPPERLIMIT() {
        return upperlimit;
    }

    /**
     * ??upperlimit?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIMIT }
     *     
     */
    public void setUPPERLIMIT(LIMIT value) {
        this.upperlimit = value;
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
