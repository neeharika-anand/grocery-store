


package com.javaproject.Model;

import java.io.InputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Product implements Serializable {

	private String prodId;
	private String prodName;
	private String prodType;
	private String prodInfo;
	private double prodPrice;
	private int prodQuantity;
	private InputStream prodImage;

	// Private constructor to be used by the builder
	private Product(Builder builder) {
		this.prodId = builder.prodId;
		this.prodName = builder.prodName;
		this.prodType = builder.prodType;
		this.prodInfo = builder.prodInfo;
		this.prodPrice = builder.prodPrice;
		this.prodQuantity = builder.prodQuantity;
		this.prodImage = builder.prodImage;
	}

	// Builder class
	public static class Builder {
		// Mandatory parameters
		private String prodId;

		// Optional parameters
		private String prodName;
		private String prodType;
		private String prodInfo;
		private double prodPrice;
		private int prodQuantity;
		private InputStream prodImage;

		public Builder(String prodId) {
			this.prodId = prodId;
		}

		public Builder prodName(String prodName) {
			this.prodName = prodName;
			return this;
		}

		public Builder prodType(String prodType) {
			this.prodType = prodType;
			return this;
		}

		public Builder prodInfo(String prodInfo) {
			this.prodInfo = prodInfo;
			return this;
		}

		public Builder prodPrice(double prodPrice) {
			this.prodPrice = prodPrice;
			return this;
		}

		public Builder prodQuantity(int prodQuantity) {
			this.prodQuantity = prodQuantity;
			return this;
		}

		public Builder prodImage(InputStream prodImage) {
			this.prodImage = prodImage;
			return this;
		}

		public Product build() {
			return new Product(this);
		}
	}

	// Getters and setters remain unchanged

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdType() {
		return prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public String getProdInfo() {
		return prodInfo;
	}

	public void setProdInfo(String prodInfo) {
		this.prodInfo = prodInfo;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getProdQuantity() {
		return prodQuantity;
	}

	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}

	public InputStream getProdImage() {
		return prodImage;
	}

	public void setProdImage(InputStream prodImage) {
		this.prodImage = prodImage;
	}
}
