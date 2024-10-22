
// 64. Create a program using for-each to the occurrences of a specific element in an array.

import java.util.Scanner;

class OccurrencesOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the find occurrences of a specific element !!");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Now , enter your number which you want to find number of occurrences : ");
        int num = input.nextInt();

        System.out.println("Your element was found : " + contOccurrences(arr, num) + " times");

    }

    public static int contOccurrences(int[] arr, int num) {
        int count = 0;
        for (int nums : arr) {
            if (nums == num) {
                count++;
            }
        }
        return count;
    }
}

// Outputs :

// Welcome to the find occurrences of a specific element !!
// Please enter the number of elements : 5
// Please enter element number 1: 2
// Please enter element number 2: 1
// Please enter element number 3: 2
// Please enter element number 4: 45
// Please enter element number 5: 44
// Now , enter your number which you want to find number of occurrences : 2
// Your element was found : 2 times

// =====================================

// Welcome to the find occurrences of a specific element !!
// Please enter the number of elements : 4
// Please enter element number 1: 1
// Please enter element number 2: 2
// Please enter element number 3: 1
// Please enter element number 4: 2
// Now , enter your number which you want to find number of occurrences : 33
// Your element was found : 0 times