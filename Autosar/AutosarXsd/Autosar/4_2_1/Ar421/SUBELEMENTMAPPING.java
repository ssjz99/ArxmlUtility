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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * This meta-class allows for the definition of mappings of elements of a composite data type.
 * 
 * <p>SUB-ELEMENT-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SUB-ELEMENT-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SUB-ELEMENT-MAPPING"/>
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
@XmlType(name = "SUB-ELEMENT-MAPPING", propOrder = {
    "firstelements",
    "secondelements",
    "texttablemappings"
})
public class SUBELEMENTMAPPING {

    @XmlElement(name = "FIRST-ELEMENTS")
    protected SUBELEMENTMAPPING.FIRSTELEMENTS firstelements;
    @XmlElement(name = "SECOND-ELEMENTS")
    protected SUBELEMENTMAPPING.SECONDELEMENTS secondelements;
    @XmlElement(name = "TEXT-TABLE-MAPPINGS")
    protected SUBELEMENTMAPPING.TEXTTABLEMAPPINGS texttablemappings;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??firstelements?????
     * 
     * @return
     *     possible object is
     *     {@link SUBELEMENTMAPPING.FIRSTELEMENTS }
     *     
     */
    public SUBELEMENTMAPPING.FIRSTELEMENTS getFIRSTELEMENTS() {
        return firstelements;
    }

    /**
     * ??firstelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link SUBELEMENTMAPPING.FIRSTELEMENTS }
     *     
     */
    public void setFIRSTELEMENTS(SUBELEMENTMAPPING.FIRSTELEMENTS value) {
        this.firstelements = value;
    }

    /**
     * ??secondelements?????
     * 
     * @return
     *     possible object is
     *     {@link SUBELEMENTMAPPING.SECONDELEMENTS }
     *     
     */
    public SUBELEMENTMAPPING.SECONDELEMENTS getSECONDELEMENTS() {
        return secondelements;
    }

    /**
     * ??secondelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link SUBELEMENTMAPPING.SECONDELEMENTS }
     *     
     */
    public void setSECONDELEMENTS(SUBELEMENTMAPPING.SECONDELEMENTS value) {
        this.secondelements = value;
    }

    /**
     * ??texttablemappings?????
     * 
     * @return
     *     possible object is
     *     {@link SUBELEMENTMAPPING.TEXTTABLEMAPPINGS }
     *     
     */
    public SUBELEMENTMAPPING.TEXTTABLEMAPPINGS getTEXTTABLEMAPPINGS() {
        return texttablemappings;
    }

    /**
     * ??texttablemappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link SUBELEMENTMAPPING.TEXTTABLEMAPPINGS }
     *     
     */
    public void setTEXTTABLEMAPPINGS(SUBELEMENTMAPPING.TEXTTABLEMAPPINGS value) {
        this.texttablemappings = value;
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
     *         &lt;element name="APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF" type="{http://autosar.org/schema/r4.0}APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF"/>
     *         &lt;element name="IMPLEMENTATION-DATA-TYPE-SUB-ELEMENT-REF" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE-SUB-ELEMENT-REF"/>
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
        "applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF"
    })
    public static class FIRSTELEMENTS {

        @XmlElements({
            @XmlElement(name = "APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF", type = APPLICATIONCOMPOSITEDATATYPESUBELEMENTREF.class),
            @XmlElement(name = "IMPLEMENTATION-DATA-TYPE-SUB-ELEMENT-REF", type = IMPLEMENTATIONDATATYPESUBELEMENTREF.class)
        })
        protected List<Object> applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF;

        /**
         * Gets the value of the applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAPPLICATIONCOMPOSITEDATATYPESUBELEMENTREFOrIMPLEMENTATIONDATATYPESUBELEMENTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APPLICATIONCOMPOSITEDATATYPESUBELEMENTREF }
         * {@link IMPLEMENTATIONDATATYPESUBELEMENTREF }
         * 
         * 
         */
        public List<Object> getAPPLICATIONCOMPOSITEDATATYPESUBELEMENTREFOrIMPLEMENTATIONDATATYPESUBELEMENTREF() {
            if (applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF == null) {
                applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF = new ArrayList<Object>();
            }
            return this.applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF;
        }

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
     *         &lt;element name="APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF" type="{http://autosar.org/schema/r4.0}APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF"/>
     *         &lt;element name="IMPLEMENTATION-DATA-TYPE-SUB-ELEMENT-REF" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE-SUB-ELEMENT-REF"/>
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
        "applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF"
    })
    public static class SECONDELEMENTS {

        @XmlElements({
            @XmlElement(name = "APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF", type = APPLICATIONCOMPOSITEDATATYPESUBELEMENTREF.class),
            @XmlElement(name = "IMPLEMENTATION-DATA-TYPE-SUB-ELEMENT-REF", type = IMPLEMENTATIONDATATYPESUBELEMENTREF.class)
        })
        protected List<Object> applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF;

        /**
         * Gets the value of the applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAPPLICATIONCOMPOSITEDATATYPESUBELEMENTREFOrIMPLEMENTATIONDATATYPESUBELEMENTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APPLICATIONCOMPOSITEDATATYPESUBELEMENTREF }
         * {@link IMPLEMENTATIONDATATYPESUBELEMENTREF }
         * 
         * 
         */
        public List<Object> getAPPLICATIONCOMPOSITEDATATYPESUBELEMENTREFOrIMPLEMENTATIONDATATYPESUBELEMENTREF() {
            if (applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF == null) {
                applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF = new ArrayList<Object>();
            }
            return this.applicationcompositedatatypesubelementrefOrIMPLEMENTATIONDATATYPESUBELEMENTREF;
        }

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
     *       &lt;choice maxOccurs="2" minOccurs="0">
     *         &lt;element name="TEXT-TABLE-MAPPING" type="{http://autosar.org/schema/r4.0}TEXT-TABLE-MAPPING"/>
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
        "texttablemapping"
    })
    public static class TEXTTABLEMAPPINGS {

        @XmlElement(name = "TEXT-TABLE-MAPPING")
        protected List<TEXTTABLEMAPPING> texttablemapping;

        /**
         * Gets the value of the texttablemapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the texttablemapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTEXTTABLEMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TEXTTABLEMAPPING }
         * 
         * 
         */
        public List<TEXTTABLEMAPPING> getTEXTTABLEMAPPING() {
            if (texttablemapping == null) {
                texttablemapping = new ArrayList<TEXTTABLEMAPPING>();
            }
            return this.texttablemapping;
        }

    }

}
