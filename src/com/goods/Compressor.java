package com.goods;

public class Compressor extends Product {
   private final int powerInWatt;

   public Compressor(int powerInWatt) {
      this.powerInWatt = powerInWatt;
   }

   public int getPowerInWatt() {
      return powerInWatt;
   }
}
