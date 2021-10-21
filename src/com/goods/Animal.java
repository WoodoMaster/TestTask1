package com.goods;

public abstract class Animal extends Product {
  private   int neededVolumeInLiters;
    private int minTemperature;
    private int neededFilterPerformance;
    private int neededCompressorPower;
    private int neededLightBrightness;

    public int getNeededVolumeInLiters() {
        return neededVolumeInLiters;
    }

    public int getMinTemperature() {
        return minTemperature;
    }
}
