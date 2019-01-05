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
 * This element defines, that the data object (which is specified by the aggregating element) contains a reference to another data object or to a function in the CPU code. This corresponds to a pointer in the C-language.
 * 
 * The attributes of this element describe the category and the detailed properties of the target which is either a data description or a function signature.
 * 
 * <p>SW-POINTER-TARGET-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-POINTER-TARGET-PROPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-POINTER-TARGET-PROPS"/>
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
@XmlType(name = "SW-POINTER-TARGET-PROPS", propOrder = {
    "targetcategory",
    "swdatadefprops",
    "functionpointersignatureref"
})
public class SWPOINTERTARGETPROPS {

    @XmlElement(name = "TARGET-CATEGORY")
    protected IDENTIFIER targetcategory;
    @XmlElement(name = "SW-DATA-DEF-PROPS")
    protected SWDATADEFPROPS swdatadefprops;
    @XmlElement(name = "FUNCTION-POINTER-SIGNATURE-REF")
    protected SWPOINTERTARGETPROPS.FUNCTIONPOINTERSIGNATUREREF functionpointersignatureref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??targetcategory?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getTARGETCATEGORY() {
        return targetcategory;
    }

    /**
     * ??targetcategory?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setTARGETCATEGORY(IDENTIFIER value) {
        this.targetcategory = value;
    }

    /**
     * ??swdatadefprops?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public SWDATADEFPROPS getSWDATADEFPROPS() {
        return swdatadefprops;
    }

    /**
     * ??swdatadefprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public void setSWDATADEFPROPS(SWDATADEFPROPS value) {
        this.swdatadefprops = value;
    }

    /**
     * ??functionpointersignatureref?????
     * 
     * @return
     *     possible object is
     *     {@link SWPOINTERTARGETPROPS.FUNCTIONPOINTERSIGNATUREREF }
     *     
     */
    public SWPOINTERTARGETPROPS.FUNCTIONPOINTERSIGNATUREREF getFUNCTIONPOINTERSIGNATUREREF() {
        return functionpointersignatureref;
    }

    /**
     * ??functionpointersignatureref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWPOINTERTARGETPROPS.FUNCTIONPOINTERSIGNATUREREF }
     *     
     */
    public void setFUNCTIONPOINTERSIGNATUREREF(SWPOINTERTARGETPROPS.FUNCTIONPOINTERSIGNATUREREF value) {
        this.functionpointersignatureref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTRY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FUNCTIONPOINTERSIGNATUREREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWMODULEENTRYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWMODULEENTRYSUBTYPESENUM }
         *     
         */
        public BSWMODULEENTRYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWMODULEENTRYSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWMODULEENTRYSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
