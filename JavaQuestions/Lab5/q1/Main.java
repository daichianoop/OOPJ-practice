package lab_5.q1;

/**
 * Illustrate the usage of abstract class with following Java classes –
 * An abstract class ‘student’ with two data members roll no, reg no, a method
 * getinput() and an abstract method course()
 * A subclass ‘kiitian’ with course() method implementation
 * Write the driver class to print the all details of a kiitian object.
 */

import java.util.Scanner;

abstract class Student {
    int rollNo;
    int regNo;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll No: ");
        rollNo = sc.nextInt();
        System.out.print("Registration No: ");
        regNo = sc.nextInt();
        sc.close();
    }

    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Registration No: " + regNo);
        course();
    }
}

public class Main {
    public static void main(String[] args) {
        Kiitian student = new Kiitian();
        student.getInput();
        System.out.println("\nStudent Details:");
        student.display();
    }
}
