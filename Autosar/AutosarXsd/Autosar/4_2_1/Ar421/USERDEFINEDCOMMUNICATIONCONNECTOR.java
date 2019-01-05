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
 * This element allows the modelling of arbitrary Communication Connectors.
 * 
 * <p>USER-DEFINED-COMMUNICATION-CONNECTOR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="USER-DEFINED-COMMUNICATION-CONNECTOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CONNECTOR"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}USER-DEFINED-COMMUNICATION-CONNECTOR"/>
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
@XmlType(name = "USER-DEFINED-COMMUNICATION-CONNECTOR", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "commcontrollerref",
    "ecucommportinstances",
    "pncgatewaytype"
})
public class USERDEFINEDCOMMUNICATIONCONNECTOR {

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
    @XmlElement(name = "COMM-CONTROLLER-REF")
    protected Ar421.LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF commcontrollerref;
    @XmlElement(name = "ECU-COMM-PORT-INSTANCES")
    protected Ar421.LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES ecucommportinstances;
    @XmlElement(name = "PNC-GATEWAY-TYPE")
    protected PNCGATEWAYTYPEENUM pncgatewaytype;
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
     * ??commcontrollerref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF }
     *     
     */
    public Ar421.LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF getCOMMCONTROLLERREF() {
        return commcontrollerref;
    }

    /**
     * ??commcontrollerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF }
     *     
     */
    public void setCOMMCONTROLLERREF(Ar421.LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF value) {
        this.commcontrollerref = value;
    }

    /**
     * ??ecucommportinstances?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES }
     *     
     */
    public Ar421.LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES getECUCOMMPORTINSTANCES() {
        return ecucommportinstances;
    }

    /**
     * ??ecucommportinstances?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES }
     *     
     */
    public void setECUCOMMPORTINSTANCES(Ar421.LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES value) {
        this.ecucommportinstances = value;
    }

    /**
     * ??pncgatewaytype?????
     * 
     * @return
     *     possible object is
     *     {@link PNCGATEWAYTYPEENUM }
     *     
     */
    public PNCGATEWAYTYPEENUM getPNCGATEWAYTYPE() {
        return pncgatewaytype;
    }

    /**
     * ??pncgatewaytype?????
     * 
     * @param value
     *     allowed object is
     *     {@link PNCGATEWAYTYPEENUM }
     *     
     */
    public void setPNCGATEWAYTYPE(PNCGATEWAYTYPEENUM value) {
        this.pncgatewaytype = value;
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

}
