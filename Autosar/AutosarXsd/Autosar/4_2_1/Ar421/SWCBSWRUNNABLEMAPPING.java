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
 * Maps a BswModuleEntity to a RunnableEntity if it is implemented as part of a BSW module (in the case of an AUTOSAR Service, a Complex Driver or an ECU Abstraction). The mapping can be used by a tool to find relevant information on the behavior, e.g. whether the bswEntity shall be running in interrupt context.
 * 
 * <p>SWC-BSW-RUNNABLE-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-BSW-RUNNABLE-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-BSW-RUNNABLE-MAPPING"/>
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
@XmlType(name = "SWC-BSW-RUNNABLE-MAPPING", propOrder = {
    "bswentityref",
    "swcrunnableref",
    "variationpoint"
})
public class SWCBSWRUNNABLEMAPPING {

    @XmlElement(name = "BSW-ENTITY-REF")
    protected SWCBSWRUNNABLEMAPPING.BSWENTITYREF bswentityref;
    @XmlElement(name = "SWC-RUNNABLE-REF")
    protected SWCBSWRUNNABLEMAPPING.SWCRUNNABLEREF swcrunnableref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??bswentityref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCBSWRUNNABLEMAPPING.BSWENTITYREF }
     *     
     */
    public SWCBSWRUNNABLEMAPPING.BSWENTITYREF getBSWENTITYREF() {
        return bswentityref;
    }

    /**
     * ??bswentityref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCBSWRUNNABLEMAPPING.BSWENTITYREF }
     *     
     */
    public void setBSWENTITYREF(SWCBSWRUNNABLEMAPPING.BSWENTITYREF value) {
        this.bswentityref = value;
    }

    /**
     * ??swcrunnableref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCBSWRUNNABLEMAPPING.SWCRUNNABLEREF }
     *     
     */
    public SWCBSWRUNNABLEMAPPING.SWCRUNNABLEREF getSWCRUNNABLEREF() {
        return swcrunnableref;
    }

    /**
     * ??swcrunnableref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCBSWRUNNABLEMAPPING.SWCRUNNABLEREF }
     *     
     */
    public void setSWCRUNNABLEREF(SWCBSWRUNNABLEMAPPING.SWCRUNNABLEREF value) {
        this.swcrunnableref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTITY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BSWENTITYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWMODULEENTITYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWMODULEENTITYSUBTYPESENUM }
         *     
         */
        public BSWMODULEENTITYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWMODULEENTITYSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWMODULEENTITYSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}RUNNABLE-ENTITY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SWCRUNNABLEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected RUNNABLEENTITYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link RUNNABLEENTITYSUBTYPESENUM }
         *     
         */
        public RUNNABLEENTITYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link RUNNABLEENTITYSUBTYPESENUM }
         *     
         */
        public void setDEST(RUNNABLEENTITYSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
