
import java.util.Scanner;

public class RiverseLeftHalfPyramid {

    public static void main(String[] args) {
        System.out.println("\nWelcome to the Riverse Left Half Pyramid!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of lines : ");
        int num = input.nextInt();

        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


// Outputs : 

// Welcome to the Right Half Pyramid!!
// Enter Number of lines : 7
//  * * * * * * *
//  * * * * * *
//  * * * * *
//  * * * *
//  * * *
//  * *
//  *