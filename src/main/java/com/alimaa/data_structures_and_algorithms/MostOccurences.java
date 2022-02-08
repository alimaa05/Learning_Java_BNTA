package com.alimaa.data_structures_and_algorithms;

import java.util.HashMap;

public class MostOccurences {


    String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";

    public HashMap<String, Integer> check(String input) {
        HashMap<String, Integer> map = new HashMap<>();
        // .split because we want the individual numbers and it's currently a String and .
        String[] split = input.split(",");
        // enhanced for loop
        for (String e : split) {
            // if condition
            if (!map.containsKey(e)) {
                // if the map doesn't contain "e" (element) then
                map.put(e, 1); // put "e" in the map and setting the value as 1 for each key
            } else {
                // if it does contain that element then add one to that key within the map
                int count = map.get(e) + 1;
                map.put(e, count);
            }
        }
        return map;

    }

}

// Key - element within the list
// Value - the number of times it occurs
