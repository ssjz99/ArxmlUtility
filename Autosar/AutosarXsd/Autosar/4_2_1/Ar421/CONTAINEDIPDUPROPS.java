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
 * Defines the aspects of an IPdu which can be collected inside a ContainerIPdu.
 * 
 * <p>CONTAINED-I-PDU-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CONTAINED-I-PDU-PROPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CONTAINED-I-PDU-PROPS"/>
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
@XmlType(name = "CONTAINED-I-PDU-PROPS", propOrder = {
    "collectionsemantics",
    "headeridlongheader",
    "headeridshortheader",
    "timeout",
    "trigger"
})
public class CONTAINEDIPDUPROPS {

    @XmlElement(name = "COLLECTION-SEMANTICS")
    protected CONTAINEDIPDUCOLLECTIONSEMANTICSENUM collectionsemantics;
    @XmlElement(name = "HEADER-ID-LONG-HEADER")
    protected POSITIVEINTEGER headeridlongheader;
    @XmlElement(name = "HEADER-ID-SHORT-HEADER")
    protected POSITIVEINTEGER headeridshortheader;
    @XmlElement(name = "TIMEOUT")
    protected TIMEVALUE timeout;
    @XmlElement(name = "TRIGGER")
    protected PDUCOLLECTIONTRIGGERENUM trigger;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??collectionsemantics?????
     * 
     * @return
     *     possible object is
     *     {@link CONTAINEDIPDUCOLLECTIONSEMANTICSENUM }
     *     
     */
    public CONTAINEDIPDUCOLLECTIONSEMANTICSENUM getCOLLECTIONSEMANTICS() {
        return collectionsemantics;
    }

    /**
     * ??collectionsemantics?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONTAINEDIPDUCOLLECTIONSEMANTICSENUM }
     *     
     */
    public void setCOLLECTIONSEMANTICS(CONTAINEDIPDUCOLLECTIONSEMANTICSENUM value) {
        this.collectionsemantics = value;
    }

    /**
     * ??headeridlongheader?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getHEADERIDLONGHEADER() {
        return headeridlongheader;
    }

    /**
     * ??headeridlongheader?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setHEADERIDLONGHEADER(POSITIVEINTEGER value) {
        this.headeridlongheader = value;
    }

    /**
     * ??headeridshortheader?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getHEADERIDSHORTHEADER() {
        return headeridshortheader;
    }

    /**
     * ??headeridshortheader?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setHEADERIDSHORTHEADER(POSITIVEINTEGER value) {
        this.headeridshortheader = value;
    }

    /**
     * ??timeout?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUT() {
        return timeout;
    }

    /**
     * ??timeout?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUT(TIMEVALUE value) {
        this.timeout = value;
    }

    /**
     * ??trigger?????
     * 
     * @return
     *     possible object is
     *     {@link PDUCOLLECTIONTRIGGERENUM }
     *     
     */
    public PDUCOLLECTIONTRIGGERENUM getTRIGGER() {
        return trigger;
    }

    /**
     * ??trigger?????
     * 
     * @param value
     *     allowed object is
     *     {@link PDUCOLLECTIONTRIGGERENUM }
     *     
     */
    public void setTRIGGER(PDUCOLLECTIONTRIGGERENUM value) {
        this.trigger = value;
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
