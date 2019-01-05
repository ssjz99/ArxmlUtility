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
 * Specifies in which hardware ProvidedMemorySegment the softwareMemorySection is located.
 * 
 * <p>MEMORY-SECTION-LOCATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MEMORY-SECTION-LOCATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MEMORY-SECTION-LOCATION"/>
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
@XmlType(name = "MEMORY-SECTION-LOCATION", propOrder = {
    "providedmemoryref",
    "softwarememorysectionref"
})
public class MEMORYSECTIONLOCATION {

    @XmlElement(name = "PROVIDED-MEMORY-REF")
    protected MEMORYSECTIONLOCATION.PROVIDEDMEMORYREF providedmemoryref;
    @XmlElement(name = "SOFTWARE-MEMORY-SECTION-REF")
    protected MEMORYSECTIONLOCATION.SOFTWAREMEMORYSECTIONREF softwarememorysectionref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??providedmemoryref?????
     * 
     * @return
     *     possible object is
     *     {@link MEMORYSECTIONLOCATION.PROVIDEDMEMORYREF }
     *     
     */
    public MEMORYSECTIONLOCATION.PROVIDEDMEMORYREF getPROVIDEDMEMORYREF() {
        return providedmemoryref;
    }

    /**
     * ??providedmemoryref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MEMORYSECTIONLOCATION.PROVIDEDMEMORYREF }
     *     
     */
    public void setPROVIDEDMEMORYREF(MEMORYSECTIONLOCATION.PROVIDEDMEMORYREF value) {
        this.providedmemoryref = value;
    }

    /**
     * ??softwarememorysectionref?????
     * 
     * @return
     *     possible object is
     *     {@link MEMORYSECTIONLOCATION.SOFTWAREMEMORYSECTIONREF }
     *     
     */
    public MEMORYSECTIONLOCATION.SOFTWAREMEMORYSECTIONREF getSOFTWAREMEMORYSECTIONREF() {
        return softwarememorysectionref;
    }

    /**
     * ??softwarememorysectionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MEMORYSECTIONLOCATION.SOFTWAREMEMORYSECTIONREF }
     *     
     */
    public void setSOFTWAREMEMORYSECTIONREF(MEMORYSECTIONLOCATION.SOFTWAREMEMORYSECTIONREF value) {
        this.softwarememorysectionref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}HW-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PROVIDEDMEMORYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected HWELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link HWELEMENTSUBTYPESENUM }
         *     
         */
        public HWELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link HWELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(HWELEMENTSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MEMORY-SECTION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SOFTWAREMEMORYSECTIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MEMORYSECTIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MEMORYSECTIONSUBTYPESENUM }
         *     
         */
        public MEMORYSECTIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MEMORYSECTIONSUBTYPESENUM }
         *     
         */
        public void setDEST(MEMORYSECTIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
