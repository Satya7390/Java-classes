import java.util.Scanner;

public class RotatedHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hollow Rotated Half Pyramid Patterns!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int totRows = sc.nextInt();
        rotatedPyramid(totRows);
    }

    public static void rotatedPyramid(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= (totRows - i); j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       
    }

}


// Outputs : 

// Welcome to the Hollow Rotated Half Pyramid Patterns!!
// Enter no of Rows : 7
//       *
//      **
//     ***
//    ****
//   *****
//  ******
// *******