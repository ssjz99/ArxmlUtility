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
import javax.xml.bind.annotation.XmlType;


/**
 * An IncludedModeDeclarationGroupSet declares that a set of ModeDeclarationGroups used by the software component for its implementation and consequently these ModeDeclarationGroups become part of the contract.
 * 
 * <p>INCLUDED-MODE-DECLARATION-GROUP-SET complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="INCLUDED-MODE-DECLARATION-GROUP-SET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INCLUDED-MODE-DECLARATION-GROUP-SET"/>
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
@XmlType(name = "INCLUDED-MODE-DECLARATION-GROUP-SET", propOrder = {
    "modedeclarationgrouprefs",
    "prefix"
})
public class INCLUDEDMODEDECLARATIONGROUPSET {

    @XmlElement(name = "MODE-DECLARATION-GROUP-REFS")
    protected INCLUDEDMODEDECLARATIONGROUPSET.MODEDECLARATIONGROUPREFS modedeclarationgrouprefs;
    @XmlElement(name = "PREFIX")
    protected IDENTIFIER prefix;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??modedeclarationgrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link INCLUDEDMODEDECLARATIONGROUPSET.MODEDECLARATIONGROUPREFS }
     *     
     */
    public INCLUDEDMODEDECLARATIONGROUPSET.MODEDECLARATIONGROUPREFS getMODEDECLARATIONGROUPREFS() {
        return modedeclarationgrouprefs;
    }

    /**
     * ??modedeclarationgrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link INCLUDEDMODEDECLARATIONGROUPSET.MODEDECLARATIONGROUPREFS }
     *     
     */
    public void setMODEDECLARATIONGROUPREFS(INCLUDEDMODEDECLARATIONGROUPSET.MODEDECLARATIONGROUPREFS value) {
        this.modedeclarationgrouprefs = value;
    }

    /**
     * ??prefix?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getPREFIX() {
        return prefix;
    }

    /**
     * ??prefix?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setPREFIX(IDENTIFIER value) {
        this.prefix = value;
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
     *         &lt;element name="MODE-DECLARATION-GROUP-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "modedeclarationgroupref"
    })
    public static class MODEDECLARATIONGROUPREFS {

        @XmlElement(name = "MODE-DECLARATION-GROUP-REF")
        protected List<INCLUDEDMODEDECLARATIONGROUPSET.MODEDECLARATIONGROUPREFS.MODEDECLARATIONGROUPREF> modedeclarationgroupref;

        /**
         * Gets the value of the modedeclarationgroupref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modedeclarationgroupref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEDECLARATIONGROUPREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INCLUDEDMODEDECLARATIONGROUPSET.MODEDECLARATIONGROUPREFS.MODEDECLARATIONGROUPREF }
         * 
         * 
         */
        public List<INCLUDEDMODEDECLARATIONGROUPSET.MODEDECLARATIONGROUPREFS.MODEDECLARATIONGROUPREF> getMODEDECLARATIONGROUPREF() {
            if (modedeclarationgroupref == null) {
                modedeclarationgroupref = new ArrayList<INCLUDEDMODEDECLARATIONGROUPSET.MODEDECLARATIONGROUPREFS.MODEDECLARATIONGROUPREF>();
            }
            return this.modedeclarationgroupref;
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
        public static class MODEDECLARATIONGROUPREF
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

}
