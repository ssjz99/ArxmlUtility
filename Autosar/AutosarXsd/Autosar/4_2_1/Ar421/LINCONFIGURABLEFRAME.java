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
 * Assignment of messageIds to Frames. 
 * This element shall be used for the LIN 2.0 Assign-Frame command.
 * 
 * <p>LIN-CONFIGURABLE-FRAME complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIN-CONFIGURABLE-FRAME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-CONFIGURABLE-FRAME"/>
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
@XmlType(name = "LIN-CONFIGURABLE-FRAME", propOrder = {
    "frameref",
    "messageid"
})
public class LINCONFIGURABLEFRAME {

    @XmlElement(name = "FRAME-REF")
    protected LINCONFIGURABLEFRAME.FRAMEREF frameref;
    @XmlElement(name = "MESSAGE-ID")
    protected POSITIVEINTEGER messageid;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??frameref?????
     * 
     * @return
     *     possible object is
     *     {@link LINCONFIGURABLEFRAME.FRAMEREF }
     *     
     */
    public LINCONFIGURABLEFRAME.FRAMEREF getFRAMEREF() {
        return frameref;
    }

    /**
     * ??frameref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINCONFIGURABLEFRAME.FRAMEREF }
     *     
     */
    public void setFRAMEREF(LINCONFIGURABLEFRAME.FRAMEREF value) {
        this.frameref = value;
    }

    /**
     * ??messageid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMESSAGEID() {
        return messageid;
    }

    /**
     * ??messageid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMESSAGEID(POSITIVEINTEGER value) {
        this.messageid = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LIN-FRAME--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FRAMEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected LINFRAMESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link LINFRAMESUBTYPESENUM }
         *     
         */
        public LINFRAMESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link LINFRAMESUBTYPESENUM }
         *     
         */
        public void setDEST(LINFRAMESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
