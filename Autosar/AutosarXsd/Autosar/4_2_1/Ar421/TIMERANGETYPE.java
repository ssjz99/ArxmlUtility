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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The timeRange can be specified with the value attribute. Optionally a tolerance can be defined.
 * 
 * <p>TIME-RANGE-TYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TIME-RANGE-TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIME-RANGE-TYPE"/>
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
@XmlType(name = "TIME-RANGE-TYPE", propOrder = {
    "tolerance",
    "value"
})
public class TIMERANGETYPE {

    @XmlElement(name = "TOLERANCE")
    protected TIMERANGETYPE.TOLERANCE tolerance;
    @XmlElement(name = "VALUE")
    protected TIMEVALUE value;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??tolerance?????
     * 
     * @return
     *     possible object is
     *     {@link TIMERANGETYPE.TOLERANCE }
     *     
     */
    public TIMERANGETYPE.TOLERANCE getTOLERANCE() {
        return tolerance;
    }

    /**
     * ??tolerance?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMERANGETYPE.TOLERANCE }
     *     
     */
    public void setTOLERANCE(TIMERANGETYPE.TOLERANCE value) {
        this.tolerance = value;
    }

    /**
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getVALUE() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setVALUE(TIMEVALUE value) {
        this.value = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element name="ABSOLUTE-TOLERANCE" type="{http://autosar.org/schema/r4.0}ABSOLUTE-TOLERANCE"/>
     *         &lt;element name="RELATIVE-TOLERANCE" type="{http://autosar.org/schema/r4.0}RELATIVE-TOLERANCE"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "absolutetoleranceOrRELATIVETOLERANCE"
    })
    public static class TOLERANCE {

        @XmlElements({
            @XmlElement(name = "ABSOLUTE-TOLERANCE", type = ABSOLUTETOLERANCE.class),
            @XmlElement(name = "RELATIVE-TOLERANCE", type = RELATIVETOLERANCE.class)
        })
        protected Object absolutetoleranceOrRELATIVETOLERANCE;

        /**
         * ??absolutetoleranceOrRELATIVETOLERANCE?????
         * 
         * @return
         *     possible object is
         *     {@link ABSOLUTETOLERANCE }
         *     {@link RELATIVETOLERANCE }
         *     
         */
        public Object getABSOLUTETOLERANCEOrRELATIVETOLERANCE() {
            return absolutetoleranceOrRELATIVETOLERANCE;
        }

        /**
         * ??absolutetoleranceOrRELATIVETOLERANCE?????
         * 
         * @param value
         *     allowed object is
         *     {@link ABSOLUTETOLERANCE }
         *     {@link RELATIVETOLERANCE }
         *     
         */
        public void setABSOLUTETOLERANCEOrRELATIVETOLERANCE(Object value) {
            this.absolutetoleranceOrRELATIVETOLERANCE = value;
        }

    }

}
