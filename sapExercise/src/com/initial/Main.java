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

        Product product = new Food("Apple","5 kg", 4, 6.60, "MEAL");
        Product product2 = new Food("Chocolate","Milka", 2, 8.20, "SWEET");
        Product product3 = new Technology("TV","SONY", 1, 80, 3);
        Product product4 = new Home("Table","3x3 m", 1, 20, "black");

        //ADD PRODUCTS TO CART
        shoppingCart.addProduct(product,products);
        shoppingCart.addProduct(product2,products);
        shoppingCart.addProduct(product3,products);
        shoppingCart.addProduct(product4,products);

        //PRINT PRODUCTS IN SHOPPINGCART
        shoppingCart.printProducts(products);

        double totalPrice = shoppingCart.calculateTotalPrice(products);
        System.out.println(" TOTAL PRICE IN CART " + totalPrice +"\n");


        System.out.println("Deleting product from cart : " +product4 +"\n");
        shoppingCart.deleteProduct(product4,products);

        //PRINT PRODUCTS IN SHOPPINGCART
        shoppingCart.printProducts(products);

        double totalPriceAfterDelete = shoppingCart.calculateTotalPrice(products);
        System.out.println(" TOTAL PRICE IN CART AFTER DELETE A PRODUCT  " + totalPriceAfterDelete +"\n");
    }


}
