
// 36. Create a program to print the Fibonacci series up to a certain number.

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series!!");

        System.out.print("Please enter the number up to which series has to be printed : ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        int i = 1;
        while (i <= num) {
            int fab = a + b;
            System.out.println(fab);
            a = b;
            b = fab;
            i++;

        }

    }
    // public static void (){

    // }
}
