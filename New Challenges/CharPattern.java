
import java.util.Scanner;

public class CharPattern {

    public static void main(String[] args) {
        System.out.println("Welcome to the Print Character Pattern!!");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of lines : ");

        int num = input.nextInt();
        char ch = 'A';

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + ch);
                ch++;
            }
            System.out.println();
        }
    }
}


// Outputs : 

// Welcome to the Print Character Pattern!!
// Enter number of lines : 4
//  A
//  B C
//  D E F
//  G H I J
