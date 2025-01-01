import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hollow Rhombus Patterns!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int totRows = sc.nextInt();
        hollow_Rhombus(totRows);
    }

    public static void hollow_Rhombus(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            // for space
            for (int j = 1; j <= (totRows - i); j++) {
                System.out.print(" ");
            }
            // hollow start
            for (int j = 1; j <= totRows; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totRows) {
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

// Welcome to the Hollow Rhombus Patterns!!
// Enter no of Rows : 5
//     *****
//    *   *
//   *   *
//  *   *
// *****