
// 57. Create a program to print the month of the year based on a
// number (1-12) input by the user.

import java.util.Scanner;

class MonthOfYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Find month of the year !!");
        System.out.print("Please enter number to find month of the year : ");
        int month = input.nextInt();
        
        String monthName = monthOfYear(month);
        System.out.println("Your month name is : " + monthName);

    }

    public static String monthOfYear(int month) {
        String output = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid input!! , Please enter value between 1 to 12";
        };
        return output;
    }

}

// Outputs :

// Welcome to Find month of the year !!
// Please enter number to find month of the year : 1
// Your month name is : January

// Welcome to Find month of the year !!
// Please enter number to find month of the year : 13
// Invalid input!! , Please enter value between 1 to 12
