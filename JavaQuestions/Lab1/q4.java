package lab_1;

/*
Program to check a user entered number is palindrome or not 
*/

public class q4 {
    public static void main(String[] args) {
        int number = 1011;

        int originalNum = number;
        int reversedNum = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversedNum = reversedNum * 10 + remainder;
            number /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
