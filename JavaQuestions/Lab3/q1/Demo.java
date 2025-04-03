package lab_3.q1;

/*
 * Write a class file – box with three data members(length, width, height)
and a method volume() . Also implement the application class Demo where an object of the
box class is created with user entered dimensions and volume is printed.
 */

import java.util.Scanner;

class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return length * width * height;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length : ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width : ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height : ");
        double height = scanner.nextDouble();

        Box box = new Box(length, width, height);

        System.out.println("The volume is: " + box.volume());

        scanner.close();
    }
}
