// package New Challenges.Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linear search!!");
        Scanner sc = new Scanner(System.in);
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.print("Now enter your values between 1 to 10 which you want to find : ");
        int key = sc.nextInt();
        int index = find_key(nums, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index : " + index);
        }
    }

    public static int find_key(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
