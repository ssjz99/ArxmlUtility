//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representing freely defined data.
 * 
 * <p>FREE-FORMAT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FREE-FORMAT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SCHEDULE-TABLE-ENTRY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FREE-FORMAT-ENTRY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FREE-FORMAT"/>
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
@XmlType(name = "FREE-FORMAT", propOrder = {
    "introduction",
    "delay",
    "positionintable",
    "bytevalues"
})
public class FREEFORMAT {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "DELAY")
    protected TIMEVALUE delay;
    @XmlElement(name = "POSITION-IN-TABLE")
    protected INTEGER positionintable;
    @XmlElement(name = "BYTE-VALUES")
    protected FREEFORMAT.BYTEVALUES bytevalues;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??introduction?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getINTRODUCTION() {
        return introduction;
    }

    /**
     * ??introduction?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setINTRODUCTION(DOCUMENTATIONBLOCK value) {
        this.introduction = value;
    }

    /**
     * ??delay?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getDELAY() {
        return delay;
    }

    /**
     * ??delay?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setDELAY(TIMEVALUE value) {
        this.delay = value;
    }

    /**
     * ??positionintable?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getPOSITIONINTABLE() {
        return positionintable;
    }

    /**
     * ??positionintable?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setPOSITIONINTABLE(INTEGER value) {
        this.positionintable = value;
    }

    /**
     * ??bytevalues?????
     * 
     * @return
     *     possible object is
     *     {@link FREEFORMAT.BYTEVALUES }
     *     
     */
    public FREEFORMAT.BYTEVALUES getBYTEVALUES() {
        return bytevalues;
    }

    /**
     * ??bytevalues?????
     * 
     * @param value
     *     allowed object is
     *     {@link FREEFORMAT.BYTEVALUES }
     *     
     */
    public void setBYTEVALUES(FREEFORMAT.BYTEVALUES value) {
        this.bytevalues = value;
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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="8" minOccurs="0">
     *         &lt;element name="BYTE-VALUE" type="{http://autosar.org/schema/r4.0}INTEGER"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bytevalue"
    })
    public static class BYTEVALUES {

        @XmlElement(name = "BYTE-VALUE")
        protected List<INTEGER> bytevalue;

        /**
         * Gets the value of the bytevalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bytevalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBYTEVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INTEGER }
         * 
         * 
         */
        public List<INTEGER> getBYTEVALUE() {
            if (bytevalue == null) {
                bytevalue = new ArrayList<INTEGER>();
            }
            return this.bytevalue;
        }

    }

}
