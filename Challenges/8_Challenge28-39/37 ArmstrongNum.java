
// 37. Create a program to check if a number is an Armstrong number.

import java.util.Scanner;

class  ArmstrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Check Armstrong Number!!");

        System.out.print("Please Enter Your Number : ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);

        if (isArmstrong) {
            System.out.println("Your number is Armstrong");
        }
        else{
            System.out.println("Your number is not Armstrong");
        }
        
    }

    public static boolean isArmstrong(int num){
        int Digits = noOfDigits(num) ;
        int copyNumber = num;
        int finalNumber = 0 ;
        while (num > 0) {
            int lastDigit = num % 10;
            finalNumber += pow(lastDigit, Digits);
            num /= 10 ;
        }
        // System.out.println(num); // for debugging purpose
        return finalNumber == copyNumber;
    }

    // for calculating power

    public static int pow(int num1 , int num2){
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    // for number of digit count
    
    public static int noOfDigits(int num){
        int Digits = 0;
        while (num > 0) {
            num /= 10;
            Digits++;
        }
        return Digits;
    }
    
}

// Outputs :
// Welcome to Check Armstrong Number!!
// Please Enter Your Number : 153
// Your number is Armstrong

// Welcome to Check Armstrong Number!!
// Please Enter Your Number : 15
// Your number is not Armstrong