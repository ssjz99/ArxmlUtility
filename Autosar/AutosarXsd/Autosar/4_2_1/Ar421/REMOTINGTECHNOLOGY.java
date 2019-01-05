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
 * Defines the used remoting Technology.
 * 
 * <p>REMOTING-TECHNOLOGY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="REMOTING-TECHNOLOGY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REMOTING-TECHNOLOGY"/>
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
@XmlType(name = "REMOTING-TECHNOLOGY", propOrder = {
    "name",
    "version"
})
public class REMOTINGTECHNOLOGY {

    @XmlElement(name = "NAME")
    protected REMOTINGTECHNOLOGYENUM name;
    @XmlElement(name = "VERSION")
    protected STRING version;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??name?????
     * 
     * @return
     *     possible object is
     *     {@link REMOTINGTECHNOLOGYENUM }
     *     
     */
    public REMOTINGTECHNOLOGYENUM getNAME() {
        return name;
    }

    /**
     * ??name?????
     * 
     * @param value
     *     allowed object is
     *     {@link REMOTINGTECHNOLOGYENUM }
     *     
     */
    public void setNAME(REMOTINGTECHNOLOGYENUM value) {
        this.name = value;
    }

    /**
     * ??version?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getVERSION() {
        return version;
    }

    /**
     * ??version?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setVERSION(STRING value) {
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
