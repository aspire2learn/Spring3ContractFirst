//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.10 at 03:39:23 PM IST 
//


package com.spring.ws.demo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="empId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "empId"
})
@XmlRootElement(name = "EmployeeRequest")
public class EmployeeRequest {

    @XmlElement(required = true)
    protected String empId;

    /**
     * Gets the value of the empId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * Sets the value of the empId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpId(String value) {
        this.empId = value;
    }

}
