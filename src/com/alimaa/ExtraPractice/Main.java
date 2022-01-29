package com.alimaa.ExtraPractice; // this is the PACKAGE

import java.time.LocalDate;

public class Main { // this is the CLASS

// JAVA SYNTAX AND HOW IT WORKS
// for every line there are semiColons
// if there's something wrong with the syntax, you will get a syntax error
// within {} you can have other statements
// java syntax is robust

    public static void main(String[] args) { // this is a METHOD - the method here contains a String array (String[]) which requires square brackets
        // this is the main entry point to run program
        System.out.println("Hooray my first java program"); //single line - must start with single line
        // - this is a String which require double quotes // in comparison the line of code below is a data type -->

        char a = 'A'; // char is a DATA TYPE - with data types you can use single quotes


//PACKAGES
// a way for you to organise your classes together
// the actual package is basically a folder structure
// it's a directory structure that allows you to group classes together
// you can nest packages - i.e. packages within packages
// create classes within packages (classes within java should start with cap and then following ford should follow with a cap also)


// COMMENTS
// when you run the code comments won't print i.e. they're ignored
// it's useful for documenting your code
// can have single line comments i.e. //
// can have multiline comments i.e. /* ------ */
// useful to help other developers understand your code as well

// VARIABLES
// e.g. think of pur variable like a box - within the box we can only store things but only one value, and we can store anything e.g. a pen which we store in the box // arrays can store multiple things
// If we want to access our variable we simply refer to it
// the variable has a name and that's how we actually get a hold of the variable
// when defining a variable need to specify the data type i.e. what goes inside the variable

// CREATING VARIABLES
// PLACEHOLDER where you can store values
// first need to decide on the data type 1)primitive data type 2) reference data type
// e.g. variable where you want to store a number inside
// --> int number = 100; (int is a primitive data type, number is the placeholder i.e. the variable name, 100 is the value)
// e.g. String brand = "Amigoscode"; (String data type, brand is variable name, "Amigoscode" is value or content inside)
// data types - primitive used to store single values like numbers or single characters
// data types - reference types or objects - for complex data types e.g. trying to find out the current date --> Date date = new Date();
        // needs import statement to ensure it works
        // creating reference types or objects are slightly diff bec they're more special
        // when you see NEW it's because it's a reference type meaning the data type is more complex than primitives

// PRIMITIVE DATA TYPES
        byte theByte = -128;
        //--> byte is a reserved key word like static, void etc.
        // byte stores whole numbers from -128 to 127

        short theShort = 8989;
        // stores whole numbers from -32,768 to 32,767

        int theInt = 787858;
        // sores whole numbers from -2,147,483,648 to 2,147,483,647

        long theLong = 7858038448883L;
        // stores even bigger whole numbers
        // with longs you need to add an L can be lowercase as well

        // these larger numbers can be hard to read --> you can simply add _ to separate out the numbers and visualise it better e.g. 32_000 or 787_838_334

        // THE DIFF BETWEEN THE DATA TYPES ABOVE IS THE SIZE IN WHICH THEY CAN STORE IN TURN THE BYTE SIZE WILL ALSO DIFFER

        float pi = 3.14F;
        // decimal number
        // needs an F or f after the number
        // sufficient for 6-7 decimal digits

        double doublePi = 3.1415;
        // also for decimals
        // can sufficiently store up to 15 decimal digits

        boolean isAdult = false;
        //true;
        // default for boolean is false

        char nameInitial = 'A';
        // stores single characters
        // must be within single quotes

        // to print it
        //system.out.println(VARIABLE NAME);

// NON-PRIMITIVE DATA TYPES I.E. REFERENCE TYPES
// V special - you need a lot of these to build your application
// Majority of your code will be based of reference types

        String name = new String("Amigoscode");
        // one diff between ref types and primitives - ref type always start with uppercase i.e. String has uppercase but int doesn't
        // with Strings you can get lots of different attributes when you add . after the String name  but you don't get that with primitives
        // a String is a ref type that allows you to store a sequence of characters
        System.out.println(name);
        System.out.println(name.toUpperCase());
        // ref types give you built in behaviours
        // when you build your own, you can define those behaviours

        // there are lots of built-in data types - we have lots of classes we can use
        LocalDate now = LocalDate.now(); // local date is the data type  // now is the variable name
        System.out.println(now); // printing the local date
        System.out.println(now.getMonth()); // lots of different methods built into java
    }


}
