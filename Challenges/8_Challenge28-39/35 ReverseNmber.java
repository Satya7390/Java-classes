
// 35. Create a program to reverse the digits of a number.

import java.util.Scanner;

class ReverseNmber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse Number !!");

        System.out.print("Please Enter Your Number : ");
        int num = input.nextInt();
        int rev = ReverseNmber(num);
        System.out.println("Reverse of this " + num + " is : " + rev);
    }

    public static int ReverseNmber(int num) {

        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;

        }
        return rev;
    }

}

// Output :
// Welcome to Reverse Number !!
// Please Enter Your Number : 567
// Reverse of this 567 is : 765