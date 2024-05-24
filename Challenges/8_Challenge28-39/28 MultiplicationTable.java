
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

           
            System.out.println(num+"*"+i+ " = "+ cal);
            i++;
            
        }

    }

    public static void greetUser() {

        System.out.println("\nHey !! , Welcome to Multiplication Table\n");
    }

}


// output :

// Hey !! , Welcome to Multiplication Table

// Now , please tell me what number do you want to print table : 5

// Your Table of 5 is ready now !!
// 5*1 = 5
// 5*2 = 10
// 5*3 = 15
// 5*4 = 20
// 5*5 = 25
// 5*6 = 30
// 5*7 = 35
// 5*8 = 40
// 5*9 = 45
// 5*10 = 50