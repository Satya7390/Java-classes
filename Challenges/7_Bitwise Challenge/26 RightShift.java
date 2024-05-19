
// 26. Create a program that shows use of right shift operator.


import java.util.Scanner;

class  RightShift {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to perform RightShift Operator!!");
        System.out.print("Enter your Number : ");

        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("YOur Result is : "+result);

    }
    
}
