package com.alimaa.methods;

import java.util.Arrays;

public class ExerciseWritingMethods {

    // METHODS INCLUDE
// access modifier, static, return type, name() {}

    // WHEN YOU DON'T USE STATIC
    // if we don't use the static keyword you need to create an instance in the main for that class
    // then add a name for that class we give i.e. placeholder = new, then name of class
    // then call on the placeholder .method you want to call
    // then in parenthesis the name of the variable you want to call from the method.


    // EXAMPLE - WRITE A METHOD THAT TAKES A NUMBER AS AN ARGUMENT, MULTIPLIES IT BY TWO AND PRINTS THE RESULT TO THE TERMINAL

    // a method that has the data types as an int, that will return a value, should have parameters
    // multiply that variable by 2 i.e. *2
    // print the result in the terminal by calling on it in the main

    public static int multiplyingNumberByTwo(int number) {
        int timesByTwo = number * 2;
        return timesByTwo;
    }

    // Q1 WRITE A METHOD WHICH TAKES TWO NUMBERS AS ARGUMENT AND PRINTS THEIR SUM TO THE TERMINAL.
    // writing a method that takes numbers as arguments so need to use int and need parameters
    // write a new variable that will add the two ints within the argument
    // then return that variable
    public static int addingTwoNumbersTogether(int number1, int number2) {
        // initialising the two variables as ints
        int totalSum = number1 + number2;
        return totalSum;
    }

    // Q2 WRITE A METHOD THAT TAKES A NUMBER AS AN ARGUMENT AND RETURNS THAT NUMBER NEGATED, E.G. PASSING 5 AS AN ARGUMENT SHOULD RETURN -5, PASSING -10 SHOULD RETURN 10.
    public static int returningNumberNegated(int number) {
        // creating a new method "returningNumberNegated" and passing through an int called number
        int numberNegated = number * -1;
        // creating a new variable, using the number variable from above and multiplying it by -1
//        int numberNegated = number = -number;
        // another way to do it is number is equal to -number
        return numberNegated;
        // returning the 'numberNegated variable'
    }

// Q3 WRITE A METHOD THAT TAKES TWO NUMBERS AS ARGUMENTS, CHECKS IF THEY ARE THE SAME AND RETURNS THE APPROPRIATE BOOLEAN VALUE.
//YOU SHOULD CHECK BOTH POSSIBLE OUTCOMES HERE I.E. THAT IT RETURNS TRUE WHEN IT'S SUPPOSED TO AND FALSE WHEN IT'S SUPPOSED TO.

    // create a method that takes 2 ints
    // create a boolean data type to indicate true and false
    public static boolean areNumbersAreTheSame(int firstNumber, int secondNumber) {
        // creating a method with a boolean data type that contains int within the parameters
        boolean isNotTheSame = false;
        // instantiating that the variable placeholder 'isNotTheSame' is equal to

        if (firstNumber != secondNumber) {
            return isNotTheSame;
        } else
            return true;
    }

// Q4 WRITE A METHOD THAT TAKES TWO NUMBERS AS ARGUMENTS AND PRINTS ONE OF:
// 1 - THE FIRST NUMBER IS LARGER
// 2- THE SECOND NUMBER IS LARGER
// 3- THE NUMBERS ARE EQUAL

    // a method that takes two number's as arguments
    public static boolean numbers(int numberOne, int numberTwo) { // boolean that contains int as arguments
        boolean firstNumberIsLarger = numberOne > numberTwo; // need a boolean data type, so it can be used within the if else condition
//        boolean secondNumberIsLarger = numberOne < numberTwo;
        boolean theNumbersAreEqual = numberOne == numberTwo;

        // if else statement so that if the values for variable numberOne is more than  numberTwo it will return true. if numberTwo is bigger then it returns false.
        if (numberOne > numberTwo) {
            return firstNumberIsLarger;
        } else if (numberOne < numberTwo) {
            return false;
        } else {
            // this one isn't functioning as expected
            return theNumbersAreEqual;
        }
    }

//Q5 WRITE A METHOD WHICH TAKES A STRING AS AN ARGUMENT, CAPITALISES THE FIRST LETTER AND RETURNS THE CAPITALISED STRING.

    // I CHANGED IT SO IT CAN BE PRINTED IN THE MAIN

    // Call method here and store result in variable
//        String result =capitalisedFirstLetter("hello");
    // print variable
//        System.out.println(result);

    // write method here
    // Pseudocode - i.e. plain English description of what code will do

    // Method signature - take a string as an argument then return a string
    public static String capitalisedFirstLetter(String inputString) {  // hello

        // Capitalise first letter of inputString
        String capitalisedString = inputString.substring(0, 1).toUpperCase() + inputString.substring(1);
        // .subString is taking a small section of the String in this case its starting at index 0 and stopping at index 1
        // then it's going to capitalise that one index
        // then adds (+) it to the rest of the subString

        // return modified String
        return capitalisedString;

    }

    //
    public static void convertArrayToString(String[] strings) {
        String v1 = Arrays.toString(strings);
// this .toString is a method
// . toString IS A METHOD USED WITHIN ARRAY CLASS, THE METHOD NEEDS AN ARRAY TO BE PASSED IN IT
        System.out.println("v1 " + v1);

        String v2 = strings.toString();
        // this just prints the memory location of the string
        System.out.println("v2 " + v2);


    }

// Q6 WRITE A METHOD THAT TAKES AN ARRAY OF STRINGS AS AN ARGUMENT AND RETURNS THE NUMBER OF ITEMS IN THE ARRAY

    // method - takes an array of strings as arguments
    public int arrayOfStrings(String[] stringArray) {  // int bec we want to return a number
        int result = stringArray.length;
        // calling a new variable as equal to the 'stringArray' which is the name of our string array
        // .length bec we want to return the number of items in this array
        return result;
        // must have a return - this returns the result variable

    }

    // Q7 WRITE A METHOD THAT TAKES A SENTENCE AS AN ARGUMENT, COUNTS THE NUMBER OF WORDS IN THE ARRAY AND PRINTS " THE SENTENCE CONTAINS x WORDS"
// USE WHAT YOU ALREADY KNOW, MAYBE REUSE ONE OF THE METHODS ABOVE.

    public int countNumberOfWordsInArray(String sentence) { // creating our method which takes in a string
        String[] sentenceArray = sentence.split(" ");
        // .split method splits the sentence and looks for whatever you put in the parenthesis i.e. spaces
        // creating a string array to split the sentence and put each word in the String array
        System.out.println(Arrays.toString(sentenceArray));

        int count = sentenceArray.length;
        return count;
    }


}
