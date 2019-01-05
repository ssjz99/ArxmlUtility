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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Sdg (SpecialDataGroup) is a generic model which can be used to keep arbitrary information which is not explicitly modeled in the meta-model. 
 * 
 * Sdg can have various contents as defined by sdgContentsType. Special Data should only be used moderately since all elements should be defined in the meta-model. 
 * 
 * Thereby SDG should be considered as a temporary solution when no explicit model is available. If an sdgCaption is available, it is possible to establish a reference to the sdg structure.
 * 
 * <p>SDG complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SDG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SDG"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}SDG"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDG", propOrder = {
    "sdgcaption",
    "sdgcaptionref",
    "sdxrefOrSDXFOrSD",
    "variationpoint"
})
public class SDG {

    @XmlElement(name = "SDG-CAPTION")
    protected SDGCAPTION sdgcaption;
    @XmlElement(name = "SDG-CAPTION-REF")
    protected SDG.SDGCAPTIONREF sdgcaptionref;
    @XmlElements({
        @XmlElement(name = "SDX-REF", type = Ar421.SDGCONTENTS.SDXREF.class),
        @XmlElement(name = "SDXF", type = REFERRABLEREFCONDITIONAL.class),
        @XmlElement(name = "SD", type = SD.class),
        @XmlElement(name = "SDG", type = SDG.class),
        @XmlElement(name = "SDF", type = SDF.class)
    })
    protected List<Object> sdxrefOrSDXFOrSD;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "GID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gid;

    /**
     * ??sdgcaption?????
     * 
     * @return
     *     possible object is
     *     {@link SDGCAPTION }
     *     
     */
    public SDGCAPTION getSDGCAPTION() {
        return sdgcaption;
    }

    /**
     * ??sdgcaption?????
     * 
     * @param value
     *     allowed object is
     *     {@link SDGCAPTION }
     *     
     */
    public void setSDGCAPTION(SDGCAPTION value) {
        this.sdgcaption = value;
    }

    /**
     * ??sdgcaptionref?????
     * 
     * @return
     *     possible object is
     *     {@link SDG.SDGCAPTIONREF }
     *     
     */
    public SDG.SDGCAPTIONREF getSDGCAPTIONREF() {
        return sdgcaptionref;
    }

    /**
     * ??sdgcaptionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SDG.SDGCAPTIONREF }
     *     
     */
    public void setSDGCAPTIONREF(SDG.SDGCAPTIONREF value) {
        this.sdgcaptionref = value;
    }

    /**
     * Gets the value of the sdxrefOrSDXFOrSD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdxrefOrSDXFOrSD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSDXREFOrSDXFOrSD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ar421.SDGCONTENTS.SDXREF }
     * {@link REFERRABLEREFCONDITIONAL }
     * {@link SD }
     * {@link SDG }
     * {@link SDF }
     * 
     * 
     */
    public List<Object> getSDXREFOrSDXFOrSD() {
        if (sdxrefOrSDXFOrSD == null) {
            sdxrefOrSDXFOrSD = new ArrayList<Object>();
        }
        return this.sdxrefOrSDXFOrSD;
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
     * ??gid?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGID() {
        return gid;
    }

    /**
     * ??gid?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGID(String value) {
        this.gid = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SDG-CAPTION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SDGCAPTIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SDGCAPTIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SDGCAPTIONSUBTYPESENUM }
         *     
         */
        public SDGCAPTIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SDGCAPTIONSUBTYPESENUM }
         *     
         */
        public void setDEST(SDGCAPTIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
