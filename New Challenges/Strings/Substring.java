public class Substring {
    public static void main(String[] args) {
        String s1 = "Hello Satya!";
        System.out.println(s1.substring(0, 5));
        String fruits[] = { "appale", "mango", "banana","Mmango" };

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {

            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
