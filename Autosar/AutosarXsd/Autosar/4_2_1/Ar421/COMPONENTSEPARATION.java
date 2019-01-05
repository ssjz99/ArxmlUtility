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
 * Constraint that forces the two referenced SW components (called A and B in the following) not to be mapped to the same ECU, Core, Partition depending on the defined mappingScope attribute. If mappingScope is not specified then mappingScopeEcu shall be assumed. 
 * 
 * If a SW component (e.g. A) is a composition, none of the atomic SW components making up the A composition must be mapped together with any of the atomic SW components making up the B composition. Furthermore, A and B must be disjoint.
 * 
 * <p>COMPONENT-SEPARATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COMPONENT-SEPARATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MAPPING-CONSTRAINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMPONENT-SEPARATION"/>
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
@XmlType(name = "COMPONENT-SEPARATION", propOrder = {
    "introduction",
    "variationpoint",
    "mappingscope",
    "separatedcomponentirefs"
})
public class COMPONENTSEPARATION {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "MAPPING-SCOPE")
    protected MAPPINGSCOPEENUM mappingscope;
    @XmlElement(name = "SEPARATED-COMPONENT-IREFS")
    protected COMPONENTSEPARATION.SEPARATEDCOMPONENTIREFS separatedcomponentirefs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??mappingscope?????
     * 
     * @return
     *     possible object is
     *     {@link MAPPINGSCOPEENUM }
     *     
     */
    public MAPPINGSCOPEENUM getMAPPINGSCOPE() {
        return mappingscope;
    }

    /**
     * ??mappingscope?????
     * 
     * @param value
     *     allowed object is
     *     {@link MAPPINGSCOPEENUM }
     *     
     */
    public void setMAPPINGSCOPE(MAPPINGSCOPEENUM value) {
        this.mappingscope = value;
    }

    /**
     * ??separatedcomponentirefs?????
     * 
     * @return
     *     possible object is
     *     {@link COMPONENTSEPARATION.SEPARATEDCOMPONENTIREFS }
     *     
     */
    public COMPONENTSEPARATION.SEPARATEDCOMPONENTIREFS getSEPARATEDCOMPONENTIREFS() {
        return separatedcomponentirefs;
    }

    /**
     * ??separatedcomponentirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPONENTSEPARATION.SEPARATEDCOMPONENTIREFS }
     *     
     */
    public void setSEPARATEDCOMPONENTIREFS(COMPONENTSEPARATION.SEPARATEDCOMPONENTIREFS value) {
        this.separatedcomponentirefs = value;
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
     *       &lt;choice maxOccurs="2" minOccurs="0">
     *         &lt;element name="SEPARATED-COMPONENT-IREF" type="{http://autosar.org/schema/r4.0}COMPONENT-IN-SYSTEM-INSTANCE-REF"/>
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
        "separatedcomponentiref"
    })
    public static class SEPARATEDCOMPONENTIREFS {

        @XmlElement(name = "SEPARATED-COMPONENT-IREF")
        protected List<COMPONENTINSYSTEMINSTANCEREF> separatedcomponentiref;

        /**
         * Gets the value of the separatedcomponentiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the separatedcomponentiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSEPARATEDCOMPONENTIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMPONENTINSYSTEMINSTANCEREF }
         * 
         * 
         */
        public List<COMPONENTINSYSTEMINSTANCEREF> getSEPARATEDCOMPONENTIREF() {
            if (separatedcomponentiref == null) {
                separatedcomponentiref = new ArrayList<COMPONENTINSYSTEMINSTANCEREF>();
            }
            return this.separatedcomponentiref;
        }

    }

}
