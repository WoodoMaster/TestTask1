package com.model;

public abstract class Reptile extends Animal{
    public Reptile(String name, int neededVolumeInLiters, int minTemperature, int neededFilterPerformance,
                   int neededCompressorPower, int neededLightBrightness, int number) {
        super(name, neededVolumeInLiters, minTemperature, neededFilterPerformance, neededCompressorPower,
                neededLightBrightness, number);
    }
}
