
// 69. Create a program using recursion to check if a string is a palindrome using
// recursion.

import java.util.Scanner;

class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker !!");
        System.out.print("Enter the string to be checked: ");
        String str = input.next();

        str = str.toLowerCase();
        System.out.println("Your string is " + (isPalindrome(str) ? "Palindrome" : "not palindrome"));
    }

    public static boolean isPalindrome(String str) {

        if (str.length() <= 1) { // Base case
            return true;
        }

        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }
        String newStr = str.substring(1, lastPos); // it will chek from 1 to lastPos-1
        // System.out.println(newStr);
        return isPalindrome(newStr);
    }
}

// Outputs :

// Welcome to Palindrome Checker !!
// Enter the string to be checked: 121
// Your string is Palindrome

// Welcome to Palindrome Checker !!
// Enter the string to be checked: Satya
// Your string is not palindrome

// Welcome to Palindrome Checker !!
// Enter the string to be checked: Nitin
// Your string is Palindrome

// Welcome to Palindrome Checker !!
// Enter the string to be checked: madam
// Your string is Palindrome