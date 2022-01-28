package com.alimaa.WeekTwoExercises.Friday;

public class Person {
    // person is the class
    String name;   // THERE ARE PROPERTIES
    int age;
    EyeColour eyeColour;
    // name and age are the properties
    // string and int are the data types

    public Person(String inputName, int inputAge){  // CONSTRUCTOR  - a method that allows you to make an object
        this.name = inputName;
        this.age = inputAge;
        this.eyeColour =  eyeColour;
        // this is the object your referring to
        //.age is the property you're referring to - it can only be referred to within the Person class
        //inputAge and inputName is calling on the values you'll be giving
    }

    // in the main method we actually create the object
    // passing a name and age in the person object we made


    public String getName(){
        return this.name;

        // getter to get a specific property of certain object
    }

    public int getAge(){
        return this.age;
    }

    public EyeColour getEyeColour() {
        return eyeColour;
    }

    public void setAge(int newAge){
        this.age = newAge;
        // setter to set the value to this property
    }


}
