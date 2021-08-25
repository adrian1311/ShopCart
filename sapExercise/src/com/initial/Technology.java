package com.initial;

public class Technology extends Product {

    private int guarantee;

    public Technology(String productName, int productAmount, double productPrice, int guarantee) {
        super(productName, productAmount, productPrice);
        this.guarantee = guarantee;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    @Override
    public String toString() {
        return "Technology -->" +
                " NAME ='" + getProductName() + '\'' +
                ", AMOUNT ='" + getProductAmount() + '\'' +
                ", PRICE ='" + getProductPrice() + '\'' +
                ", GUARANTEE=" + guarantee;
    }
}
