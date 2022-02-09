package com.alimaa.data_structures_and_algorithms;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        // instance of the class
        MostOccurences mostOccurences = new MostOccurences();

        System.out.println(mostOccurences.check(mostOccurences.input));

        MostNumberOfOccurences mostNumberOfOccurences = new MostNumberOfOccurences();

        System.out.println(mostNumberOfOccurences.modeNumber(mostOccurences.input));




    }
}
