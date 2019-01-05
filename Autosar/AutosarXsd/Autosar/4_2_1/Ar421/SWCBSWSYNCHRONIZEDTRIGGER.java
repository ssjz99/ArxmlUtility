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
 * Synchronizes a Trigger provided by a component via a port with a Trigger provided by a BSW module or cluster.
 * 
 * <p>SWC-BSW-SYNCHRONIZED-TRIGGER complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-BSW-SYNCHRONIZED-TRIGGER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-BSW-SYNCHRONIZED-TRIGGER"/>
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
@XmlType(name = "SWC-BSW-SYNCHRONIZED-TRIGGER", propOrder = {
    "bswtriggerref",
    "swctriggeriref",
    "variationpoint"
})
public class SWCBSWSYNCHRONIZEDTRIGGER {

    @XmlElement(name = "BSW-TRIGGER-REF")
    protected SWCBSWSYNCHRONIZEDTRIGGER.BSWTRIGGERREF bswtriggerref;
    @XmlElement(name = "SWC-TRIGGER-IREF")
    protected PTRIGGERINATOMICSWCTYPEINSTANCEREF swctriggeriref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??bswtriggerref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCBSWSYNCHRONIZEDTRIGGER.BSWTRIGGERREF }
     *     
     */
    public SWCBSWSYNCHRONIZEDTRIGGER.BSWTRIGGERREF getBSWTRIGGERREF() {
        return bswtriggerref;
    }

    /**
     * ??bswtriggerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCBSWSYNCHRONIZEDTRIGGER.BSWTRIGGERREF }
     *     
     */
    public void setBSWTRIGGERREF(SWCBSWSYNCHRONIZEDTRIGGER.BSWTRIGGERREF value) {
        this.bswtriggerref = value;
    }

    /**
     * ??swctriggeriref?????
     * 
     * @return
     *     possible object is
     *     {@link PTRIGGERINATOMICSWCTYPEINSTANCEREF }
     *     
     */
    public PTRIGGERINATOMICSWCTYPEINSTANCEREF getSWCTRIGGERIREF() {
        return swctriggeriref;
    }

    /**
     * ??swctriggeriref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PTRIGGERINATOMICSWCTYPEINSTANCEREF }
     *     
     */
    public void setSWCTRIGGERIREF(PTRIGGERINATOMICSWCTYPEINSTANCEREF value) {
        this.swctriggeriref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TRIGGER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BSWTRIGGERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TRIGGERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TRIGGERSUBTYPESENUM }
         *     
         */
        public TRIGGERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TRIGGERSUBTYPESENUM }
         *     
         */
        public void setDEST(TRIGGERSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
