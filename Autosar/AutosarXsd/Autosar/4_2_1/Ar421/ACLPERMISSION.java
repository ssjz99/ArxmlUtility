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
 * This meta class represents the ability to represent permissions granted on objects in an AUTOSAR model.
 * 
 * <p>ACL-PERMISSION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ACL-PERMISSION">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ACL-PERMISSION"/>
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
@XmlType(name = "ACL-PERMISSION", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "blueprintpolicys",
    "shortnamepattern",
    "aclcontexts",
    "aclobjectrefs",
    "acloperationrefs",
    "aclrolerefs",
    "aclscope"
})
public class ACLPERMISSION {

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
    @XmlElement(name = "BLUEPRINT-POLICYS")
    protected Ar421.FLATMAP.BLUEPRINTPOLICYS blueprintpolicys;
    @XmlElement(name = "SHORT-NAME-PATTERN")
    protected STRING shortnamepattern;
    @XmlElement(name = "ACL-CONTEXTS")
    protected ACLPERMISSION.ACLCONTEXTS aclcontexts;
    @XmlElement(name = "ACL-OBJECT-REFS")
    protected ACLPERMISSION.ACLOBJECTREFS aclobjectrefs;
    @XmlElement(name = "ACL-OPERATION-REFS")
    protected ACLPERMISSION.ACLOPERATIONREFS acloperationrefs;
    @XmlElement(name = "ACL-ROLE-REFS")
    protected ACLPERMISSION.ACLROLEREFS aclrolerefs;
    @XmlElement(name = "ACL-SCOPE")
    protected ACLSCOPEENUM aclscope;
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
     * ??blueprintpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public Ar421.FLATMAP.BLUEPRINTPOLICYS getBLUEPRINTPOLICYS() {
        return blueprintpolicys;
    }

    /**
     * ??blueprintpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public void setBLUEPRINTPOLICYS(Ar421.FLATMAP.BLUEPRINTPOLICYS value) {
        this.blueprintpolicys = value;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getSHORTNAMEPATTERN() {
        return shortnamepattern;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setSHORTNAMEPATTERN(STRING value) {
        this.shortnamepattern = value;
    }

    /**
     * ??aclcontexts?????
     * 
     * @return
     *     possible object is
     *     {@link ACLPERMISSION.ACLCONTEXTS }
     *     
     */
    public ACLPERMISSION.ACLCONTEXTS getACLCONTEXTS() {
        return aclcontexts;
    }

    /**
     * ??aclcontexts?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLPERMISSION.ACLCONTEXTS }
     *     
     */
    public void setACLCONTEXTS(ACLPERMISSION.ACLCONTEXTS value) {
        this.aclcontexts = value;
    }

    /**
     * ??aclobjectrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ACLPERMISSION.ACLOBJECTREFS }
     *     
     */
    public ACLPERMISSION.ACLOBJECTREFS getACLOBJECTREFS() {
        return aclobjectrefs;
    }

    /**
     * ??aclobjectrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLPERMISSION.ACLOBJECTREFS }
     *     
     */
    public void setACLOBJECTREFS(ACLPERMISSION.ACLOBJECTREFS value) {
        this.aclobjectrefs = value;
    }

    /**
     * ??acloperationrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ACLPERMISSION.ACLOPERATIONREFS }
     *     
     */
    public ACLPERMISSION.ACLOPERATIONREFS getACLOPERATIONREFS() {
        return acloperationrefs;
    }

    /**
     * ??acloperationrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLPERMISSION.ACLOPERATIONREFS }
     *     
     */
    public void setACLOPERATIONREFS(ACLPERMISSION.ACLOPERATIONREFS value) {
        this.acloperationrefs = value;
    }

    /**
     * ??aclrolerefs?????
     * 
     * @return
     *     possible object is
     *     {@link ACLPERMISSION.ACLROLEREFS }
     *     
     */
    public ACLPERMISSION.ACLROLEREFS getACLROLEREFS() {
        return aclrolerefs;
    }

    /**
     * ??aclrolerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLPERMISSION.ACLROLEREFS }
     *     
     */
    public void setACLROLEREFS(ACLPERMISSION.ACLROLEREFS value) {
        this.aclrolerefs = value;
    }

    /**
     * ??aclscope?????
     * 
     * @return
     *     possible object is
     *     {@link ACLSCOPEENUM }
     *     
     */
    public ACLSCOPEENUM getACLSCOPE() {
        return aclscope;
    }

    /**
     * ??aclscope?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLSCOPEENUM }
     *     
     */
    public void setACLSCOPE(ACLSCOPEENUM value) {
        this.aclscope = value;
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
     *         &lt;element name="ACL-CONTEXT" type="{http://autosar.org/schema/r4.0}NMTOKEN-STRING"/>
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
        "aclcontext"
    })
    public static class ACLCONTEXTS {

        @XmlElement(name = "ACL-CONTEXT")
        protected List<NMTOKENSTRING> aclcontext;

        /**
         * Gets the value of the aclcontext property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aclcontext property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACLCONTEXT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NMTOKENSTRING }
         * 
         * 
         */
        public List<NMTOKENSTRING> getACLCONTEXT() {
            if (aclcontext == null) {
                aclcontext = new ArrayList<NMTOKENSTRING>();
            }
            return this.aclcontext;
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
     *         &lt;element name="ACL-OBJECT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ACL-OBJECT-SET--SUBTYPES-ENUM" />
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
        "aclobjectref"
    })
    public static class ACLOBJECTREFS {

        @XmlElement(name = "ACL-OBJECT-REF")
        protected List<ACLPERMISSION.ACLOBJECTREFS.ACLOBJECTREF> aclobjectref;

        /**
         * Gets the value of the aclobjectref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aclobjectref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACLOBJECTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACLPERMISSION.ACLOBJECTREFS.ACLOBJECTREF }
         * 
         * 
         */
        public List<ACLPERMISSION.ACLOBJECTREFS.ACLOBJECTREF> getACLOBJECTREF() {
            if (aclobjectref == null) {
                aclobjectref = new ArrayList<ACLPERMISSION.ACLOBJECTREFS.ACLOBJECTREF>();
            }
            return this.aclobjectref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ACL-OBJECT-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ACLOBJECTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ACLOBJECTSETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ACLOBJECTSETSUBTYPESENUM }
             *     
             */
            public ACLOBJECTSETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ACLOBJECTSETSUBTYPESENUM }
             *     
             */
            public void setDEST(ACLOBJECTSETSUBTYPESENUM value) {
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
     *         &lt;element name="ACL-OPERATION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ACL-OPERATION--SUBTYPES-ENUM" />
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
        "acloperationref"
    })
    public static class ACLOPERATIONREFS {

        @XmlElement(name = "ACL-OPERATION-REF")
        protected List<ACLPERMISSION.ACLOPERATIONREFS.ACLOPERATIONREF> acloperationref;

        /**
         * Gets the value of the acloperationref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acloperationref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACLOPERATIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACLPERMISSION.ACLOPERATIONREFS.ACLOPERATIONREF }
         * 
         * 
         */
        public List<ACLPERMISSION.ACLOPERATIONREFS.ACLOPERATIONREF> getACLOPERATIONREF() {
            if (acloperationref == null) {
                acloperationref = new ArrayList<ACLPERMISSION.ACLOPERATIONREFS.ACLOPERATIONREF>();
            }
            return this.acloperationref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ACL-OPERATION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ACLOPERATIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ACLOPERATIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ACLOPERATIONSUBTYPESENUM }
             *     
             */
            public ACLOPERATIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ACLOPERATIONSUBTYPESENUM }
             *     
             */
            public void setDEST(ACLOPERATIONSUBTYPESENUM value) {
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
     *         &lt;element name="ACL-ROLE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ACL-ROLE--SUBTYPES-ENUM" />
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
        "aclroleref"
    })
    public static class ACLROLEREFS {

        @XmlElement(name = "ACL-ROLE-REF")
        protected List<ACLPERMISSION.ACLROLEREFS.ACLROLEREF> aclroleref;

        /**
         * Gets the value of the aclroleref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aclroleref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACLROLEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACLPERMISSION.ACLROLEREFS.ACLROLEREF }
         * 
         * 
         */
        public List<ACLPERMISSION.ACLROLEREFS.ACLROLEREF> getACLROLEREF() {
            if (aclroleref == null) {
                aclroleref = new ArrayList<ACLPERMISSION.ACLROLEREFS.ACLROLEREF>();
            }
            return this.aclroleref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ACL-ROLE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ACLROLEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ACLROLESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ACLROLESUBTYPESENUM }
             *     
             */
            public ACLROLESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ACLROLESUBTYPESENUM }
             *     
             */
            public void setDEST(ACLROLESUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
