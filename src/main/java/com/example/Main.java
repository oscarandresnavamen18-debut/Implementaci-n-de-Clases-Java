package com.example;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println("Product 1:");
        product1.setId(1);
        product1.setName("Mouse");
        product1.setPrice(25500);
        product1.setDescription("Wireless mouse with high precision");
        product1.setInStock(true);

        // Print two attributes using getters
        System.out.println("ID: " + product1.getId());
        System.out.println("Name: " + product1.getName());
        System.out.println();

        Product product2 = new Product(34, "Keyboard", "Mechanical keyboard with backlight", 45000, true);
        System.out.println("Product 2:");
        System.out.println("ID: " + product2.getId());
        System.out.println("Name: " + product2.getName());
        System.out.println();

        // Modify one attribute of each object using setters
        product1.setPrice(24999);
        product2.setInStock(false);

        // Print full representation via toString()
        System.out.println("Product1: " + product1);
        System.out.println("Product2: " + product2);
    }
}