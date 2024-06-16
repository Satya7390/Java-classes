
// 40. Create a program to find the sum and average of all elements in an array.

import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {

        System.out.println("Welcome to Array Sum and Average!!");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = average(numArray);

        System.out.println("Sum of the number is : " + sum);
        System.out.println("Average of the number is : " + avg);
    }

    // for find Array Sum

    public static long sum(int[] numArray) {
        int i = 0;
        int sum = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;

        }
        return sum;
    }

    // for find Array Average

    public static double average(int[] numArray) {

        double sum = sum(numArray);

        return sum / numArray.length;
    }

}

// Outputs :
// Welcome to Array Sum and Average!!
// Please enter the number of elements : 2
// Please enter element number 1: 1
// Please enter element number 2: 2
// Sum of the number is : 3
// Average of the number is : 1.5
