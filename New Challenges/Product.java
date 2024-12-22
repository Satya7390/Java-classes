
import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        System.out.println("Welcome to the multiplication of two numbers");
       
        System.out.println("Your answer is : " + getInput());
        System.out.println("Your answer is : " + getInput());
    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        int result = a * b;
        return result;
    }
}
