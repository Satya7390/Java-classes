
// 16.Create a program that determines if a number is odd or even.public 

import java.util.Scanner;

class  OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Check your number is Even or Odd!!\n");

        System.out.print("Please Enter Your Number : ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Your Number is Even!!");
        }
        else{
            System.out.println("Your Number is Odd!!");

        }
    }
    
}
