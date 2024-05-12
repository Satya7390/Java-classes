// package 5_Operators;

import java.util.Scanner;

public class OperatorUse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Discount sell!!");

        System.out.print("Please, Tell me you age : ");
        int age = input.nextInt();

        System.out.println("Are you Female ? (true/false) ");
        boolean isFemale = input.nextBoolean();
       

        if(age<5){
            System.out.println("You got 75% discount");
        }
        else if(isFemale){
            System.out.println("You got 50% discount");
        }
        else if (age>60 && !isFemale) {
            System.out.println("You got 25% discount");
        }
        else{
            System.out.println("you are not eligible for any discount");
        }
    }

}
