package com.alimaa.oop.Car_OOP_Example;

import java.util.Arrays;

public class Garage {
    private Person owner;
    private int garageNumber;
    private int capacity;
    private boolean isOpen;
    private Car[] cars;


    public Garage(Person owner,
                  int garageNumber,
                  int capacity) {
        this.owner = owner;
        this.garageNumber = garageNumber;
        this.capacity = capacity;
        this.isOpen = isOpen;
        this.cars = new Car[capacity];
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getGarageNumber() {
        return garageNumber;
    }

    public void setGarageNumber(int garageNumber) {
        this.garageNumber = garageNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "owner=" + owner +
                ", garageNumber=" + garageNumber +
                ", capacity=" + capacity +
                ", isOpen=" + isOpen +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
