

// 22. Create a program that shows bitwise OR of two numbers.


import java.util.Scanner;

/**
 * 22 BitwiseOR
 */
class BitwiseOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to Bitwise OR of two numbers!!\n");

        System.out.print("Please enter First number : ");
        int num1 = input.nextInt();

        System.out.print("Please enter Second number : ");
        int num2 = input.nextInt();

        int ans = (num1 | num2);  // BY Bitwise inclusive OR
        System.out.println("Your Bitwise  OR of two numbers is :  " + ans);

    }

}