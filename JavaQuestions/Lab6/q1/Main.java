package lab_6.q1;

/* 
 * Write a Java program to generate an
 * ArrayIndexOutofBoundsException and handle it using catch statement.
*/

public class Main {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4 };
        try {
            System.out.println(num[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
