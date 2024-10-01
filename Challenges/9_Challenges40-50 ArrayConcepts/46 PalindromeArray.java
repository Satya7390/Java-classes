// 46. Create a program to check is the array is palindrome or not.

import java.util.Scanner;

class PalindromeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Checker!! ");
        int[] numArray = ArrayUtility.inputArray();

        boolean isPalin = isPalindrome(numArray);

        if (isPalin) {
            System.out.println("Your Array is Palindrome");
        } else {
            System.out.println("Your Array is not Palindrome");
        }

    }

    public static boolean isPalindrome(int[] numArray) {

        int i = 0;
        while (i < numArray.length / 2) {
            if (numArray[i] != numArray[(numArray.length - 1) - i]) {
                return false;

            }
            i++;

        }
        return true;
    }
}

// Outputs : 

// Welcome to the Palindrome Checker!! 
// Please enter the number of elements : 6
// Please enter element number 1: 1
// Please enter element number 2: 2
// Please enter element number 3: 1
// Please enter element number 4: 1
// Please enter element number 5: 2
// Please enter element number 6: 1
// Your Array is Palindrome

// ================================================

// Welcome to the Palindrome Checker!! 
// Please enter the number of elements : 5
// Please enter element number 1: 1
// Please enter element number 2: 2
// Please enter element number 3: 3
// Please enter element number 4: 4
// Please enter element number 5: 5
// Your Array is not Palindrome
