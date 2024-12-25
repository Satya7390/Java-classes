import java.util.Scanner;

public class DecToBin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decNum = sc.nextInt();

        System.out.print("Binary of " + decNum + " is: " + decToBin(decNum));
    }

    public static int decToBin(int decNum) {
        int pow = 0;
        int bin = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            bin = bin + rem * (int) Math.pow(10, pow);
            pow++;
            decNum = decNum / 2;
        }
        return bin;
    }

}
