
package com.yjcloud.health.vcard.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeaderInParm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BodyInParm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doService", propOrder = {
    "headerInParm",
    "bodyInParm"
})
public class DoService {

    @XmlElement(name = "HeaderInParm")
    protected String headerInParm;
    @XmlElement(name = "BodyInParm")
    protected String bodyInParm;

    /**
     * Gets the value of the headerInParm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderInParm() {
        return headerInParm;
    }

    /**
     * Sets the value of the headerInParm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderInParm(String value) {
        this.headerInParm = value;
    }

    /**
     * Gets the value of the bodyInParm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyInParm() {
        return bodyInParm;
    }

    /**
     * Sets the value of the bodyInParm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyInParm(String value) {
        this.bodyInParm = value;
    }

}
