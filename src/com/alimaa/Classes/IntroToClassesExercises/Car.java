package com.alimaa.Classes.IntroToClassesExercises;

// Q1 Create a class to represent a car. --> DONE
//// The car should have properties representing the manufacturer, price, and engine type (eg. petrol, electric, etc).

//Q2 Write getters for each of these properties. Test them in Main. --> DONE

// Q3 Write setters for the properties. Test them in Main. --> DONE

// Q4 Modify the engine type property to use an EngineType enum.  --> DONE
// You'll need to modify the getter and setter to reflect the different data type.

public class Car {      // CAR CLASS
    private String manufacturer;
    private int price;
    private EngineType engineType; // Enum type

    public Car(String manufacturer, int price, EngineType engineType) {  // CONSTRUCTOR
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    public String getManufacturer() {
        return manufacturer;
    }    // Q2 GETTERS

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }  // Q3 SETTERS

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }    // Q4 GETTER AND SETTER FOR ENUM IS SLIGHTLY DIFFERENT

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {          // OVERRIDE TO-STRING METHOD
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", engineType=" + engineType +
                '}';
    }
}
