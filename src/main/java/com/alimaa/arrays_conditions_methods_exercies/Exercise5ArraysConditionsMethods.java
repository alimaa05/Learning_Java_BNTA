package com.alimaa.arrays_conditions_methods_exercies;

import java.util.Random;
import java.util.Scanner;

// ARRAYS, CONDITIONS AND METHODS

/*
        Write a method that displays random joke to the user.
        Your program should stop displaying jokes when use inputs no.
        For e.g
        Want to hear a joke? Yes/No
            if yes then display joke and repeat same question
            if no then program should exit
    */

public class Exercise5ArraysConditionsMethods {

    public static void main(String[] args) {


//            System.out.println("Want to hear a joke?");
//            System.out.println("Yes/No");
        // this prints these Strings


        String input;
        //whatever the user inputs , internalising input

        //LOOP THROUGH IF "YES" IF NOT EXIT
        boolean keepAsking = true;
        // boolean is automatically false so need to state that its true in this case

        while (keepAsking) {
            input = userInput(); // this is calling on the method that takes the users input and repeats the questions
            if (input.equals("Yes") || input.equals("yes") || input.equals("y")) { // this will keep asking the question if the user returns Yes,yes or y
                System.out.println("Here's your joke");
                displayingRandomJokes(); // this is calling on the random generator function
                // if user writes Yes, yes or y then the method before will be invoked
//                displayingRandomJokes();
            } else if (input.equals("No") || input.equals("no") || input.equals("n")) {
                System.out.println("You said no, so you have exited.");
                keepAsking = false;
                // need to state that the boolean 'keepasking' is false otherwise even if users input no then it will repeat the question
                // this --> || means or so if the user in puts either No no or n then it will exit the loop
            } else {
                // if any other input aside from Yes(yes,y) and No (no,n) it will print this -->
                System.out.println("Please try again, with yes or no");
            }
        }
    }

    // METHODS TO INVOKE
     static void displayingRandomJokes() {
        String[]randomJokesArray = new String[3];
        // using an array // this is an alternative way of writing an array i.e. if you know what all your Index will be and if they aren't going to change
        randomJokesArray[0] = "I can’t believe I got fired from the calendar factory. All I did was take a day off!";
        randomJokesArray[1] = "Money talks. Mine always says goodbye.";
        randomJokesArray[2] = "I went to see the doctor about my short-term memory problems — the first thing he did was make me pay in advance.";
        // these are my jokes that I've included in an array, so if 0 is called it will print "I can't believe I got fired..."
//        System.out.println(Arrays.toString(randomJokesArray));
         Random randomNumber = new Random();
         // this is the random number generator function
         int i =randomNumber.nextInt(randomJokesArray.length);
         System.out.println(randomJokesArray[i]);

    }

    static String userInput() { // this takes in the users input and returns the questions
        Scanner n = new Scanner(System.in);
        System.out.println("Want to hear a joke?");
        System.out.println("Yes/No");

        String input = n.nextLine();
        return input;
    }



    // method is preferable because you want to use it at the beginning and then repeat it again, so your calling it more than once

}
