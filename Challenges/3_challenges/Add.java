import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        System.out.print("Are you excited for addition ? ");
        String ans = add.nextLine();
        System.out.print("please enter your first number: ");
        int num1 = add.nextInt();
        System.out.print("please enter your second number: ");
        int num2 = add.nextInt();
        int Fans=num1+num2;
        System.out.print("your answer is : "+Fans);
    }
}
