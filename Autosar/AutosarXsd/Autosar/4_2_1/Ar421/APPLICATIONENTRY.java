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
 * Schedule table entry for application messages.
 * 
 * <p>APPLICATION-ENTRY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="APPLICATION-ENTRY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SCHEDULE-TABLE-ENTRY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}APPLICATION-ENTRY"/>
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
@XmlType(name = "APPLICATION-ENTRY", propOrder = {
    "introduction",
    "delay",
    "positionintable",
    "frametriggeringref"
})
public class APPLICATIONENTRY {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "DELAY")
    protected TIMEVALUE delay;
    @XmlElement(name = "POSITION-IN-TABLE")
    protected INTEGER positionintable;
    @XmlElement(name = "FRAME-TRIGGERING-REF")
    protected APPLICATIONENTRY.FRAMETRIGGERINGREF frametriggeringref;
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
     * ??frametriggeringref?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONENTRY.FRAMETRIGGERINGREF }
     *     
     */
    public APPLICATIONENTRY.FRAMETRIGGERINGREF getFRAMETRIGGERINGREF() {
        return frametriggeringref;
    }

    /**
     * ??frametriggeringref?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONENTRY.FRAMETRIGGERINGREF }
     *     
     */
    public void setFRAMETRIGGERINGREF(APPLICATIONENTRY.FRAMETRIGGERINGREF value) {
        this.frametriggeringref = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LIN-FRAME-TRIGGERING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FRAMETRIGGERINGREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected LINFRAMETRIGGERINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link LINFRAMETRIGGERINGSUBTYPESENUM }
         *     
         */
        public LINFRAMETRIGGERINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link LINFRAMETRIGGERINGSUBTYPESENUM }
         *     
         */
        public void setDEST(LINFRAMETRIGGERINGSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
