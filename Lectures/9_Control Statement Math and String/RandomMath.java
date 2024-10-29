public class RandomMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-56));
        System.out.println(Math.abs(46));
        System.out.println(Math.ceil(77.08));
        System.out.println(Math.floor(77.08));
        System.out.println(Math.round(55.06));
        System.out.println(Math.round(55.7));
        System.out.println(Math.pow(14,2));
        System.out.println(Math.PI);
        System.out.println("------------------------------");

        for (int i = 0; i < 10; i++) {
            int random = (int) Math.round(Math.random() * 100);
            System.out.println(random);
        }

    }
}


// Outputs : 

// 56
// 46
// 78.0
// 77.0
// 55
// 56
// ------------------------------
// 6
// 99
// 93
// 62
// 42
// 26
// 85
// 84
// 91
// 7