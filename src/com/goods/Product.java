package com.goods;

public abstract class Product {
    private int id;
    private  String name;
    private boolean isAvailable;
    private static int quantityInStock;
    private int price;



    public boolean isAvailable() {
        return isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public int getPrice() {
        return price;
    }

    public void returnProduct(){
        quantityInStock+=1;
    }
}
