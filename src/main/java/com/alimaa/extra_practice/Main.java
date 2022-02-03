package com.alimaa.extra_practice; // this is the PACKAGE

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

        alex.name = "Alexander";  // mariam changes to alexander as well because they are pointing to the same reference

        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);
    }

    static class Person { // this is a class where we can create reference types or i.e. objects
        String name;

        Person(String name) {
            this.name = name;
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

    int khalidAge = 18;
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
    int[] numberss = {2, 0, 1}; // int array - this array doesn't specify the size, it's whatever number you add or what ever nu of values you add
    // here you don't have to initialise the actual size of the array, so you can add values

//    System.out.println(numberss.length);
// this prints and tells us how many values within our array

    String[] namez = {"Ali", "Maria"}; // String array

// ARRAYS AND INDEXES
// ---------------------------------------------

// if you want call on specific element within a specific index within the array

    //    int [] numberss = {2, 4, 5, 7, 4, 10};
    int number2 = numberss[2]; // storing it in a variable then grabbing the index 2 within the array
    int four = numberss[numberss.length - 1]; // need the minus one because to grab the index we need to start with the 0 index


// ++ & --
// ---------------------------------------------

// i++ and i--

    //i++ takes the current value and increment it by 1 i.e. taking a value and then adding 1
    // i-- takes the current value and decrements it by 1
    // only use i++ and i-- when incrementing and decrementing by 1
    // i++ and i-- is the actual short hand version we should use to increase by 1


    // if we want to increment by 2 then we do i + 2

    // can also do this --> number+=2  --> number + = is incrementing the number by 2

// ENHANCED FOR LOOP
// ---------------------------------------------

// better version of looping through arrays

//    for (int number : numbers){ // for numbers, take the individual values of numbers one by one and put it in the variable numbers
//        System.out.println(number); // this type of loo[ doesn't have actaul access to the index

// if you put your variable followed by .for then the IDE can automatically put the code in for the loop

// BREAK AND CONTINUE
// ---------------------------------------------

    // break keyword allows us to break out of the loop
    // e.g.
    String[] names = {"Anna", "Ali", "Bob", "Mike"}; // this is our String array
//    for(
//    String name:names)

    { // this is the enhanced for loop, so for every element in names will be put into the new variable name
        if (name.equals("Bob")) { // this is saying if name is equal to Bob, then to break out of the for loop
//            break;  //it will then print all the names up to Bob
        }
        System.out.println(name); // if name wasn't equal to Bob then it would continue and print all the names
    }

    // continue - rather than breaking out of the loop, it will go back to the beginning of the loop
    //e.g.
//    String[] names = {"Anna", "Ali", "Bob", "Mike"};
//    for(String name:names) {
//        if (name.startsWith("A")) {
//            continue; // if name does start with a we go back to the beginning, otherwise it will go on
//        }
//        System.out.println(name); // this will bring Bob and Mike
//    }


// WHILE LOOP
// ---------------------------------------------

// allows us to loop while the boolean expression evaluates as true

//    while (true) { // the thing in the brackets is the actual boolean expression - the while loop won't run if it has false in the bracket
//        System.out.print.ln("hi"); // the stuff inside the curly brackets is what's inside the while loop
//    } // if we just do this then the while loop with run and print hi forever


    int count = 0;
//     while (count <=20) { // this is saying while count is less than or equal to 20 then it will bring what's in the while loop
//         System.out.println("count " + count);
//         count ++; // incrementing by 1
    // the output will only return count up to 20 because that's what we specified within the while loop


// DO WHILE
// ---------------------------------------------

    // executes no matter what at least once

//    do {
//        System.out.println(count); // it's saying to do this, and it will print it once, while the code below is still happening
//        count++;
//    } while (count <= 20);  // and even if the while condition is not true it will still print the do


// TAKING USER INPUT WITH THE SCANNER CLASS
// ---------------------------------------------

// Scanner allows us to take user input into the console

//    Scanner scanner = new Scanner(System.in); // the scanner variable can now take user input
//    System.out.println("What is your name?");
//    String username = scanner.nextLine(); // takes the actual user input - next line means takes the actual string from the console
//    System.out.println("Hello " + username); // this will print hello followed by the input put in by the user
//
//    // adding the following code will allow user input and gives info about the year they were born
//    System.out.println( "How old are you?"); // this prints first
//    int age = scanner.nextInt();// then takes in the users input when they put a number
//    int year = LocalDate.now().minusYears(age).getYear(); // this runs the process of finding the year they were born - i.e. taking the date now and minus the years of their age and printing that year
//    System.out.println("You were born in " + year); // printing the year they were born

// METHODS
// ---------------------------------------------

    // a block of code that's only run when called on
    // can pass data in methods i.e. parameters
    // methods are used to perform any logic i.e. perform any actions or any piece of code that does something

    // there's two types of methods 1) built-in methods  2)user pre-defined methods
    // built-in methods - methods provided by the java runtime environment
    // user pre-defined methods - methods we build ourselves

//    e.g. System.out.println(); // println is a method - within the parenthesis implies that we are invoking the actual method
    // methods can pass data i.e. parameters

//    e.g. String brand = "Samsung";
    //  System.out.println(brand.toUpperCase()); // toUpperCase is also a method that we invoke
    //  - in this specific method we aren't passing any data it simply transforms the value "Samsung"

    // Java has classes like String that have build-in methods that can be used for the classes

// UNDERSTANDING METHODS
// ---------------------------------------------

    // public static void main(String[] args) --> this is a method itself
    char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};                            // this is all within the main method
//    int count = countOccurrences(letters); // this is invoking the method
//    System.out.println(count); // now printing the count value

    // outside the main method
    public static int countOccurrences() { // public means this method is accessible by other classes
        return 0;
    }                                       // static means this method belongs to a class
    // int is the return type of the method
    // countOccurrences is the method
    //() is what we can pass into our method

    // to INVOKE the method/ calling on the method --> you do this in the main method sections

    // to pass data inside the method do the following -- // look at the above commented code as well
    public static int countOccurrences(char[] letters) { // now this method can accept an array of characters
        // where we invoke the method in the main method need to give an argument within the parenthesis that matches the return data type
        return -1;

        // so it would look something like this -->

        // public static void main(String[] args) --> inside the main method
//        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
//        int count = countOccurrences(letters);
//        System.out.println(count);
//
//        // outside the main method
//        public static int countOccurrences(char[] letters) {
//            System.out.println("Method countOccurrence was invoked");
//            return -1;
    }

// USER DEFINED METHODS
// ---------------------------------------------

//E.G.
// char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
//        int count = countOccurrences(letters, 'N );      // within main method
//        System.out.println(count);
//
//        // outside the main method
//        public static int countOccurrences(char[] letters, char searchLetter) {
//            int count =0;
//            for (char letter : letters) {
//               if (letter == searchLetter) {
//                   count ++;
//           }
//       }
//            return count;


// CLASSES AND OBJECTS
// ---------------------------------------------

    // OBJETS -anything that can represent something in the real world e.g. car, headphones etc.
    // CLASS - a template or blueprint for creating these objects

    // e.g
    String passportNumber = new String(" 12345"); // passportNumber is now an object - objects have properties and behaviours
    // properties of the object you can find by using . e.g.
//    passportNumber.
    // String is the template for creating sequences of characters
    // in this case the object has been created based off the String class template

    // the way we know something is an object or not is through the keyword new, followed by the class - indicates that you are creating an object


// CLASSES
// ---------------------------------------------

    // class is a template for anything in the real world i.e. for objects
    // E.G. a camera lens
    // lenses are constructed in their own way - you have a template for the lens and then from that you can create more lenses maybe with different attributes
    // the camera lens would be the object - the classes is what creates the object i.e. the template for the object

// CREATING CLASSES
// ---------------------------------------------

    // creating a class that allows to create lenses
    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand,
             String focalLength,
             boolean isPrime) {
            // this is constructor - it's how we construct objects
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
            // this --> is referring to the current instance of the current class
        }
    }
    // THIS ENTIRE BIT OF CODE ABOVE IS OUT CLASS - ITS ARE BLUEPRINT, OUR TEMPLATE FOR CREATING THE OBJECT LENSES

    // we want to you this class and call on it within out main method

// CREATING OBJECTS
// ---------------------------------------------

    // to create a lens i.e. an object based on the template above
    // it will be within the main method
//    public static void main(String[] args){  // lensOne variable is now our object - we used the keyword new to do this
    Lens lensOne = new Lens(
            "sony",
            "85mm",
            true);
    // in the constructor we said we accept the brand, focalLength and whether its prime - so here we can state those within our object

    // the class (i.e. template) we created above allows us to create as many lenses

    Lens lensTwo = new Lens(
            "sony",
            "35mm",
            true);

    Lens lensThree = new Lens(
            "Canon",
            "20-70mm",
            false);
    // i.e. objects as we want, and we can make small changes to the attributes of each lens i.e. it could be a diff brand or have a different focalLength


// PRINTING OBJECT ATTRIBUTES
// ---------------------------------------------

//    System.out.println("Lens 1");
//    System.out.println(lensOne.brand);
//    System.out.println(lensOne.focalLength);
//    System.out.println(lensOne.isPrime);
//
//    System.out.println("Lens 2");
//    System.out.println(lensTwo.brand);
//    System.out.println(lensTwo.focalLength);
//    System.out.println(lensTwo.isPrime);
//
//    System.out.println("Lens 3");
//    System.out.println(lensThree.brand);
//    System.out.println(lensThree.focalLength);
//    System.out.println(lensThree.isPrime);


// REPRESENTING A PASSPORT USING CLASSES AND OBJECTS
// ---------------------------------------------

    static class Passport { // this is are class called Passport and it has capital letter
        String number;
        LocalDate expiryDate;


        // this is out constructor -->
        Passport(String number, LocalDate expiryDate) { // String number and LocalDate expiryDate refers to the current instance of the current class
            this.number = number;
            this.expiryDate = expiryDate;
        }
    } // so this is our template i.e. the Passport class

    // Below is the object Passport
    Passport ukPassport = new Passport(
            "12234",
            LocalDate.of(2025,1, 1 ));

    Passport usPassport = new Passport(
            "12288",
            LocalDate.of(2030,1, 1 ));


}






