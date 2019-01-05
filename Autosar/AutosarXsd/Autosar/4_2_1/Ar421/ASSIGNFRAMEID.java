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
 * Schedule entry for an  Assign Frame Id master request.
 * 
 * <p>ASSIGN-FRAME-ID complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ASSIGN-FRAME-ID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SCHEDULE-TABLE-ENTRY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-CONFIGURATION-ENTRY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ASSIGN-FRAME-ID"/>
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
@XmlType(name = "ASSIGN-FRAME-ID", propOrder = {
    "introduction",
    "delay",
    "positionintable",
    "assignedcontrollerref",
    "assignedframetriggeringref"
})
public class ASSIGNFRAMEID {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "DELAY")
    protected TIMEVALUE delay;
    @XmlElement(name = "POSITION-IN-TABLE")
    protected INTEGER positionintable;
    @XmlElement(name = "ASSIGNED-CONTROLLER-REF")
    protected Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF assignedcontrollerref;
    @XmlElement(name = "ASSIGNED-FRAME-TRIGGERING-REF")
    protected ASSIGNFRAMEID.ASSIGNEDFRAMETRIGGERINGREF assignedframetriggeringref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??delay?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getDELAY() {
        return delay;
    }

    /**
     * ??delay?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setDELAY(TIMEVALUE value) {
        this.delay = value;
    }

    /**
     * ??positionintable?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getPOSITIONINTABLE() {
        return positionintable;
    }

    /**
     * ??positionintable?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setPOSITIONINTABLE(INTEGER value) {
        this.positionintable = value;
    }

    /**
     * ??assignedcontrollerref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF }
     *     
     */
    public Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF getASSIGNEDCONTROLLERREF() {
        return assignedcontrollerref;
    }

    /**
     * ??assignedcontrollerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF }
     *     
     */
    public void setASSIGNEDCONTROLLERREF(Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF value) {
        this.assignedcontrollerref = value;
    }

    /**
     * ??assignedframetriggeringref?????
     * 
     * @return
     *     possible object is
     *     {@link ASSIGNFRAMEID.ASSIGNEDFRAMETRIGGERINGREF }
     *     
     */
    public ASSIGNFRAMEID.ASSIGNEDFRAMETRIGGERINGREF getASSIGNEDFRAMETRIGGERINGREF() {
        return assignedframetriggeringref;
    }

    /**
     * ??assignedframetriggeringref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ASSIGNFRAMEID.ASSIGNEDFRAMETRIGGERINGREF }
     *     
     */
    public void setASSIGNEDFRAMETRIGGERINGREF(ASSIGNFRAMEID.ASSIGNEDFRAMETRIGGERINGREF value) {
        this.assignedframetriggeringref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LIN-FRAME-TRIGGERING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ASSIGNEDFRAMETRIGGERINGREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected LINFRAMETRIGGERINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link LINFRAMETRIGGERINGSUBTYPESENUM }
         *     
         */
        public LINFRAMETRIGGERINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link LINFRAMETRIGGERINGSUBTYPESENUM }
         *     
         */
        public void setDEST(LINFRAMETRIGGERINGSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
