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
 * This element is deprecated and will be removed in future. This information is replaced by the runtimePortConfiguration and runtimeIpAddressConfiguration attributes in the SocketConnection.
 * 
 * Old description:
 * Discovery technology information.
 * 
 * <p>DISCOVERY-TECHNOLOGY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DISCOVERY-TECHNOLOGY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DISCOVERY-TECHNOLOGY"/>
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
@XmlType(name = "DISCOVERY-TECHNOLOGY", propOrder = {
    "name",
    "version"
})
public class DISCOVERYTECHNOLOGY {

    @XmlElement(name = "NAME")
    protected DISCOVERYTECHNOLOGYENUM name;
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
     *     {@link DISCOVERYTECHNOLOGYENUM }
     *     
     */
    public DISCOVERYTECHNOLOGYENUM getNAME() {
        return name;
    }

    /**
     * ??name?????
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOVERYTECHNOLOGYENUM }
     *     
     */
    public void setNAME(DISCOVERYTECHNOLOGYENUM value) {
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
