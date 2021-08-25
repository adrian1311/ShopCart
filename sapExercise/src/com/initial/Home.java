package com.initial;

public class Home extends Product {

    private String color;

    public Home(String productName, int productAmount, double productPrice,String color) {
        super(productName, productAmount, productPrice);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Home -->" +
                " NAME : '" + getProductName() + '\'' +
                ", AMOUNT : '" + getProductAmount() + '\'' +
                ", PRICE  :'" + getProductPrice() + '\'' +
                ", COLOR : '" + color + '\'';
    }
}
