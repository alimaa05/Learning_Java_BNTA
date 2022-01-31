package com.alimaa.WeekOne;


public class Exercise5Fundamentals2 {
    /*
       Write a program that takes numbers from the program args and loops through args and print each item in args
       Compile using: javac and run using: java
       i.e. javac Exercise5.java | java Exercise5 foo bar baz
     */
    public static void main(String[] args) {
        // loop through args here
        for (int i =0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
// ➜  WeekOneExercises java exercise5.java Alimaa is amazing
//Alimaa
//is
//amazing