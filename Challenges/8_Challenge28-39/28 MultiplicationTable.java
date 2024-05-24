
// 28. Develop a program that prints the multiplication table for a given number.

import java.util.Scanner;

 class MultiplicationTable {
    public static void main(String[] args) {

        greetUser();

        printResult();
    }

    public static int readNumber() {

        Scanner input = new Scanner(System.in);

        System.out.print("Now , please tell me what number do you want to print table : ");
        return input.nextInt();

    }
    public static void printResult(){

        int num = readNumber();
        System.out.println("\nYour Table of "+num+" is ready now !! ");

        int i = 1;

        while (i < 11) {

            int cal = num*i;

           
            System.out.println(num+"*"+i+ "="+ cal);
            i++;
            
        }

    }

    public static void greetUser() {

        System.out.println("\nHey !! , Welcome to Multiplication Table\n");
    }

}
