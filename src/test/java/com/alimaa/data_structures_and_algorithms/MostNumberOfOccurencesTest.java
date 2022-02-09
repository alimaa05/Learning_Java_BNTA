package com.alimaa.data_structures_and_algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MostNumberOfOccurencesTest {

    @Test
    void itCanReturnMostCommonNumberWithOnlyOneMode() {
        // Given
        MostNumberOfOccurences mostNumberOfOccurences = new MostNumberOfOccurences(); // instance of the class

        String input = "a,a,1,3,1,a,5,3,3,3";

        // When
        List<String> actual = mostNumberOfOccurences.modeNumber(input);
        // data structure of our method we want to test
        // and what we want to test

        // Then
        List<String> expected = Arrays.asList("3");

        assertThat(actual).isEqualTo(expected);
    }
}