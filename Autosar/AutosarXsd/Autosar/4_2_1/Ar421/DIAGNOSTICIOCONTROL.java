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
 * This represents an instance of the "I/O Control" diagnostic service.
 * 
 * <p>DIAGNOSTIC-IO-CONTROL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-IO-CONTROL">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-IO-CONTROL"/>
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
@XmlType(name = "DIAGNOSTIC-IO-CONTROL", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "accesspermissionref",
    "dataidentifierref",
    "freezecurrentstate",
    "iocontrolclassref",
    "resettodefault",
    "shorttermadjustment"
})
public class DIAGNOSTICIOCONTROL {

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
    @XmlElement(name = "DATA-IDENTIFIER-REF")
    protected DIAGNOSTICIOCONTROL.DATAIDENTIFIERREF dataidentifierref;
    @XmlElement(name = "FREEZE-CURRENT-STATE")
    protected BOOLEAN freezecurrentstate;
    @XmlElement(name = "IO-CONTROL-CLASS-REF")
    protected DIAGNOSTICIOCONTROL.IOCONTROLCLASSREF iocontrolclassref;
    @XmlElement(name = "RESET-TO-DEFAULT")
    protected BOOLEAN resettodefault;
    @XmlElement(name = "SHORT-TERM-ADJUSTMENT")
    protected BOOLEAN shorttermadjustment;
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
     * ??dataidentifierref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICIOCONTROL.DATAIDENTIFIERREF }
     *     
     */
    public DIAGNOSTICIOCONTROL.DATAIDENTIFIERREF getDATAIDENTIFIERREF() {
        return dataidentifierref;
    }

    /**
     * ??dataidentifierref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICIOCONTROL.DATAIDENTIFIERREF }
     *     
     */
    public void setDATAIDENTIFIERREF(DIAGNOSTICIOCONTROL.DATAIDENTIFIERREF value) {
        this.dataidentifierref = value;
    }

    /**
     * ??freezecurrentstate?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getFREEZECURRENTSTATE() {
        return freezecurrentstate;
    }

    /**
     * ??freezecurrentstate?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setFREEZECURRENTSTATE(BOOLEAN value) {
        this.freezecurrentstate = value;
    }

    /**
     * ??iocontrolclassref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICIOCONTROL.IOCONTROLCLASSREF }
     *     
     */
    public DIAGNOSTICIOCONTROL.IOCONTROLCLASSREF getIOCONTROLCLASSREF() {
        return iocontrolclassref;
    }

    /**
     * ??iocontrolclassref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICIOCONTROL.IOCONTROLCLASSREF }
     *     
     */
    public void setIOCONTROLCLASSREF(DIAGNOSTICIOCONTROL.IOCONTROLCLASSREF value) {
        this.iocontrolclassref = value;
    }

    /**
     * ??resettodefault?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getRESETTODEFAULT() {
        return resettodefault;
    }

    /**
     * ??resettodefault?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setRESETTODEFAULT(BOOLEAN value) {
        this.resettodefault = value;
    }

    /**
     * ??shorttermadjustment?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSHORTTERMADJUSTMENT() {
        return shorttermadjustment;
    }

    /**
     * ??shorttermadjustment?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSHORTTERMADJUSTMENT(BOOLEAN value) {
        this.shorttermadjustment = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DATA-IDENTIFIER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DATAIDENTIFIERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICDATAIDENTIFIERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICDATAIDENTIFIERSUBTYPESENUM }
         *     
         */
        public DIAGNOSTICDATAIDENTIFIERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICDATAIDENTIFIERSUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICDATAIDENTIFIERSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-IO-CONTROL-CLASS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IOCONTROLCLASSREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICIOCONTROLCLASSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICIOCONTROLCLASSSUBTYPESENUM }
         *     
         */
        public DIAGNOSTICIOCONTROLCLASSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICIOCONTROLCLASSSUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICIOCONTROLCLASSSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
