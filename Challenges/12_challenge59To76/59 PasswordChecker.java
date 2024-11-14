
// 59. Create a program using do-while to find password checker until a valid
// password is entered.

import java.util.Scanner;

// package Challenges.12_challenge59To69;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to set your password !!");
        String pass;

        do {
            System.out.print("Enter your password : ");
            pass = input.next();
        } while (!isValidPassword(pass));
        System.out.println("Thanks for entering a valid password !!");
        // System.out.println(pass.length());

    }

    public static boolean isValidPassword(String pass) {
        return pass.length() > 6;
    }
}

// Outputs :

// Welcome to set your password !!
// Enter your password : Satya
// Enter your password : Nitya
// Enter your password : HiiSatya
// Thanks for entering a valid password !!
