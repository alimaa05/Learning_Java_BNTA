package com.alimaa.interfaces;

public class Bicycle implements Vehicle {


    @Override
    public void move() {
        System.out.println("Pedal");
    }

    @Override
    public void applyBreak() {

    }

    @Override
    public double getCurrentSpeed() {
        return 0;

    }
}
