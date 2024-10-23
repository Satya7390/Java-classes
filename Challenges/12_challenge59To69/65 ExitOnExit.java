
// 65. Create a program using break to read inputs from the user in a loop and break
// the loop if a specific keyword (like "exit") is entered.

import java.util.Scanner;

class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welocme to the Exit on Exit !!");
        String command;

        while (true) {
            System.out.print("Now enter your commands : ");
            command = input.next();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("You have successfully exited !!");
    }
}


// Outputs : 

// Welocme to the Exit on Exit !!
// Now enter your commands : Hii
// Now enter your commands : run
// Now enter your commands : exit
// You have successfully exited !!

// Welocme to the Exit on Exit !!
// Now enter your commands : hii
// Now enter your commands : satya
// Now enter your commands : EXIT
// You have successfully exited !!