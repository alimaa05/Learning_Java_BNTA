package com.alimaa.WeekTwo.Monday;

public class Exercise1ArraysConditionsMethods {
    /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */
    public static void main(String[] args) {
        // invoke your function here
        System.out.println(reverse("Alimaa"));
        // this is in the main so essentially anything you put here can be printed by the below function
    }


        static String reverse(String input){
        // reverse is essentially just a name
            String output = "";
            for (int i = input.length()-1; i>=0; i--) {
                output = output + input.charAt(i);
                // charAt is a function that already exists, taking an input e.g. string (i) is taking the index out
            }
            return output;
        }

}

// Iain's example and notes
    /* public static String reverse(String str) {

        String input = str;
        // assigns a variable to our input (just for clarity)

        String reversedStr = "";
        // initialise our output string

        for (int i = 0; i < (input.length()); i++) {

// for loop which starts at 0 and goes up the length of the input. With the less than symbol, it goes up to ONE LESS than the length - this accounts for Java starting at index 0

            char letter = input.charAt(input.length() - i - 1);
            // grabs the character in the word, starting from the end of the string

            reversedStr += letter;
            // adds each character to our output string
        }

        return reversedStr;
    }

     */