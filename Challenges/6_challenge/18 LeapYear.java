
// 18. Create a program that determines if a given year is a leap year (considering conditions like divisible by 4 but not 100, unless also divisible by 400).

// if year leap then feb month is 29 days

import java.util.Scanner;

 class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New Year Calculator ");

        System.out.print("Enter Year to Calculate Given year is Leap or Not : ");

        int yr = input.nextInt();

        if ((yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0) {
            System.out.println("Your Enter year is a Leap Year !!");
        }  else {
            System.out.println("Your Enter year is not a Leap Year !!");

        }
    }

}
