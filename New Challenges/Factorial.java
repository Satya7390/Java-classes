
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Welcome to the factorial of  numbers");
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter number : ");
        // int n = input.nextInt();
        // System.out.println("Factorial of "+n+" is : "+getFact(n));

        System.out.print("Enter first number : ");
        int n = input.nextInt();
        System.out.print("Enter second number : ");
        int r = input.nextInt();
        System.out.println("Binomial Coefficent is : " + binCoeff(n, r));

    }

    public static int getFact(long n) {

        int fac = 1;

        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = getFact(n);
        int fact_r = getFact(r);
        int fact_nmr = getFact(n - r);

        return (fact_n / (fact_r * fact_nmr));
    }
}
