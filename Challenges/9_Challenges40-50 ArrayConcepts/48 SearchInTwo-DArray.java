
// 48. Create a program to search an element in a 2-D array.

import java.util.Scanner;

class SearchInTwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D Search\n");
        int[][] numArray = ArrayUtility.input2DArray();
        System.out.print("Now Enter the number you want to search : ");
        int num = input.nextInt();
        boolean isFound = searchArr(numArray, num);

        if (isFound) {
            System.out.println(num + " is present in the Array\n");
        } else {
            System.out.println(num + " is not present in the Array");
        }
    }

    public static boolean searchArr(int[][] numArray, int num) {
        int i = 0;
        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                if (numArray[i][j] == num) {
                    return true;

                }
                j++;
            }
            i++;
        }

        return false;

    }
}

// Outputs

// Welcome to 2D Search

// Please enter the number of rows : 2
// Please enter the number of columns : 2
// Please enter the element of row : 1 , column 1 : 1
// Please enter the element of row : 1 , column 2 : 2
// Please enter the element of row : 2 , column 1 : 3
// Please enter the element of row : 2 , column 2 : 4
// Now Enter the number you want to search : 2
// 2 is present in the Array

// Welcome to 2D Search

// Please enter the number of rows : 2
// Please enter the number of columns : 2
// Please enter the element of row : 1 , column 1 : 11
// Please enter the element of row : 1 , column 2 : 12
// Please enter the element of row : 2 , column 1 : 13
// Please enter the element of row : 2 , column 2 : 14
// Now Enter the number you want to search : 3
// 3 is not present in the Array