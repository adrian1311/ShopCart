package com.initial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {

    private double totalAmount;

    public ShoppingCart(){

    }

    public double calculateTotalPrice(List<Product> products) {
        double totalAmount = 0;
        for (int i = 0; i < products.size(); i++) {
            totalAmount += products.get(i).getProductAmount() >= 2 ? products.get(i).getProductAmount() * (products.get(i).getProductPrice() * 0.9) : products.get(i).getProductAmount() * products.get(i).getProductPrice();

        }
        return totalAmount > 100 ? totalAmount * 0.9 : totalAmount;
    }

    //METHOD FOR ADD PRODUCTS
    public List<Product> addProduct(Product product, List<Product> products) {
        Scanner sn = new Scanner(System.in);
        for(int i = 0; i < products.size(); i++){
            //ONLY IF THE PRODUCT IS OF THE SAME TYPE AND NAME
            if(products.get(i).getProductName().equals(product.getProductName()) && products.get(i).getClass().equals(product.getClass())){
                System.out.println("THE PRODUCT ALREADY EXIST");
                System.out.println(products.get(i));
                System.out.println("DO YOU WANT TO MODIFY THE AMOUNT?");
                String choise = sn.next();
                if(choise.equals("Y")){
                    System.out.println("Insert new amount");
                    int newAmount = sn.nextInt();
                    if(newAmount <= 0){
                        products.remove(products.get(i));
                        return products;
                    }else {
                        products.get(i).setProductAmount(newAmount);
                        return products;
                    }
                }else if(choise.equals("N")){
                    return products;
                }else{
                    System.out.println("I DONT UNDERSTAND YOU !");
                    return products;
                }
            }
        }
        products.add(product);
        return products;
    }

   /* METHOD FOR REMOVE PRODUCTS BY NAME*/
    public void deleteProduct(String productName, List<Product> products){
        //Only by name
        boolean found = false;
           for (int i = 0; i < products.size(); i++) {
               if(products.get(i).getProductName().equals(productName)){
                   System.out.println("THE PRODUCT WAS DELETED");
                   products.remove(products.get(i));
                   found = true;
               }
           }if (found == false){
            System.out.println("THE PRODUCT DOES NOT EXIST");
        }
    }

     /*METHOD FOR PRINT PRODUCTS*/
    public void printProducts(List<Product> products) {
        if(products.size() > 0){
            for (int i = 0; i < products.size(); i++) {
                System.out.println("--------------------------------------------------------------------------------------------------");
                System.out.println(i+1 +" "+products.get(i));
                System.out.println("---------------------------------------------------------------------------------------------------");
            }
        }else{
            System.out.println("THE CART IS EMPTY");
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
