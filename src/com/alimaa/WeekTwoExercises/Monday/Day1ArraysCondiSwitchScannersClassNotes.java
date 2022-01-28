package com.alimaa.WeekTwoExercises.Monday;

import java.util.Arrays;

public class Day1ArraysCondiSwitchScannersClassNotes {


        public static void main(String[] args) {


// WORKING ON ARRAYS
            String name = "Wendy, Linda, Will";
            String[] names = {"Wendy", "Linda", "Will"}; //this is an array of strings
           // String[] names = new String[5];
           // names[0] = "Wendy";
           // names[1] = "Linda";
            // names[2] = "Will";
            // System.out.println(names);
            System.out.println(Arrays.toString(names)); // this is printing the array

            double[] nums = new double[3]; // double is used for decimals, this is an array for decimals, it has 3 elements

            // Arrays.fill(nums, -1);

            System.out.println(Arrays.toString(nums)); // this is printing the decimals array

            System.out.println(names.length); // this is telling us the length of the first array
            System.out.println(nums.length); // this is telling us the length of the second array




            String[] namez = {"Wendy", "Linda", "Will", "Alex", "Nasir", "Hajr"};

            for (int i = 0; i < namez.length; i++) {
                // i is equal to 0 starting at Wendy, i < names.length means stop when i is bigger than the length of our array namez
                // and i++ means go up by one each time the loop is completed
                System.out.println(namez[i + 2]);
                        // at i miss two
            }
            for (String forename : namez) {
                System.out.println(forename);
                        // printing out the names
            }




// IF, ELSE AND IF ELSE STATEMENTS AND CONDITIONS
//            String hello = "Hello";
//            // our string
//            if (hello.equals("Ola")) {
//                System.out.println("Portuguese");
//                // if its ola then prints portuguese
//            } else if (hello.equals("Hello")) {
//                System.out.println("English");
//                // or if its not ola and its hello, print english
//            } else if (hello.equals("Ciao")) {
//                System.out.println("Italian");
//                // if its not ola or hello and it is ciao then print italian
//            } else {
//                System.out.println("Oops I dont know the language");
//                // if it doesn't say either ola, hello or ciao then print i dont know
//            }



// SWITCH - EASIER WAY TO DO IF ELSE STATEMENTS
            String hello = "   OLA    ";
//
            if (hello.equals("ola")) {

            } else if (hello.equals("ciao")) {

            } else {
//
            } switch (hello.trim().toLowerCase()) {
                case "ola":
                    System.out.println("Portuguese");
                    break;
                case "ciao":
                    System.out.println("Italian");
                    break;
                default:
                    System.out.println("Opps I dont know");
            }
//


// READING USER INPUT WITH SCANNER CLASS
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Translate");
//
//            String input = scanner.nextLine();
//
//            if (input.equals("Ola")) {
//                        System.out.println("Hello");
//                        // If user writes ola then hello prints
//            } else if (input.equals("Hola")) {
//                        System.out.println("Hello");
//                        // if they dont' and they write hola instead then hello prints
//            } else {
//                System.out.println("Language not supported");
//                // if neither of these and another language then prints 'lang not supported'

            }
        }












