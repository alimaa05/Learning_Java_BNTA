package com.alimaa.data_structures_and_algorithms;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


//        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";

        String input = "7,7,1,3,1,7,5,3,3,3";

        // instance of the class
        MostOccurences mostOccurences = new MostOccurences();

//        System.out.println(mostOccurences.check(mostOccurences.input));

        System.out.println(mostOccurences.check(input));

        MostNumberOfOccurences mostNumberOfOccurences = new MostNumberOfOccurences();

        System.out.println(mostNumberOfOccurences.modeNumber(input));




    }
}
