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
 * Specifies a released trigger to be directly implemented via OS calls, for example in a Complex Driver module.
 * 
 * <p>BSW-TRIGGER-DIRECT-IMPLEMENTATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-TRIGGER-DIRECT-IMPLEMENTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-TRIGGER-DIRECT-IMPLEMENTATION"/>
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
@XmlType(name = "BSW-TRIGGER-DIRECT-IMPLEMENTATION", propOrder = {
    "masteredtriggerref",
    "task",
    "variationpoint"
})
public class BSWTRIGGERDIRECTIMPLEMENTATION {

    @XmlElement(name = "MASTERED-TRIGGER-REF")
    protected BSWTRIGGERDIRECTIMPLEMENTATION.MASTEREDTRIGGERREF masteredtriggerref;
    @XmlElement(name = "TASK")
    protected IDENTIFIER task;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??masteredtriggerref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWTRIGGERDIRECTIMPLEMENTATION.MASTEREDTRIGGERREF }
     *     
     */
    public BSWTRIGGERDIRECTIMPLEMENTATION.MASTEREDTRIGGERREF getMASTEREDTRIGGERREF() {
        return masteredtriggerref;
    }

    /**
     * ??masteredtriggerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWTRIGGERDIRECTIMPLEMENTATION.MASTEREDTRIGGERREF }
     *     
     */
    public void setMASTEREDTRIGGERREF(BSWTRIGGERDIRECTIMPLEMENTATION.MASTEREDTRIGGERREF value) {
        this.masteredtriggerref = value;
    }

    /**
     * ??task?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getTASK() {
        return task;
    }

    /**
     * ??task?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setTASK(IDENTIFIER value) {
        this.task = value;
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
    public static class MASTEREDTRIGGERREF
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
