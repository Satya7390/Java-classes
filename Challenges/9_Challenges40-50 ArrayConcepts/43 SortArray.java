
// 43. Create a program to check if the given array is sorted.

import java.util.Scanner;

class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Sorting Checker!!");
        int[] numArray = ArrayUtility.inputArray();

        boolean inc = isIncreasing(numArray);
        boolean des = isDecreasing(numArray);

        if (inc || des) {
            System.out.println("Your Given Array is Sorted");
        } else {
            System.out.println("Your Given Array is not Sorted");
        }
    }

    public static boolean isIncreasing(int[] numArray) {
        int i = 1;
        while (i < numArray.length) {
            if (numArray[i] > numArray[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArray) {
        int i = 1;
        while (i < numArray.length) {
            if (numArray[i] < numArray[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
