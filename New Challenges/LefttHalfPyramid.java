
import java.util.Scanner;

public class LefttHalfPyramid {

    public static void main(String[] args) {
        System.out.println("\nWelcome to Right Half Pyramid!!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

// Outputs: 
// Welcome to Right Half Pyramid!!
// Enter Number : 7
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *
//  * * * * * *
//  * * * * * * *
