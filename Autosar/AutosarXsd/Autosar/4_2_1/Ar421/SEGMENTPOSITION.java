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
 * The StaticPart and the DynamicPart can be
 * separated in multiple segments within the multiplexed PDU. 
 * 
 * The ISignalIPdus are copied bit by bit into the MultiplexedIPdu. If the space of the first segment is 5 bits large than the first 5 bits of the ISignalIPdu are copied into this first segment and so on.
 * 
 * <p>SEGMENT-POSITION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SEGMENT-POSITION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SEGMENT-POSITION"/>
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
@XmlType(name = "SEGMENT-POSITION", propOrder = {
    "segmentbyteorder",
    "segmentlength",
    "segmentposition"
})
public class SEGMENTPOSITION {

    @XmlElement(name = "SEGMENT-BYTE-ORDER")
    protected BYTEORDERENUM segmentbyteorder;
    @XmlElement(name = "SEGMENT-LENGTH")
    protected INTEGER segmentlength;
    @XmlElement(name = "SEGMENT-POSITION")
    protected INTEGER segmentposition;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??segmentbyteorder?????
     * 
     * @return
     *     possible object is
     *     {@link BYTEORDERENUM }
     *     
     */
    public BYTEORDERENUM getSEGMENTBYTEORDER() {
        return segmentbyteorder;
    }

    /**
     * ??segmentbyteorder?????
     * 
     * @param value
     *     allowed object is
     *     {@link BYTEORDERENUM }
     *     
     */
    public void setSEGMENTBYTEORDER(BYTEORDERENUM value) {
        this.segmentbyteorder = value;
    }

    /**
     * ??segmentlength?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSEGMENTLENGTH() {
        return segmentlength;
    }

    /**
     * ??segmentlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSEGMENTLENGTH(INTEGER value) {
        this.segmentlength = value;
    }

    /**
     * ??segmentposition?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSEGMENTPOSITION() {
        return segmentposition;
    }

    /**
     * ??segmentposition?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSEGMENTPOSITION(INTEGER value) {
        this.segmentposition = value;
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
