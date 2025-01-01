import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        System.out.println("Welcome to the Diamond Patterns!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int totRows = sc.nextInt();
        diamond_pattern(totRows);
    }

    public static void diamond_pattern(int totRows) {
        // 1st half start
        for (int i = 1; i <= totRows; i++) {
            // spaces
            for (int j = 1; j <= totRows - i; j++) {
                System.out.print(" ");
            }
            // start  logic => (2 * i) - 1 
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = totRows; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= totRows - i; j++) {
                System.out.print(" ");
            }
            // start
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// Outputs : 

// Welcome to the Diamond Patterns!!
// Enter no of Rows : 7
//       *
//      ***
//     *****
//    *******
//   *********
//  ***********
// *************
// *************
//  ***********
//   *********
//    *******
//     *****
//      ***
//       *