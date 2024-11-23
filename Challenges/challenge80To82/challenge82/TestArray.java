package challenge80To82.challenge82;

public class TestArray {

    public static void main(String[] args) {

        ArrayOperations opr = new ArrayOperations(new int[]{1, 3, 5, 9});

        // Create an instance of Statistics within ArrayOperations
        ArrayOperations.Statistics statistics = opr.new Statistics();

        System.out.println("Mean: " + statistics.mean());

    }
}
