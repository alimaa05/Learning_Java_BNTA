package com.alimaa.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        Car car = new Car();
        ElectricScooter electricScooter = new ElectricScooter();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bicycle);
        vehicles.add(electricScooter);

        Person alimaa = new Person("Alimaa",vehicles);


        System.out.println(Arrays.toString(vehicles.toArray()));

    }

}
