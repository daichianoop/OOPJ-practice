package lab_6.q4;

/*
 * Write a program to create user defined exceptions called
 * HrsException, MinException and SecException. Create a class Time which contains data
 * members hours, minutes, seconds and a method to take a time from user which throws
 * the user defined exceptions if hours (>24 &<0),minutes(>60 & <0),seconds(>60 & <0).
*/

import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

public class Main {
    public static void ProcessInput() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        int hours = sc.nextInt();
        System.out.println("Enter minutes: ");
        int minutes = sc.nextInt();
        System.out.println("Enter Seconds: ");
        int seconds = sc.nextInt();
        sc.close();

        if (hours > 24) {
            throw new HrsException("Hours can't be greater than 24. ");
        }
        if (minutes > 60) {
            throw new MinException("Minutes can't be greater than 60. ");
        }
        if (seconds > 60) {
            throw new SecException("Seconds can't be geater than 60. ");
        } else {
            System.out.println("Correct time -> " + hours + ":" + minutes + ":" + seconds);
        }

    }

    public static void main(String[] args) {
        try {
            ProcessInput();
        } catch (Exception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}