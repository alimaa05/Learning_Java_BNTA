package com.alimaa.Random;

import java.awt.Point;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // day 4
       /* System.out.println("Hello Alimaa");

       // day 5
       // printing int
        int x= 5;
        int y= x;

        System.out.println(x);
        System.out.println(y);
        */

        // printing increment and decrement
        /* int w =6;
        System.out.println(w--);
        System.out.println(w--);
        System.out.println(++w);
        System.out.println(w);
         */

        // primitives, reference types, changing the code
        /* Point p1 = new Point(10, 5 );
        Point p2 = new Point (10, 5 );

        p2.x = 5;

        System.out.println(p1);
        System.out.println(p2);
         */

        Point p;

        /* System.out.println("This is my self study practice!");
        // this is a new sentence
        System.out.println("And today is Thursday the 20th of January 2022.");
         */

        // System.out.println("lets try a multiline comment for the above code.");

        // let's make a variable for coordinates
        p = new Point(20, 10);
        System.out.println(p);


        String[] names = new String[5];
        names[0] = "Honufah";
        names[1] = "Alimaa";
        names[2] = "Abida";
        names[3] = "Riyaz";
        names[4] = "Amaan";

        System.out.println(Arrays.toString(names));


    }
}
