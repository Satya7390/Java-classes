
// 44. Create a program to return a new array deleting a specific element.

import java.util.Scanner;

class NewArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion!!\n");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Now , Enter your number which you want to delete : ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArray, numToDelete);
        System.out.println("Your new array is printed below!!");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArray, int numToDelete) {
        int occ = NumberOfOccurrences.numberOfOccurences(numArray, numToDelete);

        if (occ == 0) {
            return numArray;
        }

        int newSize = numArray.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArray.length) {
            if (numArray[i] != numToDelete) {
                newArr[j] = numArray[i];
                j++;

            }
            i++;

        }
        return newArr;
    }

}


// Outputs: 
// Please enter the number of elements : 5
// Please enter element number 1: 2
// Please enter element number 2: 2
// Please enter element number 3: 3
// Please enter element number 4: 4
// Please enter element number 5: 7
// Now , Enter your number which you want to delete : 2
// Your new array is printed below!!
// 3 4 7 