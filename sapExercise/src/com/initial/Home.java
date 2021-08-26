package com.initial;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Home home = (Home) o;
        return color.equals(home.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
