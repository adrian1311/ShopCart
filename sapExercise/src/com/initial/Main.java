package com.initial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();
        ShoppingCart shoppingCart = new ShoppingCart();

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int menuOption,productOption;

        while (!exit) {
            printMainMenu();
            try {
                System.out.println("CHOSE ONE OPTION");
                menuOption = sn.nextInt();
                switch (menuOption) {
                    case 1:
                        printProductsType();
                        productOption = sn.nextInt();
                        switch (productOption){
                            case 1:
                                Product proFood = createProduct("food");
                                shoppingCart.addProduct(proFood,products);
                                shoppingCart.printProducts(products);
                                break;
                            case 2:
                                Product proHome = createProduct("home");
                                shoppingCart.addProduct(proHome,products);
                                shoppingCart.printProducts(products);
                                break;
                            case 3:
                                Product proTechnology = createProduct("technology");
                                shoppingCart.addProduct(proTechnology,products);
                                shoppingCart.printProducts(products);
                                break;
                            default:
                                System.out.println("CHOOSE NUMBER BETWEEN 1 and 3");
                        }
                        break;
                    case 2:
                        System.out.println(" FOR DELETE A PRODUCT ENTER THE NAME");
                        String productForDelete = sn.next();
                        shoppingCart.deleteProduct(productForDelete,products);
                        break;
                    case 3:
                        shoppingCart.printProducts(products);
                        double totalPrice = shoppingCart.calculateTotalPrice(products);
                        System.out.println(" TOTAL PRICE IN CART " + totalPrice +"\n");
                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("CHOOSE NUMBER BETWEEN 1 and 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("YOU MUST ENTER A NUMBER");
                sn.next();
            }
        }
    }


    public static void printProductsType(){
        System.out.println("-----------------------------");
        System.out.println("SELECT PRODUCT TYPE");
        System.out.println("1. FOOD");
        System.out.println("2. HOME");
        System.out.println("3. TECHNOLOGY");
        System.out.println("-----------------------------");
    }
    public static void printMainMenu(){
        System.out.println("-----------------------------");
        System.out.println("1. ADD PRODUCT");
        System.out.println("2. DELETE PRODUCT");
        System.out.println("3. SHOW CART");
        System.out.println("4. EXIT");
        System.out.println("-----------------------------");
    }

    public static Product createProduct(String productType){
        Product product = null;
        Scanner sn = new Scanner(System.in);
        System.out.println("INSERT NAME");
        String name = sn.next().toLowerCase();
        System.out.println("INSERT AMOUNT");
        int amount = sn.nextInt();
        System.out.println("INSERT PRICE (with coma separator)");
        double price = sn.nextDouble();
        if(productType.equals("food")){
            System.out.println("INSERT TYPE");
            String type = sn.next().toLowerCase();
            product = new Food(name, amount, price, type);
        }
        if(productType.equals("home")){
            System.out.println("INSERT COLOR");
            String color = sn.next().toLowerCase();
            product = new Home(name, amount, price, color);
        }
        if(productType.equals("technology")){
            System.out.println("INSERT GUARANTEE");
            int guarantee = sn.nextInt();
            product = new Technology(name, amount, price, guarantee);
        }
        return product;
    }




}
