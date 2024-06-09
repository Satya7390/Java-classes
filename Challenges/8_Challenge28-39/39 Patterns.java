
//  39. Create a program that print patterns:

//  Right Half Pyramid

import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to  Patterns Print!!");
        System.out.print("Please enter No of Rows : ");
        int maxRows = input.nextInt();
        RightHalfPyramid(maxRows);
        ReverseRightHalfPyramid(maxRows);
        LeftHalfPyramid(maxRows);
    }

    // Right Half Pyramid

    public static void RightHalfPyramid(int maxRows) {
        System.out.println("\nHere is Right Half Pyramid ");
        int row = 0;
        while (row < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;

        }
    }

    // Reverse Right Half Pyramid

    public static void ReverseRightHalfPyramid(int maxRows) {
        System.out.println("\nHere is Reverse Right Half Pyramid ");
        int row = maxRows;
        while (row > 0) {
            int i = 0;
            while ( i < row) {
                System.out.print("* ");
                i++;

            }
            System.out.println();
            row--;
        }
    }

    // Left Half Pyramid

    public static void LeftHalfPyramid(int maxRows){
        System.out.println("\nHere is Left Half Pyramid ");

         // this loop is for space
        int row = maxRows;
        while (row > 0) {
            int j = 0;
            while (j < row-1) {
                System.out.print("  ");
                j++;
                
            }

            // this loop is for starts
           int i = 0;
           while (i <= (maxRows-row)) {
            System.out.print("* ");
            i++;
            
           }
            System.out.println();
            row--;
        }
    }

}

// Outputs : 
// Welcome to  Patterns Print!!
// Please enter No of Rows : 7

// Here is Right Half Pyramid
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * * * *
// * * * * * * *

// Here is Reverse Right Half Pyramid
// * * * * * * *
// * * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

// Here is Left Half Pyramid
//             *
//           * *
//         * * *
//       * * * *
//     * * * * *
//   * * * * * *
// * * * * * * *