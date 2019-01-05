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
 * Describes a mapping between one or several Virtual Function Clusters onto Partial Network Clusters. A Virtual Function Cluster is realized by a PortGroup. A Partial Network Cluster is realized by one or more IPduGroups.
 * 
 * <p>PNC-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PNC-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DESCRIBABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PNC-MAPPING"/>
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
@XmlType(name = "PNC-MAPPING", propOrder = {
    "desc",
    "category",
    "introduction",
    "admindata",
    "pncgrouprefs",
    "pncidentifier",
    "vfcirefs",
    "wakeupframerefs",
    "variationpoint"
})
public class PNCMAPPING {

    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "PNC-GROUP-REFS")
    protected PNCMAPPING.PNCGROUPREFS pncgrouprefs;
    @XmlElement(name = "PNC-IDENTIFIER")
    protected POSITIVEINTEGER pncidentifier;
    @XmlElement(name = "VFC-IREFS")
    protected PNCMAPPING.VFCIREFS vfcirefs;
    @XmlElement(name = "WAKEUP-FRAME-REFS")
    protected PNCMAPPING.WAKEUPFRAMEREFS wakeupframerefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
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
     * ??pncgrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link PNCMAPPING.PNCGROUPREFS }
     *     
     */
    public PNCMAPPING.PNCGROUPREFS getPNCGROUPREFS() {
        return pncgrouprefs;
    }

    /**
     * ??pncgrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PNCMAPPING.PNCGROUPREFS }
     *     
     */
    public void setPNCGROUPREFS(PNCMAPPING.PNCGROUPREFS value) {
        this.pncgrouprefs = value;
    }

    /**
     * ??pncidentifier?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPNCIDENTIFIER() {
        return pncidentifier;
    }

    /**
     * ??pncidentifier?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPNCIDENTIFIER(POSITIVEINTEGER value) {
        this.pncidentifier = value;
    }

    /**
     * ??vfcirefs?????
     * 
     * @return
     *     possible object is
     *     {@link PNCMAPPING.VFCIREFS }
     *     
     */
    public PNCMAPPING.VFCIREFS getVFCIREFS() {
        return vfcirefs;
    }

    /**
     * ??vfcirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PNCMAPPING.VFCIREFS }
     *     
     */
    public void setVFCIREFS(PNCMAPPING.VFCIREFS value) {
        this.vfcirefs = value;
    }

    /**
     * ??wakeupframerefs?????
     * 
     * @return
     *     possible object is
     *     {@link PNCMAPPING.WAKEUPFRAMEREFS }
     *     
     */
    public PNCMAPPING.WAKEUPFRAMEREFS getWAKEUPFRAMEREFS() {
        return wakeupframerefs;
    }

    /**
     * ??wakeupframerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PNCMAPPING.WAKEUPFRAMEREFS }
     *     
     */
    public void setWAKEUPFRAMEREFS(PNCMAPPING.WAKEUPFRAMEREFS value) {
        this.wakeupframerefs = value;
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
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="PNC-GROUP-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU-GROUP--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "pncgroupref"
    })
    public static class PNCGROUPREFS {

        @XmlElement(name = "PNC-GROUP-REF")
        protected List<PNCMAPPING.PNCGROUPREFS.PNCGROUPREF> pncgroupref;

        /**
         * Gets the value of the pncgroupref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pncgroupref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPNCGROUPREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNCMAPPING.PNCGROUPREFS.PNCGROUPREF }
         * 
         * 
         */
        public List<PNCMAPPING.PNCGROUPREFS.PNCGROUPREF> getPNCGROUPREF() {
            if (pncgroupref == null) {
                pncgroupref = new ArrayList<PNCMAPPING.PNCGROUPREFS.PNCGROUPREF>();
            }
            return this.pncgroupref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU-GROUP--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PNCGROUPREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ISIGNALIPDUGROUPSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ISIGNALIPDUGROUPSUBTYPESENUM }
             *     
             */
            public ISIGNALIPDUGROUPSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ISIGNALIPDUGROUPSUBTYPESENUM }
             *     
             */
            public void setDEST(ISIGNALIPDUGROUPSUBTYPESENUM value) {
                this.dest = value;
            }

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
     *         &lt;element name="VFC-IREF" type="{http://autosar.org/schema/r4.0}PORT-GROUP-IN-SYSTEM-INSTANCE-REF"/>
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
        "vfciref"
    })
    public static class VFCIREFS {

        @XmlElement(name = "VFC-IREF")
        protected List<PORTGROUPINSYSTEMINSTANCEREF> vfciref;

        /**
         * Gets the value of the vfciref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vfciref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVFCIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PORTGROUPINSYSTEMINSTANCEREF }
         * 
         * 
         */
        public List<PORTGROUPINSYSTEMINSTANCEREF> getVFCIREF() {
            if (vfciref == null) {
                vfciref = new ArrayList<PORTGROUPINSYSTEMINSTANCEREF>();
            }
            return this.vfciref;
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
     *         &lt;element name="WAKEUP-FRAME-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FRAME-TRIGGERING--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "wakeupframeref"
    })
    public static class WAKEUPFRAMEREFS {

        @XmlElement(name = "WAKEUP-FRAME-REF")
        protected List<PNCMAPPING.WAKEUPFRAMEREFS.WAKEUPFRAMEREF> wakeupframeref;

        /**
         * Gets the value of the wakeupframeref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wakeupframeref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWAKEUPFRAMEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNCMAPPING.WAKEUPFRAMEREFS.WAKEUPFRAMEREF }
         * 
         * 
         */
        public List<PNCMAPPING.WAKEUPFRAMEREFS.WAKEUPFRAMEREF> getWAKEUPFRAMEREF() {
            if (wakeupframeref == null) {
                wakeupframeref = new ArrayList<PNCMAPPING.WAKEUPFRAMEREFS.WAKEUPFRAMEREF>();
            }
            return this.wakeupframeref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FRAME-TRIGGERING--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class WAKEUPFRAMEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected FRAMETRIGGERINGSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link FRAMETRIGGERINGSUBTYPESENUM }
             *     
             */
            public FRAMETRIGGERINGSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link FRAMETRIGGERINGSUBTYPESENUM }
             *     
             */
            public void setDEST(FRAMETRIGGERINGSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
