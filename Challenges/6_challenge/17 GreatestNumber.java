
// 17. Create a program that determines the greatest of the three numbers.

import java.util.Scanner;

class  GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to find Greatest Number!!\n");

        System.out.print("Please Enter Your Three Number : ");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        if(num1>num2 && num1>num3){
            System.out.println("Your Greatest Number is : "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Your Greatest Number is : "+num2);
        }
        else{
            System.out.println("Your Greatest Number is : "+num3);
        }
    }
    
}
