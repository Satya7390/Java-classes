
// 31. Create a program that computes the sum of the digits of an integer.

import java.util.Scanner;

class  SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculate Sum of Digits!!");

        System.out.print("Please Enter your Number : ");

        int num = input.nextInt();

        int sum = SumofDigits(num);
        System.out.println("Your Sum of Digits is : " + sum);
    }

    public static int SumofDigits(int num){

        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
            
        }

        return sum;

    }
}


// Output 

// Welcome to Calculate Sum of Digits!!
// Please Enter your Number : 6789
// Your Sum of Digits is : 30