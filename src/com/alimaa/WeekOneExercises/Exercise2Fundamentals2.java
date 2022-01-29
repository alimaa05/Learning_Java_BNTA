package com.alimaa.WeekOneExercises;

public class Exercise2Fundamentals2 {
    public static void main(String[] args) {
        /*  Write a program that compares two String contents. i.e x > y
            Create 3 variables.
            2 to store both strings and 1 to store the result
            Print the result
        */
       String alimaa = "Bangladesh";
       String wendy = "Ghana";

      // boolean result = (alimaa==wendy);

       boolean result = (alimaa.equals(wendy));

        System.out.println(result);

    }
}

