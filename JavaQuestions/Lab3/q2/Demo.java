package lab_3.q2;

/*
 * Write a program in Java to create a class Rectangle having data members
length and breadth and three methods called read, calculate and display to read the values of
length and breadth, calculate the area and perimeter  and display the result
respectively.
 */

import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length : ");
        length = scanner.nextDouble();

        System.out.print("Enter the breadth : ");
        breadth = scanner.nextDouble();
        scanner.close();
    }

    public double calculate(double length2, double breadth2) {
        return length2 * breadth2;
    }

    public double calculate(double length, double breadth, int flag) {
        return 2 * (length + breadth);
    }

    public void display() {
        double area = calculate(length, breadth);
        double perimeter = calculate(length, breadth, 0);

        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);

    }
}

public class Demo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.read();
        rectangle.display();
    }
}
