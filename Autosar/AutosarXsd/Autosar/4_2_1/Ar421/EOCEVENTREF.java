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
 * This is used to define a reference to an RTE or BSW Event.
 * 
 * <p>EOC-EVENT-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="EOC-EVENT-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-ABSTRACT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EOC-EVENT-REF"/>
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
@XmlType(name = "EOC-EVENT-REF", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "directsuccessorrefs",
    "bswmoduleinstanceref",
    "componentiref",
    "eventref",
    "successorrefs"
})
public class EOCEVENTREF {

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
    @XmlElement(name = "DIRECT-SUCCESSOR-REFS")
    protected Ar421.EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS directsuccessorrefs;
    @XmlElement(name = "BSW-MODULE-INSTANCE-REF")
    protected EOCEVENTREF.BSWMODULEINSTANCEREF bswmoduleinstanceref;
    @XmlElement(name = "COMPONENT-IREF")
    protected COMPONENTINCOMPOSITIONINSTANCEREF componentiref;
    @XmlElement(name = "EVENT-REF")
    protected EOCEVENTREF.EVENTREF eventref;
    @XmlElement(name = "SUCCESSOR-REFS")
    protected EOCEVENTREF.SUCCESSORREFS successorrefs;
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
     * ??directsuccessorrefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS }
     *     
     */
    public Ar421.EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS getDIRECTSUCCESSORREFS() {
        return directsuccessorrefs;
    }

    /**
     * ??directsuccessorrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS }
     *     
     */
    public void setDIRECTSUCCESSORREFS(Ar421.EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS value) {
        this.directsuccessorrefs = value;
    }

    /**
     * ??bswmoduleinstanceref?????
     * 
     * @return
     *     possible object is
     *     {@link EOCEVENTREF.BSWMODULEINSTANCEREF }
     *     
     */
    public EOCEVENTREF.BSWMODULEINSTANCEREF getBSWMODULEINSTANCEREF() {
        return bswmoduleinstanceref;
    }

    /**
     * ??bswmoduleinstanceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link EOCEVENTREF.BSWMODULEINSTANCEREF }
     *     
     */
    public void setBSWMODULEINSTANCEREF(EOCEVENTREF.BSWMODULEINSTANCEREF value) {
        this.bswmoduleinstanceref = value;
    }

    /**
     * ??componentiref?????
     * 
     * @return
     *     possible object is
     *     {@link COMPONENTINCOMPOSITIONINSTANCEREF }
     *     
     */
    public COMPONENTINCOMPOSITIONINSTANCEREF getCOMPONENTIREF() {
        return componentiref;
    }

    /**
     * ??componentiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPONENTINCOMPOSITIONINSTANCEREF }
     *     
     */
    public void setCOMPONENTIREF(COMPONENTINCOMPOSITIONINSTANCEREF value) {
        this.componentiref = value;
    }

    /**
     * ??eventref?????
     * 
     * @return
     *     possible object is
     *     {@link EOCEVENTREF.EVENTREF }
     *     
     */
    public EOCEVENTREF.EVENTREF getEVENTREF() {
        return eventref;
    }

    /**
     * ??eventref?????
     * 
     * @param value
     *     allowed object is
     *     {@link EOCEVENTREF.EVENTREF }
     *     
     */
    public void setEVENTREF(EOCEVENTREF.EVENTREF value) {
        this.eventref = value;
    }

    /**
     * ??successorrefs?????
     * 
     * @return
     *     possible object is
     *     {@link EOCEVENTREF.SUCCESSORREFS }
     *     
     */
    public EOCEVENTREF.SUCCESSORREFS getSUCCESSORREFS() {
        return successorrefs;
    }

    /**
     * ??successorrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link EOCEVENTREF.SUCCESSORREFS }
     *     
     */
    public void setSUCCESSORREFS(EOCEVENTREF.SUCCESSORREFS value) {
        this.successorrefs = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-IMPLEMENTATION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BSWMODULEINSTANCEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWIMPLEMENTATIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWIMPLEMENTATIONSUBTYPESENUM }
         *     
         */
        public BSWIMPLEMENTATIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWIMPLEMENTATIONSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWIMPLEMENTATIONSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ABSTRACT-EVENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EVENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ABSTRACTEVENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ABSTRACTEVENTSUBTYPESENUM }
         *     
         */
        public ABSTRACTEVENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ABSTRACTEVENTSUBTYPESENUM }
         *     
         */
        public void setDEST(ABSTRACTEVENTSUBTYPESENUM value) {
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
     *         &lt;element name="SUCCESSOR-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM" />
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
        "successorref"
    })
    public static class SUCCESSORREFS {

        @XmlElement(name = "SUCCESSOR-REF")
        protected List<EOCEVENTREF.SUCCESSORREFS.SUCCESSORREF> successorref;

        /**
         * Gets the value of the successorref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the successorref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUCCESSORREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EOCEVENTREF.SUCCESSORREFS.SUCCESSORREF }
         * 
         * 
         */
        public List<EOCEVENTREF.SUCCESSORREFS.SUCCESSORREF> getSUCCESSORREF() {
            if (successorref == null) {
                successorref = new ArrayList<EOCEVENTREF.SUCCESSORREFS.SUCCESSORREF>();
            }
            return this.successorref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SUCCESSORREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM }
             *     
             */
            public EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM }
             *     
             */
            public void setDEST(EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
