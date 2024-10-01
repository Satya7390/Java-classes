
// 48. Create a program to search an element in a 2-D array.

import java.util.Scanner;

class SearchInTwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D Search\n");
        int [][] numArray = ArrayUtility.input2DArray();
        System.out.println("Now Enter the number you want to search : ");
    }
}
