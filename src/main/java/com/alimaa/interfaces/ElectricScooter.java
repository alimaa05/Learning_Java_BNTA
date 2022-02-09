package com.alimaa.interfaces;

public class ElectricScooter implements Vehicle{

    @Override
    public void move() {
        System.out.println("push off");
        System.out.println("press button");

    }

    @Override
    public void applyBreak() {

    }

    @Override
    public double getCurrentSpeed() {
        return 0;

    }
}
