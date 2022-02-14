package com.alimaa.classes.IntroToClassesExercises;

// Q5 Create a class to represent a car dealership. --> DONE
// It should have properties representing its name, the maximum number of cars it can have on display and all the cars currently in stock.
//------
// Hint 1: We could create an individual property for each car we have in stock, but is there a data type we have already
// seen which would let us store all our cars together in the same variable? How can we figure out how big that data structure should be?
//------
//Hint 2: A brand new dealership won't have any cars yet. Do we need to pass that information in the constructor when we create a dealership
// or can we define our class in such a way that every new dealership starts with no cars?


import java.util.Arrays;

public class CarDealership { // CAR DEALERSHIP CLASS
    private String carDealershipName; // THE PROPERTIES OF THE CLASS
    private int maxCarDisplayNumber;
    private Car[] carsInStock; // THIS PROPERTY USES AN ARRAY ALLOWS US TO STORE ALL THE CARS WE HAVE IN STOCK UNDER THE SAME VARIABLE


    public CarDealership() {

    }

    public CarDealership(String carDealershipName,
                         // THE CONSTRUCTOR ALLOWS US TO MAKE NEW OBJECTS
                         // OUR CAR DEALERSHIP OBJECT WILL HAVE THESE INDIVIDUAL PROPERTIES WHICH WE CAN SET VALUES FOR
                         int maxCarDisplayNumber) {
        this.carDealershipName = carDealershipName;
        this.maxCarDisplayNumber = maxCarDisplayNumber;
        this.carsInStock = new Car[maxCarDisplayNumber];
        // BY SAYING THAT 'CARS IN STOCK' IS EQUAL TO THE CAR ARRAY WHICH HOLDS THE CAPACITY OF THE 'MAXIMUM CAR DISPLAY NUMBER'
        // ALLOWS US TO FIGURE OUT HOW BIG THIS DATA STRUCTURE SHOULD BE

        // REDEFINING THE CAR PROPERTIES AS BEING ABLE TO HOLD THE 'MAX CAR DISPLAY NUMBER' RATHER THAN JUST 'CARS IN STOCK'
        // MEANS EVERY NEW DEALERSHIP STARTS WITH NO CARS I.E. NULL, BECAUSE THE 'MAX CAR DISPLAY NUMBER' INDICATES THE NU OF CARS THE DEALERSHIP CAN HAVE
        // AND HOW MANY IT ACTUALLY HAS CURRENTLY
    }

    public String getCarDealershipName() {    // GETTERS
        return carDealershipName;
    }

    public void setCarDealershipName(String carDealershipName) {  // SETTERS
        this.carDealershipName = carDealershipName;
    }

    public int getMaxCarDisplayNumber() {
        return maxCarDisplayNumber;
    }

    public void setMaxCarDisplayNumber(int maxCarDisplayNumber) {
        this.maxCarDisplayNumber = maxCarDisplayNumber;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void setCarsInStock(Car[] carsInStock) {
        this.carsInStock = carsInStock;
    }

    @Override
    public String toString() {              // OVERRIDE TO_STRING METHOD
        return "CarDealership{" +
                "carDealershipName='" + carDealershipName + '\'' +
                ", maxCarDisplayNumber=" + maxCarDisplayNumber +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';
    }
}
