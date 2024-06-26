// 33. Create a program to find the Greatest Common Divisor (GCD) of two integers.

import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wecome to Calculate Greatest Common Divisor of two Numbers!!");

        System.out.print("please enter first number : ");
        int first = input.nextInt();
        System.out.print("please enter second number : ");
        int second = input.nextInt();

        int gcd = gcd(first, second);
        System.out.println("Your GCD of Two Numbers is : " + gcd);

    }

    public static int gcd(int num1, int num2) {
        int leastNum = leastNum(num1, num2);
        int gcd = 1;
        int i = 2;
        while (i <= leastNum) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;

            }
            i++;

        }
        return gcd;
    }

    public static int leastNum(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

}


// Output :
// Wecome to Calculate Greatest Common Divisor of two Numbers!!
// please enter first number : 45
// please enter second number : 10
// Your GCD of Two Numbers is : 5
