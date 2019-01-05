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
 * Specifies the general needs on the configuration of the  Diagnostic Communication Manager (DCM) which are not related to a particular item (e.g. a PID). The main use case is the mapping of service ports to the DCM which are not related to a particular item.
 * 
 * In the case of using a sender receiver communicated value, the related value shall be taken via assignedData in the role "signalBasedDiagnostics".
 * 
 * In case of using a client/server communicated value, the related value shall be communicated via the port referenced by asssignedPort. The details of this communication (e.g. appropriate naming conventions) are specified in the related software specifications (SWS).
 * 
 * <p>DIAGNOSTIC-VALUE-NEEDS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-VALUE-NEEDS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SERVICE-NEEDS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CAPABILITY-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-VALUE-NEEDS"/>
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
@XmlType(name = "DIAGNOSTIC-VALUE-NEEDS", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "audiences",
    "diagrequirement",
    "securityaccesslevel",
    "datalength",
    "diagnosticvalueaccess",
    "didnumber",
    "fixedlength",
    "processingstyle"
})
public class DIAGNOSTICVALUENEEDS {

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
    @XmlElement(name = "AUDIENCES")
    protected Ar421.DIAGNOSTICSTORAGECONDITIONNEEDS.AUDIENCES audiences;
    @XmlElement(name = "DIAG-REQUIREMENT")
    protected DIAGREQUIREMENTIDSTRING diagrequirement;
    @XmlElement(name = "SECURITY-ACCESS-LEVEL")
    protected POSITIVEINTEGER securityaccesslevel;
    @XmlElement(name = "DATA-LENGTH")
    protected POSITIVEINTEGER datalength;
    @XmlElement(name = "DIAGNOSTIC-VALUE-ACCESS")
    protected DIAGNOSTICVALUEACCESSENUM diagnosticvalueaccess;
    @XmlElement(name = "DID-NUMBER")
    protected POSITIVEINTEGER didnumber;
    @XmlElement(name = "FIXED-LENGTH")
    protected BOOLEAN fixedlength;
    @XmlElement(name = "PROCESSING-STYLE")
    protected DIAGNOSTICPROCESSINGSTYLEENUM processingstyle;
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
     * ??audiences?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.DIAGNOSTICSTORAGECONDITIONNEEDS.AUDIENCES }
     *     
     */
    public Ar421.DIAGNOSTICSTORAGECONDITIONNEEDS.AUDIENCES getAUDIENCES() {
        return audiences;
    }

    /**
     * ??audiences?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.DIAGNOSTICSTORAGECONDITIONNEEDS.AUDIENCES }
     *     
     */
    public void setAUDIENCES(Ar421.DIAGNOSTICSTORAGECONDITIONNEEDS.AUDIENCES value) {
        this.audiences = value;
    }

    /**
     * ??diagrequirement?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGREQUIREMENTIDSTRING }
     *     
     */
    public DIAGREQUIREMENTIDSTRING getDIAGREQUIREMENT() {
        return diagrequirement;
    }

    /**
     * ??diagrequirement?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGREQUIREMENTIDSTRING }
     *     
     */
    public void setDIAGREQUIREMENT(DIAGREQUIREMENTIDSTRING value) {
        this.diagrequirement = value;
    }

    /**
     * ??securityaccesslevel?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSECURITYACCESSLEVEL() {
        return securityaccesslevel;
    }

    /**
     * ??securityaccesslevel?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSECURITYACCESSLEVEL(POSITIVEINTEGER value) {
        this.securityaccesslevel = value;
    }

    /**
     * ??datalength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDATALENGTH() {
        return datalength;
    }

    /**
     * ??datalength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDATALENGTH(POSITIVEINTEGER value) {
        this.datalength = value;
    }

    /**
     * ??diagnosticvalueaccess?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICVALUEACCESSENUM }
     *     
     */
    public DIAGNOSTICVALUEACCESSENUM getDIAGNOSTICVALUEACCESS() {
        return diagnosticvalueaccess;
    }

    /**
     * ??diagnosticvalueaccess?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICVALUEACCESSENUM }
     *     
     */
    public void setDIAGNOSTICVALUEACCESS(DIAGNOSTICVALUEACCESSENUM value) {
        this.diagnosticvalueaccess = value;
    }

    /**
     * ??didnumber?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDIDNUMBER() {
        return didnumber;
    }

    /**
     * ??didnumber?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDIDNUMBER(POSITIVEINTEGER value) {
        this.didnumber = value;
    }

    /**
     * ??fixedlength?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getFIXEDLENGTH() {
        return fixedlength;
    }

    /**
     * ??fixedlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setFIXEDLENGTH(BOOLEAN value) {
        this.fixedlength = value;
    }

    /**
     * ??processingstyle?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICPROCESSINGSTYLEENUM }
     *     
     */
    public DIAGNOSTICPROCESSINGSTYLEENUM getPROCESSINGSTYLE() {
        return processingstyle;
    }

    /**
     * ??processingstyle?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICPROCESSINGSTYLEENUM }
     *     
     */
    public void setPROCESSINGSTYLE(DIAGNOSTICPROCESSINGSTYLEENUM value) {
        this.processingstyle = value;
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
