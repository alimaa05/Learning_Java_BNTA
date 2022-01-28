package com.alimaa.WeekTwoExercises.Wednesday;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class Day3EnumsDatesErrorsClassNotes {

    // GOING OVER RANDOM OPERATOR
        public static void main(String[] args) {

            String[] jokes = {
                    "Alex", // index 0
                    "Colin", // index 1
                    "Abdi", // index 2
                    "Marcy", // index 3
                    "Suraaj", // index 4
                    "Robyn", // index 5,
                    "Yang", // index 6,
                    "Hajr", // index 7,
                    "Bob", // index 8,

            };

            Random random = new Random();
            // that above is calling the random function

            // Random number between 0 - 9
            int randomNumber = random.nextInt(jokes.length);

            System.out.println(jokes[randomNumber]);
            // this is printing the "jokes"

// PRINTING ENUMS
            System.out.println(Color.BLACK); // how you print enums
            System.out.println(WeatherSeason.SPRING);

            WeatherSeason[] weatherSeasons = WeatherSeason.values();
            System.out.println(WeatherSeason.SUMMER.compareTo(WeatherSeason.SPRING)); // comparing two seasons prints -2 because it's not true
            System.out.println(WeatherSeason.SUMMER.equals(WeatherSeason.WINTER)); // prints false because summer is not equal to winter
//            for (WeatherSeason weatherSeason : weatherSeasons);


// WORKING WITH DATES

            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println(localDateTime);

            LocalDate localDate =LocalDate.now();
            System.out.println(localDate);

            LocalTime localTime = LocalTime.now();
            System.out.println(localTime);

            System.out.println(localDateTime.getDayOfMonth());

 // ERROR HANDLING
            try {
                int division = 10/0;
                int result =Integer.parseInt("10x");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("oops input not a number");
            } catch (Exception e){
                System.out.println("catch all");
            }

//
            int[] numbers ={1, 2, 3, 4, 5};
            int result = 0;
            for (int number : numbers) {
                int add = (number + 100) / number;
                result += add;
            }
            System.out.println(result);
        }

    }

