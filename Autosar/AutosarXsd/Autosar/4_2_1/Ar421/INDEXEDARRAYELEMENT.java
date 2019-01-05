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
 * This element represents exactly one indexed element in the array.  Either the applicationArrayElement or implementationArrayElement reference shall be used.
 * 
 * <p>INDEXED-ARRAY-ELEMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="INDEXED-ARRAY-ELEMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INDEXED-ARRAY-ELEMENT"/>
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
@XmlType(name = "INDEXED-ARRAY-ELEMENT", propOrder = {
    "applicationarrayelementref",
    "implementationarrayelementref",
    "index"
})
public class INDEXEDARRAYELEMENT {

    @XmlElement(name = "APPLICATION-ARRAY-ELEMENT-REF")
    protected INDEXEDARRAYELEMENT.APPLICATIONARRAYELEMENTREF applicationarrayelementref;
    @XmlElement(name = "IMPLEMENTATION-ARRAY-ELEMENT-REF")
    protected INDEXEDARRAYELEMENT.IMPLEMENTATIONARRAYELEMENTREF implementationarrayelementref;
    @XmlElement(name = "INDEX")
    protected INTEGER index;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??applicationarrayelementref?????
     * 
     * @return
     *     possible object is
     *     {@link INDEXEDARRAYELEMENT.APPLICATIONARRAYELEMENTREF }
     *     
     */
    public INDEXEDARRAYELEMENT.APPLICATIONARRAYELEMENTREF getAPPLICATIONARRAYELEMENTREF() {
        return applicationarrayelementref;
    }

    /**
     * ??applicationarrayelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link INDEXEDARRAYELEMENT.APPLICATIONARRAYELEMENTREF }
     *     
     */
    public void setAPPLICATIONARRAYELEMENTREF(INDEXEDARRAYELEMENT.APPLICATIONARRAYELEMENTREF value) {
        this.applicationarrayelementref = value;
    }

    /**
     * ??implementationarrayelementref?????
     * 
     * @return
     *     possible object is
     *     {@link INDEXEDARRAYELEMENT.IMPLEMENTATIONARRAYELEMENTREF }
     *     
     */
    public INDEXEDARRAYELEMENT.IMPLEMENTATIONARRAYELEMENTREF getIMPLEMENTATIONARRAYELEMENTREF() {
        return implementationarrayelementref;
    }

    /**
     * ??implementationarrayelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link INDEXEDARRAYELEMENT.IMPLEMENTATIONARRAYELEMENTREF }
     *     
     */
    public void setIMPLEMENTATIONARRAYELEMENTREF(INDEXEDARRAYELEMENT.IMPLEMENTATIONARRAYELEMENTREF value) {
        this.implementationarrayelementref = value;
    }

    /**
     * ??index?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getINDEX() {
        return index;
    }

    /**
     * ??index?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setINDEX(INTEGER value) {
        this.index = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}APPLICATION-ARRAY-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class APPLICATIONARRAYELEMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected APPLICATIONARRAYELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONARRAYELEMENTSUBTYPESENUM }
         *     
         */
        public APPLICATIONARRAYELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONARRAYELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(APPLICATIONARRAYELEMENTSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IMPLEMENTATIONARRAYELEMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM }
         *     
         */
        public IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
