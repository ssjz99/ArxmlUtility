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
 * Arranges those signals (or SignalGroups) that are transferred by the gateway from one channel to the other in pairs and defines the mapping between them.
 * Each pair consists in a source and a target referencing to a ISignalTriggering.
 * 
 * <p>I-SIGNAL-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="I-SIGNAL-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}I-SIGNAL-MAPPING"/>
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
@XmlType(name = "I-SIGNAL-MAPPING", propOrder = {
    "introduction",
    "sourcesignalref",
    "targetsignalref",
    "variationpoint"
})
public class ISIGNALMAPPING {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "SOURCE-SIGNAL-REF")
    protected ISIGNALMAPPING.SOURCESIGNALREF sourcesignalref;
    @XmlElement(name = "TARGET-SIGNAL-REF")
    protected ISIGNALMAPPING.TARGETSIGNALREF targetsignalref;
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
     * ??sourcesignalref?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALMAPPING.SOURCESIGNALREF }
     *     
     */
    public ISIGNALMAPPING.SOURCESIGNALREF getSOURCESIGNALREF() {
        return sourcesignalref;
    }

    /**
     * ??sourcesignalref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALMAPPING.SOURCESIGNALREF }
     *     
     */
    public void setSOURCESIGNALREF(ISIGNALMAPPING.SOURCESIGNALREF value) {
        this.sourcesignalref = value;
    }

    /**
     * ??targetsignalref?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALMAPPING.TARGETSIGNALREF }
     *     
     */
    public ISIGNALMAPPING.TARGETSIGNALREF getTARGETSIGNALREF() {
        return targetsignalref;
    }

    /**
     * ??targetsignalref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALMAPPING.TARGETSIGNALREF }
     *     
     */
    public void setTARGETSIGNALREF(ISIGNALMAPPING.TARGETSIGNALREF value) {
        this.targetsignalref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-TRIGGERING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SOURCESIGNALREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ISIGNALTRIGGERINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ISIGNALTRIGGERINGSUBTYPESENUM }
         *     
         */
        public ISIGNALTRIGGERINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ISIGNALTRIGGERINGSUBTYPESENUM }
         *     
         */
        public void setDEST(ISIGNALTRIGGERINGSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-TRIGGERING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETSIGNALREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ISIGNALTRIGGERINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ISIGNALTRIGGERINGSUBTYPESENUM }
         *     
         */
        public ISIGNALTRIGGERINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ISIGNALTRIGGERINGSUBTYPESENUM }
         *     
         */
        public void setDEST(ISIGNALTRIGGERINGSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
