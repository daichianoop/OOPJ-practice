package lab_3.q3;

/*
 * Write a program in java to input and display the details of n number of
 * students having roll, name and cgpa as data members. Also display the name of
 * the student having lowest cgpa.
 */

import java.util.Scanner;

class Student {
    private int roll;
    private String name;
    private double cgpa;

    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            students[i] = new Student(roll, name, cgpa);
        }
        scanner.close();

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }

        Student lowestCgpa = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getCgpa() < lowestCgpa.getCgpa()) {
                lowestCgpa = students[i];
            }
        }

        System.out.println("\nStudent with the lowest CGPA:");
        lowestCgpa.display();
    }
}
