import java.util.Scanner;

// User-defined exception class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// Class to process user input
public class NumberProcessor {
    public void processInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed: " + number);
        }
        System.out.println("Double value: " + (number * 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberProcessor processor = new NumberProcessor();

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        try {
            processor.processInput(num);
        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Processing complete.");
        }
    }
}