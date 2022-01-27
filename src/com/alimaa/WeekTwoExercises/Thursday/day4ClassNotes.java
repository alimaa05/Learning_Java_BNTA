package com.alimaa.WeekTwoExercises.Thursday;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class day4ClassNotes {

    public static void main(String[] args) {


        // ERROR HANDLING BRIEF OVERVIEW

        //CHECKED EXCEPTIONS
        // have to deal with it otherwise the code will not compile
//        File file = new File("./foo.txt");
//        try {
////            FileInputStream fileInoutStream = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        //UNCHECKED EXCEPTION i.e. runtime exception
        // it will compile and run and may throw an exception when executed
        for (int i = 10; i > -1; i--) {
            System.out.println(10 / i);
        }

        //THROWING AN EXCEPTION

        // WORKING WITH FILES
        // to create file in java have class called File

//        File file = new File("src/hello.txt");
//        try {
//            if (!file.exists()) {
//                // you can check if file exists --> file. has lots of different functions
//
//                file.createNewFile();
//            }
//
//
//            // allows to write
//            FileWriter fileWriter = new FileWriter(file);
//            PrintWriter printWriter = new PrintWriter(fileWriter);
//
//            // now lets write
//            printWriter.println("hello");
//
//            // writing 1-100
//            for (int i = 0; i < 101; i++) {
//                printWriter.println(i);
//            }
//
//            // once you are done writing to the file
//            printWriter.flush();
//            printWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // read from file
//        Scanner scanner = new Scanner(file);
//        while (scanner.hasNext()) {
//            System.out.println(scanner.nextLine());
//        }

    }

}
