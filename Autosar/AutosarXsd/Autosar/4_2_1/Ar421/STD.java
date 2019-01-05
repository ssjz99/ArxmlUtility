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
 * This represents a reference to external standards.
 * 
 * <p>STD complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="STD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SINGLE-LANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}STD"/>
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
@XmlType(name = "STD", propOrder = {
    "shortname",
    "longname1",
    "subtitle",
    "state",
    "date",
    "url",
    "position"
})
public class STD {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "LONG-NAME-1")
    protected SINGLELANGUAGELONGNAME longname1;
    @XmlElement(name = "SUBTITLE")
    protected STRING subtitle;
    @XmlElement(name = "STATE")
    protected STRING state;
    @XmlElement(name = "DATE")
    protected DATE date;
    @XmlElement(name = "URL")
    protected URL url;
    @XmlElement(name = "POSITION")
    protected STRING position;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??longname1?????
     * 
     * @return
     *     possible object is
     *     {@link SINGLELANGUAGELONGNAME }
     *     
     */
    public SINGLELANGUAGELONGNAME getLONGNAME1() {
        return longname1;
    }

    /**
     * ??longname1?????
     * 
     * @param value
     *     allowed object is
     *     {@link SINGLELANGUAGELONGNAME }
     *     
     */
    public void setLONGNAME1(SINGLELANGUAGELONGNAME value) {
        this.longname1 = value;
    }

    /**
     * ??subtitle?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getSUBTITLE() {
        return subtitle;
    }

    /**
     * ??subtitle?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setSUBTITLE(STRING value) {
        this.subtitle = value;
    }

    /**
     * ??state?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getSTATE() {
        return state;
    }

    /**
     * ??state?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setSTATE(STRING value) {
        this.state = value;
    }

    /**
     * ??date?????
     * 
     * @return
     *     possible object is
     *     {@link DATE }
     *     
     */
    public DATE getDATE() {
        return date;
    }

    /**
     * ??date?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATE }
     *     
     */
    public void setDATE(DATE value) {
        this.date = value;
    }

    /**
     * ??url?????
     * 
     * @return
     *     possible object is
     *     {@link URL }
     *     
     */
    public URL getURL() {
        return url;
    }

    /**
     * ??url?????
     * 
     * @param value
     *     allowed object is
     *     {@link URL }
     *     
     */
    public void setURL(URL value) {
        this.url = value;
    }

    /**
     * ??position?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getPOSITION() {
        return position;
    }

    /**
     * ??position?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setPOSITION(STRING value) {
        this.position = value;
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
