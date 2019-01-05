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
 * Proxy class for several kinds of references to a variable.
 * 
 * <p>SW-VARIABLE-REF-PROXY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-VARIABLE-REF-PROXY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-VARIABLE-REF-PROXY"/>
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
@XmlType(name = "SW-VARIABLE-REF-PROXY", propOrder = {
    "autosarvariable",
    "mcdatainstancevarref"
})
public class SWVARIABLEREFPROXY {

    @XmlElement(name = "AUTOSAR-VARIABLE")
    protected AUTOSARVARIABLEREF autosarvariable;
    @XmlElement(name = "MC-DATA-INSTANCE-VAR-REF")
    protected SWVARIABLEREFPROXY.MCDATAINSTANCEVARREF mcdatainstancevarref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??autosarvariable?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public AUTOSARVARIABLEREF getAUTOSARVARIABLE() {
        return autosarvariable;
    }

    /**
     * ??autosarvariable?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public void setAUTOSARVARIABLE(AUTOSARVARIABLEREF value) {
        this.autosarvariable = value;
    }

    /**
     * ??mcdatainstancevarref?????
     * 
     * @return
     *     possible object is
     *     {@link SWVARIABLEREFPROXY.MCDATAINSTANCEVARREF }
     *     
     */
    public SWVARIABLEREFPROXY.MCDATAINSTANCEVARREF getMCDATAINSTANCEVARREF() {
        return mcdatainstancevarref;
    }

    /**
     * ??mcdatainstancevarref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWVARIABLEREFPROXY.MCDATAINSTANCEVARREF }
     *     
     */
    public void setMCDATAINSTANCEVARREF(SWVARIABLEREFPROXY.MCDATAINSTANCEVARREF value) {
        this.mcdatainstancevarref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MC-DATA-INSTANCE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MCDATAINSTANCEVARREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MCDATAINSTANCESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MCDATAINSTANCESUBTYPESENUM }
         *     
         */
        public MCDATAINSTANCESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MCDATAINSTANCESUBTYPESENUM }
         *     
         */
        public void setDEST(MCDATAINSTANCESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
