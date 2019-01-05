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
 * This represents an instance of the "Request Download" diagnostic service.
 * 
 * <p>DIAGNOSTIC-REQUEST-DOWNLOAD complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-REQUEST-DOWNLOAD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-INSTANCE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-MEMORY-BY-ADDRESS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-MEMORY-ADDRESSABLE-RANGE-ACCESS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-REQUEST-DOWNLOAD"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIAGNOSTIC-REQUEST-DOWNLOAD", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "accesspermissionref",
    "memoryrangerefs",
    "requestdownloadclassref"
})
public class DIAGNOSTICREQUESTDOWNLOAD {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "LONG-NAME")
    protected MULTILANGUAGELONGNAME longname;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ANNOTATIONS")
    protected Ar421.LINKER.ANNOTATIONS annotations;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "ACCESS-PERMISSION-REF")
    protected Ar421.DIAGNOSTICROUTINECONTROL.ACCESSPERMISSIONREF accesspermissionref;
    @XmlElement(name = "MEMORY-RANGE-REFS")
    protected DIAGNOSTICREQUESTDOWNLOAD.MEMORYRANGEREFS memoryrangerefs;
    @XmlElement(name = "REQUEST-DOWNLOAD-CLASS-REF")
    protected DIAGNOSTICREQUESTDOWNLOAD.REQUESTDOWNLOADCLASSREF requestdownloadclassref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "UUID")
    protected String uuid;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??longname?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public MULTILANGUAGELONGNAME getLONGNAME() {
        return longname;
    }

    /**
     * ??longname?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public void setLONGNAME(MULTILANGUAGELONGNAME value) {
        this.longname = value;
    }

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
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public Ar421.LINKER.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(Ar421.LINKER.ANNOTATIONS value) {
        this.annotations = value;
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
     * ??accesspermissionref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.DIAGNOSTICROUTINECONTROL.ACCESSPERMISSIONREF }
     *     
     */
    public Ar421.DIAGNOSTICROUTINECONTROL.ACCESSPERMISSIONREF getACCESSPERMISSIONREF() {
        return accesspermissionref;
    }

    /**
     * ??accesspermissionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.DIAGNOSTICROUTINECONTROL.ACCESSPERMISSIONREF }
     *     
     */
    public void setACCESSPERMISSIONREF(Ar421.DIAGNOSTICROUTINECONTROL.ACCESSPERMISSIONREF value) {
        this.accesspermissionref = value;
    }

    /**
     * ??memoryrangerefs?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICREQUESTDOWNLOAD.MEMORYRANGEREFS }
     *     
     */
    public DIAGNOSTICREQUESTDOWNLOAD.MEMORYRANGEREFS getMEMORYRANGEREFS() {
        return memoryrangerefs;
    }

    /**
     * ??memoryrangerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICREQUESTDOWNLOAD.MEMORYRANGEREFS }
     *     
     */
    public void setMEMORYRANGEREFS(DIAGNOSTICREQUESTDOWNLOAD.MEMORYRANGEREFS value) {
        this.memoryrangerefs = value;
    }

    /**
     * ??requestdownloadclassref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICREQUESTDOWNLOAD.REQUESTDOWNLOADCLASSREF }
     *     
     */
    public DIAGNOSTICREQUESTDOWNLOAD.REQUESTDOWNLOADCLASSREF getREQUESTDOWNLOADCLASSREF() {
        return requestdownloadclassref;
    }

    /**
     * ??requestdownloadclassref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICREQUESTDOWNLOAD.REQUESTDOWNLOADCLASSREF }
     *     
     */
    public void setREQUESTDOWNLOADCLASSREF(DIAGNOSTICREQUESTDOWNLOAD.REQUESTDOWNLOADCLASSREF value) {
        this.requestdownloadclassref = value;
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
     * ??uuid?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * ??uuid?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
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
     *         &lt;element name="MEMORY-RANGE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-MEMORY-IDENTIFIER--SUBTYPES-ENUM" />
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
        "memoryrangeref"
    })
    public static class MEMORYRANGEREFS {

        @XmlElement(name = "MEMORY-RANGE-REF")
        protected List<DIAGNOSTICREQUESTDOWNLOAD.MEMORYRANGEREFS.MEMORYRANGEREF> memoryrangeref;

        /**
         * Gets the value of the memoryrangeref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memoryrangeref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEMORYRANGEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICREQUESTDOWNLOAD.MEMORYRANGEREFS.MEMORYRANGEREF }
         * 
         * 
         */
        public List<DIAGNOSTICREQUESTDOWNLOAD.MEMORYRANGEREFS.MEMORYRANGEREF> getMEMORYRANGEREF() {
            if (memoryrangeref == null) {
                memoryrangeref = new ArrayList<DIAGNOSTICREQUESTDOWNLOAD.MEMORYRANGEREFS.MEMORYRANGEREF>();
            }
            return this.memoryrangeref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-MEMORY-IDENTIFIER--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MEMORYRANGEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected DIAGNOSTICMEMORYIDENTIFIERSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link DIAGNOSTICMEMORYIDENTIFIERSUBTYPESENUM }
             *     
             */
            public DIAGNOSTICMEMORYIDENTIFIERSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link DIAGNOSTICMEMORYIDENTIFIERSUBTYPESENUM }
             *     
             */
            public void setDEST(DIAGNOSTICMEMORYIDENTIFIERSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class REQUESTDOWNLOADCLASSREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICREQUESTDOWNLOADCLASSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICREQUESTDOWNLOADCLASSSUBTYPESENUM }
         *     
         */
        public DIAGNOSTICREQUESTDOWNLOADCLASSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICREQUESTDOWNLOADCLASSSUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICREQUESTDOWNLOADCLASSSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
