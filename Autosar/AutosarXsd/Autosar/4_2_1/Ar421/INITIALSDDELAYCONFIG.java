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
 * This element is used to configure the offer behavior of the server and the find behavior on the client.
 * 
 * <p>INITIAL-SD-DELAY-CONFIG complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="INITIAL-SD-DELAY-CONFIG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INITIAL-SD-DELAY-CONFIG"/>
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
@XmlType(name = "INITIAL-SD-DELAY-CONFIG", propOrder = {
    "initialdelaymaxvalue",
    "initialdelayminvalue",
    "initialrepetitionsbasedelay",
    "initialrepetitionsmax"
})
public class INITIALSDDELAYCONFIG {

    @XmlElement(name = "INITIAL-DELAY-MAX-VALUE")
    protected TIMEVALUE initialdelaymaxvalue;
    @XmlElement(name = "INITIAL-DELAY-MIN-VALUE")
    protected TIMEVALUE initialdelayminvalue;
    @XmlElement(name = "INITIAL-REPETITIONS-BASE-DELAY")
    protected TIMEVALUE initialrepetitionsbasedelay;
    @XmlElement(name = "INITIAL-REPETITIONS-MAX")
    protected POSITIVEINTEGER initialrepetitionsmax;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??initialdelaymaxvalue?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getINITIALDELAYMAXVALUE() {
        return initialdelaymaxvalue;
    }

    /**
     * ??initialdelaymaxvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setINITIALDELAYMAXVALUE(TIMEVALUE value) {
        this.initialdelaymaxvalue = value;
    }

    /**
     * ??initialdelayminvalue?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getINITIALDELAYMINVALUE() {
        return initialdelayminvalue;
    }

    /**
     * ??initialdelayminvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setINITIALDELAYMINVALUE(TIMEVALUE value) {
        this.initialdelayminvalue = value;
    }

    /**
     * ??initialrepetitionsbasedelay?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getINITIALREPETITIONSBASEDELAY() {
        return initialrepetitionsbasedelay;
    }

    /**
     * ??initialrepetitionsbasedelay?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setINITIALREPETITIONSBASEDELAY(TIMEVALUE value) {
        this.initialrepetitionsbasedelay = value;
    }

    /**
     * ??initialrepetitionsmax?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getINITIALREPETITIONSMAX() {
        return initialrepetitionsmax;
    }

    /**
     * ??initialrepetitionsmax?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setINITIALREPETITIONSMAX(POSITIVEINTEGER value) {
        this.initialrepetitionsmax = value;
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
