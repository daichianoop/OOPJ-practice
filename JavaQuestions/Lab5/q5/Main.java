package lab_5.q5;

/*
 * Create a Java program to demonstrate the use of the final keyword in a real-life scenario of a company's employee system. 
 * Create a class Employee with a final attribute companyName set to "TechCorp". 
 * Add a final method displayCompanyName() to print the company name. 
 * Create a subclass Developer that tries to override displayCompanyName() (this should result in a compilation error). 
 * In the main method, create an object of Employee and call displayCompanyName().
 */

class Employee {
    final String Name = "TechCorp";

    final void displayCompanyName() {
        System.out.println("Company Name: " + Name);
    }
}

/*
 * class Developer extends Employee {
 * void displayCompanyName() {
 * System.out.println("Error");
 * }
 * }
 */

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayCompanyName();
    }
}
