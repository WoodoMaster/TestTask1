package com.goods;

import java.util.ArrayList;

public class Cart {
    private final ArrayList<Product> productArrayList = new ArrayList<>();
    private int fullPrice = 0;

    public void addProductToCart(Product product) {
        if (product.isAvailable()) {
            productArrayList.add(product);
            fullPrice += product.getPrice();
            return;
        }
        System.out.println("There is no available product " + product.getName());

    }

    public void removeProductFromCart(Product product) {
        if (productArrayList.contains(product)) {
            productArrayList.remove(product);
            product.returnProduct();
            return;
        }
        System.out.println("There is no product " + product.getName() + " in cart");
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void printProductListInCart() {
        System.out.println("Your cart:");
        productArrayList.forEach(p -> System.out.println(p.getName() + " " + p.getPrice()));
    }
}
