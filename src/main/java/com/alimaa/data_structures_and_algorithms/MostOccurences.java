package com.alimaa.data_structures_and_algorithms;

import java.util.HashMap;

public class MostOccurences {

    //Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
    //Find the number of occurences for each element
//    Create a method. Think about the return type and parameters
//    Write unit tests for your method

    String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";

    public HashMap<String, Integer> check(String input) {
        HashMap<String, Integer> map = new HashMap<>();
        // .split because we want the individual numbers and it's currently a String and in this case .split will split the String everytime there is a comma
        String[] split = input.split(",");
        // enhanced for loop
        for (String e : split) { // looping through the array called split and looking at each element in the array (e = element)
            // if condition
            if (!map.containsKey(e)) {
                // if the map doesn't contain "e" (element) then
                map.put(e, 1); // put "e" in the map and setting the value as 1 for each key
            } else {
                // if it does contain that element then add one to that key within the map
                int count = map.get(e) + 1; // creating the variable to add 1 each time there's a repeat of the same element
                map.put(e, count); // putting it in the count variable with that element in the map
            }
        }
        return map;

    }

}

// Key - element within the list
// Value - the number of times it occurs
