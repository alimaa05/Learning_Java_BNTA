package com.alimaa.WeekTwoExercises.Thursday;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExceptionsFilesClassNotes {

    public static void main(String[] args) {

// ERROR HANDLING BRIEF OVERVIEW


//        extracted(new int[]{1, 2, 0, 5});
//        extracted(new int[]{1, 2, 2, 5});
//        extracted(new int[]{});
//        extracted(new int[]{0, 0, 0, 0});
//
//    }
//
//    private static void extracted(int[] numbers) {
//        for (int number : numbers) {
//            if (number == 0) {
//                throw new RuntimeException("sorry but I dont accept 0");
//            }
//            System.out.println(10 / number);
//       }
    }

    //THROWING AN EXCEPTION
    private static FileInputStream michelle() throws FileNotFoundException {
        FileInputStream fileInputStream = sarina();
        return fileInputStream;
    }

    private static FileInputStream michael() throws FileNotFoundException {
        FileInputStream fileInputStream = michelle();
        return fileInputStream;
    }

    private static void yang() {
        try {
            FileInputStream fileInputStream = michael();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static FileInputStream sarina() throws FileNotFoundException {
        File file = new File("./foo.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        return fileInputStream;
    }

    private static void example4() {

        //CHECKED EXCEPTIONS
        // have to deal with it otherwise the code will not compile
        File file = new File("./foo.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        }


        //UNCHECKED EXCEPTION i.e. runtime exception
        // it will compile and run and may throw an exception when executed
        for (int i = 10; i > -1; i--) {
            System.out.println(10 / i);
        }
        int result = Integer.parseInt("1");
    }

    private static void example3() {
        String number = "10x";

        try {
            int result = Integer.parseInt(number);
            System.out.println("foobar");
            //
            //
            //

        } catch (NumberFormatException e) {
            System.out.println("oops failed parse " + number);
        }
        System.out.println("foo");
    }

    private static void example2() {
        int[] numbers = {1, 2, 3, 0, 4, 5};
        int result = 0;
        for (int number : numbers) {
            int add = (number + 100) / number;
            result += add;
        }
        System.out.println(result);
    }

    private static void example1() {
        try {
            int division = 10 / 1;
            int result = Integer.parseInt("10");
            // dodgy error
            System.out.println(result);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("oops input not a number");
        } catch (ArithmeticException e) {
            System.out.println("oops cant divide by 0");
        } catch (Exception e) {
            System.out.println("catch all");
            System.out.println(e);
        }

        System.out.println("Sarina :)");

// WORKING WITH FILES
// to create file in java have class called File
        File file = new File("src/hello.txt");
        try {

            if (!file.exists()) {
                // you can check if file exists --> file. has lots of different functions
                file.createNewFile();

            }

            // Allows to write to file. True will append contents at the end.
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Now lets write
            printWriter.println("Yang");
            printWriter.println("Linda");

            for (int i = 0; i < 1_000; i++) {
                printWriter.println(i);
            }

            // once you are done writing to the file
            printWriter.flush();
            printWriter.close();

            // Read from file
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine().toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

