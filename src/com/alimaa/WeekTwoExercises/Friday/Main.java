package com.alimaa.WeekTwoExercises.Friday;

public class Main {
    public static void main(String[] args) {

        // every variable needs a data type

        // a class can be used as a data type

            Person colin = new Person("Colin", 18);   // there are the same properties but different values
            // declared the variable colin and said it's gonna have person type
            // this is an instance of the person class

            System.out.println(colin.getName());
            System.out.println(colin.getAge()); // printing the values within the person object
        System.out.println(EyeColour.BLUE);

        Person alimaa = new Person("Alimaa", 21);

        System.out.println(alimaa.getName());
        System.out.println(alimaa.getAge());
        System.out.println(EyeColour.BROWN);


        Person sarina = new Person("Sarina", 22);
        System.out.println(sarina.getName());
        System.out.println(sarina.getAge());
        System.out.println(EyeColour.HAZEL);


    }


}
