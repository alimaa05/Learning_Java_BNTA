package com.alimaa.WeekTwo.Monday;

public class Exercise2ArraysConditionsMethods {
    /*
      Given the following String input
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */

    public static String okay(String input){
        // this word in yellow can be absolutely anything
        String spacesRemoved = input.replaceAll(" ","");
        // replacing the words with spaces with no spaces between them
        System.out.println(spacesRemoved);
        return spacesRemoved.substring(0,1).toUpperCase() + spacesRemoved.substring(1,6) + " " + spacesRemoved.substring(6,7).toUpperCase() + spacesRemoved.substring(7);
        // changing the first letter of each word to a capital
        //substring(0,1) means were taking 0 i.e. b, making it capital and stopping at 1 i.e. r
        //
    }

    public static void main(String[] args) {
        System.out.println(okay("   b ri   ght net   work  "));


    }
}
