package com.alimaa.data_structures_and_algorithms;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MostOccurencesTest {

    @Test
    void itCanReturnTheMostOccurrenceForEachElement() {
        // Given
        MostOccurences mostOccurences = new MostOccurences(); // instance of the class

        String input = "a,1,3,1,a,5";

        // When
        HashMap <String, Integer> actual = mostOccurences.check(input);
        // data structure of our method we want to test
        // and what we want to test

        // Then
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put( "a",2);
        expected.put("1", 2);
        expected.put("3", 1);
        expected.put("5", 1);
        assertThat(actual).isEqualTo(expected);
    }
}