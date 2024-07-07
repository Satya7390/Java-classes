
// 34. Create a program to check whether a given number is prime.

import java.util.Scanner;

class  PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wecome to Prime NUmber Checker!!");

        System.out.print("please enter your number : ");
        int num = input.nextInt();
        
        boolean isPrime = isPrime(num);
        if (isPrime){
            System.out.println("Your Number is Prime");
        }
        else{
            System.out.println("Your Number is Not Prime");
        }
    }

    public static boolean isPrime(int num){

        int i = 2;
        while (i < num) {
            if(num % i == 0){
                return false;
            }
            i++;
            
        }
        return true;
    }
    
}

// Output :
// Wecome to Prime NUmber Checker!!
// please enter your number : 67
// Your Number is Prime