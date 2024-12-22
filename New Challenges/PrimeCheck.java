public class PrimeCheck {
    public static void main(String[] args) {

        // System.out.println(checkPrime(10));
        // System.out.println(checkPrime(7));
        // primeRange(50);
        System.out.println(1001/10);
        System.out.println(1001%10);

    }

    public static boolean checkPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n) {

        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
