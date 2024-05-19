
// 21. Create a program that shows bitwise AND of two numbers.



import java.util.Scanner;

/**
 * 21 BitwiseAND
 */
class BitwiseAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to Bitwise AND of two numbers!!\n");

        System.out.print("Please enter First number : ");
        int num1 = input.nextInt();

        System.out.print("Please enter Second number : ");
        int num2 = input.nextInt();

        int ans = (num1 & num2);
        System.out.println("Your Bitwise AND of two numbers is :  " + ans);

    }

}