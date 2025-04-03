import java.util.Scanner;

// customer applying for a loan
class Customer {
    int c_id;
    String c_name;
    int c_age; 
    double c_salary; 

    // Constructor customer
    Customer(int c_id, String c_name, int c_age, double c_salary) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_age = c_age;
        this.c_salary = c_salary;
    }
}

// Class representing different loan categories
class LoanCategory {
    int l_no; 
    String l_name; 
    double min_salary;
    int min_age; 
 
    // Constructor loan category
    LoanCategory(int l_no, String  l_name, double min_salary, int min_age) {
        this.l_no = l_no;
        this.l_name = l_name;
        this.min_salary = min_salary;
        this.min_age = min_age;
    }
}

// Class loan request
class LoanRequest {
    int l_no; 
    Customer applicant; 
    double l_amount; 
    String l_purpose;
    int l_tenure; 
    String l_status;

    // Constructor to loan request details
    LoanRequest(int l_no, Customer applicant, double l_amount, String l_purpose, int l_tenure) {
        this.l_no = l_no;
        this.applicant = applicant;
        this.l_amount = l_amount;
        this.l_purpose = l_purpose;
        this.l_tenure = l_tenure;
        this.l_status = "Pending";
    }
}

// Class responsible for loan processing and management
class LoanProcessor {
    static Customer[] customers = new Customer[10]; 
    static LoanCategory[] loanCategories = new LoanCategory[10]; 
    static LoanRequest[] loanRequests = new LoanRequest[10]; 
    static int req_count = 0; 
    static int c_count = 0; 
    static int l_count = 0; 

    // Method to initialize predefined data for customers and loan categories
    static void initializeData() {
        customers[c_count++] = new Customer(1, "John", 30, 50000);
        customers[c_count++] = new Customer(2, "Emily", 25, 30000);
        customers[c_count++] = new Customer(3, "Michael", 28, 40000);
        customers[c_count++] = new Customer(4, "Sarah", 35, 60000);
        customers[c_count++] = new Customer(5, "David", 32, 45000);

        loanCategories[l_count++] = new LoanCategory(1, "Personal Loan", 25000, 21);
        loanCategories[l_count++] = new LoanCategory(2, "Home Loan", 50000, 25);
        loanCategories[l_count++] = new LoanCategory(3, "Car Loan", 30000, 23);
    }

    // Method to find a customer by ID
    static Customer findCustomer(int c_id) {
        for (Customer customer : customers) {
            if (customer != null && customer.c_id == c_id)
                return customer;
        }
        return null;
    }

    // Method to find a loan category by ID
    static LoanCategory findLoanCategory(int l_no) {
        for (LoanCategory category : loanCategories) {
            if (category != null && category.l_no == l_no)
                return category;
        }
        return null;
    }

    // Method to evaluate and process a loan request
    static String evaluateLoan(LoanRequest request, int l_no) {
        LoanCategory category = findLoanCategory(l_no);
        if (category == null)
            return "Rejected";

        if (request.applicant.c_age >= category.min_age && request.applicant.c_salary >= category.min_salary) {
            request.l_status = "Approved";
            loanRequests[req_count++] = request;
            return "Approved";
        } else {
            request.l_status = "Rejected";
            return "Rejected";
        }
    }
}

// Main class
public class LoanApplicationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoanProcessor.initializeData();

        while (true) {
            System.out.println("1. Apply for a Loan");
            System.out.println("2. View Loan Application Status");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\nAvailable Loan Types:");
                for (LoanCategory category : LoanProcessor.loanCategories) {
                    if (category != null) {
                        System.out.println(category.l_no + ". " + category.l_name);
                    }
                }

                System.out.print("Select a Loan Type (Enter ID): ");
                int l_no = scanner.nextInt();

                System.out.println("\nRegistered Customers:");
                for (Customer customer : LoanProcessor.customers) {
                    if (customer != null) {
                        System.out.println(customer.c_id + ". " + customer.c_name);
                    }
                }

                System.out.print("Select a Customer (Enter ID): ");
                int c_id = scanner.nextInt();
                Customer customer = LoanProcessor.findCustomer(c_id);
                if (customer == null) {
                    System.out.println("Invalid Customer ID.");
                    continue;
                }

                scanner.nextLine();
                System.out.print("Enter Loan Purpose: ");
                String l_purpose = scanner.nextLine();

                System.out.print("Enter Loan Amount: ");
                double l_amount = scanner.nextDouble();

                System.out.print("Enter Loan Tenure (in years): ");
                int l_tenure = scanner.nextInt();

                LoanRequest request = new LoanRequest(l_no, customer, l_amount, l_purpose, l_tenure);
                String decision = LoanProcessor.evaluateLoan(request, l_no);

                System.out.println(decision.equals("Approved") ? "\nCongratulations! Your loan has been approved." : "\nUnfortunately, your loan request was rejected.");
            } 
            else if (choice == 2) {
                System.out.println("\nLoan Applications Status:");
                for (LoanRequest request : LoanProcessor.loanRequests) {
                    if (request != null) {
                        LoanCategory category = LoanProcessor.findLoanCategory(request.l_no);
                        System.out.println("Customer: " + request.applicant.c_name + " | Loan Type: " + category.l_name + " | Status: " + request.l_status);
                    }
                }
            } 
            else if (choice == 3) {
                System.out.println("Goodbye!");
                scanner.close();
                break;
            } 
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
