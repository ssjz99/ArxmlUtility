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
 * This BaseType is defined directly (as opposite to a derived BaseType)
 * 
 * <p>BASE-TYPE-DIRECT-DEFINITION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BASE-TYPE-DIRECT-DEFINITION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BASE-TYPE-DEFINITION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BASE-TYPE-DIRECT-DEFINITION"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BASE-TYPE-DIRECT-DEFINITION", propOrder = {
    "basetypesize",
    "maxbasetypesize",
    "basetypeencoding",
    "memalignment",
    "byteorder",
    "nativedeclaration"
})
public class BASETYPEDIRECTDEFINITION {

    @XmlElement(name = "BASE-TYPE-SIZE")
    protected POSITIVEINTEGER basetypesize;
    @XmlElement(name = "MAX-BASE-TYPE-SIZE")
    protected POSITIVEINTEGER maxbasetypesize;
    @XmlElement(name = "BASE-TYPE-ENCODING")
    protected BASETYPEENCODINGSTRING basetypeencoding;
    @XmlElement(name = "MEM-ALIGNMENT")
    protected POSITIVEINTEGER memalignment;
    @XmlElement(name = "BYTE-ORDER")
    protected BYTEORDERENUM byteorder;
    @XmlElement(name = "NATIVE-DECLARATION")
    protected NATIVEDECLARATIONSTRING nativedeclaration;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??basetypesize?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getBASETYPESIZE() {
        return basetypesize;
    }

    /**
     * ??basetypesize?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setBASETYPESIZE(POSITIVEINTEGER value) {
        this.basetypesize = value;
    }

    /**
     * ??maxbasetypesize?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXBASETYPESIZE() {
        return maxbasetypesize;
    }

    /**
     * ??maxbasetypesize?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXBASETYPESIZE(POSITIVEINTEGER value) {
        this.maxbasetypesize = value;
    }

    /**
     * ??basetypeencoding?????
     * 
     * @return
     *     possible object is
     *     {@link BASETYPEENCODINGSTRING }
     *     
     */
    public BASETYPEENCODINGSTRING getBASETYPEENCODING() {
        return basetypeencoding;
    }

    /**
     * ??basetypeencoding?????
     * 
     * @param value
     *     allowed object is
     *     {@link BASETYPEENCODINGSTRING }
     *     
     */
    public void setBASETYPEENCODING(BASETYPEENCODINGSTRING value) {
        this.basetypeencoding = value;
    }

    /**
     * ??memalignment?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMEMALIGNMENT() {
        return memalignment;
    }

    /**
     * ??memalignment?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMEMALIGNMENT(POSITIVEINTEGER value) {
        this.memalignment = value;
    }

    /**
     * ??byteorder?????
     * 
     * @return
     *     possible object is
     *     {@link BYTEORDERENUM }
     *     
     */
    public BYTEORDERENUM getBYTEORDER() {
        return byteorder;
    }

    /**
     * ??byteorder?????
     * 
     * @param value
     *     allowed object is
     *     {@link BYTEORDERENUM }
     *     
     */
    public void setBYTEORDER(BYTEORDERENUM value) {
        this.byteorder = value;
    }

    /**
     * ??nativedeclaration?????
     * 
     * @return
     *     possible object is
     *     {@link NATIVEDECLARATIONSTRING }
     *     
     */
    public NATIVEDECLARATIONSTRING getNATIVEDECLARATION() {
        return nativedeclaration;
    }

    /**
     * ??nativedeclaration?????
     * 
     * @param value
     *     allowed object is
     *     {@link NATIVEDECLARATIONSTRING }
     *     
     */
    public void setNATIVEDECLARATION(NATIVEDECLARATIONSTRING value) {
        this.nativedeclaration = value;
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
