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
 * This is used to describe timing events related to the exchange of frames between the communication controller and the bus specific (FlexRay / CAN / LIN) Interface BSW module.
 * 
 * <p>TD-EVENT-FRAME complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TD-EVENT-FRAME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIMING-DESCRIPTION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIMING-DESCRIPTION-EVENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TD-EVENT-COM"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TD-EVENT-FRAME"/>
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
@XmlType(name = "TD-EVENT-FRAME", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "occurrenceexpression",
    "ecuinstanceref",
    "frameref",
    "physicalchannelref",
    "tdeventtype"
})
public class TDEVENTFRAME {

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
    @XmlElement(name = "OCCURRENCE-EXPRESSION")
    protected TDEVENTOCCURRENCEEXPRESSION occurrenceexpression;
    @XmlElement(name = "ECU-INSTANCE-REF")
    protected TDEVENTFRAME.ECUINSTANCEREF ecuinstanceref;
    @XmlElement(name = "FRAME-REF")
    protected TDEVENTFRAME.FRAMEREF frameref;
    @XmlElement(name = "PHYSICAL-CHANNEL-REF")
    protected TDEVENTFRAME.PHYSICALCHANNELREF physicalchannelref;
    @XmlElement(name = "TD-EVENT-TYPE")
    protected TDEVENTFRAMETYPEENUM tdeventtype;
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
     * ??occurrenceexpression?????
     * 
     * @return
     *     possible object is
     *     {@link TDEVENTOCCURRENCEEXPRESSION }
     *     
     */
    public TDEVENTOCCURRENCEEXPRESSION getOCCURRENCEEXPRESSION() {
        return occurrenceexpression;
    }

    /**
     * ??occurrenceexpression?????
     * 
     * @param value
     *     allowed object is
     *     {@link TDEVENTOCCURRENCEEXPRESSION }
     *     
     */
    public void setOCCURRENCEEXPRESSION(TDEVENTOCCURRENCEEXPRESSION value) {
        this.occurrenceexpression = value;
    }

    /**
     * ??ecuinstanceref?????
     * 
     * @return
     *     possible object is
     *     {@link TDEVENTFRAME.ECUINSTANCEREF }
     *     
     */
    public TDEVENTFRAME.ECUINSTANCEREF getECUINSTANCEREF() {
        return ecuinstanceref;
    }

    /**
     * ??ecuinstanceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link TDEVENTFRAME.ECUINSTANCEREF }
     *     
     */
    public void setECUINSTANCEREF(TDEVENTFRAME.ECUINSTANCEREF value) {
        this.ecuinstanceref = value;
    }

    /**
     * ??frameref?????
     * 
     * @return
     *     possible object is
     *     {@link TDEVENTFRAME.FRAMEREF }
     *     
     */
    public TDEVENTFRAME.FRAMEREF getFRAMEREF() {
        return frameref;
    }

    /**
     * ??frameref?????
     * 
     * @param value
     *     allowed object is
     *     {@link TDEVENTFRAME.FRAMEREF }
     *     
     */
    public void setFRAMEREF(TDEVENTFRAME.FRAMEREF value) {
        this.frameref = value;
    }

    /**
     * ??physicalchannelref?????
     * 
     * @return
     *     possible object is
     *     {@link TDEVENTFRAME.PHYSICALCHANNELREF }
     *     
     */
    public TDEVENTFRAME.PHYSICALCHANNELREF getPHYSICALCHANNELREF() {
        return physicalchannelref;
    }

    /**
     * ??physicalchannelref?????
     * 
     * @param value
     *     allowed object is
     *     {@link TDEVENTFRAME.PHYSICALCHANNELREF }
     *     
     */
    public void setPHYSICALCHANNELREF(TDEVENTFRAME.PHYSICALCHANNELREF value) {
        this.physicalchannelref = value;
    }

    /**
     * ??tdeventtype?????
     * 
     * @return
     *     possible object is
     *     {@link TDEVENTFRAMETYPEENUM }
     *     
     */
    public TDEVENTFRAMETYPEENUM getTDEVENTTYPE() {
        return tdeventtype;
    }

    /**
     * ??tdeventtype?????
     * 
     * @param value
     *     allowed object is
     *     {@link TDEVENTFRAMETYPEENUM }
     *     
     */
    public void setTDEVENTTYPE(TDEVENTFRAMETYPEENUM value) {
        this.tdeventtype = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECU-INSTANCE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ECUINSTANCEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ECUINSTANCESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ECUINSTANCESUBTYPESENUM }
         *     
         */
        public ECUINSTANCESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ECUINSTANCESUBTYPESENUM }
         *     
         */
        public void setDEST(ECUINSTANCESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FRAME--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FRAMEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FRAMESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FRAMESUBTYPESENUM }
         *     
         */
        public FRAMESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FRAMESUBTYPESENUM }
         *     
         */
        public void setDEST(FRAMESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PHYSICAL-CHANNEL--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PHYSICALCHANNELREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PHYSICALCHANNELSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PHYSICALCHANNELSUBTYPESENUM }
         *     
         */
        public PHYSICALCHANNELSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PHYSICALCHANNELSUBTYPESENUM }
         *     
         */
        public void setDEST(PHYSICALCHANNELSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
