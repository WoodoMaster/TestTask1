package com.model;


public class Animal {
    private String name;
    private int neededVolumeInLiters;
    private int minTemperature;
    private int neededFilterPerformance;
    private int neededCompressorPower;
    private int neededLightBrightness;
    private int number;


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
