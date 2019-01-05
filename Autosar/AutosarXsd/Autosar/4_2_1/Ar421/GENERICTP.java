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
 * Content Model for a generic transport protocol.
 * 
 * <p>GENERIC-TP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="GENERIC-TP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSPORT-PROTOCOL-CONFIGURATION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}GENERIC-TP"/>
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
@XmlType(name = "GENERIC-TP", propOrder = {
    "tpaddress",
    "tptechnology"
})
public class GENERICTP {

    @XmlElement(name = "TP-ADDRESS")
    protected STRING tpaddress;
    @XmlElement(name = "TP-TECHNOLOGY")
    protected STRING tptechnology;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??tpaddress?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getTPADDRESS() {
        return tpaddress;
    }

    /**
     * ??tpaddress?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setTPADDRESS(STRING value) {
        this.tpaddress = value;
    }

    /**
     * ??tptechnology?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getTPTECHNOLOGY() {
        return tptechnology;
    }

    /**
     * ??tptechnology?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setTPTECHNOLOGY(STRING value) {
        this.tptechnology = value;
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
