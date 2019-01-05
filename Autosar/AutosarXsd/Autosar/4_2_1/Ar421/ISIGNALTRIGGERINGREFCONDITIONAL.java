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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>I-SIGNAL-TRIGGERING-REF-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="I-SIGNAL-TRIGGERING-REF-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}I-SIGNAL-TRIGGERING-REF-CONDITIONAL"/>
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
@XmlType(name = "I-SIGNAL-TRIGGERING-REF-CONDITIONAL", propOrder = {
    "isignaltriggeringref",
    "variationpoint"
})
public class ISIGNALTRIGGERINGREFCONDITIONAL {

    @XmlElement(name = "I-SIGNAL-TRIGGERING-REF")
    protected ISIGNALTRIGGERINGREFCONDITIONAL.ISIGNALTRIGGERINGREF isignaltriggeringref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??isignaltriggeringref?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALTRIGGERINGREFCONDITIONAL.ISIGNALTRIGGERINGREF }
     *     
     */
    public ISIGNALTRIGGERINGREFCONDITIONAL.ISIGNALTRIGGERINGREF getISIGNALTRIGGERINGREF() {
        return isignaltriggeringref;
    }

    /**
     * ??isignaltriggeringref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALTRIGGERINGREFCONDITIONAL.ISIGNALTRIGGERINGREF }
     *     
     */
    public void setISIGNALTRIGGERINGREF(ISIGNALTRIGGERINGREFCONDITIONAL.ISIGNALTRIGGERINGREF value) {
        this.isignaltriggeringref = value;
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
    public static class ISIGNALTRIGGERINGREF
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
