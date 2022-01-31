package com.alimaa.WeekTwo.Tuesday;

public class MethodsClassNotes {


    // SIMPLE EXAMPLE OF USING METHODS
    public static void main(String[] args) {
        System.out.println(sum(2));
        System.out.println(sum(5));

    }

    static int sum(int num){
        int total = 0;
        for (int i = 0; i <= num; i++){
            total =total + i;
        }

        return total;


    }
}



// methods is  a reusable code that you call upon over and over again
        // methods needs ACCESS MODIFIER, RETURN TYPE, STATIC, NAME OF THE METHOD, PARAMETERS
// method needs ACCESS MODIFIER either public,private and whether its package protected (e.g. static)
// then it needs a RETURN TYPE what you'll be returning  e.g. String (if you don't return anything it should be VOID)
// NAME the METHOD e.g. capitalize
// you then need parameters inside parenthesis i.e. () e.g. (String input)
// need to evoke the method within the main - this needs to be printed
// need STATIC in order to evoke method
// at the very end of method has to be RETURN if the method is expecting to produce

// e.g. of method :  public static void myMethod(String "hello");
// the name of the method here is myMethod
//the stuff in the brackets is called parameters, and I've stated it's a String



//  access modifier
// 1 - public can be accessed by anything
// 2- private can only be accessed by siad class
// package protected - can only be accessed by that package

// void - is used if you're just printing something, doesn't return any value



