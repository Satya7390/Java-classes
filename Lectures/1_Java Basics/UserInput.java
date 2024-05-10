import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        String name = input.next();
        System.out.println("Good Morning " + name);
        System.out.println(name + " Also tell me your age : ");
        int age = input.nextInt();
        System.out.println("Your age is : "+age);

        
    }
}


// Output:
// Please Enter Your Name: Satya
// Good Morning Satya
// Satya Also tell me your age :
// 20
// Your age is : 20

