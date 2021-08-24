package com.initial;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       /* Product product1 = new Product("Milk","3,6 fat", 10, 4.80);
        Product product2 = new Product("Apple","5 kg", 25, 6.60);
        Product product3 = new Product("Chocolate","Milka", 20, 8.20);
        Product product4 = new Product("Eggs","size L", 20, 6.30);*/

        ArrayList<Product> products = new ArrayList<Product>();
        ShoppingCart shoppingCart = new ShoppingCart();

        Product p = new Food("Apple","5 kg", 4, 6.60, "MEAL");
        Product p2 = new Food("Chocolate","Milka", 2, 8.20, "SWEET");
        Product p3 = new Technology("TV","SONY", 1, 80, 3);
        Product p4 = new Home("Table","3x3 m", 1, 20, "black");

        //ADD PRODUCTS TO CART
        shoppingCart.addProduct(p,products);
        shoppingCart.addProduct(p2,products);
        shoppingCart.addProduct(p3,products);
        shoppingCart.addProduct(p4,products);

        //PRINT PRODUCTS IN SHOPPINGCART
        shoppingCart.printProducts(products);

        double totalPrice = shoppingCart.calculateTotalPrice(products);
        System.out.println(" TOTAL PRICE IN CART " + totalPrice);

        shoppingCart.deleteProduct(p4,products);

        //PRINT PRODUCTS IN SHOPPINGCART
        shoppingCart.printProducts(products);
    }


}
