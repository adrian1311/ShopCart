package com.initial;

public class Food extends Product {

    private String type;

    public Food(String productName, String productDescription, int productAmount, double productPrice,String type) {
        super(productName, productDescription, productAmount, productPrice);
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
