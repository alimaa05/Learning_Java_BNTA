package com.alimaa.classes.IntroToClassesExercises;

// In these exercises you'll  create classes and define their properties and behaviours.
// Each class should be in its own file.
// If you need to call any of the methods you define you can do it from the main method inside the Main class.


// Q1 Create a class to represent a car. --> DONE
// The car should have properties representing the manufacturer, price, and engine type (eg. petrol, electric, etc).

//Q2 Write getters for each of these properties. Test them in Main. --> DONE

// Q3 Write setters for the properties. Test them in Main. --> DONE

// Q4 Modify the engine type property to use an EngineType enum.  --> DONE
// You'll need to modify the getter and setter to reflect the different data type.

// Q5 Create a class to represent a car dealership. --> DONE
// It should have properties representing its name, the maximum number of cars it can have on display and all the cars currently in stock.
//------
// Hint 1: We could create an individual property for each car we have in stock, but is there a data type we have already
// seen which would let us store all our cars together in the same variable? How can we figure out how big that data structure should be?
//------
//Hint 2: A brand new dealership won't have any cars yet. Do we need to pass that information in the constructor when we create a dealership
// or can we define our class in such a way that every new dealership starts with no cars?


// Q6 Write a method to count the number of cars in the dealership. It doesn't need to take any parameters and should return an int. --> DONE
// Write another method to add a car to the dealership. The method should have a Car parameter and doesn't need to return anything.
// Test your method by counting the number of cars, adding a new car then counting again to make sure the number has gone up by one.
//------
//Hint: You will need some way of finding the first empty slot in the array to save the Car in. Maybe checking each slot in the array in turn would help?


// Q7 Write a method for the dealership called findCarByManufacturer which takes a String as a parameter and returns a Car object.
// The method should return the first Car the dealership has in stock with a manufacturer property
// matching the value passed to the method.
// Hint 1: Think carefully about how you will access the information you need from the Cars.
// Remember the methods you wrote in exercise 2...
// Hint 2: To test this in Main you will need to:
// - create some Car objects - add them to the Dealership -
// store the result of your findCarByManufacturer method to a variable - print the variable

public class Main {     // MAIN CLASS
    public static void main(String[] args) {
        Car firstCar = new Car(                // FIRST_CAR OBJECT
                "Volvo",
                6000,
                EngineType.electric);

// FOR Q2
        System.out.println(firstCar.toString());
        System.out.println("-----------------");
//        System.out.println(firstCar.getManufacturer());
//        System.out.println(firstCar.getPrice());
//        System.out.println(firstCar.getEngineType());

        Car secondCar = new Car(                  // SECOND_CAR OBJECT
                "Honda",
                10_000,
                EngineType.electric);
        System.out.println(secondCar.toString());
        System.out.println("-----------------");


        Car thirdCar = new Car(                  // SECOND_CAR OBJECT
                "Fiat",
                9_000,
                EngineType.electric);
        System.out.println(thirdCar.toString());
        System.out.println("-----------------");

        Car fourthCar = new Car(                  // SECOND_CAR OBJECT
                "BMW",
                30_000,
                EngineType.electric);
        System.out.println(fourthCar.toString());
        System.out.println("-----------------");

        Car fifthCar = new Car(                  // SECOND_CAR OBJECT
                "Ford",
                8_000,
                EngineType.petrol);
        System.out.println(fifthCar.toString());
        System.out.println("-----------------");

//        Car[] myCarArray = new Car[] {firstCar, secondCar };

        CarDealership dealership = new CarDealership(
                "AlimaasDealership",
                15);
//        System.out.println(dealership.toString());

        // first dealership object
        // properties of the first dealership

        CarDealership dealership1 = new CarDealership(
                "WillsDealership",
                10);
//        System.out.println(dealership1.toString());

        // second dealership object
        // properties of the second dealership


// Q6 THIS OBJECT IS RETURNING THE NUMBER OF CARS THE DEALERSHIP CURRENTLY HAS IN STOCK


        DealershipService dealershipService = new DealershipService(); // calling on the DealershipService class
        System.out.println("Number of cars in " + dealership.getCarDealershipName() + " = ");
        dealershipService.addingCarToDealership(dealership, firstCar);
        dealershipService.addingCarToDealership(dealership, secondCar);
        System.out.println(dealershipService.countingCars(dealership)); // returns the number of cars being added into our dealership


        System.out.println("-----------------");

        System.out.println("Number of cars in " + dealership1.getCarDealershipName() + " = ");// printing the number of cars in the first dealership object
        dealershipService.addingCarToDealership(dealership1, thirdCar);
        dealershipService.addingCarToDealership(dealership1, fourthCar);// printing third,fourth and fifth car to dealership one
        dealershipService.addingCarToDealership(dealership1, fifthCar);
        System.out.println(dealershipService.countingCars(dealership1)); // printing the number of cars in the dealership after adding the car to it


// Q7  Write a method for the dealership called findCarByManufacturer which takes a String as a parameter and returns a Car object.

        // store the result of findCarByManufacturer method to variable
        String resultFindCarByManufacturer = dealershipService.findCarByManufacturer(dealership,firstCar);
        // print the variable
        System.out.println(resultFindCarByManufacturer);

    }

}
