package com.alimaa.arrays_conditions_methods_exercies;

public class Exercise7ArraysConditionsMethods {

      /*
        Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */


    String helloInDifferentLanguages[] = {"hello", "bingo", "ola", "bye", "ciao"}; // String Array and content of array

    // method that takes a String Array
    public String getLongestString(String[] helloInDifferentLanguages) {

        // initialising i is equal to 0
        int maxLength = 0;
        // initialising a placeholder which will be returned at the end
        String longestString = "";

        // enhanced for loop --> s is a placeholder
        //  and everytime you loop through the index(element) in array it will be temporarily placed in the placeholder
        for (String s : helloInDifferentLanguages) {

            // if condition --> if the length of element is bigger then 'maxLength' which is equal to 0
            if (s.length() > maxLength) {
                // then maxLength will be replaced and now be equal to the element i.e. s.length
                maxLength = s.length();
                // initialising that the placeholder longestString is equal to s -- i.e. the variable 'longestString' will have the value of 's'
                longestString = s;
            }  // returning longestString - it's the string initialised at the top which is now each to 's' which holds the values of the String array

        }
        return longestString;
    }

}
