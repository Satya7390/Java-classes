import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find factorial of a number !!");
        System.out.print("Enter your number to find factorial : ");
        int num = input.nextInt();
        long factResult = factorial(num);
        System.out.println("Your factorial of a " + num + " is : " + factResult);
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {  // BaseCase
            return 1;
        } else {
            return num * factorial(num - 1); // recursion calling to factorial(int num)
        }
    }
}

// Outputs :

// Welcome to find factorial of a number !!
// Enter your number to find factorial : 5
// Your factorial of a 5 is : 120