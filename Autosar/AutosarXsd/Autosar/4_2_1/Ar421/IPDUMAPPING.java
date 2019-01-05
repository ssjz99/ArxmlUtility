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
 * Arranges those IPdus that are transferred by the gateway from one channel to the other in pairs and defines the mapping between them.
 * 
 * <p>I-PDU-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="I-PDU-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}I-PDU-MAPPING"/>
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
@XmlType(name = "I-PDU-MAPPING", propOrder = {
    "introduction",
    "pdurtpchunksize",
    "sourceipduref",
    "targetipdu",
    "variationpoint"
})
public class IPDUMAPPING {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "PDUR-TP-CHUNK-SIZE")
    protected POSITIVEINTEGER pdurtpchunksize;
    @XmlElement(name = "SOURCE-I-PDU-REF")
    protected IPDUMAPPING.SOURCEIPDUREF sourceipduref;
    @XmlElement(name = "TARGET-I-PDU")
    protected TARGET_I_PDU_REF_COMPLEX targetipdu;
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
     * ??pdurtpchunksize?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPDURTPCHUNKSIZE() {
        return pdurtpchunksize;
    }

    /**
     * ??pdurtpchunksize?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPDURTPCHUNKSIZE(POSITIVEINTEGER value) {
        this.pdurtpchunksize = value;
    }

    /**
     * ??sourceipduref?????
     * 
     * @return
     *     possible object is
     *     {@link IPDUMAPPING.SOURCEIPDUREF }
     *     
     */
    public IPDUMAPPING.SOURCEIPDUREF getSOURCEIPDUREF() {
        return sourceipduref;
    }

    /**
     * ??sourceipduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link IPDUMAPPING.SOURCEIPDUREF }
     *     
     */
    public void setSOURCEIPDUREF(IPDUMAPPING.SOURCEIPDUREF value) {
        this.sourceipduref = value;
    }

    /**
     * ??targetipdu?????
     * 
     * @return
     *     possible object is
     *     {@link TARGET_I_PDU_REF_COMPLEX }
     *     
     */
    public TARGET_I_PDU_REF_COMPLEX getTARGETIPDU() {
        return targetipdu;
    }

    /**
     * ??targetipdu?????
     * 
     * @param value
     *     allowed object is
     *     {@link TARGET_I_PDU_REF_COMPLEX }
     *     
     */
    public void setTARGETIPDU(TARGET_I_PDU_REF_COMPLEX value) {
        this.targetipdu = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PDU-TRIGGERING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SOURCEIPDUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PDUTRIGGERINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PDUTRIGGERINGSUBTYPESENUM }
         *     
         */
        public PDUTRIGGERINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PDUTRIGGERINGSUBTYPESENUM }
         *     
         */
        public void setDEST(PDUTRIGGERINGSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
