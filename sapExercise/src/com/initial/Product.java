package com.initial;

public abstract class Product {

    private String productName;
    private int productAmount;
    private double productPrice;

    public Product(String productName,int productAmount,double productPrice ){
        this.productName = productName;
        this.productAmount = productAmount;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
                "  NAME ='" + productName + '\'' +
                ", AMOUNT =" + productAmount +
                ", PRICE =" + productPrice;
    }
}
