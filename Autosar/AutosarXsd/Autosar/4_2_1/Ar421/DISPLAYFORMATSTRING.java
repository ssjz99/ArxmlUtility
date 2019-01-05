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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This is a display format specifier for the display of values  e.g. in documents or in measurement and calibration systems. 
 * 
 * The display format specifier is a subset of the ANSI C printf specifiers with the following
 * form:
 * 
 *   % [flags] [width] [.prec] type character 
 * 
 * For more details refer to "ASAM-HarmonizedDataObjects-V1.1.pdf" chapter 13.3.2 DISPLAY OF DATA. 
 * 
 * Due to the numerical nature of value settings, only the following type characters are allowed:
 * 
 * * d:  Signed decimal integer 
 * * i:  Signed decimal integer 
 * * o:  Unsigned octal integer 
 * * u:  Unsigned decimal integer 
 * * x:  Unsigned hexadecimal integer, using "abcdef" 
 * * X:  Unsigned hexadecimal integer, using "ABCDEF" 
 * * e:  Signed value having the form [-]d.dddd e [sign]ddd where d is a single decimal digit, dddd is one or more decimal digits, ddd is exactly three decimal digits, and sign is + or - 
 * * E:  Identical to the e format except that E rather than e introduces the exponent 
 * * f:  Signed value having the form [-]dddd.dddd, where dddd is one or more decimal digits; the number of digits before the decimal point depends on the magnitude of the number, and the number of digits after the decimal point depends on the requested precision 
 * * g:  Signed value printed in f or e format, whichever is more compact for the given value and precision; trailing zeros are truncated, and the decimal point appears only if one or more digits follow it 
 * * G:  Identical to the g format, except that E, rather than e, introduces the exponent (where appropriate)
 * 
 * <p>DISPLAY-FORMAT-STRING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DISPLAY-FORMAT-STRING">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>DISPLAY-FORMAT-STRING--SIMPLE">
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISPLAY-FORMAT-STRING", propOrder = {
    "value"
})
public class DISPLAYFORMATSTRING {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
