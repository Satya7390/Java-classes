// 10.Create a program to calculate Perimeter of a rectangle. Perimeter of rectangle ABCD = A+B+C+D

import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to solve Perimter!!");

        System.out.print("Please enter your all four sides in cm : "); 
        Double A = input.nextDouble();
        Double B = input.nextDouble();
        Double C = input.nextDouble();
        Double D = input.nextDouble();

        Double ans = A+B+C+D;
        System.out.println("\nPerimeter of Your Rectangle is : "+ans+"cm");
    }
}
