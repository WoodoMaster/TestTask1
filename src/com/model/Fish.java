package com.model;

public class Fish  extends Animal {
    public Fish(String name, int neededVolumeInLiters, int minTemperature, int neededFilterPerformance,
                int neededCompressorPower, int neededLightBrightness, int number) {
        super(name, neededVolumeInLiters, minTemperature, neededFilterPerformance, neededCompressorPower,
                neededLightBrightness, number);
    }

    @Override
    public String toString() {
        return "Fish{}";
    }
}
