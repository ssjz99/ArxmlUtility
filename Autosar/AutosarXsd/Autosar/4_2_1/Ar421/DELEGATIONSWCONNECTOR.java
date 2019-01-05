//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A delegation connector delegates one inner PortPrototype  (a port of a component that is used inside the composition) to a outer PortPrototype of compatible type that belongs directly to the composition (a port that is owned by the composition).
 * 
 * <p>DELEGATION-SW-CONNECTOR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DELEGATION-SW-CONNECTOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-CLASSIFIER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-STRUCTURE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-CONNECTOR"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DELEGATION-SW-CONNECTOR"/>
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
@XmlType(name = "DELEGATION-SW-CONNECTOR", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "mappingref",
    "variationpoint",
    "innerportiref",
    "outerportref"
})
public class DELEGATIONSWCONNECTOR {

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
    @XmlElement(name = "MAPPING-REF")
    protected Ar421.ASSEMBLYSWCONNECTOR.MAPPINGREF mappingref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "INNER-PORT-IREF")
    protected DELEGATIONSWCONNECTOR.INNERPORTIREF innerportiref;
    @XmlElement(name = "OUTER-PORT-REF")
    protected DELEGATIONSWCONNECTOR.OUTERPORTREF outerportref;
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
     * ??mappingref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ASSEMBLYSWCONNECTOR.MAPPINGREF }
     *     
     */
    public Ar421.ASSEMBLYSWCONNECTOR.MAPPINGREF getMAPPINGREF() {
        return mappingref;
    }

    /**
     * ??mappingref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ASSEMBLYSWCONNECTOR.MAPPINGREF }
     *     
     */
    public void setMAPPINGREF(Ar421.ASSEMBLYSWCONNECTOR.MAPPINGREF value) {
        this.mappingref = value;
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
     * ??innerportiref?????
     * 
     * @return
     *     possible object is
     *     {@link DELEGATIONSWCONNECTOR.INNERPORTIREF }
     *     
     */
    public DELEGATIONSWCONNECTOR.INNERPORTIREF getINNERPORTIREF() {
        return innerportiref;
    }

    /**
     * ??innerportiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DELEGATIONSWCONNECTOR.INNERPORTIREF }
     *     
     */
    public void setINNERPORTIREF(DELEGATIONSWCONNECTOR.INNERPORTIREF value) {
        this.innerportiref = value;
    }

    /**
     * ??outerportref?????
     * 
     * @return
     *     possible object is
     *     {@link DELEGATIONSWCONNECTOR.OUTERPORTREF }
     *     
     */
    public DELEGATIONSWCONNECTOR.OUTERPORTREF getOUTERPORTREF() {
        return outerportref;
    }

    /**
     * ??outerportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DELEGATIONSWCONNECTOR.OUTERPORTREF }
     *     
     */
    public void setOUTERPORTREF(DELEGATIONSWCONNECTOR.OUTERPORTREF value) {
        this.outerportref = value;
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="P-PORT-IN-COMPOSITION-INSTANCE-REF" type="{http://autosar.org/schema/r4.0}P-PORT-IN-COMPOSITION-INSTANCE-REF"/>
     *         &lt;element name="R-PORT-IN-COMPOSITION-INSTANCE-REF" type="{http://autosar.org/schema/r4.0}R-PORT-IN-COMPOSITION-INSTANCE-REF"/>
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
        "pportincompositioninstancerefOrRPORTINCOMPOSITIONINSTANCEREF"
    })
    public static class INNERPORTIREF {

        @XmlElements({
            @XmlElement(name = "P-PORT-IN-COMPOSITION-INSTANCE-REF", type = PPORTINCOMPOSITIONINSTANCEREF.class),
            @XmlElement(name = "R-PORT-IN-COMPOSITION-INSTANCE-REF", type = RPORTINCOMPOSITIONINSTANCEREF.class)
        })
        protected Object pportincompositioninstancerefOrRPORTINCOMPOSITIONINSTANCEREF;

        /**
         * ??pportincompositioninstancerefOrRPORTINCOMPOSITIONINSTANCEREF?????
         * 
         * @return
         *     possible object is
         *     {@link PPORTINCOMPOSITIONINSTANCEREF }
         *     {@link RPORTINCOMPOSITIONINSTANCEREF }
         *     
         */
        public Object getPPORTINCOMPOSITIONINSTANCEREFOrRPORTINCOMPOSITIONINSTANCEREF() {
            return pportincompositioninstancerefOrRPORTINCOMPOSITIONINSTANCEREF;
        }

        /**
         * ??pportincompositioninstancerefOrRPORTINCOMPOSITIONINSTANCEREF?????
         * 
         * @param value
         *     allowed object is
         *     {@link PPORTINCOMPOSITIONINSTANCEREF }
         *     {@link RPORTINCOMPOSITIONINSTANCEREF }
         *     
         */
        public void setPPORTINCOMPOSITIONINSTANCEREFOrRPORTINCOMPOSITIONINSTANCEREF(Object value) {
            this.pportincompositioninstancerefOrRPORTINCOMPOSITIONINSTANCEREF = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OUTERPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PORTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public PORTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(PORTPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
