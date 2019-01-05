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
 * Defines the mapping of two particular ModeDeclarationGroupPrototypes (in the given context) that are unequally named and/or require a reference to a ModeDeclarationMappingSet in order to become compatible by definition of ModeDeclarationMappings.
 * 
 * <p>MODE-DECLARATION-GROUP-PROTOTYPE-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MODE-DECLARATION-GROUP-PROTOTYPE-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP-PROTOTYPE-MAPPING"/>
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
@XmlType(name = "MODE-DECLARATION-GROUP-PROTOTYPE-MAPPING", propOrder = {
    "firstmodegroupref",
    "modedeclarationmappingsetref",
    "secondmodegroupref"
})
public class MODEDECLARATIONGROUPPROTOTYPEMAPPING {

    @XmlElement(name = "FIRST-MODE-GROUP-REF")
    protected MODEDECLARATIONGROUPPROTOTYPEMAPPING.FIRSTMODEGROUPREF firstmodegroupref;
    @XmlElement(name = "MODE-DECLARATION-MAPPING-SET-REF")
    protected MODEDECLARATIONGROUPPROTOTYPEMAPPING.MODEDECLARATIONMAPPINGSETREF modedeclarationmappingsetref;
    @XmlElement(name = "SECOND-MODE-GROUP-REF")
    protected MODEDECLARATIONGROUPPROTOTYPEMAPPING.SECONDMODEGROUPREF secondmodegroupref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??firstmodegroupref?????
     * 
     * @return
     *     possible object is
     *     {@link MODEDECLARATIONGROUPPROTOTYPEMAPPING.FIRSTMODEGROUPREF }
     *     
     */
    public MODEDECLARATIONGROUPPROTOTYPEMAPPING.FIRSTMODEGROUPREF getFIRSTMODEGROUPREF() {
        return firstmodegroupref;
    }

    /**
     * ??firstmodegroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEDECLARATIONGROUPPROTOTYPEMAPPING.FIRSTMODEGROUPREF }
     *     
     */
    public void setFIRSTMODEGROUPREF(MODEDECLARATIONGROUPPROTOTYPEMAPPING.FIRSTMODEGROUPREF value) {
        this.firstmodegroupref = value;
    }

    /**
     * ??modedeclarationmappingsetref?????
     * 
     * @return
     *     possible object is
     *     {@link MODEDECLARATIONGROUPPROTOTYPEMAPPING.MODEDECLARATIONMAPPINGSETREF }
     *     
     */
    public MODEDECLARATIONGROUPPROTOTYPEMAPPING.MODEDECLARATIONMAPPINGSETREF getMODEDECLARATIONMAPPINGSETREF() {
        return modedeclarationmappingsetref;
    }

    /**
     * ??modedeclarationmappingsetref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEDECLARATIONGROUPPROTOTYPEMAPPING.MODEDECLARATIONMAPPINGSETREF }
     *     
     */
    public void setMODEDECLARATIONMAPPINGSETREF(MODEDECLARATIONGROUPPROTOTYPEMAPPING.MODEDECLARATIONMAPPINGSETREF value) {
        this.modedeclarationmappingsetref = value;
    }

    /**
     * ??secondmodegroupref?????
     * 
     * @return
     *     possible object is
     *     {@link MODEDECLARATIONGROUPPROTOTYPEMAPPING.SECONDMODEGROUPREF }
     *     
     */
    public MODEDECLARATIONGROUPPROTOTYPEMAPPING.SECONDMODEGROUPREF getSECONDMODEGROUPREF() {
        return secondmodegroupref;
    }

    /**
     * ??secondmodegroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEDECLARATIONGROUPPROTOTYPEMAPPING.SECONDMODEGROUPREF }
     *     
     */
    public void setSECONDMODEGROUPREF(MODEDECLARATIONGROUPPROTOTYPEMAPPING.SECONDMODEGROUPREF value) {
        this.secondmodegroupref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FIRSTMODEGROUPREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM }
         *     
         */
        public MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-MAPPING-SET--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MODEDECLARATIONMAPPINGSETREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MODEDECLARATIONMAPPINGSETSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MODEDECLARATIONMAPPINGSETSUBTYPESENUM }
         *     
         */
        public MODEDECLARATIONMAPPINGSETSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MODEDECLARATIONMAPPINGSETSUBTYPESENUM }
         *     
         */
        public void setDEST(MODEDECLARATIONMAPPINGSETSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SECONDMODEGROUPREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM }
         *     
         */
        public MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
