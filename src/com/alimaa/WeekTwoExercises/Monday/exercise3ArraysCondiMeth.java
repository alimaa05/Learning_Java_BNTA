package com.alimaa.WeekTwoExercises.Monday;

import java.util.Scanner;

public class exercise3ArraysCondiMeth {

        /*
          Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
          You might compile and run the program via command line or by editing configuration and pass program arguments
        */
        public static void main(String[] args) {
            // args should contain numbers
//            int n;
            Scanner scan = new Scanner(System.in);
// need to use scanner so users input can be read
            System.out.println("Enter the number you'd like to check");

            int n = scan.nextInt();
            // you need this to scan the input as an int
            // in this case its .nextInt as we are working with numbers and not Strings which would be .nextLine

            if (n % 2 == 0) {
                System.out.println("This number " + n + " is even");
                // this is checking whether numbers are divisible by 2 if so then its even and it will print "This number " + n + " is even"
                // the "+ n +" enables the number that the user input to be embedded into the output sentence.
            } else {
                System.out.println("This number " + n + " is odd");
                // else is needed so that if the user inputs an odd number it will print this
                // its saying any number that is not divisible by 2 would in this case be odd
            }

        }
    }




