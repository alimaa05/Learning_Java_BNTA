package com.alimaa.arrays_conditions_methods_exercies;

public class Main {

    public static void main(String[] args) {

         /*
        Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */

        // need a method that takes in a String[]  - so gonna need method and to use arrays
        // need a for loop to loop through each word of the array
        // will need an if else condition


        // making an instance of the method
        Exercise7ArraysConditionsMethods exercise7ArraysConditionsMethods = new Exercise7ArraysConditionsMethods();

        // stating the string array
        String helloInDifferentLanguages[] = {"hello", "bingo", "ola", "bye", "ciao"};

        // longestString is a placeholder -- then calling on the class and then the method followed by the StringArray initialised in the method
        String longestString = exercise7ArraysConditionsMethods.getLongestString(helloInDifferentLanguages);

        // returning longestString
        System.out.println(longestString);


    }

}
