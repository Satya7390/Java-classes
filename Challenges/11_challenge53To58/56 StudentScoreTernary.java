
// 56. Create a program to Based on a student's score, categorize as
// "High", "Moderate", or "Low" using the ternary operator (e.g.,
// High for scores > 80, Moderate for 50-80, Low for < 50).

import java.util.Scanner;

class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Student Score !!");
        System.out.print("Please enter your marks : ");

        int marks = input.nextInt();
        String category = marks > 80 ? "High" : (marks >= 50 ? "Moderate" : "Low");
        System.out.println("Your category is : " + category);
    }
}


// Outputs : 

// Welcome to Student Score !!
// Please enter your marks : 81
// Your category is : High

// Welcome to Student Score !!
// Please enter your marks : 80
// Your category is : Moderate

// Welcome to Student Score !!
// Please enter your marks : 49
// Your category is : Low