
//  67. Create a program using continue to print only even numbers using continue for
//  odd numbers.

import java.util.Scanner;

class PrintEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to print only even numbers !!");
        System.out.print("Enter your number till you want to print Even Numbers :  ");
        int num = input.nextInt();

        // special conditions ===
        if (num <= 1) {
            System.out.println("Oops!! , your entered number must be greater then 1 ");
        } else {
            System.out.println("Your Even Numbers  are listed below !!");
        }

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

// Outputs : 

// Welcome to print only even numbers !!
// Enter your number till you want to print Even Numbers :  10
// Your Even Numbers  are listed below !!
// 2
// 4
// 6
// 8
// 10


// Welcome to print only even numbers !!
// Enter your number till you want to print Even Numbers :  -12
// Oops!! , your entered number must be greater then 1 