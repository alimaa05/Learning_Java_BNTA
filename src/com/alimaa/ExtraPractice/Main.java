package com.alimaa.ExtraPractice; // this is the PACKAGE

import javax.management.ValueExp;
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

        char c = 'C'; // char is a DATA TYPE - with data types you can use single quotes


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
// ---------------------------------------------
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


// PRIMITIVE AND REFERENCE TYPES DIFFERENCES
// ---------------------------------------------

        int a = 10; // define variable named a
        int b = a; // defined variable b equals a
        a = 100;
        System.out.println("a " + a + " - b = " + b);
        // when we say (b) equals to (a), the (a) that goes into (b) is passed by copy i.e. it's a copy of (a)
        // so if we change (a), the value of (b) is untouched
        // COMPUTER MEMORY -->
        // we have addresses, each address is where we store the variables
        // variable (a) is a primitive, and it stores the value 10
        // new variable (b) which is equal to (a)
        // with primitives it creates b in a different memory location and has the copy of (a) in the new memory address
        // so in this case, even though we changed (a) to 100, (b) is untouched bec it lives in a different memory address

// BUT WITH REFERENCE TYPES THIS IS SLIGHTLY DIFFERENT
// ---------------------------------------------

        Person alex = new Person("alex"); // creating a Person object
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name); // both alex and marian are pointing to the initial object

        alex.name  = "Alexander";  // mariam changes to alexander as well because they are pointing to the same reference

        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);
    }
    static class Person { // this is a class where we can create reference types or i.e. objects
        String name;
        Person(String name) {
            this.name =name;
        }
        // with ref types is diff to primitives and how objects are stored in the memory
        // Person("Alex") - this is the object, and it's somewhere in the memory
        // then we have alex, the actual thing, and this is the reference to our object
        // THIS IS THE MAIN DIFFERENCE ALEX IS A REFERENCE TYPE FOR THE OBJECT - PERSON("ALEX")
        // we also have mariam A REFERENCE TYPE, which is equal to alex, but it doesn't point to alex, it points to the Object Person("Alex")
    }

// NAMING VARIABLES
// ----------------------

    //should name your variables in ways that make a lot of sense
    int number = 0;
//    int number = 1; // this clashes
    double pi = 2.1415;

    // need to name the variables in clear ways, that the variable corresponds to the actual value

    // when you have to or more words for variable names need to use camel case
    // i.e. numberZero --> the second word starts with uppercase and first word starts with lowercase

// THE STRING CLASS
// a series of characters

    String name = new String("Amigoscode");
    // the String data type is a default by java - allows you to hold values but you can also perform a lot of stuff
    // String data type is a class - name is an object of type string
    // objects have behaviours associated with it -->

    // sout.out.println(name.toUpperCase);
    // toUpperCase() is a method which performs a behaviour i.e. UpperCases every character within the sequence

    //SOME METHODS
    //e.g.  system.out.println(name.charAt(0)); // charAt grabs a specific character a given position
    // e.g. System.out.println(name.contains(code)); // checks whether the String contains a specific thing
    // e.g. System.out.println(name.equals(code)); // to see whether name is the same or equal to something else

    // REFERRING TO LINE166 --> String (DATA TYPE - REF TYPE), name (IS THE NAME OF THE OBJECT), name String (THIS GIVES YOU AN OBJECT, IT CREATES THE OBJECT)
    // you can then INVOKE methods within your OBJECTS


    // **data types that start with capital is a class where you can create objects and can invoke methods inside  that method

    // whenever you work with Strings you don't always need the 'new String'

//CONCATENATING STRINGS
// ---------------------------------------------

//        String name ="Alex";
//        String surname = "Jamier";
//        String fullName = name + " " + surname;
//        System.out.println(fullName);

        // this also works with numbers but the entire thing will still be a string

    // can also do the following --> String fullName = name.concat(" ").concat(surname);


// PACKAGES AND IMPORT STATEMENTS
// ---------------------------------------------

// the package keyword tells us where we are
// when defined this we created our project

// there are also import statements - it tells you from which package, and it imports, so you can use the diff classes
// imports come from different packages and used for different classes

// but anything that comes from JAVA.lang doesn't have import statement e.g. String

// RESERVED KEYWORD
// ---------------------------------------------
// keyword that has been reserved for the language itself
// e.g.  public, class, static, void

// int public = 0; --> we won't be able to use public as a variable name because it's a reserved keyword

   // CAN'T USED RESERVED KEYWORDS FOR OUR VARIABLES, METHODS, CLASSES ETC.

// ARITHMETIC OPERATIONS
// ---------------------------------------------
   int ten = 10;
   int two = 2;
   int addition = ten + two;

   // can easily do this -->
//    System.out.println(10 + 2);
//    System.out.println(10 - 2);
//    System.out.println(10 * 2);
//    System.out.println(10 % 2);

    // when doing more operations in one code it uses BODMAS
    // can do arithmetic operations on numbers (whole numbers and decimals)

// MATH CLASS
// ---------------------------------------------

    // ALLOWS US TO PERFORM EXTRA OPERATIONS ON MATHS
    //Math class doesn't require an import statement

    // Math.abs(-10); // turns neg numbers to positive
    // Math.max( 3.6, 10.11); // gives the max number between the two numbers
    // Math.min(6, 10) // gives the lowest number
    // Math.pow(5.0, 2.0) //  the power
    // Math.sqrt(25) // finds square root --> can cast the result to an integer i.e. System.out.println((int)Math.sqrt(25))
// ** Math class can invoke methods


// COMPARISON OPERATORS
// ---------------------------------------------

// allows us to compare values
// performs operations of two or more numbers

    int khalidAge =18;
    int mariamAge = 20;
    boolean isKhalidOlderThanMariam = khalidAge > mariamAge;
    //THESE ARE BOOLEAN EXPRESSIONS
//    System.out.println(khalidAge > mariamAge); // khalid age is bigger than
//    System.out.println(khalidAge >= mariamAge); // khalid age is bigger than or equal to
//    System.out.println(khalidAge < mariamAge); // khalid age is less than
//    System.out.println(khalidAge <= mariamAge); // khalid age is less than
//    System.out.println(khalidAge == mariamAge); // khalid age is equal to
//    System.out.println(khalidAge != mariamAge); // khalid age is not equal to

// LOGICAL OPERATORS
// ---------------------------------------------

    // && (AND) || (OR) 1(IS NOT)
// these combine multiple boolean operators
    boolean isAdult = false;
    boolean isStudent = true;
//    System.out.println(isAdult && isStudent); // this checks if adult is equal to true and also if student is equal to true
// this print statement is checking that if the first boolean is true it will move on to the nest one and then check if the second is tru
// && here means that all the boolean must be true otherwise it will print false - which is the case in this example

//    System.out.println(isAdult || isStudent);
    // or --> || this check whether either one is true

    boolean isAmigoscodeMember = true;
//    System.out.println((isAdult || isStudent) && isAmigoscodeMember); // this would print false if both adult and student were false
    // but it prints true if just one os true
    // - add means that all the boolean values would be true

    // flipping the value
//    System.out.println((!isAdult || isStudent) && isAmigoscodeMember); // with && everything must be true
    // using ! to say is not - it will flip the value



// IF STATEMENTS
// ---------------------------------------------

// allows you to execute certain sections of your code depending on your boolean expressions

//    int age = 17;
//    if (age >= 18) {
//        System.out.println("Hooray...I am an adult"); // reads the first code if its false it moves to the next bit but if its true then it stops there
//    } else if (age>= 16 && age < 18) {
//        System.out.println("I am almost an adult");
//    } else {
//        System.out.println("I am not an adult"); // code stops here
        // this line of code is looked at last only if all the other statements are false will it print this
//    }

// TERNARY OPERATOR
// ---------------------------------------------

    // If you are only evaluating one boolean statement and need the else, if the initial condition is not met, you can do the following
//    String message = age >= 18 ?
//        "Hooray...I am an adult" :
//        "I am not an adult";
//    System.out.println(number);


// SWITCH STATEMENTS
// ---------------------------------------------

// falls under same category as if statement but slightly different
    String gender = "FEMALE";
//    if (gender.equals("FEMALE")) {
//
//    } else if (gender.equals("MALE")){
//
//    } else if (gender.equals("PREFER_NOT_SAY")){
//
//    } else {
//
//    }

    // we can do the same thing but with switch statements

//    switch (gender){
//        case "FEMALE":
//            System.out.println("I am a female"); // if this is the case, do whatever is before the break statement and then break out of the switch statement
//            break;
//        case "MALE":
//            System.out.println("I am a male");
//            break;
//        case "PREFER_NOT_SAY":
//            System.out.println("prefer not say");
//        default: // default if none of the cases above are met
//            System.out.println("unknown gender");

            //switch statements are neater and should be used when performing if condition only on one value

// ARRAYS (BONUS VIDEO)
// ---------------------------------------------

// allow us to store as many values as we want
//but we need to initialise the size before hand
// once the size is set we can't change the size

// WORKING WITH ARRAYS
// ---------------------------------------------

// arrays allow us to make one variable that holds more than one value

int[] numberz = new int[2]; // need to specify the data type followed by square brackets --> this is currently an empty array
    // need a name for our array
    // need to call on the object
    // need to state the number of values that will be in our array

//    System.out.println(Arrays.toString(numberz));
    // this is how you print an array

    // to add numbers in this array above we do the following
//    numberz[0] = 0;
//    numberz[1] = 1;
//    numberz[2] = 2; // when you initialise the size you can't change it

    // there is a much easier way to do all of that
    int [] numberss = {2, 0, 1}; // int array - this array doesn't specify the size, it's whatever number you add or what ever nu of values you add
    // here you don't have to initialise the actual size of the array, so you can add values

//    System.out.println(numberss.length);
// this prints and tells us how many values within our array

    String [] namez ={ "Ali", "Maria"}; // String array

// ARRAYS AND INDEXES
// ---------------------------------------------

// if you want call on specific element within a specific index within the array

//    int [] numberss = {2, 4, 5, 7, 4, 10};
    int number2 = numberss[2]; // storing it in a variable then grabbing the index 2 within the array
    int four = numberss[numberss.length - 1]; // need the minus one because to grab the index we need to start with the 0 index



// ++ & --
// ---------------------------------------------


}
