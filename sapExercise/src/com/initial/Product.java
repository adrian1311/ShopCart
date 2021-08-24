package com.initial;

public abstract class Product {

    private String productName;
    private String productDescription;
    private int productAmount;
    private double productPrice;

    public Product(String productName, String productDescription, int productAmount,double productPrice ){
        this.productName = productName;
        this.productDescription = productDescription;
        this.productAmount = productAmount;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product --> " +
                "Product name ='" + productName + '\'' +
                ", Product description ='" + productDescription + '\'' +
                ", Product amount =" + productAmount +
                ", Product price =" + productPrice;
    }
}
