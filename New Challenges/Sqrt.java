public class Sqrt {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x){
        int res = (int)Math.sqrt(x);
        return res;
    }
}
