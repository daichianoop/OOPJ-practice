package lab_3.q6;

/*
 * Write a program in java using constructor overloading concept to calculate
the area of a rectangle having data member as length and breadth. Use default constructor to
initialize the value of the data member to zero and parameterized constructor to initialize the value
of data member according to the user input.
 */

import java.util.Scanner;

class rect {
    double length, breadth;

    public rect() {
        length = 2;
        breadth = 3;
    }

    public rect(double l, double b) {
        length = l;
        breadth = b;
    }

    public double calc() {
        return length * breadth;
    }
}

public class Rectangle {
    public static void main(String[] args) {

        rect rect1 = new rect();
        System.out.println("Area (default) - " + rect1.calc());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length - ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth - ");
        double breadth = sc.nextDouble();

        sc.close();

        rect rect2 = new rect(length, breadth);
        System.out.println("Area (input based) - " + rect2.calc());
    }
}
