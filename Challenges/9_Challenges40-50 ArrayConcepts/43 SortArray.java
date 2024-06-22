
// 43. Create a program to check if the given array is sorted.

import java.util.Scanner;

class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Sorting Checker!!");
        int[] numArray = ArrayUtility.inputArray();

        // SortArray(numArray);
    }

    public static boolean AscendingOrder(int[] numArray){
        int min = numArray[1];
        int max = numArray[1];
        int i = 1;
        while (i < numArray.length) {
            if (min < numArray[i] || max > numArray[i]) {
                return true;
            }
            i++;
        }
        return false;
    }

}
