package com.alimaa.WeekTwoExercises.Thursday;

import java.util.Arrays;

public class ExerciseWritingMethods {

    public static void main(String[] args) {

//Q5 Write a method which takes a string as an argument, capitalises the first letter and returns the capitalised string.

        // Call method here and store result in variable
        String result =capitalisedFirstLetter("hello");
        // print variable
        System.out.println(result);


    }

    // write method here
    // Pseudocode - i.e. plain English description of what code will do

    // Method signature - take a string as an argument then return a string
    public static String capitalisedFirstLetter(String inputString){

        // Capitalise first letter of inputString
        String capitalisedString = inputString.substring(0,1).toUpperCase() + inputString.substring(1);
        // .subString is taking a small section of the String in this case its starting at index 0 and stopping at index 1
        // then it's going to capitalise that one index
        // then adds (+) it to the rest of the subString

        // return modified String
        return capitalisedString;

    }

    //
    public static void convertArrayToString(String[] strings){
        String v1 = Arrays.toString(strings);
// this .toString s a methodTOsTRING IS A METHOD USED WITHIN ARRAY CALSS , THE METHOD NEEDS AN ARRAY TO BE PASSED IN IT
        System.out.println("v1 " + v1);

        String v2 = strings.toString();
        // this just prints the memory location of the string
        System.out.println("v2 " + v2);


    }

}
