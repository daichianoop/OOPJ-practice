package lab_4.q4;

/**
 * Write a class Account containing acc_no, balance as data members and two
 * methods as input() for taking input from user and disp() method to display
 * the details. Create a subclass Person which has name and aadhar_no as extra
 * data members and override disp() function. Write the complete program to take
 * and print details of three persons.
 * 
 */

import java.util.Scanner;

class Account {
    protected int acc_no;
    protected float balance;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextFloat();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    private String name;
    private String aadhar_no;

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
    }

    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
            System.out.println("\nPerson " + (i + 1) + " Details:");
            persons[i].input();
        }

        System.out.println("\nPerson Details:");
        for (Person person : persons) {
            person.disp();
            System.out.println("--------------------");
        }
    }
}