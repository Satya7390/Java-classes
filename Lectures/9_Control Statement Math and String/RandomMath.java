public class RandomMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-56));
        System.out.println(Math.abs(46));
        System.out.println(Math.ceil(77.08));
        System.out.println(Math.floor(77.08));
        System.out.println(Math.round(55.06));
        System.out.println(Math.round(55.7));
        System.out.println("------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.round(Math.random()*100));
        }
        
    }
}
