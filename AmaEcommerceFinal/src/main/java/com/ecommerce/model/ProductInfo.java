package com.ecommerce.model;

import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.ecommerce.entity.Products;

public class ProductInfo {

	private String productCodeSku;
    private String productName;
    private double unitPrice;
    
    private boolean newProduct=false;
 
    // Upload file.
   // private CommonsMultipartFile fileData;
    private List<CommonsMultipartFile> fileData;
    
    private String productDescription;
    private String destFilePath;
    private String imageUrl;
    private List<String> imageUrlList;
    private int qty;
    private String fileNames;
    private String vendorUserName;
    public ProductInfo() {

    }
    
    public ProductInfo(Products products) {
    	this.productCodeSku = products.getProductCodeSku();
    	this.productName = products.getProductName();
    	this.unitPrice = products.getUnitPrice();
    	this.destFilePath= products.getDestFilePath();
    	this.productDescription=products.getProductDescription();
    	this.fileNames=products.getFileNames();
    	//this.newProduct = products.isNewProduct();
    	//this.fileData = products.getFileData();
    	
    }
    
    public ProductInfo(String productCodeSku,String productName,double unitPrice,boolean newProduct,CommonsMultipartFile fileData) {
    	this.productCodeSku = productCodeSku;
    	this.productName = productName;
    	this.unitPrice = unitPrice;
    	this.newProduct = newProduct;
    	//this.fileData = fileData;
    }

	public String getProductCodeSku() {
		return productCodeSku;
	}

	public void setProductCodeSku(String productCodeSku) {
		this.productCodeSku = productCodeSku;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public boolean isNewProduct() {
		return newProduct;
	}

	public void setNewProduct(boolean newProduct) {
		this.newProduct = newProduct;
	}

	public List<CommonsMultipartFile> getFileData() {
		return fileData;
	}

	public void setFileData(List<CommonsMultipartFile> fileData) {
		this.fileData = fileData;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getDestFilePath() {
		return destFilePath;
	}

	public void setDestFilePath(String destFilePath) {
		this.destFilePath = destFilePath;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<String> getImageUrlList() {
		return imageUrlList;
	}

	public void setImageUrlList(List<String> imageUrlList) {
		this.imageUrlList = imageUrlList;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getFileNames() {
		return fileNames;
	}

	public void setFileNames(String fileNames) {
		this.fileNames = fileNames;
	}

	public String getVendorUserName() {
		return vendorUserName;
	}

	public void setVendorUserName(String vendorUserName) {
		this.vendorUserName = vendorUserName;
	}
}
