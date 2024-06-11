package Array;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Welcome to Array Searching!! ");
        System.out.print(" Enter the number you want to search : ");
        int num = input.nextInt();

        int arr[] = { 3, 4, 44, 33, 55, 67, 23, 1, 13, 11, 25 };

        if (isFound(arr, num)) {
            System.out.println(" Your number is found in the Array ");
        } else {
            System.out.println(" Your number is not found in the Array");
        }
    }

    public static boolean isFound(int arr[], int num) {

        int index = 0;
        while (index < arr.length) {

            if (arr[index] == num) {
                // for find index position
                // System.out.println(index);

                return true;
            }
            index++;

        }

        return false;

    }

}

// Outputs :

// Welcome to Array Searching!!
// Enter the number you want to search : 55
// Your number is found in the Array

// Welcome to Array Searching!!
// Enter the number you want to search : 56
// Your number is not found in the Array