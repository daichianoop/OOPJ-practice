package lab_5.q3;

/*
 * Define an interface with three methods – earnings(), deductions() and bonus() and
 * define a Java class ‘Manager’ which uses this interface without implementing bonus() method.
 *  Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements bonus() method.  
 * Write the complete program to find out earnings, deduction and 
 * bonus of a substaff with basic salary amount entered by the user as per the following guidelines –
 * earnings           basic + DA (80% of basic) + HRA (15% of basic)
 * deduction PF       12% of basic
 * bonus             50% of basic
 */

import java.util.Scanner;

interface Salary {
    double earn(double basic);

    double ded(double basic);

    double bonus(double basic);
}

class Manager implements Salary {

    public double earn(double basic) {
        return basic + (0.80 * basic) + (0.15 * basic);
    }

    public double ded(double basic) {
        return 0.12 * basic;
    }

    public double bonus(double basic) {
        return 0;
    }
}

class Substaff extends Manager {

    public double bonus(double basic) {
        return 0.50 * basic;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double bSal = sc.nextDouble();

        Substaff substaff = new Substaff();
        double earnings = substaff.earn(bSal);
        double deduction = substaff.ded(bSal);
        double bonus = substaff.bonus(bSal);

        System.out.println("\nEarnings - " + earnings);
        System.out.println("Deduction - " + deduction);
        System.out.println("Bonus - " + bonus);
        sc.close();

    }
}
