package com.alimaa.WeekThree.Monday.IntoToClassesExercises;

import java.util.Arrays;

public class CarDealership {
    private String carDealershipName;
    private int maxCarDisplayNumber;
    private Car[] carsInStock;

    public CarDealership(String carName,
                         int maxCarDisplayNumber) {
        this.carDealershipName = carDealershipName;
        this.maxCarDisplayNumber = maxCarDisplayNumber;
        this.carsInStock = new Car[maxCarDisplayNumber];
    }

    public String getCarDealershipName() {
        return carDealershipName;
    }

    public void setCarDealershipName(String carDealershipName) {
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
    public String toString() {
        return "CarDealership{" +
                "carName='" + carDealershipName + '\'' +
                ", maxCarDisplayNumber=" + maxCarDisplayNumber +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';
    }
}
