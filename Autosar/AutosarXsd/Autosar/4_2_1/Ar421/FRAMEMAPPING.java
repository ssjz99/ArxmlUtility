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
 * The entire source frame is mapped as it is onto the target frame (what in general is only possible inside of a common platform). In this case source and target frame should be the identical object.
 * 
 * Each pair consists in a SOURCE and a TARGET referencing to a FrameTriggering.
 * 
 * The Frame Mapping is not supported by the Autosar BSW. The existence is optional and has been incorporated into the System Template mainly for compatibility in order to allow interchange between FIBEX and AUTOSAR descriptions.
 * 
 * <p>FRAME-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FRAME-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FRAME-MAPPING"/>
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
@XmlType(name = "FRAME-MAPPING", propOrder = {
    "introduction",
    "sourceframeref",
    "targetframeref",
    "variationpoint"
})
public class FRAMEMAPPING {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "SOURCE-FRAME-REF")
    protected FRAMEMAPPING.SOURCEFRAMEREF sourceframeref;
    @XmlElement(name = "TARGET-FRAME-REF")
    protected FRAMEMAPPING.TARGETFRAMEREF targetframeref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
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
     * ??sourceframeref?????
     * 
     * @return
     *     possible object is
     *     {@link FRAMEMAPPING.SOURCEFRAMEREF }
     *     
     */
    public FRAMEMAPPING.SOURCEFRAMEREF getSOURCEFRAMEREF() {
        return sourceframeref;
    }

    /**
     * ??sourceframeref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FRAMEMAPPING.SOURCEFRAMEREF }
     *     
     */
    public void setSOURCEFRAMEREF(FRAMEMAPPING.SOURCEFRAMEREF value) {
        this.sourceframeref = value;
    }

    /**
     * ??targetframeref?????
     * 
     * @return
     *     possible object is
     *     {@link FRAMEMAPPING.TARGETFRAMEREF }
     *     
     */
    public FRAMEMAPPING.TARGETFRAMEREF getTARGETFRAMEREF() {
        return targetframeref;
    }

    /**
     * ??targetframeref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FRAMEMAPPING.TARGETFRAMEREF }
     *     
     */
    public void setTARGETFRAMEREF(FRAMEMAPPING.TARGETFRAMEREF value) {
        this.targetframeref = value;
    }

    /**
     * ??variationpoint?????
     * 
     * @return
     *     possible object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public VARIATIONPOINT getVARIATIONPOINT() {
        return variationpoint;
    }

    /**
     * ??variationpoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public void setVARIATIONPOINT(VARIATIONPOINT value) {
        this.variationpoint = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FRAME-TRIGGERING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SOURCEFRAMEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FRAMETRIGGERINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FRAMETRIGGERINGSUBTYPESENUM }
         *     
         */
        public FRAMETRIGGERINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FRAMETRIGGERINGSUBTYPESENUM }
         *     
         */
        public void setDEST(FRAMETRIGGERINGSUBTYPESENUM value) {
            this.dest = value;
        }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FRAME-TRIGGERING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETFRAMEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FRAMETRIGGERINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FRAMETRIGGERINGSUBTYPESENUM }
         *     
         */
        public FRAMETRIGGERINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FRAMETRIGGERINGSUBTYPESENUM }
         *     
         */
        public void setDEST(FRAMETRIGGERINGSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
