package com.alimaa.classes.IntroToClassesExercises;

// Q6 Write a method to count the number of cars in the dealership. It doesn't need to take any parameters and should return an int. --> DONE
// Write another method to add a car to the dealership. The method should have a Car parameter and doesn't need to return anything.
// Test your method by counting the number of cars, adding a new car then counting again to make sure the number has gone up by one.
//------
//Hint: You will need some way of finding the first empty slot in the array to save the Car in. Maybe checking each slot in the array in turn would help?

public class DealershipService {

    public DealershipService(CarDealership dealership) { // this connects the 'car dealership class' to the service by running the car dealership class as an argument
    }
//, Car addCarToDealership

//    public DealershipService(Car addCarToDealership) { // connecting the 'Car' class to the 'Dealership Service' ny running the 'Car' class as an argument
//    }

    // counting the number of cars in dealership

    public int countingCars(CarDealership dealership) { //NEW METHOD TO COUNT THE NUMBER OF CARS IN THE DEALERSHIP, will return an INT
        // CALLING ON THE 'CAR DEALERSHIP' CLASS TO GET ALL THE PROPERTIES, RENAMING IT DEALERSHIP

        int totalNulls = 0; // stating that the total nulls is at 0

        for (int i = 0; i < dealership.getCarsInStock().length; i++) { // for i loop
            if (dealership.getCarsInStock()[i] == null) {
                totalNulls++; // if the first car in stock within the loop is equal to null
                // i.e. there is no car in there then the total nulls increases by one each time it goes through the loop.
                // this will stop at the dealership's max car display number.
            }
        }
        int numberOfCars = dealership.getMaxCarDisplayNumber() - totalNulls; // defines the 'number of cars' as the 'max car display number' minus the 'total number of nulls'
//
        return numberOfCars; // returns the total number of cars within the dealership

        //     WRITE A METHOD TO ADD CARS TO DEALERSHIP
//     if the number of cars (i.e. maxCarDisplay - totalNulls) is less than the maxCarDisplay then you can add in another car
        // else its full and can throw exception

//        if (dealership.getMaxCarDisplayNumber();

//        public void addCarsToDealership(Car addCarToDealership) {
//        }
    }

}


//        public String findCarByManufacturer()