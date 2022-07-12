package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int productID;
	private String productName;
	private int productCost;

	public Product() {
		super();
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	public Product(int productID, String productName, int productCost) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}

}