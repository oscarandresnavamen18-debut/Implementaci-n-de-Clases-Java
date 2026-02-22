package com.example;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println("Producto 1:");
        product1.setId(1);
        product1.setNombre("Mouse");
        product1.setPrecio(25500);
        product1.setDescripcion("Mouse inalámbrico con alta precisión");

        System.out.println("ID: " + product1.getId());
        System.out.println("Nombre: " + product1.getNombre());
        System.out.println("Precio: " + product1.getPrecio());
        System.out.println("Descripción: " + product1.getDescripcion());
        System.out.println();

        Product product2 = new Product(34, "Teclado", "Teclado mecánico con retroiluminación", 45000);
        System.out.println("Producto 2:");
        System.out.println("Id: " + product2.getId());
        System.out.println("Nombre: " + product2.getNombre());
        System.out.println("Precio: " + product2.getPrecio());
        System.out.println("Descripción: " + product2.getDescripcion());
        System.out.println();

        System.out.println("Product1: " + product1);
        System.out.println("Product2: " + product2);
    }
}