import java.util.Scanner;

public class FlyodsPyramid {
    public static void main(String[] args) {
        System.out.println("Welcome to the Flyod's Pyramid Patterns!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int totRows = sc.nextInt();
        rotatedPyramid(totRows);
    }

    public static void rotatedPyramid(int totRows) {
        int count = 1;
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}


// Outputs : 

// Welcome to the Flyod's Pyramid Patterns!!
// Enter no of Rows : 5
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

