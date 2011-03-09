//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.15 at 02:57:18 PM BRST 
//

package com.buscape.developer.result.type;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.annotations.SerializedName;

/**
 * <p>
 * Java class for UserOpinionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UserOpinionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thumbnail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{urn:buscape}CommentType"/>
 *         &lt;element name="rating" type="{urn:buscape}RatingType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hasProduct" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RecommendProduct" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserOpinionType", propOrder = { "title", "author", "productName", "thumbnail", "comment", "rating" })
public class UserOpinionType implements Serializable {

	private final static long serialVersionUID = 1L;
	
	@XmlElement(required = true)
	@SerializedName("title")
	protected String title;
	
	@XmlElement(required = true)
	@SerializedName("author")
	protected String author;
	
	@XmlElement(required = true)
	@SerializedName("productname")
	protected String productName;
	
	@XmlElement(required = true)
	@SerializedName("thumbnail")
	protected String thumbnail;
	
	@XmlElement(required = true)
	@SerializedName("comment")
	protected CommentType comment;
	
	@XmlElement(required = true)
	@SerializedName("rating")
	protected RatingType rating;
	
	@XmlAttribute(required = true)
	@SerializedName("hasproduct")
	protected boolean hasProduct;
	
	@XmlAttribute(name = "RecommendProduct", required = true)
	@SerializedName("recommendproduct")
	protected boolean recommendProduct;
	
	@XmlAttribute(required = true)
	@XmlSchemaType(name = "dateTime")
	@SerializedName("date")
	protected XMLGregorianCalendar date;
	
	@XmlAttribute
	@SerializedName("id")
	protected Integer id;

	/**
	 * Gets the value of the title property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitle(String value) {
		this.title = value;
	}

	/**
	 * Gets the value of the author property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the value of the author property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAuthor(String value) {
		this.author = value;
	}

	/**
	 * Gets the value of the productName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the value of the productName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductName(String value) {
		this.productName = value;
	}

	/**
	 * Gets the value of the thumbnail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThumbnail() {
		return thumbnail;
	}

	/**
	 * Sets the value of the thumbnail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setThumbnail(String value) {
		this.thumbnail = value;
	}

	/**
	 * Gets the value of the comment property.
	 * 
	 * @return possible object is {@link CommentType }
	 * 
	 */
	public CommentType getComment() {
		return comment;
	}

	/**
	 * Sets the value of the comment property.
	 * 
	 * @param value
	 *            allowed object is {@link CommentType }
	 * 
	 */
	public void setComment(CommentType value) {
		this.comment = value;
	}

	/**
	 * Gets the value of the rating property.
	 * 
	 * @return possible object is {@link RatingType }
	 * 
	 */
	public RatingType getRating() {
		return rating;
	}

	/**
	 * Sets the value of the rating property.
	 * 
	 * @param value
	 *            allowed object is {@link RatingType }
	 * 
	 */
	public void setRating(RatingType value) {
		this.rating = value;
	}

	/**
	 * Gets the value of the hasProduct property.
	 * 
	 */
	public boolean isHasProduct() {
		return hasProduct;
	}

	/**
	 * Sets the value of the hasProduct property.
	 * 
	 */
	public void setHasProduct(boolean value) {
		this.hasProduct = value;
	}

	/**
	 * Gets the value of the recommendProduct property.
	 * 
	 */
	public boolean isRecommendProduct() {
		return recommendProduct;
	}

	/**
	 * Sets the value of the recommendProduct property.
	 * 
	 */
	public void setRecommendProduct(boolean value) {
		this.recommendProduct = value;
	}

	/**
	 * Gets the value of the date property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDate() {
		return date;
	}

	/**
	 * Sets the value of the date property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDate(XMLGregorianCalendar value) {
		this.date = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setId(Integer value) {
		this.id = value;
	}

}
