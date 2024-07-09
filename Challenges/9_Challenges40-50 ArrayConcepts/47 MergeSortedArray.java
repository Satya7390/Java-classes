
// 47. Create a program to merge two sorted arrays.

import java.util.Scanner;

class MergeSortedArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Merge of Sorted Array!!");
        int[] Arr1 = ArrayUtility.inputArray();
        int[] Arr2 = ArrayUtility.inputArray();
        int[] merged = merge(Arr1, Arr2);
        System.out.println("Your Array is Merged Successfully!!");
        ArrayUtility.displayArray(merged);

    }

    public static int[] merge(int[] Arr1, int[] Arr2) {
        int newSize = Arr1.length + Arr2.length;
        int[] newArr = new int[newSize];

        int i = 0, j = 0, k = 0;

        while (i < Arr1.length || j < Arr2.length) {
            if (j == Arr2.length || (i < Arr1.length && Arr1[i] < Arr2[j])) {
                newArr[k] = Arr1[i];
                i++;
                k++;
            } else {
                newArr[k] = Arr2[j];
                j++;
                k++;

            }

        }
        return newArr;
    }

}

// Outputs : 
// Welcome to the Merge of Sorted Array!!
// Please enter the number of elements : 5
// Please enter element number 1: 1
// Please enter element number 2: 3
// Please enter element number 3: 5
// Please enter element number 4: 7
// Please enter element number 5: 9
// Please enter the number of elements : 5
// Please enter element number 1: 0
// Please enter element number 2: 2
// Please enter element number 3: 4
// Please enter element number 4: 6
// Please enter element number 5: 8
// Your Array is Merged Successfully!!
// 0 1 2 3 4 5 6 7 8 9