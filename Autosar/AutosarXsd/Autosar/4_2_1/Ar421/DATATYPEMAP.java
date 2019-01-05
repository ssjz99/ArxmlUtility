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
 * This class represents the relationship between ApplicationDataType and its implementing ImplementationDataType.
 * 
 * <p>DATA-TYPE-MAP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DATA-TYPE-MAP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DATA-TYPE-MAP"/>
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
@XmlType(name = "DATA-TYPE-MAP", propOrder = {
    "applicationdatatyperef",
    "implementationdatatyperef"
})
public class DATATYPEMAP {

    @XmlElement(name = "APPLICATION-DATA-TYPE-REF")
    protected DATATYPEMAP.APPLICATIONDATATYPEREF applicationdatatyperef;
    @XmlElement(name = "IMPLEMENTATION-DATA-TYPE-REF")
    protected DATATYPEMAP.IMPLEMENTATIONDATATYPEREF implementationdatatyperef;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??applicationdatatyperef?????
     * 
     * @return
     *     possible object is
     *     {@link DATATYPEMAP.APPLICATIONDATATYPEREF }
     *     
     */
    public DATATYPEMAP.APPLICATIONDATATYPEREF getAPPLICATIONDATATYPEREF() {
        return applicationdatatyperef;
    }

    /**
     * ??applicationdatatyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATATYPEMAP.APPLICATIONDATATYPEREF }
     *     
     */
    public void setAPPLICATIONDATATYPEREF(DATATYPEMAP.APPLICATIONDATATYPEREF value) {
        this.applicationdatatyperef = value;
    }

    /**
     * ??implementationdatatyperef?????
     * 
     * @return
     *     possible object is
     *     {@link DATATYPEMAP.IMPLEMENTATIONDATATYPEREF }
     *     
     */
    public DATATYPEMAP.IMPLEMENTATIONDATATYPEREF getIMPLEMENTATIONDATATYPEREF() {
        return implementationdatatyperef;
    }

    /**
     * ??implementationdatatyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATATYPEMAP.IMPLEMENTATIONDATATYPEREF }
     *     
     */
    public void setIMPLEMENTATIONDATATYPEREF(DATATYPEMAP.IMPLEMENTATIONDATATYPEREF value) {
        this.implementationdatatyperef = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}APPLICATION-DATA-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class APPLICATIONDATATYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected APPLICATIONDATATYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONDATATYPESUBTYPESENUM }
         *     
         */
        public APPLICATIONDATATYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONDATATYPESUBTYPESENUM }
         *     
         */
        public void setDEST(APPLICATIONDATATYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IMPLEMENTATIONDATATYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected IMPLEMENTATIONDATATYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link IMPLEMENTATIONDATATYPESUBTYPESENUM }
         *     
         */
        public IMPLEMENTATIONDATATYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link IMPLEMENTATIONDATATYPESUBTYPESENUM }
         *     
         */
        public void setDEST(IMPLEMENTATIONDATATYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
