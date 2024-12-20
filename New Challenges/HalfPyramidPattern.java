
import java.util.Scanner;

public class HalfPyramidPattern {

    public static void main(String[] args) {

        System.out.println("\nWelcome to the Half Pyramid Pattern!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of lines : ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// Outputs : 

// Welcome to the Half Pyramid Pattern!!
// Enter Number of lines : 5
// 1
// 12
// 123
// 1234
// 12345
