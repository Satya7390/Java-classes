
//IMP**
// 27. Write a program to check if a given number is even or odd using bitwise operators.


import java.util.Scanner;

class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome To find Even and Odd Number Using Bitwise Operator!!");

        System.out.print("Please Enter Your Number : ");
        int num1 = input.nextInt();

       if((num1 & 1) == 0){
        System.out.println("Your Number is Even");
       }
       else {
        System.out.println("Your Number is Odd");
       }
    }

}
