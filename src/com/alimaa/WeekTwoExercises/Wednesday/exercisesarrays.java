package com.alimaa.WeekTwoExercises.Wednesday;

import java.util.Arrays;

public class exercisesarrays {

    public static void main(String[] args) {

//Q1 DECLARE INGETER ARRAY WITH LENGTH OF 3
// declare an empty integer array of length = 3

        int[] empty = new int[3];
        // 3 within the square brackets is stating the length of the int array
        // on the left of equal is declaring
        // on the right is initialising and stating length

        System.out.println("----------");

//Q2 PRINTING AN ARRAY TO CONSOLE
// using your array from Q1, print the contents to the console

        System.out.println(Arrays.toString(empty)); // this prints an array
        System.out.println(empty);// if you were to just print empty then it prints the reference in the stack, the position in the memory location


        System.out.println("----------");

//Q3 PUTTING INFO INTO OUR ARRAY WITH.FILL()
// using your array from Q1, fill it with the number `4`
// print the array to the console

//        int[] empty = new int[3];  // commented this out as it's already stated above
          Arrays.fill(empty,4);  // this fills the previously names array with the number for, using the function Array.fill()
//        we can modify arrays - we don't need a new variable we just need to modify

         System.out.println(Arrays.toString(empty)); // printed this again so the above code can be returned

        for (int i = 0; i < empty.length; i++){
            empty[i]=4;
            // this is another way to print and change all the elements in the array to 4
        }

        System.out.println(Arrays.toString(empty));


        System.out.println("----------");


//Q4 ASSIGNING VALUE TO ARRAY BY INDEX
// adding onto your code from questions 1-3, reassign the second value in the array to the number `17`
// print the array to the console

        empty[1] = 17;

        System.out.println(Arrays.toString(empty));

        System.out.println("----------");


//Q5 DECLARING AND INITIALISING AN ARRAY IN ONE
// declare and initialise a String array which holds the values "a", "b", "c" and "d"
// print the array to the console

        String[] StringArray = {"a", "b", "c", "d"};
        //initializing and decalring a String array and this holds values a,b,c,d
        System.out.println(Arrays.toString(StringArray));
        // printing the array to console

        // new String[] use this when we might not be sure of how many values, or what you want to put in it

        System.out.println("----------");

//Q6 CREATING AN ARRAY FROM ANOTHER.
// using your answer to Q5, create a second array which is initialised using your original array
// hint: instead of using the `new` keyword, try simply giving the name of your original array
// change the value at index 0 of the new array to "z"
// print both of your arrays and compare

        String[] stringArray2 = StringArray;
        // here we're saying our new decalred array i.e. stringArray2 is equal to the values of our inital array i.e. StringArray
        stringArray2[0]="z";
        // here we're replacing the index 0 in stringArray2 as "z"
        System.out.println(Arrays.toString(stringArray2));
        // this is printing the new array
        System.out.println(Arrays.toString(StringArray));
        // here the initial array has the same output as the new array because it has the same reference point in our stack
        //passing by reference

//Q6b


//Q7

        // the stuff after : colon is what were looping over

//Q8

    }

}
