//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DESCRIBABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSFORMATION-I-SIGNAL-PROPS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS"/>
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
@XmlType(name = "END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS", propOrder = {
    "desc",
    "category",
    "introduction",
    "admindata",
    "endtoendtransformationisignalpropsvariants"
})
public class ENDTOENDTRANSFORMATIONISIGNALPROPS {

    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-VARIANTS")
    protected ENDTOENDTRANSFORMATIONISIGNALPROPS.ENDTOENDTRANSFORMATIONISIGNALPROPSVARIANTS endtoendtransformationisignalpropsvariants;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??desc?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public MULTILANGUAGEOVERVIEWPARAGRAPH getDESC() {
        return desc;
    }

    /**
     * ??desc?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public void setDESC(MULTILANGUAGEOVERVIEWPARAGRAPH value) {
        this.desc = value;
    }

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public CATEGORYSTRING getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public void setCATEGORY(CATEGORYSTRING value) {
        this.category = value;
    }

    /**
     * ??introduction?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getINTRODUCTION() {
        return introduction;
    }

    /**
     * ??introduction?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setINTRODUCTION(DOCUMENTATIONBLOCK value) {
        this.introduction = value;
    }

    /**
     * ??admindata?????
     * 
     * @return
     *     possible object is
     *     {@link ADMINDATA }
     *     
     */
    public ADMINDATA getADMINDATA() {
        return admindata;
    }

    /**
     * ??admindata?????
     * 
     * @param value
     *     allowed object is
     *     {@link ADMINDATA }
     *     
     */
    public void setADMINDATA(ADMINDATA value) {
        this.admindata = value;
    }

    /**
     * ??endtoendtransformationisignalpropsvariants?????
     * 
     * @return
     *     possible object is
     *     {@link ENDTOENDTRANSFORMATIONISIGNALPROPS.ENDTOENDTRANSFORMATIONISIGNALPROPSVARIANTS }
     *     
     */
    public ENDTOENDTRANSFORMATIONISIGNALPROPS.ENDTOENDTRANSFORMATIONISIGNALPROPSVARIANTS getENDTOENDTRANSFORMATIONISIGNALPROPSVARIANTS() {
        return endtoendtransformationisignalpropsvariants;
    }

    /**
     * ??endtoendtransformationisignalpropsvariants?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENDTOENDTRANSFORMATIONISIGNALPROPS.ENDTOENDTRANSFORMATIONISIGNALPROPSVARIANTS }
     *     
     */
    public void setENDTOENDTRANSFORMATIONISIGNALPROPSVARIANTS(ENDTOENDTRANSFORMATIONISIGNALPROPS.ENDTOENDTRANSFORMATIONISIGNALPROPSVARIANTS value) {
        this.endtoendtransformationisignalpropsvariants = value;
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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL" type="{http://autosar.org/schema/r4.0}END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL"/>
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
        "endtoendtransformationisignalpropsconditional"
    })
    public static class ENDTOENDTRANSFORMATIONISIGNALPROPSVARIANTS {

        @XmlElement(name = "END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL")
        protected List<ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL> endtoendtransformationisignalpropsconditional;

        /**
         * Gets the value of the endtoendtransformationisignalpropsconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endtoendtransformationisignalpropsconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL }
         * 
         * 
         */
        public List<ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL> getENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL() {
            if (endtoendtransformationisignalpropsconditional == null) {
                endtoendtransformationisignalpropsconditional = new ArrayList<ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL>();
            }
            return this.endtoendtransformationisignalpropsconditional;
        }

    }

}
