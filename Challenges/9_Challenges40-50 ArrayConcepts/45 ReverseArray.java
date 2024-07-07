
// 45. Create a program to reverse an array.

import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse Array!!");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Your reversed Array is Printed below!!");
        reverseArray(numArray);
        ArrayUtility.displayArray(numArray);
        // revArr(numArray);

    }
    //========================== First Method===============================

    public static void reverseArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length / 2) {
            int swap = numArray[i];
            numArray[i] = numArray[(numArray.length - 1) - i];
            numArray[(numArray.length - 1) - i] = swap;
            i++;

        }
    }

// Outputs : 
// Welcome to Reverse Array!!
// Please enter the number of elements : 5
// Please enter element number 1: 1
// Please enter element number 2: 2
// Please enter element number 3: 3
// Please enter element number 4: 4
// Please enter element number 5: 5
// Your reversed Array is Printed below!!
// 5 4 3 2 1 

    // =================================Second Methods ===============================================

    // public static int[] revArr(int[] numArray) {
    // int j = numArray.length - 1;
    // int i = 0;
    // while (i < numArray.length) {
    // if (j >= 0) {
    // System.out.print(numArray[j] + " ");
    // j--;
    // }
    // i++;

    // }
    // return revArr(numArray);
    // }
}

// Outputs :
// Welcome to Reversed Array!!
// Please enter the number of elements : 5
// Please enter element number 1: 55
// Please enter element number 2: 55
// Please enter element number 3: 77
// Please enter element number 4: 7
// Please enter element number 5: 9
// Your reverse Array is Printed below!!
// 9 7 77 55 55
