package com.alimaa.email;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmailValidation emailValidation = new EmailValidation();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email: ");

        String emailInput = scanner.nextLine();

        System.out.println(emailValidation.validateEmail(emailInput));

    }
}
