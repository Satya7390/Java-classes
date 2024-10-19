import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}

// Outputs: 
// 1 3 5 7 9 11 13 15 17 19