import java.util.Scanner;

public class PyramidWithNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pyramid With Numbers Patterns!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int totRows = sc.nextInt();
        rotatedPyramid(totRows);
    }

    public static void rotatedPyramid(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= (totRows + 1 - i); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// Outputs :

// Welcome to the Pyramid With Numbers Patterns!!
// Enter no of Rows : 7
// 1234567
// 123456
// 12345
// 1234
// 123
// 12
// 1