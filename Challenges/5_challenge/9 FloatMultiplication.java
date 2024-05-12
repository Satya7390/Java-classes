
// 9. Create a program to calculate product of two floating points numbers.

import java.util.Scanner;

 class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Float multilications!!\n");

        System.out.print("Please enter your first number : ");
        Float num1 = input.nextFloat();

        System.out.print("Please enter your second number : ");
        Float num2 = input.nextFloat();

        Float ans = num1*num2;

        System.out.println("\nYour answer is : "+ans);
    }
}
