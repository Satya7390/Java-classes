package AdvancePatterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hollow Rectangle Patterns!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int totRows = sc.nextInt();
        System.out.print("Enter no of Colomns : ");
        int totCols = sc.nextInt();
        hollowRec(totRows, totCols);
    }

    public static void hollowRec(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}


// Outputs : 

// Welcome to the Hollow Rectangle Patterns!!
// Enter no of Rows : 4
// Enter no of Colomns : 5
// *****
// *   *
// *   *
// *****