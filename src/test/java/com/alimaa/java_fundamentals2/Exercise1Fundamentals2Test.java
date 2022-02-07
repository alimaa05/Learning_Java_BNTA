package com.alimaa.java_fundamentals2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Exercise1Fundamentals2Test {

    @Test
    public void canCompareHigherWithLower() {
        // given
        Exercise1Fundamentals2 underTest = new Exercise1Fundamentals2();
        int num1 = 3;
        int num2 = 2;


        // when
        boolean expected = (num1 < num2);

        // then
        assertThat(expected).isEqualTo(false);


    }
}