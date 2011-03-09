//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.15 at 02:57:18 PM BRST 
//

package com.buscape.developer.result.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.google.gson.annotations.SerializedName;

/**
 * <p>
 * Java class for FullProductType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="FullProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{urn:buscape}ProductType"/>
 *         &lt;element name="offers" type="{urn:buscape}OfferType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullProductType", propOrder = { "product", "offers" })
public class FullProductType implements Serializable {

	private final static long serialVersionUID = 1L;
	
	@XmlElement(required = true)
	@SerializedName("product")
	protected ProductType product;
	
	@SerializedName("offers")
	protected List<OfferType> offers;

	/**
	 * Gets the value of the product property.
	 * 
	 * @return possible object is {@link ProductType }
	 * 
	 */
	public ProductType getProduct() {
		return product;
	}

	/**
	 * Sets the value of the product property.
	 * 
	 * @param value
	 *            allowed object is {@link ProductType }
	 * 
	 */
	public void setProduct(ProductType value) {
		this.product = value;
	}

	/**
	 * Gets the value of the offers property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the offers property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOffers().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link OfferType }
	 * 
	 * 
	 */
	public List<OfferType> getOffers() {
		if (offers == null) {
			offers = new ArrayList<OfferType>();
		}
		return this.offers;
	}

}
