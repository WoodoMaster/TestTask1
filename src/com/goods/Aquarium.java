package com.goods;

import com.model.Animal;

import java.util.ArrayList;

public class Aquarium extends Product {

  private Compressor compressor;
  private Filter filter;
  private Light light ;
  private int volumeLiters;

  public Aquarium(int volumeLiters){
    this.volumeLiters = volumeLiters;
  }

  public Aquarium(ArrayList<Animal> animals){
   this.volumeLiters = animals.stream().mapToInt(Animal::getNeededVolumeInLiters).sum();
   this.filter  = new Filter(animals.stream().mapToInt(Animal::getNeededFilterPerformance).sum());
   this.light  = new Light(animals.stream().mapToInt(Animal::getNeededLightBrightness).sum());
   this.compressor = new Compressor(animals.stream().mapToInt(Animal::getNeededCompressorPower).sum());
  }

    @Override
    public String toString() {
        return "Aquarium volume " + volumeLiters + " l, compressor " + compressor.getPowerInWatt() +
                ", filter performance " + filter.getPerformance() +
                ", light brightness " + light.getBrightness();
    }
}
