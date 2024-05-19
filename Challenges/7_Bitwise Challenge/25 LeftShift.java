
// 25. Create a program that shows use of left shift operator.


import java.util.Scanner;

class  LeftShift {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to perform LeftShift Operator!!");
        System.out.print("Enter your Number : ");

        int num = input.nextInt();

        int result = num << 2;
        System.out.println("YOur Result is : "+result);

    }
    
}
