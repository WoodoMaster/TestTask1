package com.model;


public class Animal {
    private String name;
    private int neededVolumeInLiters;
    private int minTemperature;
    private int neededFilterPerformance;
    private int neededCompressorPower;
    private int neededLightBrightness;
    private int number;

    public Animal(String name, int neededVolumeInLiters, int minTemperature, int neededFilterPerformance,
                  int neededCompressorPower, int neededLightBrightness, int number) {
        this.name = name;
        this.neededVolumeInLiters = neededVolumeInLiters;
        this.minTemperature = minTemperature;
        this.neededFilterPerformance = neededFilterPerformance;
        this.neededCompressorPower = neededCompressorPower;
        this.neededLightBrightness = neededLightBrightness;
        this.number = number;
    }

    public int getNeededVolumeInLiters() {
        return neededVolumeInLiters;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getNeededFilterPerformance() {
        return neededFilterPerformance;
    }

    public int getNeededCompressorPower() {
        return neededCompressorPower;
    }

    public int getNeededLightBrightness() {
        return neededLightBrightness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
