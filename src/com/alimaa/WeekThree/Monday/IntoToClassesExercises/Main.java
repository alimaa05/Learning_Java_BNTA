package com.alimaa.WeekThree.Monday.IntoToClassesExercises;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car(
                "Volvo",
                6000,
                EngineType.electric);

        System.out.println(firstCar.toString());
//        System.out.println(firstCar.getManufacturer());
//        System.out.println(firstCar.getPrice());
//        System.out.println(firstCar.getEngineType());

        Car secondCar = new Car(
                "Honda",
                10_000,
                EngineType.electric);


//        Car[] myCarArray = new Car[] {firstCar, secondCar };

        CarDealership dealership = new CarDealership("Volvo", 15);
        System.out.println(dealership.toString());

        CarDealership dealership1 = new CarDealership("Honda", 10);

        DealershipService dealershipService = new DealershipService();
        System.out.println(dealershipService.countingCars(dealership));


    }

}
