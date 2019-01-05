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
 * This meta-class expresses particular properties applicable to strings in variables or calibration parameters.
 * 
 * <p>SW-TEXT-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-TEXT-PROPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-TEXT-PROPS"/>
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
@XmlType(name = "SW-TEXT-PROPS", propOrder = {
    "arraysizesemantics",
    "swmaxtextsize",
    "basetyperef",
    "swfillcharacter"
})
public class SWTEXTPROPS {

    @XmlElement(name = "ARRAY-SIZE-SEMANTICS")
    protected ARRAYSIZESEMANTICSENUM arraysizesemantics;
    @XmlElement(name = "SW-MAX-TEXT-SIZE")
    protected INTEGERVALUEVARIATIONPOINT swmaxtextsize;
    @XmlElement(name = "BASE-TYPE-REF")
    protected SWTEXTPROPS.BASETYPEREF basetyperef;
    @XmlElement(name = "SW-FILL-CHARACTER")
    protected INTEGER swfillcharacter;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??arraysizesemantics?????
     * 
     * @return
     *     possible object is
     *     {@link ARRAYSIZESEMANTICSENUM }
     *     
     */
    public ARRAYSIZESEMANTICSENUM getARRAYSIZESEMANTICS() {
        return arraysizesemantics;
    }

    /**
     * ??arraysizesemantics?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARRAYSIZESEMANTICSENUM }
     *     
     */
    public void setARRAYSIZESEMANTICS(ARRAYSIZESEMANTICSENUM value) {
        this.arraysizesemantics = value;
    }

    /**
     * ??swmaxtextsize?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGERVALUEVARIATIONPOINT }
     *     
     */
    public INTEGERVALUEVARIATIONPOINT getSWMAXTEXTSIZE() {
        return swmaxtextsize;
    }

    /**
     * ??swmaxtextsize?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setSWMAXTEXTSIZE(INTEGERVALUEVARIATIONPOINT value) {
        this.swmaxtextsize = value;
    }

    /**
     * ??basetyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWTEXTPROPS.BASETYPEREF }
     *     
     */
    public SWTEXTPROPS.BASETYPEREF getBASETYPEREF() {
        return basetyperef;
    }

    /**
     * ??basetyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWTEXTPROPS.BASETYPEREF }
     *     
     */
    public void setBASETYPEREF(SWTEXTPROPS.BASETYPEREF value) {
        this.basetyperef = value;
    }

    /**
     * ??swfillcharacter?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSWFILLCHARACTER() {
        return swfillcharacter;
    }

    /**
     * ??swfillcharacter?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSWFILLCHARACTER(INTEGER value) {
        this.swfillcharacter = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-BASE-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BASETYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWBASETYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWBASETYPESUBTYPESENUM }
         *     
         */
        public SWBASETYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWBASETYPESUBTYPESENUM }
         *     
         */
        public void setDEST(SWBASETYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
