package com.initial;

import java.util.ArrayList;

public class ShoppingCart {

    private double totalAmount;

    public ShoppingCart(){

    }

    public double calculateTotalPrice(ArrayList<Product> products) {
        double totalAmount = 0;
        for (int i = 0; i < products.size(); i++) {
            totalAmount += products.get(i).getProductAmount() >= 2 ? products.get(i).getProductAmount() * (products.get(i).getProductPrice() * 0.9) : products.get(i).getProductAmount() * products.get(i).getProductPrice();
        }
        return totalAmount > 100 ? totalAmount * 0.9 : totalAmount;
    }

    //METHOD FOR ADD PRODUCTS
    public ArrayList<Product> addProduct(Product product, ArrayList<Product> products) {
        products.add(product);
        return products;
    }

    //METHOD FOR REMOVE PRODUCTS BY NAME
    public void deleteProduct(Product product, ArrayList<Product> products){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getProductName().equals(product.getProductName())){
                products.remove(products.get(i));
            }
        }
    }

    // METHOD FOR PRINT PRODUCTS
    public void printProducts(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i+1 +" "+products.get(i));
        }
        //Print empty line
        System.out.println();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
