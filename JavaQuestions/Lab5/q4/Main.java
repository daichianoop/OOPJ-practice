package lab_5.q4;

/*
 * Define an interface Emploee with a method getDetails() to get emplyee details as Empid and Ename. 
 * Also define a derived interface Manager with a method getDeptDetails() to get department details such as Deptid and Deptname.
 * Then define a class Head which implements Manager interface and also prints all details of the employee.
 *  Write the complete program to display all details of one head of the department.
 */

import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name: ");
        empName = sc.nextLine();
    }

    public void getDeptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department id: ");
        deptId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter department name: ");
        deptName = sc.nextLine();
    }

    public void displayDetails() {
        System.out.println("\nEmployee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

public class Main {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.displayDetails();
    }
}
