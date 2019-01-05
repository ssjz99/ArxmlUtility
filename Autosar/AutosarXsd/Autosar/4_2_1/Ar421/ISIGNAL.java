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
 * Signal of the Interaction Layer. The RTE supports a "signal fan-out" where the same System Signal is sent in different SignalIPdus to multiple receivers. 
 * 
 * To support the RTE "signal fan-out" each SignalIPdu  contains ISignals. If the same System Signal is to be mapped into several SignalIPdus there is one ISignal needed for each ISignalToIPduMapping. 
 * 
 * ISignals describe the Interface between the Precompile configured RTE and the potentially Postbuild configured Com Stack (see ECUC Parameter Mapping). 
 * 
 * In case of the SystemSignalGroup an ISignal must be created for each SystemSignal contained in the SystemSignalGroup.
 * 
 * <p>I-SIGNAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="I-SIGNAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FIBEX-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}I-SIGNAL"/>
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
@XmlType(name = "I-SIGNAL", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "datatransformations",
    "datatypepolicy",
    "isignalprops",
    "initvalue",
    "length",
    "networkrepresentationprops",
    "systemsignalref",
    "transformationisignalpropss"
})
public class ISIGNAL {

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
    @XmlElement(name = "DATA-TRANSFORMATIONS")
    protected ISIGNAL.DATATRANSFORMATIONS datatransformations;
    @XmlElement(name = "DATA-TYPE-POLICY")
    protected DATATYPEPOLICYENUM datatypepolicy;
    @XmlElement(name = "I-SIGNAL-PROPS")
    protected ISIGNALPROPS isignalprops;
    @XmlElement(name = "INIT-VALUE")
    protected ISIGNAL.INITVALUE initvalue;
    @XmlElement(name = "LENGTH")
    protected INTEGER length;
    @XmlElement(name = "NETWORK-REPRESENTATION-PROPS")
    protected SWDATADEFPROPS networkrepresentationprops;
    @XmlElement(name = "SYSTEM-SIGNAL-REF")
    protected ISIGNAL.SYSTEMSIGNALREF systemsignalref;
    @XmlElement(name = "TRANSFORMATION-I-SIGNAL-PROPSS")
    protected ISIGNAL.TRANSFORMATIONISIGNALPROPSS transformationisignalpropss;
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
     * ??datatransformations?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNAL.DATATRANSFORMATIONS }
     *     
     */
    public ISIGNAL.DATATRANSFORMATIONS getDATATRANSFORMATIONS() {
        return datatransformations;
    }

    /**
     * ??datatransformations?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNAL.DATATRANSFORMATIONS }
     *     
     */
    public void setDATATRANSFORMATIONS(ISIGNAL.DATATRANSFORMATIONS value) {
        this.datatransformations = value;
    }

    /**
     * ??datatypepolicy?????
     * 
     * @return
     *     possible object is
     *     {@link DATATYPEPOLICYENUM }
     *     
     */
    public DATATYPEPOLICYENUM getDATATYPEPOLICY() {
        return datatypepolicy;
    }

    /**
     * ??datatypepolicy?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATATYPEPOLICYENUM }
     *     
     */
    public void setDATATYPEPOLICY(DATATYPEPOLICYENUM value) {
        this.datatypepolicy = value;
    }

    /**
     * ??isignalprops?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALPROPS }
     *     
     */
    public ISIGNALPROPS getISIGNALPROPS() {
        return isignalprops;
    }

    /**
     * ??isignalprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALPROPS }
     *     
     */
    public void setISIGNALPROPS(ISIGNALPROPS value) {
        this.isignalprops = value;
    }

    /**
     * ??initvalue?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNAL.INITVALUE }
     *     
     */
    public ISIGNAL.INITVALUE getINITVALUE() {
        return initvalue;
    }

    /**
     * ??initvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNAL.INITVALUE }
     *     
     */
    public void setINITVALUE(ISIGNAL.INITVALUE value) {
        this.initvalue = value;
    }

    /**
     * ??length?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getLENGTH() {
        return length;
    }

    /**
     * ??length?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setLENGTH(INTEGER value) {
        this.length = value;
    }

    /**
     * ??networkrepresentationprops?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public SWDATADEFPROPS getNETWORKREPRESENTATIONPROPS() {
        return networkrepresentationprops;
    }

    /**
     * ??networkrepresentationprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public void setNETWORKREPRESENTATIONPROPS(SWDATADEFPROPS value) {
        this.networkrepresentationprops = value;
    }

    /**
     * ??systemsignalref?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNAL.SYSTEMSIGNALREF }
     *     
     */
    public ISIGNAL.SYSTEMSIGNALREF getSYSTEMSIGNALREF() {
        return systemsignalref;
    }

    /**
     * ??systemsignalref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNAL.SYSTEMSIGNALREF }
     *     
     */
    public void setSYSTEMSIGNALREF(ISIGNAL.SYSTEMSIGNALREF value) {
        this.systemsignalref = value;
    }

    /**
     * ??transformationisignalpropss?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNAL.TRANSFORMATIONISIGNALPROPSS }
     *     
     */
    public ISIGNAL.TRANSFORMATIONISIGNALPROPSS getTRANSFORMATIONISIGNALPROPSS() {
        return transformationisignalpropss;
    }

    /**
     * ??transformationisignalpropss?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNAL.TRANSFORMATIONISIGNALPROPSS }
     *     
     */
    public void setTRANSFORMATIONISIGNALPROPSS(ISIGNAL.TRANSFORMATIONISIGNALPROPSS value) {
        this.transformationisignalpropss = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="DATA-TRANSFORMATION-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}DATA-TRANSFORMATION-REF-CONDITIONAL"/>
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
        "datatransformationrefconditional"
    })
    public static class DATATRANSFORMATIONS {

        @XmlElement(name = "DATA-TRANSFORMATION-REF-CONDITIONAL")
        protected List<DATATRANSFORMATIONREFCONDITIONAL> datatransformationrefconditional;

        /**
         * Gets the value of the datatransformationrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datatransformationrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATATRANSFORMATIONREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DATATRANSFORMATIONREFCONDITIONAL }
         * 
         * 
         */
        public List<DATATRANSFORMATIONREFCONDITIONAL> getDATATRANSFORMATIONREFCONDITIONAL() {
            if (datatransformationrefconditional == null) {
                datatransformationrefconditional = new ArrayList<DATATRANSFORMATIONREFCONDITIONAL>();
            }
            return this.datatransformationrefconditional;
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="APPLICATION-RULE-BASED-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}APPLICATION-RULE-BASED-VALUE-SPECIFICATION"/>
     *         &lt;element name="APPLICATION-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}APPLICATION-VALUE-SPECIFICATION"/>
     *         &lt;element name="ARRAY-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}ARRAY-VALUE-SPECIFICATION"/>
     *         &lt;element name="CONSTANT-REFERENCE" type="{http://autosar.org/schema/r4.0}CONSTANT-REFERENCE"/>
     *         &lt;element name="NUMERICAL-RULE-BASED-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}NUMERICAL-RULE-BASED-VALUE-SPECIFICATION"/>
     *         &lt;element name="NUMERICAL-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}NUMERICAL-VALUE-SPECIFICATION"/>
     *         &lt;element name="RECORD-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}RECORD-VALUE-SPECIFICATION"/>
     *         &lt;element name="REFERENCE-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}REFERENCE-VALUE-SPECIFICATION"/>
     *         &lt;element name="TEXT-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}TEXT-VALUE-SPECIFICATION"/>
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
        "applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION"
    })
    public static class INITVALUE {

        @XmlElements({
            @XmlElement(name = "APPLICATION-RULE-BASED-VALUE-SPECIFICATION", type = APPLICATIONRULEBASEDVALUESPECIFICATION.class),
            @XmlElement(name = "APPLICATION-VALUE-SPECIFICATION", type = APPLICATIONVALUESPECIFICATION.class),
            @XmlElement(name = "ARRAY-VALUE-SPECIFICATION", type = ARRAYVALUESPECIFICATION.class),
            @XmlElement(name = "CONSTANT-REFERENCE", type = CONSTANTREFERENCE.class),
            @XmlElement(name = "NUMERICAL-RULE-BASED-VALUE-SPECIFICATION", type = NUMERICALRULEBASEDVALUESPECIFICATION.class),
            @XmlElement(name = "NUMERICAL-VALUE-SPECIFICATION", type = NUMERICALVALUESPECIFICATION.class),
            @XmlElement(name = "RECORD-VALUE-SPECIFICATION", type = RECORDVALUESPECIFICATION.class),
            @XmlElement(name = "REFERENCE-VALUE-SPECIFICATION", type = REFERENCEVALUESPECIFICATION.class),
            @XmlElement(name = "TEXT-VALUE-SPECIFICATION", type = TEXTVALUESPECIFICATION.class)
        })
        protected Object applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION;

        /**
         * ??applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONRULEBASEDVALUESPECIFICATION }
         *     {@link APPLICATIONVALUESPECIFICATION }
         *     {@link ARRAYVALUESPECIFICATION }
         *     {@link CONSTANTREFERENCE }
         *     {@link NUMERICALRULEBASEDVALUESPECIFICATION }
         *     {@link NUMERICALVALUESPECIFICATION }
         *     {@link RECORDVALUESPECIFICATION }
         *     {@link REFERENCEVALUESPECIFICATION }
         *     {@link TEXTVALUESPECIFICATION }
         *     
         */
        public Object getAPPLICATIONRULEBASEDVALUESPECIFICATIONOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION() {
            return applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION;
        }

        /**
         * ??applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONRULEBASEDVALUESPECIFICATION }
         *     {@link APPLICATIONVALUESPECIFICATION }
         *     {@link ARRAYVALUESPECIFICATION }
         *     {@link CONSTANTREFERENCE }
         *     {@link NUMERICALRULEBASEDVALUESPECIFICATION }
         *     {@link NUMERICALVALUESPECIFICATION }
         *     {@link RECORDVALUESPECIFICATION }
         *     {@link REFERENCEVALUESPECIFICATION }
         *     {@link TEXTVALUESPECIFICATION }
         *     
         */
        public void setAPPLICATIONRULEBASEDVALUESPECIFICATIONOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION(Object value) {
            this.applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SYSTEM-SIGNAL--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SYSTEMSIGNALREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SYSTEMSIGNALSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SYSTEMSIGNALSUBTYPESENUM }
         *     
         */
        public SYSTEMSIGNALSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SYSTEMSIGNALSUBTYPESENUM }
         *     
         */
        public void setDEST(SYSTEMSIGNALSUBTYPESENUM value) {
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
     *         &lt;element name="END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS" type="{http://autosar.org/schema/r4.0}END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS"/>
     *         &lt;element name="SOMEIP-TRANSFORMATION-I-SIGNAL-PROPS" type="{http://autosar.org/schema/r4.0}SOMEIP-TRANSFORMATION-I-SIGNAL-PROPS"/>
     *         &lt;element name="USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS" type="{http://autosar.org/schema/r4.0}USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS"/>
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
        "endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS"
    })
    public static class TRANSFORMATIONISIGNALPROPSS {

        @XmlElements({
            @XmlElement(name = "END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS", type = ENDTOENDTRANSFORMATIONISIGNALPROPS.class),
            @XmlElement(name = "SOMEIP-TRANSFORMATION-I-SIGNAL-PROPS", type = SOMEIPTRANSFORMATIONISIGNALPROPS.class),
            @XmlElement(name = "USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS", type = USERDEFINEDTRANSFORMATIONISIGNALPROPS.class)
        })
        protected List<Object> endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS;

        /**
         * Gets the value of the endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getENDTOENDTRANSFORMATIONISIGNALPROPSOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ENDTOENDTRANSFORMATIONISIGNALPROPS }
         * {@link SOMEIPTRANSFORMATIONISIGNALPROPS }
         * {@link USERDEFINEDTRANSFORMATIONISIGNALPROPS }
         * 
         * 
         */
        public List<Object> getENDTOENDTRANSFORMATIONISIGNALPROPSOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS() {
            if (endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS == null) {
                endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS = new ArrayList<Object>();
            }
            return this.endtoendtransformationisignalpropsOrSOMEIPTRANSFORMATIONISIGNALPROPSOrUSERDEFINEDTRANSFORMATIONISIGNALPROPS;
        }

    }

}
