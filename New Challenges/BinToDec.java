
import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binNum = sc.nextInt();

        System.out.print("Decimal of " + binNum + " is: " + binToDec(binNum));
    }

    public static int binToDec(int binNum) {
        int pow = 0;
        int dec = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec = dec + lastDigit * (int) Math.pow(2, pow);
            pow++;
            binNum = binNum / 10;
        }
        return dec;
    }
}
