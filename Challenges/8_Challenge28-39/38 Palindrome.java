// 38. Create a program to verify if a number is a palindrome.

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker!!");
        System.out.print("Please enter your number : ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your number is Palindrome");
        } else {
            System.out.println("Your number is not Palindrome");
        }
    }

    public static boolean isPalindrome(int num) {
        return num == rev(num);
    }
    // for digit check right to left

    public static int rev(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }
        return rev;
    }

}

// Outputs :

// Welcome to Palindrome Checker!!
// Please enter your number : 151
// Your number is Palindrome

// Welcome to Palindrome Checker!!
// Please enter your number : 65675
// Your number is not Palindrome