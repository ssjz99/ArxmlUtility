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
 * AUTOSAR package, allowing to create top level packages to structure the contained ARElements.
 * 
 * ARPackages are open sets. This means that in a file based description system multiple files can be used to partially describe the contents of a package.
 * 
 * This is an extended version of MSR's SW-SYSTEM.
 * 
 * <p>AR-PACKAGE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="AR-PACKAGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-PACKAGE"/>
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
@XmlType(name = "AR-PACKAGE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "blueprintpolicys",
    "shortnamepattern",
    "referencebases",
    "elements",
    "arpackages",
    "variationpoint"
})
public class ARPACKAGE {

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
    @XmlElement(name = "BLUEPRINT-POLICYS")
    protected FLATMAP.BLUEPRINTPOLICYS blueprintpolicys;
    @XmlElement(name = "SHORT-NAME-PATTERN")
    protected STRING shortnamepattern;
    @XmlElement(name = "REFERENCE-BASES")
    protected ARPACKAGE.REFERENCEBASES referencebases;
    @XmlElement(name = "ELEMENTS")
    protected ARPACKAGE.ELEMENTS elements;
    @XmlElement(name = "AR-PACKAGES")
    protected ARPACKAGE.ARPACKAGES arpackages;
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
     * ??blueprintpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public FLATMAP.BLUEPRINTPOLICYS getBLUEPRINTPOLICYS() {
        return blueprintpolicys;
    }

    /**
     * ??blueprintpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public void setBLUEPRINTPOLICYS(FLATMAP.BLUEPRINTPOLICYS value) {
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
     * ??referencebases?????
     * 
     * @return
     *     possible object is
     *     {@link ARPACKAGE.REFERENCEBASES }
     *     
     */
    public ARPACKAGE.REFERENCEBASES getREFERENCEBASES() {
        return referencebases;
    }

    /**
     * ??referencebases?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARPACKAGE.REFERENCEBASES }
     *     
     */
    public void setREFERENCEBASES(ARPACKAGE.REFERENCEBASES value) {
        this.referencebases = value;
    }

    /**
     * ??elements?????
     * 
     * @return
     *     possible object is
     *     {@link ARPACKAGE.ELEMENTS }
     *     
     */
    public ARPACKAGE.ELEMENTS getELEMENTS() {
        return elements;
    }

    /**
     * ??elements?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARPACKAGE.ELEMENTS }
     *     
     */
    public void setELEMENTS(ARPACKAGE.ELEMENTS value) {
        this.elements = value;
    }

    /**
     * ??arpackages?????
     * 
     * @return
     *     possible object is
     *     {@link ARPACKAGE.ARPACKAGES }
     *     
     */
    public ARPACKAGE.ARPACKAGES getARPACKAGES() {
        return arpackages;
    }

    /**
     * ??arpackages?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARPACKAGE.ARPACKAGES }
     *     
     */
    public void setARPACKAGES(ARPACKAGE.ARPACKAGES value) {
        this.arpackages = value;
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
     *         &lt;element name="AR-PACKAGE" type="{http://autosar.org/schema/r4.0}AR-PACKAGE"/>
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
        "arpackage"
    })
    public static class ARPACKAGES {

        @XmlElement(name = "AR-PACKAGE")
        protected List<ARPACKAGE> arpackage;

        /**
         * Gets the value of the arpackage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arpackage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getARPACKAGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARPACKAGE }
         * 
         * 
         */
        public List<ARPACKAGE> getARPACKAGE() {
            if (arpackage == null) {
                arpackage = new ArrayList<ARPACKAGE>();
            }
            return this.arpackage;
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
     *         &lt;element name="ACL-OBJECT-SET" type="{http://autosar.org/schema/r4.0}ACL-OBJECT-SET"/>
     *         &lt;element name="ACL-OPERATION" type="{http://autosar.org/schema/r4.0}ACL-OPERATION"/>
     *         &lt;element name="ACL-PERMISSION" type="{http://autosar.org/schema/r4.0}ACL-PERMISSION"/>
     *         &lt;element name="ACL-ROLE" type="{http://autosar.org/schema/r4.0}ACL-ROLE"/>
     *         &lt;element name="ALIAS-NAME-SET" type="{http://autosar.org/schema/r4.0}ALIAS-NAME-SET"/>
     *         &lt;element name="APPLICATION-ARRAY-DATA-TYPE" type="{http://autosar.org/schema/r4.0}APPLICATION-ARRAY-DATA-TYPE"/>
     *         &lt;element name="APPLICATION-PRIMITIVE-DATA-TYPE" type="{http://autosar.org/schema/r4.0}APPLICATION-PRIMITIVE-DATA-TYPE"/>
     *         &lt;element name="APPLICATION-RECORD-DATA-TYPE" type="{http://autosar.org/schema/r4.0}APPLICATION-RECORD-DATA-TYPE"/>
     *         &lt;element name="APPLICATION-SW-COMPONENT-TYPE" type="{http://autosar.org/schema/r4.0}APPLICATION-SW-COMPONENT-TYPE"/>
     *         &lt;element name="BLUEPRINT-MAPPING-SET" type="{http://autosar.org/schema/r4.0}BLUEPRINT-MAPPING-SET"/>
     *         &lt;element name="BSW-IMPLEMENTATION" type="{http://autosar.org/schema/r4.0}BSW-IMPLEMENTATION"/>
     *         &lt;element name="BSW-MODULE-DESCRIPTION" type="{http://autosar.org/schema/r4.0}BSW-MODULE-DESCRIPTION"/>
     *         &lt;element name="BSW-MODULE-ENTRY" type="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTRY"/>
     *         &lt;element name="BSW-MODULE-TIMING" type="{http://autosar.org/schema/r4.0}BSW-MODULE-TIMING"/>
     *         &lt;element name="BUILD-ACTION-MANIFEST" type="{http://autosar.org/schema/r4.0}BUILD-ACTION-MANIFEST"/>
     *         &lt;element name="CALIBRATION-PARAMETER-VALUE-SET" type="{http://autosar.org/schema/r4.0}CALIBRATION-PARAMETER-VALUE-SET"/>
     *         &lt;element name="CAN-CLUSTER" type="{http://autosar.org/schema/r4.0}CAN-CLUSTER"/>
     *         &lt;element name="CAN-FRAME" type="{http://autosar.org/schema/r4.0}CAN-FRAME"/>
     *         &lt;element name="CAN-TP-CONFIG" type="{http://autosar.org/schema/r4.0}CAN-TP-CONFIG"/>
     *         &lt;element name="CLIENT-ID-DEFINITION-SET" type="{http://autosar.org/schema/r4.0}CLIENT-ID-DEFINITION-SET"/>
     *         &lt;element name="CLIENT-SERVER-INTERFACE" type="{http://autosar.org/schema/r4.0}CLIENT-SERVER-INTERFACE"/>
     *         &lt;element name="COLLECTION" type="{http://autosar.org/schema/r4.0}COLLECTION"/>
     *         &lt;element name="COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE" type="{http://autosar.org/schema/r4.0}COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"/>
     *         &lt;element name="COMPOSITION-SW-COMPONENT-TYPE" type="{http://autosar.org/schema/r4.0}COMPOSITION-SW-COMPONENT-TYPE"/>
     *         &lt;element name="COMPU-METHOD" type="{http://autosar.org/schema/r4.0}COMPU-METHOD"/>
     *         &lt;element name="CONSISTENCY-NEEDS-BLUEPRINT-SET" type="{http://autosar.org/schema/r4.0}CONSISTENCY-NEEDS-BLUEPRINT-SET"/>
     *         &lt;element name="CONSTANT-SPECIFICATION" type="{http://autosar.org/schema/r4.0}CONSTANT-SPECIFICATION"/>
     *         &lt;element name="CONSTANT-SPECIFICATION-MAPPING-SET" type="{http://autosar.org/schema/r4.0}CONSTANT-SPECIFICATION-MAPPING-SET"/>
     *         &lt;element name="CONTAINER-I-PDU" type="{http://autosar.org/schema/r4.0}CONTAINER-I-PDU"/>
     *         &lt;element name="COUPLING-ELEMENT" type="{http://autosar.org/schema/r4.0}COUPLING-ELEMENT"/>
     *         &lt;element name="DATA-CONSTR" type="{http://autosar.org/schema/r4.0}DATA-CONSTR"/>
     *         &lt;element name="DATA-TRANSFORMATION-SET" type="{http://autosar.org/schema/r4.0}DATA-TRANSFORMATION-SET"/>
     *         &lt;element name="DATA-TYPE-MAPPING-SET" type="{http://autosar.org/schema/r4.0}DATA-TYPE-MAPPING-SET"/>
     *         &lt;element name="DCM-I-PDU" type="{http://autosar.org/schema/r4.0}DCM-I-PDU"/>
     *         &lt;element name="DIAGNOSTIC-ACCESS-PERMISSION" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ACCESS-PERMISSION"/>
     *         &lt;element name="DIAGNOSTIC-AGING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-AGING"/>
     *         &lt;element name="DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION"/>
     *         &lt;element name="DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-COM-CONTROL" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COM-CONTROL"/>
     *         &lt;element name="DIAGNOSTIC-COM-CONTROL-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COM-CONTROL-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-CONNECTION" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CONNECTION"/>
     *         &lt;element name="DIAGNOSTIC-CONTRIBUTION-SET" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CONTRIBUTION-SET"/>
     *         &lt;element name="DIAGNOSTIC-CONTROL-DTC-SETTING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CONTROL-DTC-SETTING"/>
     *         &lt;element name="DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-CUSTOM-SERVICE-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CUSTOM-SERVICE-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-DATA-IDENTIFIER" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DATA-IDENTIFIER"/>
     *         &lt;element name="DIAGNOSTIC-DATA-IDENTIFIER-SET" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DATA-IDENTIFIER-SET"/>
     *         &lt;element name="DIAGNOSTIC-DATA-TRANSFER" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DATA-TRANSFER"/>
     *         &lt;element name="DIAGNOSTIC-DATA-TRANSFER-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DATA-TRANSFER-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-DEM-PROVIDED-DATA-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DEM-PROVIDED-DATA-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER"/>
     *         &lt;element name="DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER"/>
     *         &lt;element name="DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-ECU-RESET" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ECU-RESET"/>
     *         &lt;element name="DIAGNOSTIC-ECU-RESET-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ECU-RESET-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-ENABLE-CONDITION" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ENABLE-CONDITION"/>
     *         &lt;element name="DIAGNOSTIC-ENABLE-CONDITION-GROUP" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ENABLE-CONDITION-GROUP"/>
     *         &lt;element name="DIAGNOSTIC-ENABLE-CONDITION-PORT-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ENABLE-CONDITION-PORT-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-EVENT" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT"/>
     *         &lt;element name="DIAGNOSTIC-EVENT-PORT-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-PORT-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-EVENT-TO-DEBOUNCE-ALGORITHM-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-TO-DEBOUNCE-ALGORITHM-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-EVENT-TO-ENABLE-CONDITION-GROUP-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-TO-ENABLE-CONDITION-GROUP-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-EVENT-TO-OPERATION-CYCLE-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-TO-OPERATION-CYCLE-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-EVENT-TO-STORAGE-CONDITION-GROUP-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-TO-STORAGE-CONDITION-GROUP-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-EVENT-TO-TROUBLE-CODE-UDS-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-TO-TROUBLE-CODE-UDS-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-EXTENDED-DATA-RECORD" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EXTENDED-DATA-RECORD"/>
     *         &lt;element name="DIAGNOSTIC-FREEZE-FRAME" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-FREEZE-FRAME"/>
     *         &lt;element name="DIAGNOSTIC-IO-CONTROL" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-IO-CONTROL"/>
     *         &lt;element name="DIAGNOSTIC-INDICATOR" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-INDICATOR"/>
     *         &lt;element name="DIAGNOSTIC-IO-CONTROL-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-IO-CONTROL-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-MEMORY-DESTINATION-MIRROR" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-MEMORY-DESTINATION-MIRROR"/>
     *         &lt;element name="DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY"/>
     *         &lt;element name="DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED"/>
     *         &lt;element name="DIAGNOSTIC-MEMORY-IDENTIFIER" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-MEMORY-IDENTIFIER"/>
     *         &lt;element name="DIAGNOSTIC-OPERATION-CYCLE" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-OPERATION-CYCLE"/>
     *         &lt;element name="DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-READ-DTC-INFORMATION" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-READ-DTC-INFORMATION"/>
     *         &lt;element name="DIAGNOSTIC-READ-DTC-INFORMATION-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-READ-DTC-INFORMATION-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-READ-DATA-BY-IDENTIFIER" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-READ-DATA-BY-IDENTIFIER"/>
     *         &lt;element name="DIAGNOSTIC-READ-DATA-BY-IDENTIFIER-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-READ-DATA-BY-IDENTIFIER-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID"/>
     *         &lt;element name="DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-READ-MEMORY-BY-ADDRESS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-READ-MEMORY-BY-ADDRESS"/>
     *         &lt;element name="DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-REQUEST-DOWNLOAD" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-REQUEST-DOWNLOAD"/>
     *         &lt;element name="DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-REQUEST-FILE-TRANSFER" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-REQUEST-FILE-TRANSFER"/>
     *         &lt;element name="DIAGNOSTIC-REQUEST-FILE-TRANSFER-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-REQUEST-FILE-TRANSFER-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-REQUEST-UPLOAD" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-REQUEST-UPLOAD"/>
     *         &lt;element name="DIAGNOSTIC-REQUEST-UPLOAD-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-REQUEST-UPLOAD-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-RESPONSE-ON-EVENT" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-RESPONSE-ON-EVENT"/>
     *         &lt;element name="DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-ROUTINE" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ROUTINE"/>
     *         &lt;element name="DIAGNOSTIC-ROUTINE-CONTROL" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ROUTINE-CONTROL"/>
     *         &lt;element name="DIAGNOSTIC-ROUTINE-CONTROL-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ROUTINE-CONTROL-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-SECURITY-ACCESS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SECURITY-ACCESS"/>
     *         &lt;element name="DIAGNOSTIC-SECURITY-ACCESS-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SECURITY-ACCESS-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-SECURITY-LEVEL" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SECURITY-LEVEL"/>
     *         &lt;element name="DIAGNOSTIC-SERVICE-DATA-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-DATA-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-SERVICE-SW-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-SW-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-SERVICE-TABLE" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-TABLE"/>
     *         &lt;element name="DIAGNOSTIC-SESSION" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SESSION"/>
     *         &lt;element name="DIAGNOSTIC-SESSION-CONTROL" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SESSION-CONTROL"/>
     *         &lt;element name="DIAGNOSTIC-SESSION-CONTROL-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SESSION-CONTROL-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-STORAGE-CONDITION" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-STORAGE-CONDITION"/>
     *         &lt;element name="DIAGNOSTIC-STORAGE-CONDITION-GROUP" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-STORAGE-CONDITION-GROUP"/>
     *         &lt;element name="DIAGNOSTIC-STORAGE-CONDITION-PORT-MAPPING" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-STORAGE-CONDITION-PORT-MAPPING"/>
     *         &lt;element name="DIAGNOSTIC-TRANSFER-EXIT" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-TRANSFER-EXIT"/>
     *         &lt;element name="DIAGNOSTIC-TRANSFER-EXIT-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-TRANSFER-EXIT-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-TROUBLE-CODE-GROUP" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-TROUBLE-CODE-GROUP"/>
     *         &lt;element name="DIAGNOSTIC-TROUBLE-CODE-J-1939" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-TROUBLE-CODE-J-1939"/>
     *         &lt;element name="DIAGNOSTIC-TROUBLE-CODE-OBD" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-TROUBLE-CODE-OBD"/>
     *         &lt;element name="DIAGNOSTIC-TROUBLE-CODE-PROPS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-TROUBLE-CODE-PROPS"/>
     *         &lt;element name="DIAGNOSTIC-TROUBLE-CODE-UDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-TROUBLE-CODE-UDS"/>
     *         &lt;element name="DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER"/>
     *         &lt;element name="DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS"/>
     *         &lt;element name="DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS"/>
     *         &lt;element name="DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS-CLASS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS-CLASS"/>
     *         &lt;element name="DOCUMENTATION" type="{http://autosar.org/schema/r4.0}DOCUMENTATION"/>
     *         &lt;element name="ECU-ABSTRACTION-SW-COMPONENT-TYPE" type="{http://autosar.org/schema/r4.0}ECU-ABSTRACTION-SW-COMPONENT-TYPE"/>
     *         &lt;element name="ECU-INSTANCE" type="{http://autosar.org/schema/r4.0}ECU-INSTANCE"/>
     *         &lt;element name="ECU-TIMING" type="{http://autosar.org/schema/r4.0}ECU-TIMING"/>
     *         &lt;element name="ECUC-DEFINITION-COLLECTION" type="{http://autosar.org/schema/r4.0}ECUC-DEFINITION-COLLECTION"/>
     *         &lt;element name="ECUC-DESTINATION-URI-DEF-SET" type="{http://autosar.org/schema/r4.0}ECUC-DESTINATION-URI-DEF-SET"/>
     *         &lt;element name="ECUC-MODULE-CONFIGURATION-VALUES" type="{http://autosar.org/schema/r4.0}ECUC-MODULE-CONFIGURATION-VALUES"/>
     *         &lt;element name="ECUC-MODULE-DEF" type="{http://autosar.org/schema/r4.0}ECUC-MODULE-DEF"/>
     *         &lt;element name="ECUC-VALUE-COLLECTION" type="{http://autosar.org/schema/r4.0}ECUC-VALUE-COLLECTION"/>
     *         &lt;element name="END-TO-END-PROTECTION-SET" type="{http://autosar.org/schema/r4.0}END-TO-END-PROTECTION-SET"/>
     *         &lt;element name="ETHERNET-CLUSTER" type="{http://autosar.org/schema/r4.0}ETHERNET-CLUSTER"/>
     *         &lt;element name="ETHERNET-FRAME" type="{http://autosar.org/schema/r4.0}ETHERNET-FRAME"/>
     *         &lt;element name="EVALUATED-VARIANT-SET" type="{http://autosar.org/schema/r4.0}EVALUATED-VARIANT-SET"/>
     *         &lt;element name="FM-FEATURE" type="{http://autosar.org/schema/r4.0}FM-FEATURE"/>
     *         &lt;element name="FM-FEATURE-MAP" type="{http://autosar.org/schema/r4.0}FM-FEATURE-MAP"/>
     *         &lt;element name="FM-FEATURE-MODEL" type="{http://autosar.org/schema/r4.0}FM-FEATURE-MODEL"/>
     *         &lt;element name="FM-FEATURE-SELECTION-SET" type="{http://autosar.org/schema/r4.0}FM-FEATURE-SELECTION-SET"/>
     *         &lt;element name="FLAT-MAP" type="{http://autosar.org/schema/r4.0}FLAT-MAP"/>
     *         &lt;element name="FLEXRAY-AR-TP-CONFIG" type="{http://autosar.org/schema/r4.0}FLEXRAY-AR-TP-CONFIG"/>
     *         &lt;element name="FLEXRAY-CLUSTER" type="{http://autosar.org/schema/r4.0}FLEXRAY-CLUSTER"/>
     *         &lt;element name="FLEXRAY-FRAME" type="{http://autosar.org/schema/r4.0}FLEXRAY-FRAME"/>
     *         &lt;element name="FLEXRAY-TP-CONFIG" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-CONFIG"/>
     *         &lt;element name="GATEWAY" type="{http://autosar.org/schema/r4.0}GATEWAY"/>
     *         &lt;element name="GENERAL-PURPOSE-I-PDU" type="{http://autosar.org/schema/r4.0}GENERAL-PURPOSE-I-PDU"/>
     *         &lt;element name="GENERAL-PURPOSE-PDU" type="{http://autosar.org/schema/r4.0}GENERAL-PURPOSE-PDU"/>
     *         &lt;element name="GENERIC-ETHERNET-FRAME" type="{http://autosar.org/schema/r4.0}GENERIC-ETHERNET-FRAME"/>
     *         &lt;element name="GLOBAL-TIME-DOMAIN" type="{http://autosar.org/schema/r4.0}GLOBAL-TIME-DOMAIN"/>
     *         &lt;element name="HW-CATEGORY" type="{http://autosar.org/schema/r4.0}HW-CATEGORY"/>
     *         &lt;element name="HW-ELEMENT" type="{http://autosar.org/schema/r4.0}HW-ELEMENT"/>
     *         &lt;element name="HW-TYPE" type="{http://autosar.org/schema/r4.0}HW-TYPE"/>
     *         &lt;element name="I-SIGNAL" type="{http://autosar.org/schema/r4.0}I-SIGNAL"/>
     *         &lt;element name="I-SIGNAL-GROUP" type="{http://autosar.org/schema/r4.0}I-SIGNAL-GROUP"/>
     *         &lt;element name="I-SIGNAL-I-PDU" type="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU"/>
     *         &lt;element name="I-SIGNAL-I-PDU-GROUP" type="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU-GROUP"/>
     *         &lt;element name="IEEE-1722-TP-ETHERNET-FRAME" type="{http://autosar.org/schema/r4.0}IEEE-1722-TP-ETHERNET-FRAME"/>
     *         &lt;element name="IMPLEMENTATION-DATA-TYPE" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE"/>
     *         &lt;element name="INTERPOLATION-ROUTINE-MAPPING-SET" type="{http://autosar.org/schema/r4.0}INTERPOLATION-ROUTINE-MAPPING-SET"/>
     *         &lt;element name="J-1939-CLUSTER" type="{http://autosar.org/schema/r4.0}J-1939-CLUSTER"/>
     *         &lt;element name="J-1939-DCM-I-PDU" type="{http://autosar.org/schema/r4.0}J-1939-DCM-I-PDU"/>
     *         &lt;element name="J-1939-TP-CONFIG" type="{http://autosar.org/schema/r4.0}J-1939-TP-CONFIG"/>
     *         &lt;element name="KEYWORD-SET" type="{http://autosar.org/schema/r4.0}KEYWORD-SET"/>
     *         &lt;element name="LIFE-CYCLE-INFO-SET" type="{http://autosar.org/schema/r4.0}LIFE-CYCLE-INFO-SET"/>
     *         &lt;element name="LIFE-CYCLE-STATE-DEFINITION-GROUP" type="{http://autosar.org/schema/r4.0}LIFE-CYCLE-STATE-DEFINITION-GROUP"/>
     *         &lt;element name="LIN-CLUSTER" type="{http://autosar.org/schema/r4.0}LIN-CLUSTER"/>
     *         &lt;element name="LIN-EVENT-TRIGGERED-FRAME" type="{http://autosar.org/schema/r4.0}LIN-EVENT-TRIGGERED-FRAME"/>
     *         &lt;element name="LIN-SPORADIC-FRAME" type="{http://autosar.org/schema/r4.0}LIN-SPORADIC-FRAME"/>
     *         &lt;element name="LIN-TP-CONFIG" type="{http://autosar.org/schema/r4.0}LIN-TP-CONFIG"/>
     *         &lt;element name="LIN-UNCONDITIONAL-FRAME" type="{http://autosar.org/schema/r4.0}LIN-UNCONDITIONAL-FRAME"/>
     *         &lt;element name="MC-FUNCTION" type="{http://autosar.org/schema/r4.0}MC-FUNCTION"/>
     *         &lt;element name="MODE-DECLARATION-GROUP" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP"/>
     *         &lt;element name="MODE-DECLARATION-MAPPING-SET" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-MAPPING-SET"/>
     *         &lt;element name="MODE-SWITCH-INTERFACE" type="{http://autosar.org/schema/r4.0}MODE-SWITCH-INTERFACE"/>
     *         &lt;element name="MULTIPLEXED-I-PDU" type="{http://autosar.org/schema/r4.0}MULTIPLEXED-I-PDU"/>
     *         &lt;element name="N-PDU" type="{http://autosar.org/schema/r4.0}N-PDU"/>
     *         &lt;element name="NM-CONFIG" type="{http://autosar.org/schema/r4.0}NM-CONFIG"/>
     *         &lt;element name="NM-PDU" type="{http://autosar.org/schema/r4.0}NM-PDU"/>
     *         &lt;element name="NV-BLOCK-SW-COMPONENT-TYPE" type="{http://autosar.org/schema/r4.0}NV-BLOCK-SW-COMPONENT-TYPE"/>
     *         &lt;element name="NV-DATA-INTERFACE" type="{http://autosar.org/schema/r4.0}NV-DATA-INTERFACE"/>
     *         &lt;element name="PARAMETER-INTERFACE" type="{http://autosar.org/schema/r4.0}PARAMETER-INTERFACE"/>
     *         &lt;element name="PARAMETER-SW-COMPONENT-TYPE" type="{http://autosar.org/schema/r4.0}PARAMETER-SW-COMPONENT-TYPE"/>
     *         &lt;element name="PDUR-I-PDU-GROUP" type="{http://autosar.org/schema/r4.0}PDUR-I-PDU-GROUP"/>
     *         &lt;element name="PHYSICAL-DIMENSION" type="{http://autosar.org/schema/r4.0}PHYSICAL-DIMENSION"/>
     *         &lt;element name="PHYSICAL-DIMENSION-MAPPING-SET" type="{http://autosar.org/schema/r4.0}PHYSICAL-DIMENSION-MAPPING-SET"/>
     *         &lt;element name="PORT-INTERFACE-MAPPING-SET" type="{http://autosar.org/schema/r4.0}PORT-INTERFACE-MAPPING-SET"/>
     *         &lt;element name="PORT-PROTOTYPE-BLUEPRINT" type="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE-BLUEPRINT"/>
     *         &lt;element name="POST-BUILD-VARIANT-CRITERION" type="{http://autosar.org/schema/r4.0}POST-BUILD-VARIANT-CRITERION"/>
     *         &lt;element name="POST-BUILD-VARIANT-CRITERION-VALUE-SET" type="{http://autosar.org/schema/r4.0}POST-BUILD-VARIANT-CRITERION-VALUE-SET"/>
     *         &lt;element name="PREDEFINED-VARIANT" type="{http://autosar.org/schema/r4.0}PREDEFINED-VARIANT"/>
     *         &lt;element name="RAPID-PROTOTYPING-SCENARIO" type="{http://autosar.org/schema/r4.0}RAPID-PROTOTYPING-SCENARIO"/>
     *         &lt;element name="SECURED-I-PDU" type="{http://autosar.org/schema/r4.0}SECURED-I-PDU"/>
     *         &lt;element name="SENDER-RECEIVER-INTERFACE" type="{http://autosar.org/schema/r4.0}SENDER-RECEIVER-INTERFACE"/>
     *         &lt;element name="SENSOR-ACTUATOR-SW-COMPONENT-TYPE" type="{http://autosar.org/schema/r4.0}SENSOR-ACTUATOR-SW-COMPONENT-TYPE"/>
     *         &lt;element name="SERIALIZATION-TECHNOLOGY" type="{http://autosar.org/schema/r4.0}SERIALIZATION-TECHNOLOGY"/>
     *         &lt;element name="SERVICE-PROXY-SW-COMPONENT-TYPE" type="{http://autosar.org/schema/r4.0}SERVICE-PROXY-SW-COMPONENT-TYPE"/>
     *         &lt;element name="SERVICE-SW-COMPONENT-TYPE" type="{http://autosar.org/schema/r4.0}SERVICE-SW-COMPONENT-TYPE"/>
     *         &lt;element name="SO-AD-ROUTING-GROUP" type="{http://autosar.org/schema/r4.0}SO-AD-ROUTING-GROUP"/>
     *         &lt;element name="SW-ADDR-METHOD" type="{http://autosar.org/schema/r4.0}SW-ADDR-METHOD"/>
     *         &lt;element name="SW-AXIS-TYPE" type="{http://autosar.org/schema/r4.0}SW-AXIS-TYPE"/>
     *         &lt;element name="SW-BASE-TYPE" type="{http://autosar.org/schema/r4.0}SW-BASE-TYPE"/>
     *         &lt;element name="SW-RECORD-LAYOUT" type="{http://autosar.org/schema/r4.0}SW-RECORD-LAYOUT"/>
     *         &lt;element name="SW-SYSTEMCONST" type="{http://autosar.org/schema/r4.0}SW-SYSTEMCONST"/>
     *         &lt;element name="SW-SYSTEMCONSTANT-VALUE-SET" type="{http://autosar.org/schema/r4.0}SW-SYSTEMCONSTANT-VALUE-SET"/>
     *         &lt;element name="SWC-BSW-MAPPING" type="{http://autosar.org/schema/r4.0}SWC-BSW-MAPPING"/>
     *         &lt;element name="SWC-IMPLEMENTATION" type="{http://autosar.org/schema/r4.0}SWC-IMPLEMENTATION"/>
     *         &lt;element name="SWC-TIMING" type="{http://autosar.org/schema/r4.0}SWC-TIMING"/>
     *         &lt;element name="SYSTEM" type="{http://autosar.org/schema/r4.0}SYSTEM"/>
     *         &lt;element name="SYSTEM-SIGNAL" type="{http://autosar.org/schema/r4.0}SYSTEM-SIGNAL"/>
     *         &lt;element name="SYSTEM-SIGNAL-GROUP" type="{http://autosar.org/schema/r4.0}SYSTEM-SIGNAL-GROUP"/>
     *         &lt;element name="SYSTEM-TIMING" type="{http://autosar.org/schema/r4.0}SYSTEM-TIMING"/>
     *         &lt;element name="TRIGGER-INTERFACE" type="{http://autosar.org/schema/r4.0}TRIGGER-INTERFACE"/>
     *         &lt;element name="TTCAN-CLUSTER" type="{http://autosar.org/schema/r4.0}TTCAN-CLUSTER"/>
     *         &lt;element name="UNIT" type="{http://autosar.org/schema/r4.0}UNIT"/>
     *         &lt;element name="UNIT-GROUP" type="{http://autosar.org/schema/r4.0}UNIT-GROUP"/>
     *         &lt;element name="USER-DEFINED-CLUSTER" type="{http://autosar.org/schema/r4.0}USER-DEFINED-CLUSTER"/>
     *         &lt;element name="USER-DEFINED-ETHERNET-FRAME" type="{http://autosar.org/schema/r4.0}USER-DEFINED-ETHERNET-FRAME"/>
     *         &lt;element name="USER-DEFINED-I-PDU" type="{http://autosar.org/schema/r4.0}USER-DEFINED-I-PDU"/>
     *         &lt;element name="USER-DEFINED-PDU" type="{http://autosar.org/schema/r4.0}USER-DEFINED-PDU"/>
     *         &lt;element name="VFB-TIMING" type="{http://autosar.org/schema/r4.0}VFB-TIMING"/>
     *         &lt;element name="VIEW-MAP-SET" type="{http://autosar.org/schema/r4.0}VIEW-MAP-SET"/>
     *         &lt;element name="XCP-PDU" type="{http://autosar.org/schema/r4.0}XCP-PDU"/>
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
        "aclobjectsetOrACLOPERATIONOrACLPERMISSION"
    })
    public static class ELEMENTS {

        @XmlElements({
            @XmlElement(name = "ACL-OBJECT-SET", type = ACLOBJECTSET.class),
            @XmlElement(name = "ACL-OPERATION", type = ACLOPERATION.class),
            @XmlElement(name = "ACL-PERMISSION", type = ACLPERMISSION.class),
            @XmlElement(name = "ACL-ROLE", type = ACLROLE.class),
            @XmlElement(name = "ALIAS-NAME-SET", type = ALIASNAMESET.class),
            @XmlElement(name = "APPLICATION-ARRAY-DATA-TYPE", type = APPLICATIONARRAYDATATYPE.class),
            @XmlElement(name = "APPLICATION-PRIMITIVE-DATA-TYPE", type = APPLICATIONPRIMITIVEDATATYPE.class),
            @XmlElement(name = "APPLICATION-RECORD-DATA-TYPE", type = APPLICATIONRECORDDATATYPE.class),
            @XmlElement(name = "APPLICATION-SW-COMPONENT-TYPE", type = APPLICATIONSWCOMPONENTTYPE.class),
            @XmlElement(name = "BLUEPRINT-MAPPING-SET", type = BLUEPRINTMAPPINGSET.class),
            @XmlElement(name = "BSW-IMPLEMENTATION", type = BSWIMPLEMENTATION.class),
            @XmlElement(name = "BSW-MODULE-DESCRIPTION", type = BSWMODULEDESCRIPTION.class),
            @XmlElement(name = "BSW-MODULE-ENTRY", type = BSWMODULEENTRY.class),
            @XmlElement(name = "BSW-MODULE-TIMING", type = BSWMODULETIMING.class),
            @XmlElement(name = "BUILD-ACTION-MANIFEST", type = BUILDACTIONMANIFEST.class),
            @XmlElement(name = "CALIBRATION-PARAMETER-VALUE-SET", type = CALIBRATIONPARAMETERVALUESET.class),
            @XmlElement(name = "CAN-CLUSTER", type = CANCLUSTER.class),
            @XmlElement(name = "CAN-FRAME", type = CANFRAME.class),
            @XmlElement(name = "CAN-TP-CONFIG", type = CANTPCONFIG.class),
            @XmlElement(name = "CLIENT-ID-DEFINITION-SET", type = CLIENTIDDEFINITIONSET.class),
            @XmlElement(name = "CLIENT-SERVER-INTERFACE", type = CLIENTSERVERINTERFACE.class),
            @XmlElement(name = "COLLECTION", type = COLLECTION.class),
            @XmlElement(name = "COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE", type = COMPLEXDEVICEDRIVERSWCOMPONENTTYPE.class),
            @XmlElement(name = "COMPOSITION-SW-COMPONENT-TYPE", type = COMPOSITIONSWCOMPONENTTYPE.class),
            @XmlElement(name = "COMPU-METHOD", type = COMPUMETHOD.class),
            @XmlElement(name = "CONSISTENCY-NEEDS-BLUEPRINT-SET", type = CONSISTENCYNEEDSBLUEPRINTSET.class),
            @XmlElement(name = "CONSTANT-SPECIFICATION", type = CONSTANTSPECIFICATION.class),
            @XmlElement(name = "CONSTANT-SPECIFICATION-MAPPING-SET", type = CONSTANTSPECIFICATIONMAPPINGSET.class),
            @XmlElement(name = "CONTAINER-I-PDU", type = CONTAINERIPDU.class),
            @XmlElement(name = "COUPLING-ELEMENT", type = COUPLINGELEMENT.class),
            @XmlElement(name = "DATA-CONSTR", type = DATACONSTR.class),
            @XmlElement(name = "DATA-TRANSFORMATION-SET", type = DATATRANSFORMATIONSET.class),
            @XmlElement(name = "DATA-TYPE-MAPPING-SET", type = DATATYPEMAPPINGSET.class),
            @XmlElement(name = "DCM-I-PDU", type = DCMIPDU.class),
            @XmlElement(name = "DIAGNOSTIC-ACCESS-PERMISSION", type = DIAGNOSTICACCESSPERMISSION.class),
            @XmlElement(name = "DIAGNOSTIC-AGING", type = DIAGNOSTICAGING.class),
            @XmlElement(name = "DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION", type = DIAGNOSTICCLEARDIAGNOSTICINFORMATION.class),
            @XmlElement(name = "DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS", type = DIAGNOSTICCLEARDIAGNOSTICINFORMATIONCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-COM-CONTROL", type = DIAGNOSTICCOMCONTROL.class),
            @XmlElement(name = "DIAGNOSTIC-COM-CONTROL-CLASS", type = DIAGNOSTICCOMCONTROLCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-CONNECTION", type = DIAGNOSTICCONNECTION.class),
            @XmlElement(name = "DIAGNOSTIC-CONTRIBUTION-SET", type = DIAGNOSTICCONTRIBUTIONSET.class),
            @XmlElement(name = "DIAGNOSTIC-CONTROL-DTC-SETTING", type = DIAGNOSTICCONTROLDTCSETTING.class),
            @XmlElement(name = "DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS", type = DIAGNOSTICCONTROLDTCSETTINGCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-CUSTOM-SERVICE-CLASS", type = DIAGNOSTICCUSTOMSERVICECLASS.class),
            @XmlElement(name = "DIAGNOSTIC-DATA-IDENTIFIER", type = DIAGNOSTICDATAIDENTIFIER.class),
            @XmlElement(name = "DIAGNOSTIC-DATA-IDENTIFIER-SET", type = DIAGNOSTICDATAIDENTIFIERSET.class),
            @XmlElement(name = "DIAGNOSTIC-DATA-TRANSFER", type = DIAGNOSTICDATATRANSFER.class),
            @XmlElement(name = "DIAGNOSTIC-DATA-TRANSFER-CLASS", type = DIAGNOSTICDATATRANSFERCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-DEM-PROVIDED-DATA-MAPPING", type = DIAGNOSTICDEMPROVIDEDDATAMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER", type = DIAGNOSTICDYNAMICDATAIDENTIFIER.class),
            @XmlElement(name = "DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER", type = DIAGNOSTICDYNAMICALLYDEFINEDATAIDENTIFIER.class),
            @XmlElement(name = "DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS", type = DIAGNOSTICDYNAMICALLYDEFINEDATAIDENTIFIERCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-ECU-RESET", type = DIAGNOSTICECURESET.class),
            @XmlElement(name = "DIAGNOSTIC-ECU-RESET-CLASS", type = DIAGNOSTICECURESETCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-ENABLE-CONDITION", type = DIAGNOSTICENABLECONDITION.class),
            @XmlElement(name = "DIAGNOSTIC-ENABLE-CONDITION-GROUP", type = DIAGNOSTICENABLECONDITIONGROUP.class),
            @XmlElement(name = "DIAGNOSTIC-ENABLE-CONDITION-PORT-MAPPING", type = DIAGNOSTICENABLECONDITIONPORTMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-EVENT", type = DIAGNOSTICEVENT.class),
            @XmlElement(name = "DIAGNOSTIC-EVENT-PORT-MAPPING", type = DIAGNOSTICEVENTPORTMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-EVENT-TO-DEBOUNCE-ALGORITHM-MAPPING", type = DIAGNOSTICEVENTTODEBOUNCEALGORITHMMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-EVENT-TO-ENABLE-CONDITION-GROUP-MAPPING", type = DIAGNOSTICEVENTTOENABLECONDITIONGROUPMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-EVENT-TO-OPERATION-CYCLE-MAPPING", type = DIAGNOSTICEVENTTOOPERATIONCYCLEMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-EVENT-TO-STORAGE-CONDITION-GROUP-MAPPING", type = DIAGNOSTICEVENTTOSTORAGECONDITIONGROUPMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-EVENT-TO-TROUBLE-CODE-UDS-MAPPING", type = DIAGNOSTICEVENTTOTROUBLECODEUDSMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-EXTENDED-DATA-RECORD", type = DIAGNOSTICEXTENDEDDATARECORD.class),
            @XmlElement(name = "DIAGNOSTIC-FREEZE-FRAME", type = DIAGNOSTICFREEZEFRAME.class),
            @XmlElement(name = "DIAGNOSTIC-IO-CONTROL", type = DIAGNOSTICIOCONTROL.class),
            @XmlElement(name = "DIAGNOSTIC-INDICATOR", type = DIAGNOSTICINDICATOR.class),
            @XmlElement(name = "DIAGNOSTIC-IO-CONTROL-CLASS", type = DIAGNOSTICIOCONTROLCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-MEMORY-DESTINATION-MIRROR", type = DIAGNOSTICMEMORYDESTINATIONMIRROR.class),
            @XmlElement(name = "DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY", type = DIAGNOSTICMEMORYDESTINATIONPRIMARY.class),
            @XmlElement(name = "DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED", type = DIAGNOSTICMEMORYDESTINATIONUSERDEFINED.class),
            @XmlElement(name = "DIAGNOSTIC-MEMORY-IDENTIFIER", type = DIAGNOSTICMEMORYIDENTIFIER.class),
            @XmlElement(name = "DIAGNOSTIC-OPERATION-CYCLE", type = DIAGNOSTICOPERATIONCYCLE.class),
            @XmlElement(name = "DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING", type = DIAGNOSTICOPERATIONCYCLEPORTMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-READ-DTC-INFORMATION", type = DIAGNOSTICREADDTCINFORMATION.class),
            @XmlElement(name = "DIAGNOSTIC-READ-DTC-INFORMATION-CLASS", type = DIAGNOSTICREADDTCINFORMATIONCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-READ-DATA-BY-IDENTIFIER", type = DIAGNOSTICREADDATABYIDENTIFIER.class),
            @XmlElement(name = "DIAGNOSTIC-READ-DATA-BY-IDENTIFIER-CLASS", type = DIAGNOSTICREADDATABYIDENTIFIERCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID", type = DIAGNOSTICREADDATABYPERIODICID.class),
            @XmlElement(name = "DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS", type = DIAGNOSTICREADDATABYPERIODICIDCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-READ-MEMORY-BY-ADDRESS", type = DIAGNOSTICREADMEMORYBYADDRESS.class),
            @XmlElement(name = "DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS", type = DIAGNOSTICREADMEMORYBYADDRESSCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-REQUEST-DOWNLOAD", type = DIAGNOSTICREQUESTDOWNLOAD.class),
            @XmlElement(name = "DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS", type = DIAGNOSTICREQUESTDOWNLOADCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-REQUEST-FILE-TRANSFER", type = DIAGNOSTICREQUESTFILETRANSFER.class),
            @XmlElement(name = "DIAGNOSTIC-REQUEST-FILE-TRANSFER-CLASS", type = DIAGNOSTICREQUESTFILETRANSFERCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-REQUEST-UPLOAD", type = DIAGNOSTICREQUESTUPLOAD.class),
            @XmlElement(name = "DIAGNOSTIC-REQUEST-UPLOAD-CLASS", type = DIAGNOSTICREQUESTUPLOADCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-RESPONSE-ON-EVENT", type = DIAGNOSTICRESPONSEONEVENT.class),
            @XmlElement(name = "DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS", type = DIAGNOSTICRESPONSEONEVENTCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-ROUTINE", type = DIAGNOSTICROUTINE.class),
            @XmlElement(name = "DIAGNOSTIC-ROUTINE-CONTROL", type = DIAGNOSTICROUTINECONTROL.class),
            @XmlElement(name = "DIAGNOSTIC-ROUTINE-CONTROL-CLASS", type = DIAGNOSTICROUTINECONTROLCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-SECURITY-ACCESS", type = DIAGNOSTICSECURITYACCESS.class),
            @XmlElement(name = "DIAGNOSTIC-SECURITY-ACCESS-CLASS", type = DIAGNOSTICSECURITYACCESSCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-SECURITY-LEVEL", type = DIAGNOSTICSECURITYLEVEL.class),
            @XmlElement(name = "DIAGNOSTIC-SERVICE-DATA-MAPPING", type = DIAGNOSTICSERVICEDATAMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-SERVICE-SW-MAPPING", type = DIAGNOSTICSERVICESWMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-SERVICE-TABLE", type = DIAGNOSTICSERVICETABLE.class),
            @XmlElement(name = "DIAGNOSTIC-SESSION", type = DIAGNOSTICSESSION.class),
            @XmlElement(name = "DIAGNOSTIC-SESSION-CONTROL", type = DIAGNOSTICSESSIONCONTROL.class),
            @XmlElement(name = "DIAGNOSTIC-SESSION-CONTROL-CLASS", type = DIAGNOSTICSESSIONCONTROLCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-STORAGE-CONDITION", type = DIAGNOSTICSTORAGECONDITION.class),
            @XmlElement(name = "DIAGNOSTIC-STORAGE-CONDITION-GROUP", type = DIAGNOSTICSTORAGECONDITIONGROUP.class),
            @XmlElement(name = "DIAGNOSTIC-STORAGE-CONDITION-PORT-MAPPING", type = DIAGNOSTICSTORAGECONDITIONPORTMAPPING.class),
            @XmlElement(name = "DIAGNOSTIC-TRANSFER-EXIT", type = DIAGNOSTICTRANSFEREXIT.class),
            @XmlElement(name = "DIAGNOSTIC-TRANSFER-EXIT-CLASS", type = DIAGNOSTICTRANSFEREXITCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-TROUBLE-CODE-GROUP", type = DIAGNOSTICTROUBLECODEGROUP.class),
            @XmlElement(name = "DIAGNOSTIC-TROUBLE-CODE-J-1939", type = DIAGNOSTICTROUBLECODEJ1939 .class),
            @XmlElement(name = "DIAGNOSTIC-TROUBLE-CODE-OBD", type = DIAGNOSTICTROUBLECODEOBD.class),
            @XmlElement(name = "DIAGNOSTIC-TROUBLE-CODE-PROPS", type = DIAGNOSTICTROUBLECODEPROPS.class),
            @XmlElement(name = "DIAGNOSTIC-TROUBLE-CODE-UDS", type = DIAGNOSTICTROUBLECODEUDS.class),
            @XmlElement(name = "DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER", type = DIAGNOSTICWRITEDATABYIDENTIFIER.class),
            @XmlElement(name = "DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS", type = DIAGNOSTICWRITEDATABYIDENTIFIERCLASS.class),
            @XmlElement(name = "DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS", type = DIAGNOSTICWRITEMEMORYBYADDRESS.class),
            @XmlElement(name = "DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS-CLASS", type = DIAGNOSTICWRITEMEMORYBYADDRESSCLASS.class),
            @XmlElement(name = "DOCUMENTATION", type = DOCUMENTATION.class),
            @XmlElement(name = "ECU-ABSTRACTION-SW-COMPONENT-TYPE", type = ECUABSTRACTIONSWCOMPONENTTYPE.class),
            @XmlElement(name = "ECU-INSTANCE", type = ECUINSTANCE.class),
            @XmlElement(name = "ECU-TIMING", type = ECUTIMING.class),
            @XmlElement(name = "ECUC-DEFINITION-COLLECTION", type = ECUCDEFINITIONCOLLECTION.class),
            @XmlElement(name = "ECUC-DESTINATION-URI-DEF-SET", type = ECUCDESTINATIONURIDEFSET.class),
            @XmlElement(name = "ECUC-MODULE-CONFIGURATION-VALUES", type = ECUCMODULECONFIGURATIONVALUES.class),
            @XmlElement(name = "ECUC-MODULE-DEF", type = ECUCMODULEDEF.class),
            @XmlElement(name = "ECUC-VALUE-COLLECTION", type = ECUCVALUECOLLECTION.class),
            @XmlElement(name = "END-TO-END-PROTECTION-SET", type = ENDTOENDPROTECTIONSET.class),
            @XmlElement(name = "ETHERNET-CLUSTER", type = ETHERNETCLUSTER.class),
            @XmlElement(name = "ETHERNET-FRAME", type = ETHERNETFRAME.class),
            @XmlElement(name = "EVALUATED-VARIANT-SET", type = EVALUATEDVARIANTSET.class),
            @XmlElement(name = "FM-FEATURE", type = FMFEATURE.class),
            @XmlElement(name = "FM-FEATURE-MAP", type = FMFEATUREMAP.class),
            @XmlElement(name = "FM-FEATURE-MODEL", type = FMFEATUREMODEL.class),
            @XmlElement(name = "FM-FEATURE-SELECTION-SET", type = FMFEATURESELECTIONSET.class),
            @XmlElement(name = "FLAT-MAP", type = FLATMAP.class),
            @XmlElement(name = "FLEXRAY-AR-TP-CONFIG", type = FLEXRAYARTPCONFIG.class),
            @XmlElement(name = "FLEXRAY-CLUSTER", type = FLEXRAYCLUSTER.class),
            @XmlElement(name = "FLEXRAY-FRAME", type = FLEXRAYFRAME.class),
            @XmlElement(name = "FLEXRAY-TP-CONFIG", type = FLEXRAYTPCONFIG.class),
            @XmlElement(name = "GATEWAY", type = GATEWAY.class),
            @XmlElement(name = "GENERAL-PURPOSE-I-PDU", type = GENERALPURPOSEIPDU.class),
            @XmlElement(name = "GENERAL-PURPOSE-PDU", type = GENERALPURPOSEPDU.class),
            @XmlElement(name = "GENERIC-ETHERNET-FRAME", type = GENERICETHERNETFRAME.class),
            @XmlElement(name = "GLOBAL-TIME-DOMAIN", type = GLOBALTIMEDOMAIN.class),
            @XmlElement(name = "HW-CATEGORY", type = HWCATEGORY.class),
            @XmlElement(name = "HW-ELEMENT", type = HWELEMENT.class),
            @XmlElement(name = "HW-TYPE", type = HWTYPE.class),
            @XmlElement(name = "I-SIGNAL", type = ISIGNAL.class),
            @XmlElement(name = "I-SIGNAL-GROUP", type = ISIGNALGROUP.class),
            @XmlElement(name = "I-SIGNAL-I-PDU", type = ISIGNALIPDU.class),
            @XmlElement(name = "I-SIGNAL-I-PDU-GROUP", type = ISIGNALIPDUGROUP.class),
            @XmlElement(name = "IEEE-1722-TP-ETHERNET-FRAME", type = IEEE1722TPETHERNETFRAME.class),
            @XmlElement(name = "IMPLEMENTATION-DATA-TYPE", type = IMPLEMENTATIONDATATYPE.class),
            @XmlElement(name = "INTERPOLATION-ROUTINE-MAPPING-SET", type = INTERPOLATIONROUTINEMAPPINGSET.class),
            @XmlElement(name = "J-1939-CLUSTER", type = J1939CLUSTER.class),
            @XmlElement(name = "J-1939-DCM-I-PDU", type = J1939DCMIPDU.class),
            @XmlElement(name = "J-1939-TP-CONFIG", type = J1939TPCONFIG.class),
            @XmlElement(name = "KEYWORD-SET", type = KEYWORDSET.class),
            @XmlElement(name = "LIFE-CYCLE-INFO-SET", type = LIFECYCLEINFOSET.class),
            @XmlElement(name = "LIFE-CYCLE-STATE-DEFINITION-GROUP", type = LIFECYCLESTATEDEFINITIONGROUP.class),
            @XmlElement(name = "LIN-CLUSTER", type = LINCLUSTER.class),
            @XmlElement(name = "LIN-EVENT-TRIGGERED-FRAME", type = LINEVENTTRIGGEREDFRAME.class),
            @XmlElement(name = "LIN-SPORADIC-FRAME", type = LINSPORADICFRAME.class),
            @XmlElement(name = "LIN-TP-CONFIG", type = LINTPCONFIG.class),
            @XmlElement(name = "LIN-UNCONDITIONAL-FRAME", type = LINUNCONDITIONALFRAME.class),
            @XmlElement(name = "MC-FUNCTION", type = MCFUNCTION.class),
            @XmlElement(name = "MODE-DECLARATION-GROUP", type = MODEDECLARATIONGROUP.class),
            @XmlElement(name = "MODE-DECLARATION-MAPPING-SET", type = MODEDECLARATIONMAPPINGSET.class),
            @XmlElement(name = "MODE-SWITCH-INTERFACE", type = MODESWITCHINTERFACE.class),
            @XmlElement(name = "MULTIPLEXED-I-PDU", type = MULTIPLEXEDIPDU.class),
            @XmlElement(name = "N-PDU", type = NPDU.class),
            @XmlElement(name = "NM-CONFIG", type = NMCONFIG.class),
            @XmlElement(name = "NM-PDU", type = NMPDU.class),
            @XmlElement(name = "NV-BLOCK-SW-COMPONENT-TYPE", type = NVBLOCKSWCOMPONENTTYPE.class),
            @XmlElement(name = "NV-DATA-INTERFACE", type = NVDATAINTERFACE.class),
            @XmlElement(name = "PARAMETER-INTERFACE", type = PARAMETERINTERFACE.class),
            @XmlElement(name = "PARAMETER-SW-COMPONENT-TYPE", type = PARAMETERSWCOMPONENTTYPE.class),
            @XmlElement(name = "PDUR-I-PDU-GROUP", type = PDURIPDUGROUP.class),
            @XmlElement(name = "PHYSICAL-DIMENSION", type = PHYSICALDIMENSION.class),
            @XmlElement(name = "PHYSICAL-DIMENSION-MAPPING-SET", type = PHYSICALDIMENSIONMAPPINGSET.class),
            @XmlElement(name = "PORT-INTERFACE-MAPPING-SET", type = PORTINTERFACEMAPPINGSET.class),
            @XmlElement(name = "PORT-PROTOTYPE-BLUEPRINT", type = PORTPROTOTYPEBLUEPRINT.class),
            @XmlElement(name = "POST-BUILD-VARIANT-CRITERION", type = POSTBUILDVARIANTCRITERION.class),
            @XmlElement(name = "POST-BUILD-VARIANT-CRITERION-VALUE-SET", type = POSTBUILDVARIANTCRITERIONVALUESET.class),
            @XmlElement(name = "PREDEFINED-VARIANT", type = PREDEFINEDVARIANT.class),
            @XmlElement(name = "RAPID-PROTOTYPING-SCENARIO", type = RAPIDPROTOTYPINGSCENARIO.class),
            @XmlElement(name = "SECURED-I-PDU", type = SECUREDIPDU.class),
            @XmlElement(name = "SENDER-RECEIVER-INTERFACE", type = SENDERRECEIVERINTERFACE.class),
            @XmlElement(name = "SENSOR-ACTUATOR-SW-COMPONENT-TYPE", type = SENSORACTUATORSWCOMPONENTTYPE.class),
            @XmlElement(name = "SERIALIZATION-TECHNOLOGY", type = SERIALIZATIONTECHNOLOGY.class),
            @XmlElement(name = "SERVICE-PROXY-SW-COMPONENT-TYPE", type = SERVICEPROXYSWCOMPONENTTYPE.class),
            @XmlElement(name = "SERVICE-SW-COMPONENT-TYPE", type = SERVICESWCOMPONENTTYPE.class),
            @XmlElement(name = "SO-AD-ROUTING-GROUP", type = SOADROUTINGGROUP.class),
            @XmlElement(name = "SW-ADDR-METHOD", type = SWADDRMETHOD.class),
            @XmlElement(name = "SW-AXIS-TYPE", type = SWAXISTYPE.class),
            @XmlElement(name = "SW-BASE-TYPE", type = SWBASETYPE.class),
            @XmlElement(name = "SW-RECORD-LAYOUT", type = SWRECORDLAYOUT.class),
            @XmlElement(name = "SW-SYSTEMCONST", type = SWSYSTEMCONST.class),
            @XmlElement(name = "SW-SYSTEMCONSTANT-VALUE-SET", type = SWSYSTEMCONSTANTVALUESET.class),
            @XmlElement(name = "SWC-BSW-MAPPING", type = SWCBSWMAPPING.class),
            @XmlElement(name = "SWC-IMPLEMENTATION", type = SWCIMPLEMENTATION.class),
            @XmlElement(name = "SWC-TIMING", type = SWCTIMING.class),
            @XmlElement(name = "SYSTEM", type = SYSTEM.class),
            @XmlElement(name = "SYSTEM-SIGNAL", type = SYSTEMSIGNAL.class),
            @XmlElement(name = "SYSTEM-SIGNAL-GROUP", type = SYSTEMSIGNALGROUP.class),
            @XmlElement(name = "SYSTEM-TIMING", type = SYSTEMTIMING.class),
            @XmlElement(name = "TRIGGER-INTERFACE", type = TRIGGERINTERFACE.class),
            @XmlElement(name = "TTCAN-CLUSTER", type = TTCANCLUSTER.class),
            @XmlElement(name = "UNIT", type = UNIT.class),
            @XmlElement(name = "UNIT-GROUP", type = UNITGROUP.class),
            @XmlElement(name = "USER-DEFINED-CLUSTER", type = USERDEFINEDCLUSTER.class),
            @XmlElement(name = "USER-DEFINED-ETHERNET-FRAME", type = USERDEFINEDETHERNETFRAME.class),
            @XmlElement(name = "USER-DEFINED-I-PDU", type = USERDEFINEDIPDU.class),
            @XmlElement(name = "USER-DEFINED-PDU", type = USERDEFINEDPDU.class),
            @XmlElement(name = "VFB-TIMING", type = VFBTIMING.class),
            @XmlElement(name = "VIEW-MAP-SET", type = VIEWMAPSET.class),
            @XmlElement(name = "XCP-PDU", type = XCPPDU.class)
        })
        protected List<Object> aclobjectsetOrACLOPERATIONOrACLPERMISSION;

        /**
         * Gets the value of the aclobjectsetOrACLOPERATIONOrACLPERMISSION property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aclobjectsetOrACLOPERATIONOrACLPERMISSION property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACLOBJECTSETOrACLOPERATIONOrACLPERMISSION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACLOBJECTSET }
         * {@link ACLOPERATION }
         * {@link ACLPERMISSION }
         * {@link ACLROLE }
         * {@link ALIASNAMESET }
         * {@link APPLICATIONARRAYDATATYPE }
         * {@link APPLICATIONPRIMITIVEDATATYPE }
         * {@link APPLICATIONRECORDDATATYPE }
         * {@link APPLICATIONSWCOMPONENTTYPE }
         * {@link BLUEPRINTMAPPINGSET }
         * {@link BSWIMPLEMENTATION }
         * {@link BSWMODULEDESCRIPTION }
         * {@link BSWMODULEENTRY }
         * {@link BSWMODULETIMING }
         * {@link BUILDACTIONMANIFEST }
         * {@link CALIBRATIONPARAMETERVALUESET }
         * {@link CANCLUSTER }
         * {@link CANFRAME }
         * {@link CANTPCONFIG }
         * {@link CLIENTIDDEFINITIONSET }
         * {@link CLIENTSERVERINTERFACE }
         * {@link COLLECTION }
         * {@link COMPLEXDEVICEDRIVERSWCOMPONENTTYPE }
         * {@link COMPOSITIONSWCOMPONENTTYPE }
         * {@link COMPUMETHOD }
         * {@link CONSISTENCYNEEDSBLUEPRINTSET }
         * {@link CONSTANTSPECIFICATION }
         * {@link CONSTANTSPECIFICATIONMAPPINGSET }
         * {@link CONTAINERIPDU }
         * {@link COUPLINGELEMENT }
         * {@link DATACONSTR }
         * {@link DATATRANSFORMATIONSET }
         * {@link DATATYPEMAPPINGSET }
         * {@link DCMIPDU }
         * {@link DIAGNOSTICACCESSPERMISSION }
         * {@link DIAGNOSTICAGING }
         * {@link DIAGNOSTICCLEARDIAGNOSTICINFORMATION }
         * {@link DIAGNOSTICCLEARDIAGNOSTICINFORMATIONCLASS }
         * {@link DIAGNOSTICCOMCONTROL }
         * {@link DIAGNOSTICCOMCONTROLCLASS }
         * {@link DIAGNOSTICCONNECTION }
         * {@link DIAGNOSTICCONTRIBUTIONSET }
         * {@link DIAGNOSTICCONTROLDTCSETTING }
         * {@link DIAGNOSTICCONTROLDTCSETTINGCLASS }
         * {@link DIAGNOSTICCUSTOMSERVICECLASS }
         * {@link DIAGNOSTICDATAIDENTIFIER }
         * {@link DIAGNOSTICDATAIDENTIFIERSET }
         * {@link DIAGNOSTICDATATRANSFER }
         * {@link DIAGNOSTICDATATRANSFERCLASS }
         * {@link DIAGNOSTICDEMPROVIDEDDATAMAPPING }
         * {@link DIAGNOSTICDYNAMICDATAIDENTIFIER }
         * {@link DIAGNOSTICDYNAMICALLYDEFINEDATAIDENTIFIER }
         * {@link DIAGNOSTICDYNAMICALLYDEFINEDATAIDENTIFIERCLASS }
         * {@link DIAGNOSTICECURESET }
         * {@link DIAGNOSTICECURESETCLASS }
         * {@link DIAGNOSTICENABLECONDITION }
         * {@link DIAGNOSTICENABLECONDITIONGROUP }
         * {@link DIAGNOSTICENABLECONDITIONPORTMAPPING }
         * {@link DIAGNOSTICEVENT }
         * {@link DIAGNOSTICEVENTPORTMAPPING }
         * {@link DIAGNOSTICEVENTTODEBOUNCEALGORITHMMAPPING }
         * {@link DIAGNOSTICEVENTTOENABLECONDITIONGROUPMAPPING }
         * {@link DIAGNOSTICEVENTTOOPERATIONCYCLEMAPPING }
         * {@link DIAGNOSTICEVENTTOSTORAGECONDITIONGROUPMAPPING }
         * {@link DIAGNOSTICEVENTTOTROUBLECODEUDSMAPPING }
         * {@link DIAGNOSTICEXTENDEDDATARECORD }
         * {@link DIAGNOSTICFREEZEFRAME }
         * {@link DIAGNOSTICIOCONTROL }
         * {@link DIAGNOSTICINDICATOR }
         * {@link DIAGNOSTICIOCONTROLCLASS }
         * {@link DIAGNOSTICMEMORYDESTINATIONMIRROR }
         * {@link DIAGNOSTICMEMORYDESTINATIONPRIMARY }
         * {@link DIAGNOSTICMEMORYDESTINATIONUSERDEFINED }
         * {@link DIAGNOSTICMEMORYIDENTIFIER }
         * {@link DIAGNOSTICOPERATIONCYCLE }
         * {@link DIAGNOSTICOPERATIONCYCLEPORTMAPPING }
         * {@link DIAGNOSTICREADDTCINFORMATION }
         * {@link DIAGNOSTICREADDTCINFORMATIONCLASS }
         * {@link DIAGNOSTICREADDATABYIDENTIFIER }
         * {@link DIAGNOSTICREADDATABYIDENTIFIERCLASS }
         * {@link DIAGNOSTICREADDATABYPERIODICID }
         * {@link DIAGNOSTICREADDATABYPERIODICIDCLASS }
         * {@link DIAGNOSTICREADMEMORYBYADDRESS }
         * {@link DIAGNOSTICREADMEMORYBYADDRESSCLASS }
         * {@link DIAGNOSTICREQUESTDOWNLOAD }
         * {@link DIAGNOSTICREQUESTDOWNLOADCLASS }
         * {@link DIAGNOSTICREQUESTFILETRANSFER }
         * {@link DIAGNOSTICREQUESTFILETRANSFERCLASS }
         * {@link DIAGNOSTICREQUESTUPLOAD }
         * {@link DIAGNOSTICREQUESTUPLOADCLASS }
         * {@link DIAGNOSTICRESPONSEONEVENT }
         * {@link DIAGNOSTICRESPONSEONEVENTCLASS }
         * {@link DIAGNOSTICROUTINE }
         * {@link DIAGNOSTICROUTINECONTROL }
         * {@link DIAGNOSTICROUTINECONTROLCLASS }
         * {@link DIAGNOSTICSECURITYACCESS }
         * {@link DIAGNOSTICSECURITYACCESSCLASS }
         * {@link DIAGNOSTICSECURITYLEVEL }
         * {@link DIAGNOSTICSERVICEDATAMAPPING }
         * {@link DIAGNOSTICSERVICESWMAPPING }
         * {@link DIAGNOSTICSERVICETABLE }
         * {@link DIAGNOSTICSESSION }
         * {@link DIAGNOSTICSESSIONCONTROL }
         * {@link DIAGNOSTICSESSIONCONTROLCLASS }
         * {@link DIAGNOSTICSTORAGECONDITION }
         * {@link DIAGNOSTICSTORAGECONDITIONGROUP }
         * {@link DIAGNOSTICSTORAGECONDITIONPORTMAPPING }
         * {@link DIAGNOSTICTRANSFEREXIT }
         * {@link DIAGNOSTICTRANSFEREXITCLASS }
         * {@link DIAGNOSTICTROUBLECODEGROUP }
         * {@link DIAGNOSTICTROUBLECODEJ1939 }
         * {@link DIAGNOSTICTROUBLECODEOBD }
         * {@link DIAGNOSTICTROUBLECODEPROPS }
         * {@link DIAGNOSTICTROUBLECODEUDS }
         * {@link DIAGNOSTICWRITEDATABYIDENTIFIER }
         * {@link DIAGNOSTICWRITEDATABYIDENTIFIERCLASS }
         * {@link DIAGNOSTICWRITEMEMORYBYADDRESS }
         * {@link DIAGNOSTICWRITEMEMORYBYADDRESSCLASS }
         * {@link DOCUMENTATION }
         * {@link ECUABSTRACTIONSWCOMPONENTTYPE }
         * {@link ECUINSTANCE }
         * {@link ECUTIMING }
         * {@link ECUCDEFINITIONCOLLECTION }
         * {@link ECUCDESTINATIONURIDEFSET }
         * {@link ECUCMODULECONFIGURATIONVALUES }
         * {@link ECUCMODULEDEF }
         * {@link ECUCVALUECOLLECTION }
         * {@link ENDTOENDPROTECTIONSET }
         * {@link ETHERNETCLUSTER }
         * {@link ETHERNETFRAME }
         * {@link EVALUATEDVARIANTSET }
         * {@link FMFEATURE }
         * {@link FMFEATUREMAP }
         * {@link FMFEATUREMODEL }
         * {@link FMFEATURESELECTIONSET }
         * {@link FLATMAP }
         * {@link FLEXRAYARTPCONFIG }
         * {@link FLEXRAYCLUSTER }
         * {@link FLEXRAYFRAME }
         * {@link FLEXRAYTPCONFIG }
         * {@link GATEWAY }
         * {@link GENERALPURPOSEIPDU }
         * {@link GENERALPURPOSEPDU }
         * {@link GENERICETHERNETFRAME }
         * {@link GLOBALTIMEDOMAIN }
         * {@link HWCATEGORY }
         * {@link HWELEMENT }
         * {@link HWTYPE }
         * {@link ISIGNAL }
         * {@link ISIGNALGROUP }
         * {@link ISIGNALIPDU }
         * {@link ISIGNALIPDUGROUP }
         * {@link IEEE1722TPETHERNETFRAME }
         * {@link IMPLEMENTATIONDATATYPE }
         * {@link INTERPOLATIONROUTINEMAPPINGSET }
         * {@link J1939CLUSTER }
         * {@link J1939DCMIPDU }
         * {@link J1939TPCONFIG }
         * {@link KEYWORDSET }
         * {@link LIFECYCLEINFOSET }
         * {@link LIFECYCLESTATEDEFINITIONGROUP }
         * {@link LINCLUSTER }
         * {@link LINEVENTTRIGGEREDFRAME }
         * {@link LINSPORADICFRAME }
         * {@link LINTPCONFIG }
         * {@link LINUNCONDITIONALFRAME }
         * {@link MCFUNCTION }
         * {@link MODEDECLARATIONGROUP }
         * {@link MODEDECLARATIONMAPPINGSET }
         * {@link MODESWITCHINTERFACE }
         * {@link MULTIPLEXEDIPDU }
         * {@link NPDU }
         * {@link NMCONFIG }
         * {@link NMPDU }
         * {@link NVBLOCKSWCOMPONENTTYPE }
         * {@link NVDATAINTERFACE }
         * {@link PARAMETERINTERFACE }
         * {@link PARAMETERSWCOMPONENTTYPE }
         * {@link PDURIPDUGROUP }
         * {@link PHYSICALDIMENSION }
         * {@link PHYSICALDIMENSIONMAPPINGSET }
         * {@link PORTINTERFACEMAPPINGSET }
         * {@link PORTPROTOTYPEBLUEPRINT }
         * {@link POSTBUILDVARIANTCRITERION }
         * {@link POSTBUILDVARIANTCRITERIONVALUESET }
         * {@link PREDEFINEDVARIANT }
         * {@link RAPIDPROTOTYPINGSCENARIO }
         * {@link SECUREDIPDU }
         * {@link SENDERRECEIVERINTERFACE }
         * {@link SENSORACTUATORSWCOMPONENTTYPE }
         * {@link SERIALIZATIONTECHNOLOGY }
         * {@link SERVICEPROXYSWCOMPONENTTYPE }
         * {@link SERVICESWCOMPONENTTYPE }
         * {@link SOADROUTINGGROUP }
         * {@link SWADDRMETHOD }
         * {@link SWAXISTYPE }
         * {@link SWBASETYPE }
         * {@link SWRECORDLAYOUT }
         * {@link SWSYSTEMCONST }
         * {@link SWSYSTEMCONSTANTVALUESET }
         * {@link SWCBSWMAPPING }
         * {@link SWCIMPLEMENTATION }
         * {@link SWCTIMING }
         * {@link SYSTEM }
         * {@link SYSTEMSIGNAL }
         * {@link SYSTEMSIGNALGROUP }
         * {@link SYSTEMTIMING }
         * {@link TRIGGERINTERFACE }
         * {@link TTCANCLUSTER }
         * {@link UNIT }
         * {@link UNITGROUP }
         * {@link USERDEFINEDCLUSTER }
         * {@link USERDEFINEDETHERNETFRAME }
         * {@link USERDEFINEDIPDU }
         * {@link USERDEFINEDPDU }
         * {@link VFBTIMING }
         * {@link VIEWMAPSET }
         * {@link XCPPDU }
         * 
         * 
         */
        public List<Object> getACLOBJECTSETOrACLOPERATIONOrACLPERMISSION() {
            if (aclobjectsetOrACLOPERATIONOrACLPERMISSION == null) {
                aclobjectsetOrACLOPERATIONOrACLPERMISSION = new ArrayList<Object>();
            }
            return this.aclobjectsetOrACLOPERATIONOrACLPERMISSION;
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
     *         &lt;element name="REFERENCE-BASE" type="{http://autosar.org/schema/r4.0}REFERENCE-BASE"/>
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
        "referencebase"
    })
    public static class REFERENCEBASES {

        @XmlElement(name = "REFERENCE-BASE")
        protected List<REFERENCEBASE> referencebase;

        /**
         * Gets the value of the referencebase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the referencebase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREFERENCEBASE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REFERENCEBASE }
         * 
         * 
         */
        public List<REFERENCEBASE> getREFERENCEBASE() {
            if (referencebase == null) {
                referencebase = new ArrayList<REFERENCEBASE>();
            }
            return this.referencebase;
        }

    }

}
