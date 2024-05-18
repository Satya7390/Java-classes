
// 20.Create a program that categorize a person into different age groups

// Child -> below 13

// Teen -> below 20

// Adult -> below 60

// Senior-> above 60

import java.util.Scanner;

class  AgeGroup {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("\nWelcome to Age Group Calculator!!\n");

        System.out.print("Please Enter your AGE : ");
        int age = input.nextInt();

        if (age >= 60 ){
            System.out.println("Your are a Senior Person!!");
        }
        
        else if ( age >= 20) {
            System.out.println("You are a Adult Person");
        }

        else if (age >= 13) {
            System.out.println("You are a Teen Person");
        }
        else {
            System.out.println("You are a Child!! ");
        }

        
    }
}