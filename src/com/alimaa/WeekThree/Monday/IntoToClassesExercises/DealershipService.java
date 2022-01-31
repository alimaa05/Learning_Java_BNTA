package com.alimaa.WeekThree.Monday.IntoToClassesExercises;

import java.util.Arrays;

// Q6 Write a method to count the number of cars in the dealership. It doesn't need to take any parameters and should return an int. --> DONE
// Write another method to add a car to the dealership. The method should have a Car parameter and doesn't need to return anything.
// Test your method by counting the number of cars, adding a new car then counting again to make sure the number has gone up by one.
//------
//Hint: You will need some way of finding the first empty slot in the array to save the Car in. Maybe checking each slot in the array in turn would help?

public class DealershipService {
    // counting the number of cars in dealership

    public int countingCars(CarDealership dealership) { //NEW METHOD TO COUNT THE NUMBER OF CARS IN THE DEALERSHIP
        // CALLING ON THE 'CAR DEALERSHIP' CLASS TO GET ALL THE PROPERTIES, RENAMING IT DEALERSHIP

        int totalNulls = 0;

        for (int i = 0; i < dealership.getCarsInStock().length; i++) {
            if (dealership.getCarsInStock()[i] == null) {
                totalNulls += 1;
            }
        }

        int numberOfCars = dealership.getMaxCarDisplayNumber() - totalNulls;

        return numberOfCars;

    }
}
