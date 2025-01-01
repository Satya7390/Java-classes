import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rhombus Patterns!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int totRows = sc.nextInt();
        solidRhombus(totRows);
    }

    public static void solidRhombus(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            // for space
            for (int j = 1; j <= (totRows - i); j++) {
                System.out.print(" ");
            }
            // start
            for (int j = 1; j <= totRows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// Outputs : 

// Welcome to the Rhombus Patterns!!
// Enter no of Rows : 5
//     *****
//    *****
//   *****
//  *****
// *****