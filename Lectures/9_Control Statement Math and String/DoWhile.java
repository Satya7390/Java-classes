import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        do {
            System.out.print("Enter your age : ");
            age = input.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("Your age is : " + age);
    }
}

// Outputs : 

// Enter your age : 102
// Enter your age : -51
// Enter your age : 22
// Your age is : 22