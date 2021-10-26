package com.model;

import java.util.ArrayList;

public class Catalog {
 private    ArrayList <? extends Animal> reptile;
 private    ArrayList <? extends Animal> fish;

    public ArrayList<? extends Animal> getReptile() {
        return reptile;
    }

    public void setReptile(ArrayList<? extends Animal> reptile) {
        this.reptile = reptile;
    }

    public ArrayList<? extends Animal> getFish() {
        return fish;
    }

    public void setFish(ArrayList<? extends Animal> fish) {
        this.fish = fish;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Catalog contains  - Reptiles: ");
        reptile.forEach(r-> stringBuilder.append(r.getName()).append(" "));
        stringBuilder.append(". Fish: ");
        fish.forEach(f-> stringBuilder.append(f.getName()).append(" "));
        return stringBuilder.toString();
    }
}
