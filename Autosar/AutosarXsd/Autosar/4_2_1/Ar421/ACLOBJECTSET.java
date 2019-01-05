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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This meta class represents the ability to denote a set of objects for which roles and rights (access control lists) shall be defined. It basically can define the objects based on
 * 
 * * the nature of objects
 * * the involved blueprints
 * * the artifact in which the objects are serialized
 * * the definition of the object (in a definition - value pattern)
 * * individual reference objects
 * 
 * <p>ACL-OBJECT-SET complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ACL-OBJECT-SET">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ACL-OBJECT-SET"/>
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
@XmlType(name = "ACL-OBJECT-SET", propOrder = {
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
    "aclobjectclasss",
    "aclscope",
    "collectionref",
    "derivedfromblueprintrefs",
    "engineeringobjects",
    "objectdefinitionrefs",
    "objectdefintionrefs",
    "objectrefs"
})
public class ACLOBJECTSET {

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
    @XmlElement(name = "ACL-OBJECT-CLASSS")
    protected ACLOBJECTSET.ACLOBJECTCLASSS aclobjectclasss;
    @XmlElement(name = "ACL-SCOPE")
    protected ACLSCOPEENUM aclscope;
    @XmlElement(name = "COLLECTION-REF")
    protected ACLOBJECTSET.COLLECTIONREF collectionref;
    @XmlElement(name = "DERIVED-FROM-BLUEPRINT-REFS")
    protected ACLOBJECTSET.DERIVEDFROMBLUEPRINTREFS derivedfromblueprintrefs;
    @XmlElement(name = "ENGINEERING-OBJECTS")
    protected ACLOBJECTSET.ENGINEERINGOBJECTS engineeringobjects;
    @XmlElement(name = "OBJECT-DEFINITION-REFS")
    protected ACLOBJECTSET.OBJECTDEFINITIONREFS objectdefinitionrefs;
    @XmlElement(name = "OBJECT-DEFINTION-REFS")
    protected ACLOBJECTSET.OBJECTDEFINTIONREFS objectdefintionrefs;
    @XmlElement(name = "OBJECT-REFS")
    protected ACLOBJECTSET.OBJECTREFS objectrefs;
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
     * ??aclobjectclasss?????
     * 
     * @return
     *     possible object is
     *     {@link ACLOBJECTSET.ACLOBJECTCLASSS }
     *     
     */
    public ACLOBJECTSET.ACLOBJECTCLASSS getACLOBJECTCLASSS() {
        return aclobjectclasss;
    }

    /**
     * ??aclobjectclasss?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLOBJECTSET.ACLOBJECTCLASSS }
     *     
     */
    public void setACLOBJECTCLASSS(ACLOBJECTSET.ACLOBJECTCLASSS value) {
        this.aclobjectclasss = value;
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
     * ??collectionref?????
     * 
     * @return
     *     possible object is
     *     {@link ACLOBJECTSET.COLLECTIONREF }
     *     
     */
    public ACLOBJECTSET.COLLECTIONREF getCOLLECTIONREF() {
        return collectionref;
    }

    /**
     * ??collectionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLOBJECTSET.COLLECTIONREF }
     *     
     */
    public void setCOLLECTIONREF(ACLOBJECTSET.COLLECTIONREF value) {
        this.collectionref = value;
    }

    /**
     * ??derivedfromblueprintrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ACLOBJECTSET.DERIVEDFROMBLUEPRINTREFS }
     *     
     */
    public ACLOBJECTSET.DERIVEDFROMBLUEPRINTREFS getDERIVEDFROMBLUEPRINTREFS() {
        return derivedfromblueprintrefs;
    }

    /**
     * ??derivedfromblueprintrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLOBJECTSET.DERIVEDFROMBLUEPRINTREFS }
     *     
     */
    public void setDERIVEDFROMBLUEPRINTREFS(ACLOBJECTSET.DERIVEDFROMBLUEPRINTREFS value) {
        this.derivedfromblueprintrefs = value;
    }

    /**
     * ??engineeringobjects?????
     * 
     * @return
     *     possible object is
     *     {@link ACLOBJECTSET.ENGINEERINGOBJECTS }
     *     
     */
    public ACLOBJECTSET.ENGINEERINGOBJECTS getENGINEERINGOBJECTS() {
        return engineeringobjects;
    }

    /**
     * ??engineeringobjects?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLOBJECTSET.ENGINEERINGOBJECTS }
     *     
     */
    public void setENGINEERINGOBJECTS(ACLOBJECTSET.ENGINEERINGOBJECTS value) {
        this.engineeringobjects = value;
    }

    /**
     * ??objectdefinitionrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ACLOBJECTSET.OBJECTDEFINITIONREFS }
     *     
     */
    public ACLOBJECTSET.OBJECTDEFINITIONREFS getOBJECTDEFINITIONREFS() {
        return objectdefinitionrefs;
    }

    /**
     * ??objectdefinitionrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLOBJECTSET.OBJECTDEFINITIONREFS }
     *     
     */
    public void setOBJECTDEFINITIONREFS(ACLOBJECTSET.OBJECTDEFINITIONREFS value) {
        this.objectdefinitionrefs = value;
    }

    /**
     * ??objectdefintionrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ACLOBJECTSET.OBJECTDEFINTIONREFS }
     *     
     */
    public ACLOBJECTSET.OBJECTDEFINTIONREFS getOBJECTDEFINTIONREFS() {
        return objectdefintionrefs;
    }

    /**
     * ??objectdefintionrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLOBJECTSET.OBJECTDEFINTIONREFS }
     *     
     */
    public void setOBJECTDEFINTIONREFS(ACLOBJECTSET.OBJECTDEFINTIONREFS value) {
        this.objectdefintionrefs = value;
    }

    /**
     * ??objectrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ACLOBJECTSET.OBJECTREFS }
     *     
     */
    public ACLOBJECTSET.OBJECTREFS getOBJECTREFS() {
        return objectrefs;
    }

    /**
     * ??objectrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ACLOBJECTSET.OBJECTREFS }
     *     
     */
    public void setOBJECTREFS(ACLOBJECTSET.OBJECTREFS value) {
        this.objectrefs = value;
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
     *         &lt;element name="ACL-OBJECT-CLASS" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM"/>
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
        "aclobjectclass"
    })
    public static class ACLOBJECTCLASSS {

        @XmlElement(name = "ACL-OBJECT-CLASS")
        @XmlSchemaType(name = "string")
        protected List<REFERRABLESUBTYPESENUM> aclobjectclass;

        /**
         * Gets the value of the aclobjectclass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aclobjectclass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACLOBJECTCLASS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REFERRABLESUBTYPESENUM }
         * 
         * 
         */
        public List<REFERRABLESUBTYPESENUM> getACLOBJECTCLASS() {
            if (aclobjectclass == null) {
                aclobjectclass = new ArrayList<REFERRABLESUBTYPESENUM>();
            }
            return this.aclobjectclass;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COLLECTION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class COLLECTIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COLLECTIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COLLECTIONSUBTYPESENUM }
         *     
         */
        public COLLECTIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COLLECTIONSUBTYPESENUM }
         *     
         */
        public void setDEST(COLLECTIONSUBTYPESENUM value) {
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
     *         &lt;element name="DERIVED-FROM-BLUEPRINT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT--SUBTYPES-ENUM" />
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
        "derivedfromblueprintref"
    })
    public static class DERIVEDFROMBLUEPRINTREFS {

        @XmlElement(name = "DERIVED-FROM-BLUEPRINT-REF")
        protected List<ACLOBJECTSET.DERIVEDFROMBLUEPRINTREFS.DERIVEDFROMBLUEPRINTREF> derivedfromblueprintref;

        /**
         * Gets the value of the derivedfromblueprintref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the derivedfromblueprintref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDERIVEDFROMBLUEPRINTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACLOBJECTSET.DERIVEDFROMBLUEPRINTREFS.DERIVEDFROMBLUEPRINTREF }
         * 
         * 
         */
        public List<ACLOBJECTSET.DERIVEDFROMBLUEPRINTREFS.DERIVEDFROMBLUEPRINTREF> getDERIVEDFROMBLUEPRINTREF() {
            if (derivedfromblueprintref == null) {
                derivedfromblueprintref = new ArrayList<ACLOBJECTSET.DERIVEDFROMBLUEPRINTREFS.DERIVEDFROMBLUEPRINTREF>();
            }
            return this.derivedfromblueprintref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DERIVEDFROMBLUEPRINTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ATPBLUEPRINTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ATPBLUEPRINTSUBTYPESENUM }
             *     
             */
            public ATPBLUEPRINTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ATPBLUEPRINTSUBTYPESENUM }
             *     
             */
            public void setDEST(ATPBLUEPRINTSUBTYPESENUM value) {
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
     *         &lt;element name="AUTOSAR-ENGINEERING-OBJECT" type="{http://autosar.org/schema/r4.0}AUTOSAR-ENGINEERING-OBJECT"/>
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
        "autosarengineeringobject"
    })
    public static class ENGINEERINGOBJECTS {

        @XmlElement(name = "AUTOSAR-ENGINEERING-OBJECT")
        protected List<AUTOSARENGINEERINGOBJECT> autosarengineeringobject;

        /**
         * Gets the value of the autosarengineeringobject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autosarengineeringobject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAUTOSARENGINEERINGOBJECT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AUTOSARENGINEERINGOBJECT }
         * 
         * 
         */
        public List<AUTOSARENGINEERINGOBJECT> getAUTOSARENGINEERINGOBJECT() {
            if (autosarengineeringobject == null) {
                autosarengineeringobject = new ArrayList<AUTOSARENGINEERINGOBJECT>();
            }
            return this.autosarengineeringobject;
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
     *         &lt;element name="OBJECT-DEFINITION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ATP-DEFINITION--SUBTYPES-ENUM" />
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
        "objectdefinitionref"
    })
    public static class OBJECTDEFINITIONREFS {

        @XmlElement(name = "OBJECT-DEFINITION-REF")
        protected List<ACLOBJECTSET.OBJECTDEFINITIONREFS.OBJECTDEFINITIONREF> objectdefinitionref;

        /**
         * Gets the value of the objectdefinitionref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the objectdefinitionref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOBJECTDEFINITIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACLOBJECTSET.OBJECTDEFINITIONREFS.OBJECTDEFINITIONREF }
         * 
         * 
         */
        public List<ACLOBJECTSET.OBJECTDEFINITIONREFS.OBJECTDEFINITIONREF> getOBJECTDEFINITIONREF() {
            if (objectdefinitionref == null) {
                objectdefinitionref = new ArrayList<ACLOBJECTSET.OBJECTDEFINITIONREFS.OBJECTDEFINITIONREF>();
            }
            return this.objectdefinitionref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ATP-DEFINITION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OBJECTDEFINITIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ATPDEFINITIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ATPDEFINITIONSUBTYPESENUM }
             *     
             */
            public ATPDEFINITIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ATPDEFINITIONSUBTYPESENUM }
             *     
             */
            public void setDEST(ATPDEFINITIONSUBTYPESENUM value) {
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
     *         &lt;element name="OBJECT-DEFINTION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ATP-DEFINITION--SUBTYPES-ENUM" />
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
        "objectdefintionref"
    })
    public static class OBJECTDEFINTIONREFS {

        @XmlElement(name = "OBJECT-DEFINTION-REF")
        protected List<ACLOBJECTSET.OBJECTDEFINTIONREFS.OBJECTDEFINTIONREF> objectdefintionref;

        /**
         * Gets the value of the objectdefintionref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the objectdefintionref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOBJECTDEFINTIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACLOBJECTSET.OBJECTDEFINTIONREFS.OBJECTDEFINTIONREF }
         * 
         * 
         */
        public List<ACLOBJECTSET.OBJECTDEFINTIONREFS.OBJECTDEFINTIONREF> getOBJECTDEFINTIONREF() {
            if (objectdefintionref == null) {
                objectdefintionref = new ArrayList<ACLOBJECTSET.OBJECTDEFINTIONREFS.OBJECTDEFINTIONREF>();
            }
            return this.objectdefintionref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ATP-DEFINITION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OBJECTDEFINTIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ATPDEFINITIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ATPDEFINITIONSUBTYPESENUM }
             *     
             */
            public ATPDEFINITIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ATPDEFINITIONSUBTYPESENUM }
             *     
             */
            public void setDEST(ATPDEFINITIONSUBTYPESENUM value) {
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
     *         &lt;element name="OBJECT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM" />
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
        "objectref"
    })
    public static class OBJECTREFS {

        @XmlElement(name = "OBJECT-REF")
        protected List<ACLOBJECTSET.OBJECTREFS.OBJECTREF> objectref;

        /**
         * Gets the value of the objectref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the objectref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOBJECTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACLOBJECTSET.OBJECTREFS.OBJECTREF }
         * 
         * 
         */
        public List<ACLOBJECTSET.OBJECTREFS.OBJECTREF> getOBJECTREF() {
            if (objectref == null) {
                objectref = new ArrayList<ACLOBJECTSET.OBJECTREFS.OBJECTREF>();
            }
            return this.objectref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OBJECTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected REFERRABLESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link REFERRABLESUBTYPESENUM }
             *     
             */
            public REFERRABLESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link REFERRABLESUBTYPESENUM }
             *     
             */
            public void setDEST(REFERRABLESUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
