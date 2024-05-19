


// 24. Create a program that shows bitwise compliment of a number.

import java.util.Scanner;


class  BitwiseComplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to Bitwise Complement  of a number!!\n");

        System.out.print("Please enter Your number : ");
        int num1 = input.nextInt();

        int ans = ~num1;

        
        System.out.println("Your Bitwise Complement  of a number is :  " + ans);

       
    }

}