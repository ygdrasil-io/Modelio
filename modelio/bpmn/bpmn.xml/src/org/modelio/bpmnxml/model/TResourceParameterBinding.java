/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>Java class for tResourceParameterBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tResourceParameterBinding">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}expression"/>
 * &lt;/sequence>
 * &lt;attribute name="parameterRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("aed066e4-47a1-4fb4-b183-060c613524cf")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResourceParameterBinding", propOrder = {
    "expression"
})
public class TResourceParameterBinding extends TBaseElement {
    @objid ("68bb3e53-996a-47ea-9d36-3376af2c7088")
    @XmlElementRef(name = "expression", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class)
    protected JAXBElement<? extends TExpression> expression;

    @objid ("62198024-63e0-4267-ac66-6b0557abac12")
    @XmlAttribute(name = "parameterRef", required = true)
    protected QName parameterRef;

    /**
     * Gets the value of the expression property.
     * @return
     * possible object is
     * {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @objid ("c564d1d2-d5c5-454e-82c9-b3af1ee9ea65")
    public JAXBElement<? extends TExpression> getExpression() {
        return this.expression;
    }

    /**
     * Sets the value of the expression property.
     * @param value allowed object is
     * {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @objid ("f9372218-d9d3-42ef-b8ae-fa2251f2d243")
    public void setExpression(JAXBElement<? extends TExpression> value) {
        this.expression = value;
    }

    /**
     * Gets the value of the parameterRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("becd3176-da5c-4634-979d-3d27896cd9b2")
    public QName getParameterRef() {
        return this.parameterRef;
    }

    /**
     * Sets the value of the parameterRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("d997271a-120b-4ea7-b21f-4b58e1bc96af")
    public void setParameterRef(QName value) {
        this.parameterRef = value;
    }

}
