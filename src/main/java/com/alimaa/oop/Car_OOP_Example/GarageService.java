package com.alimaa.oop.Car_OOP_Example;

public class GarageService { //business logic
    // This class performs all business logic for the following:
    // 1. add cars
    // 2. how many cars in the garage
    // 3. number of free spots in garage
    // 4. remove car
    // 5. Open and close garage
    // 6. isGarageFull
    // 7. filter electric cars
    // 8. filter non-electric cars
    // 9. Clean garage. Remove all cars and put them back and in between print garage cleaned
    // 10. Create GarageDAO class and store current cars in garage to a file
    // 11. Create a second method to read cars from a file

    public void addCar(Garage garage, Car car) throws IllegalAccessException {
        // check if open
        // if open check not full
        // then add car to garage
        // if full throw exception
        // if not open throw exception

        if (garage.isOpen()) {

            int currentCarsInGarageCount = 0;
            for (Car c : garage.getCars()) {
                if (c != null) {
                    currentCarsInGarageCount++;
                }
            }
            if (currentCarsInGarageCount < garage.getCapacity()) {
                for (int i = 0; i < garage.getCars().length; i++) {
                    if (garage.getCars()[i] == null) {
                        garage.getCars()[i] = car;
                        break;
                    }
                }
            } else {
                throw new IllegalAccessException(garage.getGarageNumber() + " is full. Sorry");
            }
        } else {
            throw new IllegalStateException(garage.getGarageNumber() + " is closed. Please open before adding your car");
        }
    }

    public int getTotalNumberOfCarsInGarage(Garage garage) {
        int currentCarsInGarageCount = 0;
        for (Car c : garage.getCars()) {
            if (c != null) {
                currentCarsInGarageCount++;
            }
        }
        return currentCarsInGarageCount;
    }
}
