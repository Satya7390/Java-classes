 
//  19.Create a program that calculates grades based on marks

//  A -> above 90%
 
//  B -> above 75%
 
//  C -> above 60%
 
//  D -> above 30%
 
//  F -> below 30%

import java.util.Scanner;

class  CalGrade {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Grade Calculator!!\n");
        System.out.print("Please Enter your Percentage : ");

        Float per = input.nextFloat();

        if (per > 100){
            System.out.println("Warning!! , Your Enter Percentage must be 100 or Less than 100 .");
        }
        else if ( per >= 90){
            System.out.println("Congratulations , Your Grade is A");
        }
        else if(  per >= 75){
            System.out.println("Well done , Your Grade is B");
        }
        else if( per >= 60){
            System.out.println("Good Job!! Your Grade is C");
        }
        else if( per >= 30){
            System.out.println("Need to Improve!, Your Grade is D");
        }
        else {
            System.out.println("Sorry!! , You have not Clear your Examination This Time Try Again");
        }
    }
    
}
