package com.alimaa.WeekTwoExercises.Thursday;

public class EnumDatesExceptionsExercises {

    public static void main(String[] args) {


//Q2 PRINT AND RUN CODE FOR THE T-SHIRT SIZE ENUM
        System.out.println("T Shirt Sizes: " + Exercise1TshirtSizeEnums.XXS);
        // this is how you print enums within normal java class


//Q3 INVOKE .VALUES(), LOOP THROUGH THE ENUM, LOWERCASE THE VALUES
// invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
// hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase

        //invoking .values() to the enum
        Exercise1TshirtSizeEnums[] tShirtSize = Exercise1TshirtSizeEnums.values();

    }

}
