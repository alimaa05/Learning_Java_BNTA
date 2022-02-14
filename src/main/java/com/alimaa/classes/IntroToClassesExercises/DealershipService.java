package com.alimaa.classes.IntroToClassesExercises;

// Q6 Write a method to count the number of cars in the dealership. It doesn't need to take any parameters and should return an int. --> DONE
// Write another method to add a car to the dealership. The method should have a Car parameter and doesn't need to return anything.
// Test your method by counting the number of cars, adding a new car then counting again to make sure the number has gone up by one.
//------
//Hint: You will need some way of finding the first empty slot in the array to save the Car in. Maybe checking each slot in the array in turn would help?

import java.util.Scanner;

public class DealershipService {

    // COUNTING THE NUMBER OF CARS IN THE DEALERSHIP
    public int countingCars(CarDealership dealership) {
        //NEW METHOD TO COUNT THE NUMBER OF CARS IN THE DEALERSHIP, will return an INT
        // CALLING ON THE 'CAR DEALERSHIP' CLASS TO GET ALL THE PROPERTIES, RENAMING IT DEALERSHIP

        int currentCarsInDealership = 0; // stating that the current cars in the dealership starts at 0

        for (int i = 0; i < dealership.getCarsInStock().length; i++) { // for i loop get cars . length incrementing by 1 each time
            if (dealership.getCarsInStock()[i] != null) { // if the get cars in stock is not equal to null i.e. then its full
                currentCarsInDealership++; // increment the number of cars currently in the dealership by 1
            }

        }
        return currentCarsInDealership;  // returning the number of current cars in the dealership

    }


    // METHOD TO add cars to THE DEALERSHIP
    public void addingCarToDealership(CarDealership dealership, Car car) {

        // CALLING ON THE 'CAR DEALERSHIP' CLASS AND THE CAR CLASS

        for (int i = 0; i < dealership.getCarsInStock().length; i++) { // for i loop getting the length of get cars in stock variable
            if (dealership.getCarsInStock()[i] == null) { // if get cars in stock is equal to null then that means theres an empty space so the next line of code can run
                dealership.getCarsInStock()[i] = car; // if it is null then get cars in stock is equal to car object
                break; // breaks after this loop
            }

        }

    }

    // Q7  Write a method for the dealership called findCarByManufacturer which takes a String as a parameter and returns a Car object.
// should return the first Car the dealership has in stock - with manufacturer property matching the value passed to the method
    public Car findCarByManufacturer(CarDealership carDealership, String input) {

        for (Car car : carDealership.getCarsInStock()) {
            if (car.getManufacturer().equals(input)) {
                return car;
            }
        }
        return null;
    }


}














