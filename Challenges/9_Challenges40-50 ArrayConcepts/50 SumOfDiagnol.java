
// 50. Create a program to find the sum of two diagonal elements.

class SumOfDiagnol {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum Of Diagnol Elements !!");
        int[][] numArray = ArrayUtility.input2DArray();
        long sum = SumOfDiagnols(numArray);
        System.out.println("Some Diagnols is : " + sum);

    }

    public static long SumOfDiagnols(int[][] numArray) {
        long sum1 = leftDiagnolSum(numArray);
        long sum2 = rightDiagnolSum(numArray);
        long sum = sum1 + sum2;

        if (numArray.length % 2 != 0) {

            // for find center element
            int ind = numArray.length / 2;
            sum -= numArray[ind][ind];
        }
        return sum;
    }

    public static long leftDiagnolSum(int[][] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i][i];
            i++;

        }
        return sum;
    }

    public static long rightDiagnolSum(int[][] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            int cols = numArray.length - 1 - i;
            sum += numArray[i][cols];
        }
        return sum;
    }
}
