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
 * Specifies a mapping between a ModeDeclarationGroup and an ImplementationDataType. This ImplementationDataType shall be used to implement the ModeDeclarationGroup.
 * 
 * <p>MODE-REQUEST-TYPE-MAP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MODE-REQUEST-TYPE-MAP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MODE-REQUEST-TYPE-MAP"/>
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
@XmlType(name = "MODE-REQUEST-TYPE-MAP", propOrder = {
    "implementationdatatyperef",
    "modegroupref"
})
public class MODEREQUESTTYPEMAP {

    @XmlElement(name = "IMPLEMENTATION-DATA-TYPE-REF")
    protected MODEREQUESTTYPEMAP.IMPLEMENTATIONDATATYPEREF implementationdatatyperef;
    @XmlElement(name = "MODE-GROUP-REF")
    protected MODEREQUESTTYPEMAP.MODEGROUPREF modegroupref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??implementationdatatyperef?????
     * 
     * @return
     *     possible object is
     *     {@link MODEREQUESTTYPEMAP.IMPLEMENTATIONDATATYPEREF }
     *     
     */
    public MODEREQUESTTYPEMAP.IMPLEMENTATIONDATATYPEREF getIMPLEMENTATIONDATATYPEREF() {
        return implementationdatatyperef;
    }

    /**
     * ??implementationdatatyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEREQUESTTYPEMAP.IMPLEMENTATIONDATATYPEREF }
     *     
     */
    public void setIMPLEMENTATIONDATATYPEREF(MODEREQUESTTYPEMAP.IMPLEMENTATIONDATATYPEREF value) {
        this.implementationdatatyperef = value;
    }

    /**
     * ??modegroupref?????
     * 
     * @return
     *     possible object is
     *     {@link MODEREQUESTTYPEMAP.MODEGROUPREF }
     *     
     */
    public MODEREQUESTTYPEMAP.MODEGROUPREF getMODEGROUPREF() {
        return modegroupref;
    }

    /**
     * ??modegroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEREQUESTTYPEMAP.MODEGROUPREF }
     *     
     */
    public void setMODEGROUPREF(MODEREQUESTTYPEMAP.MODEGROUPREF value) {
        this.modegroupref = value;
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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MODEGROUPREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MODEDECLARATIONGROUPSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MODEDECLARATIONGROUPSUBTYPESENUM }
         *     
         */
        public MODEDECLARATIONGROUPSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MODEDECLARATIONGROUPSUBTYPESENUM }
         *     
         */
        public void setDEST(MODEDECLARATIONGROUPSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
