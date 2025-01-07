public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int rev = 0, mod;
        int num = x;
        while (x > 0) {
            mod = x % 10;
            rev = rev * 10 + mod;
            x /= 10;
        }
        if (rev == num) {
            return true;
        } else {
            return false;
        }
    }
}
