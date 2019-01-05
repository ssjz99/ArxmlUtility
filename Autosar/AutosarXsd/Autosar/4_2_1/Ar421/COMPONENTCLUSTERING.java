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
 * Constraint that forces the mapping of all referenced SW component instances  to the same ECU, Core, Partition depending on the defined mappingScope attribute.  If mappingScope is not specified then mappingScopeEcu shall be assumed.
 * 
 * <p>COMPONENT-CLUSTERING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COMPONENT-CLUSTERING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MAPPING-CONSTRAINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMPONENT-CLUSTERING"/>
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
@XmlType(name = "COMPONENT-CLUSTERING", propOrder = {
    "introduction",
    "variationpoint",
    "clusteredcomponentirefs",
    "mappingscope"
})
public class COMPONENTCLUSTERING {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "CLUSTERED-COMPONENT-IREFS")
    protected COMPONENTCLUSTERING.CLUSTEREDCOMPONENTIREFS clusteredcomponentirefs;
    @XmlElement(name = "MAPPING-SCOPE")
    protected MAPPINGSCOPEENUM mappingscope;
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
     * ??clusteredcomponentirefs?????
     * 
     * @return
     *     possible object is
     *     {@link COMPONENTCLUSTERING.CLUSTEREDCOMPONENTIREFS }
     *     
     */
    public COMPONENTCLUSTERING.CLUSTEREDCOMPONENTIREFS getCLUSTEREDCOMPONENTIREFS() {
        return clusteredcomponentirefs;
    }

    /**
     * ??clusteredcomponentirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPONENTCLUSTERING.CLUSTEREDCOMPONENTIREFS }
     *     
     */
    public void setCLUSTEREDCOMPONENTIREFS(COMPONENTCLUSTERING.CLUSTEREDCOMPONENTIREFS value) {
        this.clusteredcomponentirefs = value;
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
     *         &lt;element name="CLUSTERED-COMPONENT-IREF" type="{http://autosar.org/schema/r4.0}COMPONENT-IN-SYSTEM-INSTANCE-REF"/>
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
        "clusteredcomponentiref"
    })
    public static class CLUSTEREDCOMPONENTIREFS {

        @XmlElement(name = "CLUSTERED-COMPONENT-IREF")
        protected List<COMPONENTINSYSTEMINSTANCEREF> clusteredcomponentiref;

        /**
         * Gets the value of the clusteredcomponentiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clusteredcomponentiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLUSTEREDCOMPONENTIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMPONENTINSYSTEMINSTANCEREF }
         * 
         * 
         */
        public List<COMPONENTINSYSTEMINSTANCEREF> getCLUSTEREDCOMPONENTIREF() {
            if (clusteredcomponentiref == null) {
                clusteredcomponentiref = new ArrayList<COMPONENTINSYSTEMINSTANCEREF>();
            }
            return this.clusteredcomponentiref;
        }

    }

}
