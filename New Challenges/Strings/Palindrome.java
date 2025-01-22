public class Palindrome {
    public static void main(String[] args) {
        String str = "amanaplanacanalpanama";
        // String(str);
        System.out.println(String(str));
    }

    public static boolean String(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
