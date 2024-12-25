import java.util.Scanner;

public class ButterFly {
    public static void main(String[] args) {
        System.out.println("Welcome to the ButterFly Patterns!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int totRows = sc.nextInt();
        rotatedPyramid(totRows);
    }

    public static void rotatedPyramid(int totRows) {
        // 1st half
        for (int i = 1; i <= totRows; i++) {
            // start - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space - 2*(n-i)
            for (int j = 1; j <= 2 * (totRows - i); j++) {
                System.out.print(" ");
            }
            // start - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = totRows; i >= 1; i--) {
            // start - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space - 2*(n-i)
            for (int j = 1; j <= 2 * (totRows - i); j++) {
                System.out.print(" ");
            }
            // start - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// Outputs : 

// Welcome to the ButterFly Patterns!!
// Enter no of Rows : 5
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *