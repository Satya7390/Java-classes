
//  12.Create a program to calculate simple interest. Simple Interest = (P x T x R)/100

// where P is the principal amount, T is time & R is the rate of interest

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Simple Interest Calculator \n");

        System.out.print("Please enter your Principle amount Rs");
        int Principle = input.nextInt();

        System.out.print("Now, please tell me for how many years  are you  borrowing this money : ");
        Float years = input.nextFloat();

        System.out.print("Now, enter Rate of your Simple Interest in Percentage % : ");
        Float rate = input.nextFloat();

        Float SimpleInterest = (Principle*years*rate)/100;
        System.out.print("\n Your Simple Interest is Rs:"+SimpleInterest);

    }
}


// output:

// Welcome to Simple Interest Calculator

// Please enter your Principle amount Rs10000
// Now, please tell me for how many years  are you  borrowing this money : 3
// Now, enter Rate of your Simple Interest in Percentage % : 8.5

//  Your Simple Interest is Rs:2550.0   