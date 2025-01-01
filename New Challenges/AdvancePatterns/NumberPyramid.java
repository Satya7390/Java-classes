import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Pyramid Patterns!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int totRows = sc.nextInt();
        numberPyramid(totRows);
    }

    public static void numberPyramid(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            // for space
            for (int j = 1; j <= (totRows - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}


// Outputs : 

// Welcome to the Number Pyramid Patterns!!
// Enter no of Rows : 7
//       1
//      2 2
//     3 3 3
//    4 4 4 4
//   5 5 5 5 5
//  6 6 6 6 6 6
// 7 7 7 7 7 7 7