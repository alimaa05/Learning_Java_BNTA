package com.alimaa.data_structures_and_algorithms;

import java.util.*;


public class MostNumberOfOccurences {


    //    Most Number Of Occurrences
//    Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
//    Find the element that has the most number of occurences
//    Your method should return something like the 1 since it occurs 4 times
//    Think about the data structure that you should use
//    Create a method. Think about the return type and parameters
//    Write unit tests for your method


//    String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";


    // method called modeNumber - creating a Hashmap data structure taking in my variable, included return type and parameters
    public List<String> modeNumber(String input) {

        // if statement - if input is equal to null || if input is .Empty
        //return emptyList
        if (input == null || input.isEmpty()){ // why does Null HAVE TO go before .isEmpty
            return Collections.emptyList();
        }



        // instance of the method in Q1
        MostOccurences mostOccurences = new MostOccurences();
        // creating a new hashmap // calling on our method within MostOccurences class - so the values are equal to the 'check' method
        HashMap<String, Integer> mostCommon = mostOccurences.check(input);

        // having something for the values to compare against
        int max = 0;
        // storing a the mostCommon value within the list - list bec there could be more than one mostCommon number
        List<String> maxValuesList = new ArrayList<>();

        //for loop - looping though the variable mostCommon and
        // for each entry within the mostCommon entry set
        // looping through the mostCommon entry set i.e. each (k,v)
        for (Map.Entry<String, Integer> entry : mostCommon.entrySet()) {
            /// check if the value is greater than max i.e. 0
            if (entry.getValue() > max) {
                // if value is greater than max i.e. 0 we're gonna replace 0 with the value of that entry point
                max = entry.getValue();
                // this is clearing the list
                maxValuesList.clear();
                // to add corresponding key from entry to String list called maxvalue
                maxValuesList.add(entry.getKey());

            } else if (entry.getValue() == max) {
                maxValuesList.add(entry.getKey());

            }

        }// return the list
        return maxValuesList;

    }

}



