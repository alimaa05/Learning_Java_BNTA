package com.alimaa.WeekTwoExercises.Friday;

public class Day5OOPClassNotes {

// OBJECT ORIENTED PROGRAMMING PART 1

// CLASSES
// blueprint i.e. template for anything in the real world
// made of 2 important concepts 1) properties i.e. characteristics 2) behaviours i.e. things they can do
    // things that can be modeled as classes
// e.g. people --> properties include name, age, ethnicity, weight etc. behaviours include speaking talking etc.
// e.g. address --> properties include postcode, first line, door number etc.

// the class is like a TEMPLATE that hold the properties or behaviours of something
// once we have the template we can start producing from that template
// once we start producing the properties will be different e.g. for the class people - I would have different properties to Abida in this case we would be the objects
//the String class containing properties and behaviours.


//PROPERTIES
// properties should always be private
// through the getters and setters is how we give access the properties

//BEHAVIOURS
// everything that's a method is a behaviour

// OBJECTS
// these are the REAL THING while classes are the blueprint
// e.g. in the example above people would be the CLASS and each individual person is the OBJECT
// When you have objects you invoke  a method i.e. you created your object and now you want to use it for something you can call one of its methods to perform an action

String name;
int age;

//Person alimaa = new Person(); // created a object for alimaa - class name is person, object name is alimaa, new person is creating the new object
    // the parenthesis is a constructor
    // constructors allow us to set initial values

//THIS.NAME
// this.name --> refers to the current instance of the current class

//GETTERS AND SETTERS
// setter -->     methods that allow us to set values
// getters --> method for returning the properties

//CONSTRUCTOR
    //used to set initial values for any object
    // by default java give public constructor
    // default doesn't work if you try to have one or more constructors
    // constructor allows us to set initial value - have as many as you want provided as they're unique

// PRINTING
//TOSTRING method allows us to return string representation of object
//public String toString(){
//    return this.name + " " + this.age + " " + this.SkinColor;

// @override

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", skinColor=" + skinColor +
//                ", nationality='" + nationality + '\'' +
//                '}';


}

