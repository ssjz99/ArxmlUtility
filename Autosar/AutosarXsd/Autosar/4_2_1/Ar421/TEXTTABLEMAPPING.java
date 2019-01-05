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
 * Defines the mapping of two DataPrototypes typed by AutosarDataTypes that refer to CompuMethods of category TEXTTABLE, SCALE_LINEAR_AND_TEXTTABLE or BITFIELD_TEXTTABLE.
 * 
 * <p>TEXT-TABLE-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TEXT-TABLE-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TEXT-TABLE-MAPPING"/>
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
@XmlType(name = "TEXT-TABLE-MAPPING", propOrder = {
    "bitfieldtexttablemaskfirst",
    "bitfieldtexttablemasksecond",
    "identicalmapping",
    "mappingdirection",
    "valuepairs"
})
public class TEXTTABLEMAPPING {

    @XmlElement(name = "BITFIELD-TEXT-TABLE-MASK-FIRST")
    protected POSITIVEINTEGERVALUEVARIATIONPOINT bitfieldtexttablemaskfirst;
    @XmlElement(name = "BITFIELD-TEXT-TABLE-MASK-SECOND")
    protected POSITIVEINTEGERVALUEVARIATIONPOINT bitfieldtexttablemasksecond;
    @XmlElement(name = "IDENTICAL-MAPPING")
    protected BOOLEAN identicalmapping;
    @XmlElement(name = "MAPPING-DIRECTION")
    protected MAPPINGDIRECTIONENUM mappingdirection;
    @XmlElement(name = "VALUE-PAIRS")
    protected TEXTTABLEMAPPING.VALUEPAIRS valuepairs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??bitfieldtexttablemaskfirst?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public POSITIVEINTEGERVALUEVARIATIONPOINT getBITFIELDTEXTTABLEMASKFIRST() {
        return bitfieldtexttablemaskfirst;
    }

    /**
     * ??bitfieldtexttablemaskfirst?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setBITFIELDTEXTTABLEMASKFIRST(POSITIVEINTEGERVALUEVARIATIONPOINT value) {
        this.bitfieldtexttablemaskfirst = value;
    }

    /**
     * ??bitfieldtexttablemasksecond?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public POSITIVEINTEGERVALUEVARIATIONPOINT getBITFIELDTEXTTABLEMASKSECOND() {
        return bitfieldtexttablemasksecond;
    }

    /**
     * ??bitfieldtexttablemasksecond?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setBITFIELDTEXTTABLEMASKSECOND(POSITIVEINTEGERVALUEVARIATIONPOINT value) {
        this.bitfieldtexttablemasksecond = value;
    }

    /**
     * ??identicalmapping?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getIDENTICALMAPPING() {
        return identicalmapping;
    }

    /**
     * ??identicalmapping?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setIDENTICALMAPPING(BOOLEAN value) {
        this.identicalmapping = value;
    }

    /**
     * ??mappingdirection?????
     * 
     * @return
     *     possible object is
     *     {@link MAPPINGDIRECTIONENUM }
     *     
     */
    public MAPPINGDIRECTIONENUM getMAPPINGDIRECTION() {
        return mappingdirection;
    }

    /**
     * ??mappingdirection?????
     * 
     * @param value
     *     allowed object is
     *     {@link MAPPINGDIRECTIONENUM }
     *     
     */
    public void setMAPPINGDIRECTION(MAPPINGDIRECTIONENUM value) {
        this.mappingdirection = value;
    }

    /**
     * ??valuepairs?????
     * 
     * @return
     *     possible object is
     *     {@link TEXTTABLEMAPPING.VALUEPAIRS }
     *     
     */
    public TEXTTABLEMAPPING.VALUEPAIRS getVALUEPAIRS() {
        return valuepairs;
    }

    /**
     * ??valuepairs?????
     * 
     * @param value
     *     allowed object is
     *     {@link TEXTTABLEMAPPING.VALUEPAIRS }
     *     
     */
    public void setVALUEPAIRS(TEXTTABLEMAPPING.VALUEPAIRS value) {
        this.valuepairs = value;
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
     *         &lt;element name="TEXT-TABLE-VALUE-PAIR" type="{http://autosar.org/schema/r4.0}TEXT-TABLE-VALUE-PAIR"/>
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
        "texttablevaluepair"
    })
    public static class VALUEPAIRS {

        @XmlElement(name = "TEXT-TABLE-VALUE-PAIR")
        protected List<TEXTTABLEVALUEPAIR> texttablevaluepair;

        /**
         * Gets the value of the texttablevaluepair property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the texttablevaluepair property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTEXTTABLEVALUEPAIR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TEXTTABLEVALUEPAIR }
         * 
         * 
         */
        public List<TEXTTABLEVALUEPAIR> getTEXTTABLEVALUEPAIR() {
            if (texttablevaluepair == null) {
                texttablevaluepair = new ArrayList<TEXTTABLEVALUEPAIR>();
            }
            return this.texttablevaluepair;
        }

    }

}
