package com.initial;

public class Home extends Product {

    private String color;

    public Home(String productName, String productDescription, int productAmount, double productPrice,String color) {
        super(productName, productDescription, productAmount, productPrice);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
