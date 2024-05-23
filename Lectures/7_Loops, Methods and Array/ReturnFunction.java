import java.util.Scanner;

public class ReturnFunction {
    public static void main(String[] args) {
       
        greet();
       
        int sum = readNumber1() + readNumber2();

        System.out.println("Your Sum of Two Number is : "+sum);

    }

    public static void greet(){
        
        System.out.println("\nWelocome to My addition of Two Numbers!!\n");
    }
    
    public static int readNumber1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number : ");

        // int num = input.nextInt();
        // return num;
        // OR
        return input.nextInt(); // This is better way to write this for minimum memory space
    }
    
    public static int readNumber2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Second Number : ");

         // int num = input.nextInt();
        // return num;
        // OR
        return input.nextInt(); // This is better way to write this for minimum memory space
    }

   
    
}
