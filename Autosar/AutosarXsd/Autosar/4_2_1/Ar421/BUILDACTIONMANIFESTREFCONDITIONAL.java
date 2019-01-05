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
 * <p>BUILD-ACTION-MANIFEST-REF-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BUILD-ACTION-MANIFEST-REF-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BUILD-ACTION-MANIFEST-REF-CONDITIONAL"/>
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
@XmlType(name = "BUILD-ACTION-MANIFEST-REF-CONDITIONAL", propOrder = {
    "buildactionmanifestref",
    "variationpoint"
})
public class BUILDACTIONMANIFESTREFCONDITIONAL {

    @XmlElement(name = "BUILD-ACTION-MANIFEST-REF")
    protected BUILDACTIONMANIFESTREFCONDITIONAL.BUILDACTIONMANIFESTREF buildactionmanifestref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??buildactionmanifestref?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTIONMANIFESTREFCONDITIONAL.BUILDACTIONMANIFESTREF }
     *     
     */
    public BUILDACTIONMANIFESTREFCONDITIONAL.BUILDACTIONMANIFESTREF getBUILDACTIONMANIFESTREF() {
        return buildactionmanifestref;
    }

    /**
     * ??buildactionmanifestref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTIONMANIFESTREFCONDITIONAL.BUILDACTIONMANIFESTREF }
     *     
     */
    public void setBUILDACTIONMANIFESTREF(BUILDACTIONMANIFESTREFCONDITIONAL.BUILDACTIONMANIFESTREF value) {
        this.buildactionmanifestref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION-MANIFEST--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BUILDACTIONMANIFESTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BUILDACTIONMANIFESTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BUILDACTIONMANIFESTSUBTYPESENUM }
         *     
         */
        public BUILDACTIONMANIFESTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BUILDACTIONMANIFESTSUBTYPESENUM }
         *     
         */
        public void setDEST(BUILDACTIONMANIFESTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
