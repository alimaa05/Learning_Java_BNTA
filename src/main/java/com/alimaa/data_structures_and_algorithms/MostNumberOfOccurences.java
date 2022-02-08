package com.alimaa.data_structures_and_algorithms;

import java.util.Arrays;
import java.util.List;

public class MostNumberOfOccurences {

    public static void main(String[] args) {


        //    Most Number Of Occurrences
//    Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
//    Find the element that has the most number of occurences
//    Your method should return something like the 1 since it occurs 4 times
//    Think about the data structure that you should use
//    Create a method. Think about the return type and parameters
//    Write unit tests for your method


        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";

    }

//    List<Integer> list = Arrays.asList(1,3,4,3,4,3,2,3,3,3,3,3);


    // data structure to use - list array
    // method with a return type and parameters


    // method creating a list data structure taking in my variable which will then be converted into a list
    public void modeNumbers(String input) {

        // instance of the method in Q1
        MostOccurences mostOccurences = new MostOccurences();
        // convert map to string
        mostOccurences.check(input).toString();

        // converting my string array into a list of strings
        List<String> mostNumberOfOccurences = List.of(input);


        // steam (filter through the list of strings, distinct eliminates duplicates, .toList return a new list
        // gives us a list of the keys with no duplicates
        List<String> filterNumbers = mostNumberOfOccurences.stream().distinct().toList();

        // variable to track which is the highest number
        int count = 0;

        // loop through filterNumbers
        // create placeholder and put the element with highest occurrence in that placeholder
        for (String e : filterNumbers) {

        }
        System.out.println(filterNumbers);

    }

}
