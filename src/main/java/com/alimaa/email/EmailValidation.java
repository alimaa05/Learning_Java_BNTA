package com.alimaa.email;

import java.util.Scanner;

public class EmailValidation {

      /*
        Create a package called email
        Then have a method called validateEmail that return true of false if input is valid email
        Finally invoke validateEmail in main
            i.e. "hello@gmail.com" -> true
            i.e. "hellogmail.com" -> false
    */

    public String validateEmail(String email) {

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your email: ");
//
        String emailInput = scanner.nextLine();


        if (email.contains("@")) {
            return "Thank you the email, " + email + " is valid!";

        } else  {
        }
        return "This is an invalid email, please try again, email much contain @!";

    }

}
