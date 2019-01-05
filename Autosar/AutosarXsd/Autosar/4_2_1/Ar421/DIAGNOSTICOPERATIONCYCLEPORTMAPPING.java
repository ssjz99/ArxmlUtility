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
import javax.xml.bind.annotation.XmlType;


/**
 * Defines to which SWC service ports with DiagnosticOperationCycleNeeds the DiagnosticOperationCycle is mapped.
 * 
 * <p>DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SW-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING"/>
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
@XmlType(name = "DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "operationcycleref",
    "swcflatservicedependencyref",
    "swcservicedependencyiref"
})
public class DIAGNOSTICOPERATIONCYCLEPORTMAPPING {

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
    @XmlElement(name = "OPERATION-CYCLE-REF")
    protected DIAGNOSTICOPERATIONCYCLEPORTMAPPING.OPERATIONCYCLEREF operationcycleref;
    @XmlElement(name = "SWC-FLAT-SERVICE-DEPENDENCY-REF")
    protected DIAGNOSTICOPERATIONCYCLEPORTMAPPING.SWCFLATSERVICEDEPENDENCYREF swcflatservicedependencyref;
    @XmlElement(name = "SWC-SERVICE-DEPENDENCY-IREF")
    protected SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF swcservicedependencyiref;
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
     * ??operationcycleref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICOPERATIONCYCLEPORTMAPPING.OPERATIONCYCLEREF }
     *     
     */
    public DIAGNOSTICOPERATIONCYCLEPORTMAPPING.OPERATIONCYCLEREF getOPERATIONCYCLEREF() {
        return operationcycleref;
    }

    /**
     * ??operationcycleref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICOPERATIONCYCLEPORTMAPPING.OPERATIONCYCLEREF }
     *     
     */
    public void setOPERATIONCYCLEREF(DIAGNOSTICOPERATIONCYCLEPORTMAPPING.OPERATIONCYCLEREF value) {
        this.operationcycleref = value;
    }

    /**
     * ??swcflatservicedependencyref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICOPERATIONCYCLEPORTMAPPING.SWCFLATSERVICEDEPENDENCYREF }
     *     
     */
    public DIAGNOSTICOPERATIONCYCLEPORTMAPPING.SWCFLATSERVICEDEPENDENCYREF getSWCFLATSERVICEDEPENDENCYREF() {
        return swcflatservicedependencyref;
    }

    /**
     * ??swcflatservicedependencyref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICOPERATIONCYCLEPORTMAPPING.SWCFLATSERVICEDEPENDENCYREF }
     *     
     */
    public void setSWCFLATSERVICEDEPENDENCYREF(DIAGNOSTICOPERATIONCYCLEPORTMAPPING.SWCFLATSERVICEDEPENDENCYREF value) {
        this.swcflatservicedependencyref = value;
    }

    /**
     * ??swcservicedependencyiref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF }
     *     
     */
    public SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF getSWCSERVICEDEPENDENCYIREF() {
        return swcservicedependencyiref;
    }

    /**
     * ??swcservicedependencyiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF }
     *     
     */
    public void setSWCSERVICEDEPENDENCYIREF(SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF value) {
        this.swcservicedependencyiref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-OPERATION-CYCLE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OPERATIONCYCLEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICOPERATIONCYCLESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICOPERATIONCYCLESUBTYPESENUM }
         *     
         */
        public DIAGNOSTICOPERATIONCYCLESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICOPERATIONCYCLESUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICOPERATIONCYCLESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SWC-SERVICE-DEPENDENCY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SWCFLATSERVICEDEPENDENCYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWCSERVICEDEPENDENCYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWCSERVICEDEPENDENCYSUBTYPESENUM }
         *     
         */
        public SWCSERVICEDEPENDENCYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWCSERVICEDEPENDENCYSUBTYPESENUM }
         *     
         */
        public void setDEST(SWCSERVICEDEPENDENCYSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
