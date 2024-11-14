
// 61. Create a program using for loop multiplication table for a number.

import java.util.Scanner;

class MultiplicationOfTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Multiplication Table !!");
        System.out.print("Enter number which you want to print table : ");
        int num = input.nextInt();
        System.out.println("Your Multiplication Table of " + num + " is given below !!");

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}


// Outputs : 

// Welcome to the Multiplication Table !!
// Enter number which you want to print table : 19
// Your Multiplication Table of 19 is given below !!
// 19 * 1 = 19
// 19 * 2 = 38
// 19 * 3 = 57
// 19 * 4 = 76
// 19 * 5 = 95
// 19 * 6 = 114
// 19 * 7 = 133
// 19 * 8 = 152
// 19 * 9 = 171
// 19 * 10 = 190