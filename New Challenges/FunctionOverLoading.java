public class FunctionOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(sum(2.3f, 7.7f));
        System.out.println(sum(3, 5, 2));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float   sum(float a, float b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
