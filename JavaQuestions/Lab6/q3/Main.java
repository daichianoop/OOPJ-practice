package lab_6.q3;

/*
 * Write a Java class which has a method called ProcessInput(). This
 * method checks the number entered by the user. If the entered number is negative then
 * throw an user defined exception called NegativeNumberException, otherwise it displays
 * the double value of the entered number.


*/

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Main {

    public static void ProcessInput() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (num * 2));
        }

    }

    public static void main(String[] args) {
        try {
            ProcessInput();
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
