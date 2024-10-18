
// 58. Create a program to create a simple calculator that uses a
// switch statement to perform basic arithmetic operations
// like addition, subtraction, multiplication, and division.

import java.util.Scanner;

class SimpleCalci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to your Simple Calculator !!");
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = input.nextInt();

        System.out.print("Now , please enter your operation to calculate : ");
        String operator = input.next();

        float result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
        System.out.println("Your Answer is : " + result);
    }

}


// Outputs : 

// Welcome to your Simple Calculator !!
// Enter your first number : 44
// Enter your second number : 11
// Now , please enter your operation to calculate : /
// Your Answer is : 4.0

// Welcome to your Simple Calculator !!
// Enter your first number : 0
// Enter your second number : 1
// Now , please enter your operation to calculate : /
// Your Answer is : 0.0