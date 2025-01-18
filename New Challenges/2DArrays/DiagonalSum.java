public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 }, };
        // DiagonalSum(matrix);
        System.out.println(DiagonalSum(matrix));
    }

    public static int DiagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // for Primary diagonal sum
            sum += matrix[i][i];

            // for secondary diagonal sum
            if (i != matrix.length - i - 1) {
                // here j = matrix.length-i-1
                sum += matrix[i][matrix.length - i - 1];
            }

        }
        return sum;
    }
}
