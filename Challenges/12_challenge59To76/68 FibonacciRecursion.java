
// 68. Create a program using recursion to display the Fibonacci series upto a certain
// number.

import java.util.Scanner;

class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to print Fibonacci Series !!");
        System.out.print("Enter till which position you want the Fibonacci to be printed: ");

        int psn = input.nextInt();

        for (int i = 1; i <= psn; i++) {
            System.out.print(FibonacciSeries(i) + " ");
        }

    }

    public static int FibonacciSeries(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        return FibonacciSeries(i - 1) + FibonacciSeries(i - 2);
    }
}


// Outputs : 

// Welcome to print Fibonacci Series !!
// Enter till which position you want the Fibonacci to be printed: 10
// 0 1 1 2 3 5 8 13 21 34