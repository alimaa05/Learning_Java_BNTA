package com.alimaa.methods;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

// EXAMPLE - WRITE A METHOD THAT TAKES A NUMBER AS AN ARGUMENT, MULTIPLIES IT BY TWO AND PRINTS THE RESULT TO THE TERMINAL

        System.out.println(6 + " multiplied by two is = " + ExerciseWritingMethods.multiplyingNumberByTwo(6));
        // calling on the class where the method can be found then . name of method we want to print from
        System.out.println("_______________");

        // Q1 WRITE A METHOD WHICH TAKES TWO NUMBERS AS ARGUMENT AND PRINTS THEIR SUM TO THE TERMINAL.

        System.out.println(ExerciseWritingMethods.addingTwoNumbersTogether(4, 6)); // calling on the calls and then the method we want to print from
        System.out.println("_______________");

// Q2 WRITE A METHOD THAT TAKES A NUMBER AS AN ARGUMENT AND RETURNS THAT NUMBER NEGATED, E.G. PASSING 5 AS AN ARGUMENT SHOULD RETURN -5, PASSING -10 SHOULD RETURN 10.
        System.out.println(ExerciseWritingMethods.returningNumberNegated(4));
        System.out.println("_______________");


// Q3 WRITE A METHOD THAT TAKES TWO NUMBERS AS ARGUMENTS, CHECKS IF THEY ARE THE SAME AND RETURNS THE APPROPRIATE BOOLEAN VALUE.
        System.out.println(ExerciseWritingMethods.areNumbersAreTheSame(11, 7));
        System.out.println("_______________");

// Q4 WRITE A METHOD THAT TAKES TWO NUMBERS AS ARGUMENTS AND PRINTS ONE OF:
// 1 - THE FIRST NUMBER IS LARGER
// 2- THE SECOND NUMBER IS LARGER
// 3- THE NUMBERS ARE EQUAL

        System.out.println("The first number is larger = " + ExerciseWritingMethods.numbers(4, 7)); // works
        System.out.println("_______________");

        System.out.println("The second number is larger = " + ExerciseWritingMethods.numbers(9, 7)); // works
        System.out.println("_______________");

        System.out.println("The numbers are equal = " + ExerciseWritingMethods.numbers(5, 5));
        // this is printing false if the second number is over 5 but prints true it's less than five ???
        System.out.println("_______________");


//Q5 WRITE A METHOD WHICH TAKES A STRING AS AN ARGUMENT, CAPITALISES THE FIRST LETTER AND RETURNS THE CAPITALISED STRING.
        // Call method here and store result in variable and printing the variable
        System.out.println(ExerciseWritingMethods.capitalisedFirstLetter("hello"));
        System.out.println("_______________");


// Q6 WRITE A METHOD THAT TAKES AN ARRAY OF STRINGS AS AN ARGUMENT AND RETURNS THE NUMBER OF ITEMS IN THE ARRAY
        ExerciseWritingMethods exerciseWritingMethods = new ExerciseWritingMethods(); // instance of my class

        String[] stringArray = {"Alimaa", "Suad"}; // stating the values of our string array

        System.out.println(exerciseWritingMethods.arrayOfStrings(stringArray)); // printing the class placeholder and method and in parameters the name of the string array
        System.out.println("_______________");


        // Q7 WRITE A METHOD THAT TAKES A SENTENCE AS AN ARGUMENT, COUNTS THE NUMBER OF WORDS IN THE ARRAY AND PRINTS " THE SENTENCE CONTAINS x WORDS"
// USE WHAT YOU ALREADY KNOW, MAYBE REUSE ONE OF THE METHODS ABOVE.

        String sentence = "Alimaa is the best!";
        System.out.println("The sentence contains " + exerciseWritingMethods.countNumberOfWordsInArray(sentence) + " words");


    }


}
