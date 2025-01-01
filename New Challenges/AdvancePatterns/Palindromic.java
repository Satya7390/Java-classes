import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindromic Patterns!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int totRows = sc.nextInt();
        palindrom_patterns(totRows);
    }

    public static void palindrom_patterns(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            // for space
            for (int j = 1; j <= (totRows - i); j++) {
                System.out.print(" ");
            }
            // decrement pattern
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // increment pattern
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


// Outputs : 

// Welcome to the Palindromic Patterns!!
// Enter no of Rows : 5
//     1
//    212
//   32123
//  4321234
// 543212345