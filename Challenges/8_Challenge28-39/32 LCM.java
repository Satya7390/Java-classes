
// 32. Create a program to find the Least Common Multiple (LCM) of two numbers.

import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculate LCM of Two Numbers!!");

        System.out.print("Please Enter your first Number : ");
        int first = input.nextInt();
        System.out.print("Now,Please enter your second number : ");
        int second = input.nextInt();

        int lcm = lcm(first, second);
        System.out.println("Your LCM of Two Number is : " + lcm);
    }

    public static int lcm(int first, int second) {

        int i = 1;
        while (true) {
            int fact = first * i;
            if (fact % second == 0) {
                return fact;

            }
            i++;
        } // return 0; not reachable that,s whay I,m not using return here

    }

}
