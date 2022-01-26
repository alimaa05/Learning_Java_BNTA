package com.alimaa.WeekTwoExercises.Monday;

import java.util.Scanner;

public class exercise4ArraysCondiMeth {

        /*
          Write a program that takes an input number from the console and prints if number is prime
          Create a method to check if number is prime then use against the input
        */
        public static void main(String[] args) {

            // this is the program that takes an input number and prints whether its prime or not
            int number;
            Scanner s = new Scanner(System.in);

            System.out.println(" Enter your number to check if its a prime number: ");

            number = s.nextInt();

            // allows the user to input the number to check if its prime

            if (isPrime(number)) {
                System.out.println(""+ number +" number is a prime number!");
            }
            else {
                System.out.println(""+ number+ " is not a prime number!");
            }
            // this will print a sentence stating whether the number is in fact prime or not

        }
// this part is a method that checks if the number is prime and its linked back to the section in main to then produce an output of whether it's prime or not.
    public static boolean isPrime(int number) {
            if (number  <=1){
                // if the number is less than or equal to 1 return false
                return false;
            }
            for (int nu =2; nu < number; nu++){
                if(number % nu ==0){
                    // if the number is divisible by 2 then return false
                    // then is nu less than number
                    return false;
                }
            }
            return true;
            // if not then return true
    }
}


