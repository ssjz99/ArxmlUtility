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
 * Resources needed by the allocation of PerInstanceMemory for each SWC instance. Note that these resources are not covered by an ObjectFileSection, because they are supposed to be allocated by the RTE.
 * 
 * <p>PER-INSTANCE-MEMORY-SIZE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PER-INSTANCE-MEMORY-SIZE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PER-INSTANCE-MEMORY-SIZE"/>
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
@XmlType(name = "PER-INSTANCE-MEMORY-SIZE", propOrder = {
    "alignment",
    "perinstancememoryref",
    "size",
    "variationpoint"
})
public class PERINSTANCEMEMORYSIZE {

    @XmlElement(name = "ALIGNMENT")
    protected POSITIVEINTEGER alignment;
    @XmlElement(name = "PER-INSTANCE-MEMORY-REF")
    protected PERINSTANCEMEMORYSIZE.PERINSTANCEMEMORYREF perinstancememoryref;
    @XmlElement(name = "SIZE")
    protected POSITIVEINTEGERVALUEVARIATIONPOINT size;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??alignment?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getALIGNMENT() {
        return alignment;
    }

    /**
     * ??alignment?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setALIGNMENT(POSITIVEINTEGER value) {
        this.alignment = value;
    }

    /**
     * ??perinstancememoryref?????
     * 
     * @return
     *     possible object is
     *     {@link PERINSTANCEMEMORYSIZE.PERINSTANCEMEMORYREF }
     *     
     */
    public PERINSTANCEMEMORYSIZE.PERINSTANCEMEMORYREF getPERINSTANCEMEMORYREF() {
        return perinstancememoryref;
    }

    /**
     * ??perinstancememoryref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PERINSTANCEMEMORYSIZE.PERINSTANCEMEMORYREF }
     *     
     */
    public void setPERINSTANCEMEMORYREF(PERINSTANCEMEMORYSIZE.PERINSTANCEMEMORYREF value) {
        this.perinstancememoryref = value;
    }

    /**
     * ??size?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public POSITIVEINTEGERVALUEVARIATIONPOINT getSIZE() {
        return size;
    }

    /**
     * ??size?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setSIZE(POSITIVEINTEGERVALUEVARIATIONPOINT value) {
        this.size = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PER-INSTANCE-MEMORY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PERINSTANCEMEMORYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PERINSTANCEMEMORYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PERINSTANCEMEMORYSUBTYPESENUM }
         *     
         */
        public PERINSTANCEMEMORYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PERINSTANCEMEMORYSUBTYPESENUM }
         *     
         */
        public void setDEST(PERINSTANCEMEMORYSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
