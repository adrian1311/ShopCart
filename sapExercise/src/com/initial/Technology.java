package com.initial;

public class Technology extends Product {

    private int guarantee;

    public Technology(String productName, String productDescription, int productAmount, double productPrice, int guarantee) {
        super(productName, productDescription, productAmount, productPrice);
        this.guarantee = guarantee;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }
}
