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
 * SignalGroup of the Interaction Layer. The RTE supports a "signal fan-out" where the same System Signal Group is sent in different SignalIPdus to multiple receivers.   
 * 
 * An ISignalGroup refers to a set of ISignals that shall always be kept together. A ISignalGroup represents a COM Signal Group.  
 * 
 * Therefore it is recommended to put the ISignalGroup in the same Package as ISignals (see atp.recommendedPackage)
 * 
 * <p>I-SIGNAL-GROUP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="I-SIGNAL-GROUP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FIBEX-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}I-SIGNAL-GROUP"/>
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
@XmlType(name = "I-SIGNAL-GROUP", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "combasedsignalgrouptransformations",
    "isignalrefs",
    "systemsignalgroupref",
    "transformationisignalpropss"
})
public class ISIGNALGROUP {

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
    @XmlElement(name = "COM-BASED-SIGNAL-GROUP-TRANSFORMATIONS")
    protected ISIGNALGROUP.COMBASEDSIGNALGROUPTRANSFORMATIONS combasedsignalgrouptransformations;
    @XmlElement(name = "I-SIGNAL-REFS")
    protected ISIGNALGROUP.ISIGNALREFS isignalrefs;
    @XmlElement(name = "SYSTEM-SIGNAL-GROUP-REF")
    protected ISIGNALGROUP.SYSTEMSIGNALGROUPREF systemsignalgroupref;
    @XmlElement(name = "TRANSFORMATION-I-SIGNAL-PROPSS")
    protected ISIGNALGROUP.TRANSFORMATIONISIGNALPROPSS transformationisignalpropss;
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
     * ??combasedsignalgrouptransformations?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALGROUP.COMBASEDSIGNALGROUPTRANSFORMATIONS }
     *     
     */
    public ISIGNALGROUP.COMBASEDSIGNALGROUPTRANSFORMATIONS getCOMBASEDSIGNALGROUPTRANSFORMATIONS() {
        return combasedsignalgrouptransformations;
    }

    /**
     * ??combasedsignalgrouptransformations?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALGROUP.COMBASEDSIGNALGROUPTRANSFORMATIONS }
     *     
     */
    public void setCOMBASEDSIGNALGROUPTRANSFORMATIONS(ISIGNALGROUP.COMBASEDSIGNALGROUPTRANSFORMATIONS value) {
        this.combasedsignalgrouptransformations = value;
    }

    /**
     * ??isignalrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALGROUP.ISIGNALREFS }
     *     
     */
    public ISIGNALGROUP.ISIGNALREFS getISIGNALREFS() {
        return isignalrefs;
    }

    /**
     * ??isignalrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALGROUP.ISIGNALREFS }
     *     
     */
    public void setISIGNALREFS(ISIGNALGROUP.ISIGNALREFS value) {
        this.isignalrefs = value;
    }

    /**
     * ??systemsignalgroupref?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALGROUP.SYSTEMSIGNALGROUPREF }
     *     
     */
    public ISIGNALGROUP.SYSTEMSIGNALGROUPREF getSYSTEMSIGNALGROUPREF() {
        return systemsignalgroupref;
    }

    /**
     * ??systemsignalgroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALGROUP.SYSTEMSIGNALGROUPREF }
     *     
     */
    public void setSYSTEMSIGNALGROUPREF(ISIGNALGROUP.SYSTEMSIGNALGROUPREF value) {
        this.systemsignalgroupref = value;
    }

    /**
     * ??transformationisignalpropss?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALGROUP.TRANSFORMATIONISIGNALPROPSS }
     *     
     */
    public ISIGNALGROUP.TRANSFORMATIONISIGNALPROPSS getTRANSFORMATIONISIGNALPROPSS() {
        return transformationisignalpropss;
    }

    /**
     * ??transformationisignalpropss?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALGROUP.TRANSFORMATIONISIGNALPROPSS }
     *     
     */
    public void setTRANSFORMATIONISIGNALPROPSS(ISIGNALGROUP.TRANSFORMATIONISIGNALPROPSS value) {
        this.transformationisignalpropss = value;
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
     *         &lt;element name="DATA-TRANSFORMATION-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}DATA-TRANSFORMATION-REF-CONDITIONAL"/>
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
        "datatransformationrefconditional"
    })
    public static class COMBASEDSIGNALGROUPTRANSFORMATIONS {

        @XmlElement(name = "DATA-TRANSFORMATION-REF-CONDITIONAL")
        protected List<DATATRANSFORMATIONREFCONDITIONAL> datatransformationrefconditional;

        /**
         * Gets the value of the datatransformationrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datatransformationrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATATRANSFORMATIONREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DATATRANSFORMATIONREFCONDITIONAL }
         * 
         * 
         */
        public List<DATATRANSFORMATIONREFCONDITIONAL> getDATATRANSFORMATIONREFCONDITIONAL() {
            if (datatransformationrefconditional == null) {
                datatransformationrefconditional = new ArrayList<DATATRANSFORMATIONREFCONDITIONAL>();
            }
            return this.datatransformationrefconditional;
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
     *         &lt;element name="I-SIGNAL-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL--SUBTYPES-ENUM" />
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
        "isignalref"
    })
    public static class ISIGNALREFS {

        @XmlElement(name = "I-SIGNAL-REF")
        protected List<ISIGNALGROUP.ISIGNALREFS.ISIGNALREF> isignalref;

        /**
         * Gets the value of the isignalref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the isignalref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getISIGNALREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ISIGNALGROUP.ISIGNALREFS.ISIGNALREF }
         * 
         * 
         */
        public List<ISIGNALGROUP.ISIGNALREFS.ISIGNALREF> getISIGNALREF() {
            if (isignalref == null) {
                isignalref = new ArrayList<ISIGNALGROUP.ISIGNALREFS.ISIGNALREF>();
            }
            return this.isignalref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ISIGNALREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ISIGNALSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ISIGNALSUBTYPESENUM }
             *     
             */
            public ISIGNALSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ISIGNALSUBTYPESENUM }
             *     
             */
            public void setDEST(ISIGNALSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SYSTEM-SIGNAL-GROUP--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SYSTEMSIGNALGROUPREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SYSTEMSIGNALGROUPSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SYSTEMSIGNALGROUPSUBTYPESENUM }
         *     
         */
        public SYSTEMSIGNALGROUPSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SYSTEMSIGNALGROUPSUBTYPESENUM }
         *     
         */
        public void setDEST(SYSTEMSIGNALGROUPSUBTYPESENUM value) {
            this.dest = value;
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
     *         &lt;element name="END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS" type="{http://autosar.org/schema/r4.0}END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS"/>
     *         &lt;element name="SOMEIP-TRANSFORMATION-I-SIGNAL-PROPS" type="{http://autosar.org/schema/r4.0}SOMEIP-TRANSFORMATION-I-SIGNAL-PROPS"/>
     *         &lt;element name="USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS" type="{http://autosar.org/schema/r4.0}USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS"/>
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
        "endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS"
    })
    public static class TRANSFORMATIONISIGNALPROPSS {

        @XmlElements({
            @XmlElement(name = "END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS", type = ENDTOENDTRANSFORMATIONISIGNALPROPS.class),
            @XmlElement(name = "SOMEIP-TRANSFORMATION-I-SIGNAL-PROPS", type = SOMEIPTRANSFORMATIONISIGNALPROPS.class),
            @XmlElement(name = "USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS", type = USERDEFINEDTRANSFORMATIONISIGNALPROPS.class)
        })
        protected List<Object> endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS;

        /**
         * Gets the value of the endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getENDTOENDTRANSFORMATIONISIGNALPROPSOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ENDTOENDTRANSFORMATIONISIGNALPROPS }
         * {@link SOMEIPTRANSFORMATIONISIGNALPROPS }
         * {@link USERDEFINEDTRANSFORMATIONISIGNALPROPS }
         * 
         * 
         */
        public List<Object> getENDTOENDTRANSFORMATIONISIGNALPROPSOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS() {
            if (endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS == null) {
                endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS = new ArrayList<Object>();
            }
            return this.endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS;
        }

    }

}
