package com.initial;

public class Food extends Product {

    private String type;

    public Food(String productName, int productAmount, double productPrice,String type) {
        super(productName, productAmount, productPrice);
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Food -->" +
                "  NAME : '" + getProductName() + '\'' +
                ", AMOUNT : '" + getProductAmount() + '\'' +
                ", PRICE : '" + getProductPrice() + '\'' +
                ", TYPE : '" + type + '\'';
    }
}
