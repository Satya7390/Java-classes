import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        System.out.println("Welcome to the Zero One Triangle Patterns!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int totRows = sc.nextInt();
        rotatedPyramid(totRows);
    }

    public static void rotatedPyramid(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}

// Outputs : 

// Welcome to the Zero One Triangle Patterns!!
// Enter no of Rows : 5
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
