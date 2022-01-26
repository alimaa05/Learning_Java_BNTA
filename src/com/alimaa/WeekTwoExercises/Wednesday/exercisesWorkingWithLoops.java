package com.alimaa.WeekTwoExercises.Wednesday;

public class exercisesWorkingWithLoops {
    public static void main(String[] args) {

// create a for loop which goes from 0 to 10
// print each value
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            // when i is 0, stop when i is more than or equal to 10 and each time you go through the loop increment by 1 starting at 0
            // then print this out
        }

        System.out.println("-----------");

// create a for loop which goes from 10 down to 0
// print each value

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            // nu2 is equal to 10, when going through the loop if nu2 is less than or equal to 0 loop stops
            // when it goes through the loop one it will decrement by 1 each time
            // then prints nu2
        }

        System.out.println("-----------");

// create a for loop which goes from 0 to 20
// print each even value

        for (int nu3 = 0; nu3 <= 20; nu3++) {
            if (nu3 % 2 == 0) {
                // nu3 divisible by 2 with no remainder will be printed
                // modulo operation %
                System.out.println(nu3);
            }

        }
    }
}
