package com.alimaa.WeekTwoExercises.Wednesday;

import java.util.Arrays;

public class exercisesWorkingWithLoops {
    public static void main(String[] args) {

//Q1
// create a for loop which goes from 0 to 10
// print each value
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            // when i is 0, stop when i is more than or equal to 10 and each time you go through the loop increment by 1 starting at 0
            // then print this out
        }

        System.out.println("-----------");

//Q2
// create a for loop which goes from 10 down to 0
// print each value

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            // i is equal to 10, when going through the loop if i is less than or equal to 0 loop stops
            // when it goes through the loop one it will decrement by 1 each time
            // then prints i
        }

        System.out.println("-----------");

//Q3 CREATE A LOOP THAT PRINTS ALL THE EVEN NUMBERS FROM 0-20
// create a for loop which goes from 0 to 20
// print each even value

        for (int nu3 = 0; nu3 <= 20; nu3++) { // to make it exclude 0 you can do int nu3 = 1
            if (nu3 % 2 == 0) {
                // nu3 divisible by 2 with no remainder will be printed
                // modulo operation %
                // == comparing one thing to another thing i.e. x is equal to y
                System.out.println(nu3);
            }
        }
        System.out.println("-----------");

//Q4 CREATE A LOOP THAT ADDS ALL NUMBERS 0-10 TO AN ARRAY THEN PRINTS THE ARRAY
// create an array. Remember to manually set the size
// create a for loop which goes from 0 to 10, adding each value to an array
// print our array

        int[]  nu4ArrayLoop = new int[11];
        // this is the array called nu4ArrayLoop, the size i.e. 11 is entered manually i.e. the length is 11
        // its 11 because we want it to print numbers 0 to 10
        for (int i =0; i <=10; i++ ){
            // this is the for loop, here we said 1) that i (index) is 0,
            // 2) when we go through the loop when i becomes greater than or equal to 10 then the loop will stop
            // 3) each time we go through the loop I will increment by 1
//            nu4ArrayLoop[i]=i;
            nu4ArrayLoop[i]=i;
            // this connects the loop and the array, nu4ArrayLoop[i] is referring to the loop variable i and saying its equal to i in the loop?
        }

        String output = Arrays.toString(nu4ArrayLoop);
        // making a variable which we names 'output' so that the int array can be printed
        System.out.println(output);
        // this prints the output


        System.out.println("-----------");

//Q5 CREATE A LOOP THAT PRINTS EACH ITEM IN AN ARRAY
// using your answer from Question 4, create a for loop that goes through the values
// print each value individually

        for (int item :nu4ArrayLoop){ // this prints the numbers within the array individually.
            System.out.println(item); // printing it the new variable that will print them individually is called item
        }

        System.out.println("-----------");

//Q6 CREATE A LOOP THAT ADDS TO A SUM. PRINT THE SUM.
// create a sum variable
// using your answer from Question 4, create a for loop that goes through the values
// add each item to the sum value
// print the total sum

    }
}
