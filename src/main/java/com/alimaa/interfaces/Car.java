package com.alimaa.interfaces;

public class Car implements Vehicle {


    @Override
    public void move() {
        System.out.println("Start engine");
        System.out.println("gear");
        System.out.println("press the accelerator");

    }

    @Override
    public void applyBreak() {

    }

    @Override
    public double getCurrentSpeed() {
        return 0;
    }
}
