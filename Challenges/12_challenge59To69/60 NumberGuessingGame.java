
// 60. Create a program using do-while to implement a number guessing game.

// it is a basic program i will use in latter for standard way using random math so, let's continue with 1 already let variable======

import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        int num = 7;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game !!");
        System.out.print("Now, please enter  number between 0 To 10 which you want to Guess!! ");

        int userNum = input.nextInt();

        do {
            if (num != userNum) {
                System.out.print("Ohh!!..again enter what number you want to Guess!! ");
                userNum = input.nextInt();
            }
        } while (num != userNum);
        System.out.println("Congratulations !! You Won The Game your number is successfully matched");
    }
}

// Outputs : 

// Welcome to Number Guessing Game !!
// Now, please enter  number between 0 To 10 which you want to Guess!! 3
// Ohh!!..again enter what number you want to Guess!! 5
// Ohh!!..again enter what number you want to Guess!! 6
// Ohh!!..again enter what number you want to Guess!! 7
// Congratulations !! You Won The Game your number is successfully matched