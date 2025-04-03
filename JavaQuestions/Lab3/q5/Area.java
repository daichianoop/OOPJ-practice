package lab_3.q5;

/*
 * Write a program which will overload the area () method and display the
area of a circle, triangle and square as per user choice and user entered dimensions.
 */

import java.util.Scanner;

class Shape {
    public double area(double radius) {
        return 3.1415926 * radius * radius;
    }

    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    public double area(int side) {
        return side * side;
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape :");
        System.out.println("1. Circle\n2. Triangle\n3. Square");

        System.out.print("Enter choice : ");
        int choice = scanner.nextInt();

        Shape shape = new Shape();

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            System.out.println("Area: " + shape.area(radius));

        } else if (choice == 2) {
            System.out.print("Enter base : ");
            double base = scanner.nextDouble();
            System.out.print("Enter height : ");
            double height = scanner.nextDouble();
            System.out.println("Area: " + shape.area(base, height));

        } else if (choice == 3) {
            System.out.print("Enter side: ");
            int side = scanner.nextInt();
            System.out.println("Area: " + shape.area(side));

        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
