package com.initial;

import java.util.Objects;

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
                " NAME :'" + getProductName() + '\'' +
                ", AMOUNT : '" + getProductAmount() + '\'' +
                ", PRICE : '" + getProductPrice() + '\'' +
                ", GUARANTEE : " + guarantee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Technology that = (Technology) o;
        return guarantee == that.guarantee;
    }

    @Override
    public int hashCode() {
        return Objects.hash(guarantee);
    }
}
