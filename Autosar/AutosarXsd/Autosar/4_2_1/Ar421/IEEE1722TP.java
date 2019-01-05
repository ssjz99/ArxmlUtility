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
 * Content Model for IEEE 1722 configuration.
 * 
 * <p>IEEE-1722-TP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="IEEE-1722-TP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSPORT-PROTOCOL-CONFIGURATION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IEEE-1722-TP"/>
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
@XmlType(name = "IEEE-1722-TP", propOrder = {
    "relativerepresentationtime",
    "streamidentifier",
    "subtype",
    "version"
})
public class IEEE1722TP {

    @XmlElement(name = "RELATIVE-REPRESENTATION-TIME")
    protected TIMEVALUE relativerepresentationtime;
    @XmlElement(name = "STREAM-IDENTIFIER")
    protected POSITIVEINTEGER streamidentifier;
    @XmlElement(name = "SUB-TYPE")
    protected POSITIVEINTEGER subtype;
    @XmlElement(name = "VERSION")
    protected POSITIVEINTEGER version;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??relativerepresentationtime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getRELATIVEREPRESENTATIONTIME() {
        return relativerepresentationtime;
    }

    /**
     * ??relativerepresentationtime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setRELATIVEREPRESENTATIONTIME(TIMEVALUE value) {
        this.relativerepresentationtime = value;
    }

    /**
     * ??streamidentifier?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSTREAMIDENTIFIER() {
        return streamidentifier;
    }

    /**
     * ??streamidentifier?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSTREAMIDENTIFIER(POSITIVEINTEGER value) {
        this.streamidentifier = value;
    }

    /**
     * ??subtype?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSUBTYPE() {
        return subtype;
    }

    /**
     * ??subtype?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSUBTYPE(POSITIVEINTEGER value) {
        this.subtype = value;
    }

    /**
     * ??version?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getVERSION() {
        return version;
    }

    /**
     * ??version?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setVERSION(POSITIVEINTEGER value) {
        this.version = value;
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
