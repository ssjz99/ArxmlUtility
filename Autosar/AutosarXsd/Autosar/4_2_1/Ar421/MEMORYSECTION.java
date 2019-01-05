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
 * Provides a description of an abstract memory section used in the Implementation for code or data. It shall be declared by the Implementation Description of the module or component, which actually allocates the memory in its code. This means in case of data prototypes which are allocated by the RTE, that the generated Implementation Description of the RTE shall contain the corresponding MemorySections.
 * 
 * The attribute "symbol" (if symbol is missing: "shortName") defines the module or component specific section name used in the code. For details see the document "Specification of Memory Mapping".
 * Typically the section name is build according the pattern:
 * 
 * &lt;SwAddrMethod shortName&gt;[_&lt;further specialization nominator&gt;][_&lt;alignment&gt;] 
 * where
 * * '''[&lt;SwAddrMethod shortName&gt;]''' is the shortName of the referenced SwAddrMethod
 * * '''[_&lt;further specialization nominator&gt;]''' is an optional infix to indicate the specialization in the case that several MemorySections for different purpose of the same Implementation Description referring to the same or equally named SwAddrMethods. 
 * * '''[_&lt;alignment&gt;]''' is the alignment attributes value and is only applicable in the case that the memoryAllocationKeywordPolicy value of the referenced SwAddrMethod is set to addrMethodShortNameAndAlignment 
 * 
 * MemorySection used to Implement the code of RunnableEntitys and BswSchedulableEntitys shall have a symbol (if missing: shortName) identical to the referred SwAddrMethod to conform to the generated RTE header files.   
 * 
 * In addition to the section name described above, a prefix is used in the corresponding macro code in order to define a name space. This prefix is by default given by the shortName of the BswModuleDescription resp. the SwComponentType. It can be superseded by  the prefix attribute.
 * 
 * <p>MEMORY-SECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MEMORY-SECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MEMORY-SECTION"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEMORY-SECTION", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "alignment",
    "executableentityrefs",
    "memclasssymbol",
    "options",
    "prefixref",
    "size",
    "swaddrmethodref",
    "symbol",
    "variationpoint"
})
public class MEMORYSECTION {

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
    @XmlElement(name = "ALIGNMENT")
    protected ALIGNMENTTYPE alignment;
    @XmlElement(name = "EXECUTABLE-ENTITY-REFS")
    protected MEMORYSECTION.EXECUTABLEENTITYREFS executableentityrefs;
    @XmlElement(name = "MEM-CLASS-SYMBOL")
    protected CIDENTIFIER memclasssymbol;
    @XmlElement(name = "OPTIONS")
    protected MEMORYSECTION.OPTIONS options;
    @XmlElement(name = "PREFIX-REF")
    protected MEMORYSECTION.PREFIXREF prefixref;
    @XmlElement(name = "SIZE")
    protected POSITIVEINTEGER size;
    @XmlElement(name = "SW-ADDRMETHOD-REF")
    protected MEMORYSECTION.SWADDRMETHODREF swaddrmethodref;
    @XmlElement(name = "SYMBOL")
    protected IDENTIFIER symbol;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "UUID")
    protected String uuid;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??alignment?????
     * 
     * @return
     *     possible object is
     *     {@link ALIGNMENTTYPE }
     *     
     */
    public ALIGNMENTTYPE getALIGNMENT() {
        return alignment;
    }

    /**
     * ??alignment?????
     * 
     * @param value
     *     allowed object is
     *     {@link ALIGNMENTTYPE }
     *     
     */
    public void setALIGNMENT(ALIGNMENTTYPE value) {
        this.alignment = value;
    }

    /**
     * ??executableentityrefs?????
     * 
     * @return
     *     possible object is
     *     {@link MEMORYSECTION.EXECUTABLEENTITYREFS }
     *     
     */
    public MEMORYSECTION.EXECUTABLEENTITYREFS getEXECUTABLEENTITYREFS() {
        return executableentityrefs;
    }

    /**
     * ??executableentityrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link MEMORYSECTION.EXECUTABLEENTITYREFS }
     *     
     */
    public void setEXECUTABLEENTITYREFS(MEMORYSECTION.EXECUTABLEENTITYREFS value) {
        this.executableentityrefs = value;
    }

    /**
     * ??memclasssymbol?????
     * 
     * @return
     *     possible object is
     *     {@link CIDENTIFIER }
     *     
     */
    public CIDENTIFIER getMEMCLASSSYMBOL() {
        return memclasssymbol;
    }

    /**
     * ??memclasssymbol?????
     * 
     * @param value
     *     allowed object is
     *     {@link CIDENTIFIER }
     *     
     */
    public void setMEMCLASSSYMBOL(CIDENTIFIER value) {
        this.memclasssymbol = value;
    }

    /**
     * ??options?????
     * 
     * @return
     *     possible object is
     *     {@link MEMORYSECTION.OPTIONS }
     *     
     */
    public MEMORYSECTION.OPTIONS getOPTIONS() {
        return options;
    }

    /**
     * ??options?????
     * 
     * @param value
     *     allowed object is
     *     {@link MEMORYSECTION.OPTIONS }
     *     
     */
    public void setOPTIONS(MEMORYSECTION.OPTIONS value) {
        this.options = value;
    }

    /**
     * ??prefixref?????
     * 
     * @return
     *     possible object is
     *     {@link MEMORYSECTION.PREFIXREF }
     *     
     */
    public MEMORYSECTION.PREFIXREF getPREFIXREF() {
        return prefixref;
    }

    /**
     * ??prefixref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MEMORYSECTION.PREFIXREF }
     *     
     */
    public void setPREFIXREF(MEMORYSECTION.PREFIXREF value) {
        this.prefixref = value;
    }

    /**
     * ??size?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSIZE() {
        return size;
    }

    /**
     * ??size?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSIZE(POSITIVEINTEGER value) {
        this.size = value;
    }

    /**
     * ??swaddrmethodref?????
     * 
     * @return
     *     possible object is
     *     {@link MEMORYSECTION.SWADDRMETHODREF }
     *     
     */
    public MEMORYSECTION.SWADDRMETHODREF getSWADDRMETHODREF() {
        return swaddrmethodref;
    }

    /**
     * ??swaddrmethodref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MEMORYSECTION.SWADDRMETHODREF }
     *     
     */
    public void setSWADDRMETHODREF(MEMORYSECTION.SWADDRMETHODREF value) {
        this.swaddrmethodref = value;
    }

    /**
     * ??symbol?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSYMBOL() {
        return symbol;
    }

    /**
     * ??symbol?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSYMBOL(IDENTIFIER value) {
        this.symbol = value;
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
     *         &lt;element name="EXECUTABLE-ENTITY-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXECUTABLE-ENTITY--SUBTYPES-ENUM" />
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
        "executableentityref"
    })
    public static class EXECUTABLEENTITYREFS {

        @XmlElement(name = "EXECUTABLE-ENTITY-REF")
        protected List<MEMORYSECTION.EXECUTABLEENTITYREFS.EXECUTABLEENTITYREF> executableentityref;

        /**
         * Gets the value of the executableentityref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the executableentityref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXECUTABLEENTITYREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MEMORYSECTION.EXECUTABLEENTITYREFS.EXECUTABLEENTITYREF }
         * 
         * 
         */
        public List<MEMORYSECTION.EXECUTABLEENTITYREFS.EXECUTABLEENTITYREF> getEXECUTABLEENTITYREF() {
            if (executableentityref == null) {
                executableentityref = new ArrayList<MEMORYSECTION.EXECUTABLEENTITYREFS.EXECUTABLEENTITYREF>();
            }
            return this.executableentityref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXECUTABLE-ENTITY--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EXECUTABLEENTITYREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected EXECUTABLEENTITYSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link EXECUTABLEENTITYSUBTYPESENUM }
             *     
             */
            public EXECUTABLEENTITYSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link EXECUTABLEENTITYSUBTYPESENUM }
             *     
             */
            public void setDEST(EXECUTABLEENTITYSUBTYPESENUM value) {
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
     *         &lt;element name="OPTION" type="{http://autosar.org/schema/r4.0}IDENTIFIER"/>
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
        "option"
    })
    public static class OPTIONS {

        @XmlElement(name = "OPTION")
        protected List<IDENTIFIER> option;

        /**
         * Gets the value of the option property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the option property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDENTIFIER }
         * 
         * 
         */
        public List<IDENTIFIER> getOPTION() {
            if (option == null) {
                option = new ArrayList<IDENTIFIER>();
            }
            return this.option;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SECTION-NAME-PREFIX--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PREFIXREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SECTIONNAMEPREFIXSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SECTIONNAMEPREFIXSUBTYPESENUM }
         *     
         */
        public SECTIONNAMEPREFIXSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SECTIONNAMEPREFIXSUBTYPESENUM }
         *     
         */
        public void setDEST(SECTIONNAMEPREFIXSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-ADDR-METHOD--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SWADDRMETHODREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWADDRMETHODSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWADDRMETHODSUBTYPESENUM }
         *     
         */
        public SWADDRMETHODSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWADDRMETHODSUBTYPESENUM }
         *     
         */
        public void setDEST(SWADDRMETHODSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
