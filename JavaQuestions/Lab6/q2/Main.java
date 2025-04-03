package lab_6.q2;

/* 
 * Write a Java program to handle an ArithmeticException using try,
 * catch, and finally block.
*/

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithematic Exeption caught by try-catch-finally");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
