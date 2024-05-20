// package Lectures.7_Loops, Methods and Array;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        // int a=1;
        // while (a <= 102) {
        // System.out.println(a);
        // a++;
        // }

        // int rev = 500;
        // while (rev >= 200) {
        // System.out.println(rev);
        // rev--;
        // }

        Scanner input = new Scanner(System.in);

        int i = 0;
        while (i <= 3) {
            int num = input.nextInt();
            System.out.println("Your Number is : " + num);
            i++;
        }

    }
}
