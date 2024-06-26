
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


// Outputs: 

// Welcome to Array Sorting Checker!!
// Please enter the number of elements : 5
// Please enter element number 1: -9
// Please enter element number 2: 3
// Please enter element number 3: 33
// Please enter element number 4: 45
// Please enter element number 5: 55
// Your Given Array is Sorted


// Welcome to Array Sorting Checker!!
// Please enter the number of elements : 5
// Please enter element number 1: 45
// Please enter element number 2: 44
// Please enter element number 3: 6
// Please enter element number 4: 4
// Please enter element number 5: 1
// Your Given Array is Sorted



// Welcome to Array Sorting Checker!!
// Please enter the number of elements : 6
// Please enter element number 1: 435
// Please enter element number 2: 43
// Please enter element number 3: 32
// Please enter element number 4: 545
// Please enter element number 5: 43
// Please enter element number 6: 54
// Your Given Array is not Sorted