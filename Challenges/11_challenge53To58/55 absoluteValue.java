
// 55. Create a program to calculate the absolute value of a given integer.

import java.util.Scanner;

class absoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Calculate Absolute Value !!");
        System.out.print("Enter your number : ");
        int num = input.nextInt();

        // creating object=======
        absoluteValue output = new absoluteValue();
        int absoluteVal = output.absoluteVal(num);
        System.out.println("Your Absolut value of " + num + " will be " + absoluteVal);
    }

    public int absoluteVal(int num) {
        return num < 0 ? -num : num;
    }
}

// Outputs :
// Welcome to Calculate Absolute Value !!
// Enter your number : 33
// Your Absolut value of 33 will be 33

// Welcome to Calculate Absolute Value !!
// Enter your number : -5
// Your Absolut value of -5 will be 5

// Welcome to Calculate Absolute Value !!
// Enter your number : 0
// Your Absolut value of 0 will be 0