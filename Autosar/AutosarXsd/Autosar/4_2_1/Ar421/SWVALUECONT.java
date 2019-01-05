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
 * This metaclass represents the content of one particular SwInstance.
 * 
 * <p>SW-VALUE-CONT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-VALUE-CONT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-VALUE-CONT"/>
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
@XmlType(name = "SW-VALUE-CONT", propOrder = {
    "unitref",
    "unitdisplayname",
    "swarraysize",
    "swvaluesphys"
})
public class SWVALUECONT {

    @XmlElement(name = "UNIT-REF")
    protected SWVALUECONT.UNITREF unitref;
    @XmlElement(name = "UNIT-DISPLAY-NAME")
    protected SINGLELANGUAGEUNITNAMES unitdisplayname;
    @XmlElement(name = "SW-ARRAYSIZE")
    protected VALUELIST swarraysize;
    @XmlElement(name = "SW-VALUES-PHYS")
    protected SWVALUES swvaluesphys;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??unitref?????
     * 
     * @return
     *     possible object is
     *     {@link SWVALUECONT.UNITREF }
     *     
     */
    public SWVALUECONT.UNITREF getUNITREF() {
        return unitref;
    }

    /**
     * ??unitref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWVALUECONT.UNITREF }
     *     
     */
    public void setUNITREF(SWVALUECONT.UNITREF value) {
        this.unitref = value;
    }

    /**
     * ??unitdisplayname?????
     * 
     * @return
     *     possible object is
     *     {@link SINGLELANGUAGEUNITNAMES }
     *     
     */
    public SINGLELANGUAGEUNITNAMES getUNITDISPLAYNAME() {
        return unitdisplayname;
    }

    /**
     * ??unitdisplayname?????
     * 
     * @param value
     *     allowed object is
     *     {@link SINGLELANGUAGEUNITNAMES }
     *     
     */
    public void setUNITDISPLAYNAME(SINGLELANGUAGEUNITNAMES value) {
        this.unitdisplayname = value;
    }

    /**
     * ??swarraysize?????
     * 
     * @return
     *     possible object is
     *     {@link VALUELIST }
     *     
     */
    public VALUELIST getSWARRAYSIZE() {
        return swarraysize;
    }

    /**
     * ??swarraysize?????
     * 
     * @param value
     *     allowed object is
     *     {@link VALUELIST }
     *     
     */
    public void setSWARRAYSIZE(VALUELIST value) {
        this.swarraysize = value;
    }

    /**
     * ??swvaluesphys?????
     * 
     * @return
     *     possible object is
     *     {@link SWVALUES }
     *     
     */
    public SWVALUES getSWVALUESPHYS() {
        return swvaluesphys;
    }

    /**
     * ??swvaluesphys?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWVALUES }
     *     
     */
    public void setSWVALUESPHYS(SWVALUES value) {
        this.swvaluesphys = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}UNIT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UNITREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected UNITSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link UNITSUBTYPESENUM }
         *     
         */
        public UNITSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link UNITSUBTYPESENUM }
         *     
         */
        public void setDEST(UNITSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
