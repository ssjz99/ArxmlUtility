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
 * This represents the ability to define the error behavior in the context of mode handling.
 * 
 * <p>MODE-ERROR-BEHAVIOR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MODE-ERROR-BEHAVIOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MODE-ERROR-BEHAVIOR"/>
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
@XmlType(name = "MODE-ERROR-BEHAVIOR", propOrder = {
    "defaultmoderef",
    "errorreactionpolicy"
})
public class MODEERRORBEHAVIOR {

    @XmlElement(name = "DEFAULT-MODE-REF")
    protected MODEERRORBEHAVIOR.DEFAULTMODEREF defaultmoderef;
    @XmlElement(name = "ERROR-REACTION-POLICY")
    protected MODEERRORREACTIONPOLICYENUM errorreactionpolicy;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??defaultmoderef?????
     * 
     * @return
     *     possible object is
     *     {@link MODEERRORBEHAVIOR.DEFAULTMODEREF }
     *     
     */
    public MODEERRORBEHAVIOR.DEFAULTMODEREF getDEFAULTMODEREF() {
        return defaultmoderef;
    }

    /**
     * ??defaultmoderef?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEERRORBEHAVIOR.DEFAULTMODEREF }
     *     
     */
    public void setDEFAULTMODEREF(MODEERRORBEHAVIOR.DEFAULTMODEREF value) {
        this.defaultmoderef = value;
    }

    /**
     * ??errorreactionpolicy?????
     * 
     * @return
     *     possible object is
     *     {@link MODEERRORREACTIONPOLICYENUM }
     *     
     */
    public MODEERRORREACTIONPOLICYENUM getERRORREACTIONPOLICY() {
        return errorreactionpolicy;
    }

    /**
     * ??errorreactionpolicy?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEERRORREACTIONPOLICYENUM }
     *     
     */
    public void setERRORREACTIONPOLICY(MODEERRORREACTIONPOLICYENUM value) {
        this.errorreactionpolicy = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DEFAULTMODEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MODEDECLARATIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MODEDECLARATIONSUBTYPESENUM }
         *     
         */
        public MODEDECLARATIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MODEDECLARATIONSUBTYPESENUM }
         *     
         */
        public void setDEST(MODEDECLARATIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
