package com.alimaa.WeekThree.Monday.IntoToClassesExercises;

import java.util.Arrays;

public class DealershipService {
    // counting the number of cars in dealership
    //1)
    public int countingCars(CarDealership dealership) {

        int totalNulls =0;

        for (int i = 0; i < dealership.getCarsInStock().length; i++) {
            if (dealership.getCarsInStock()[i] == null){
                totalNulls += 1;
            }
        }

       int numberOfCars = dealership.getMaxCarDisplayNumber() - totalNulls;

        return numberOfCars;

    }
}
