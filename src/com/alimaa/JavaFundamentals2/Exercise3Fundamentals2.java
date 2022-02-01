package com.alimaa.JavaFundamentals2;

public class Exercise3Fundamentals2 {
    public static void main(String[] args) {
        /*
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end
        */

        String greeting = "";

        String[] content = {"you", "are", "how", "hello"};
        for (int i = content.length - 1; i >= 0; i--) {
            // Content length - 1 because we want to look at
            greeting += content[i] + " ";
            //
        }
        System.out.println(greeting.substring(0, greeting.length() - 1) + "?");
        // substring - going to take part of the string that you tell it, need to state the start index and end index
        // greetings.lenght()-1 takes away a space and then + "?" adds the ?




    }
}

