import java.util.Scanner;

// This class is created for use again and agian for multiple Programming

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements : ");
        int size = input.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Please enter element number " + (i + 1) + ": ");
            nums[i] = input.nextInt();
            i++;

        }
        return nums;
    }

    public static void displayArray(int [] numArray){
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }

}
