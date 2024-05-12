

// 13.Create a program to calculate Compound interest. Compound Interest = P(1 + R/100)^t
// where P is the principal amount, t is time & R is the rate of interest 

import java.util.Scanner;

class  CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to Compound Interest Calculator \n");

        System.out.print("Please enter your Principle amount Rs");
        int Principle = input.nextInt();

        System.out.print("Now, please tell me for how many years  are you  borrowing this money : ");
        Float years = input.nextFloat();

        System.out.print("Now, enter Rate of your Simple Interest in Percentage % : ");
        Float rate = input.nextFloat();

        double compInt = Principle*(Math.pow((1 + rate /100),years));
        System.out.print("\n Your Compound Interest is Rs:"+compInt);
    }
    
}


//Output is :
// Welcome to Compound Interest Calculator

// Please enter your Principle amount Rs1200
// Now, please tell me for how many years  are you  borrowing this money : 2
// Now, enter Rate of your Simple Interest in Percentage % : 5.4

//  Your Compound Interest is Rs:1333.099250660706