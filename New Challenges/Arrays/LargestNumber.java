
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the largest  find number!!");
        int num[] = { 2, 3, 1, 6, 7, 10, 9 };
        System.out.println("Largest number in an array is : " + find_large(num));
    }

    public static int find_large(int num[]) {
        int lrg = Integer.MIN_VALUE; // the value of this is -infinite
        int sml = Integer.MAX_VALUE; // the value of this is +infinite
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= lrg) {
                lrg = num[i];
            }
            if (num[i] <= sml) {
                sml = num[i];
            }
        }
        System.out.println("Smallest number is : " + sml);
        return lrg;
    }
}
