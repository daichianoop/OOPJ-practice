package lab_7.q1;

/*
 * 1. Aim of the program -Write a program to perform following operations on user entered strings and
a character –
i) Change the case of the string
ii) Reverse the string
iii) Compare two strings
iv) Insert one string into another string
v) Convert the string to upper case and lower case
vi) Check whether the character is present in the string and at which position
vii) Check whether the string is palindrome or not.
viii) Check the number of word, vowel and consonant in the string
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();
        System.out.println("The string after changing the case is: " + swapCase(str1));
        System.out.println("The string after reversing is: " + new StringBuilder(str1).reverse().toString());
        System.out.print("Enter the second string for comparison: ");

        String str2 = sc.nextLine();
        System.out.println("The difference between ASCII value is: " + getAsciiDifference(str1, str2));
        System.out.print("Enter the string to be inserted: ");

        String insertStr = sc.nextLine();
        System.out.println("The string after insertion is: " + str1 + " " + insertStr);
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int pos = str1.indexOf(ch);
        if (pos != -1) {
            System.out.println("Position of entered character: " + pos);
        } else {
            System.out.println("Entered character is not present");
        }
        System.out.println("Entered string is " + (isPalindrome(str1) ? "a palindrome" : "not a palindrome"));
        countWordsVowelsConsonants(str1);
        sc.close();
    }

    public static String swapCase(String str) {
        StringBuilder swapped = new StringBuilder();
        for (char c : str.toCharArray()) {
            swapped.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        return swapped.toString();
    }

    public static int getAsciiDifference(String str1, String str2) {
        int diff = 0;
        int len = Math.min(str1.length(), str2.length());
        for (int i = 0; i < len; i++) {
            diff += Math.abs(str1.charAt(i) - str2.charAt(i));
        }
        return diff;
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static void countWordsVowelsConsonants(String str) {
        int vowels = 0, consonants = 0, words = str.split("\\s+").length;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }

}
