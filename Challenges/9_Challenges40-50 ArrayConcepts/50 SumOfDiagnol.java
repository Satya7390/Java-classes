
// 50. Create a program to find the sum of two diagonal elements.

class SumOfDiagnol {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum Of Diagnol Elements !!");
        int[][] numArray = ArrayUtility.input2DArray();
        long sum = SumOfDiagnols(numArray);
        System.out.println("Sum Of Diagnols is : " + sum);

    }

    public static long SumOfDiagnols(int[][] numArray) {
        long sum1 = leftDiagnolSum(numArray);
        long sum2 = rightDiagnolSum(numArray);
        long sum = (sum1 + sum2);

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
            int col = numArray.length - 1 - i;
            sum += numArray[i][col];
            i++;
        }
        return sum;
    }
}

// Welcome to Sum Of Diagnol Elements !!
// Please enter the number of rows : 2
// Please enter the number of columns : 2
// Please enter the element of row : 1 , column 1 : 1
// Please enter the element of row : 1 , column 2 : 2
// Please enter the element of row : 2 , column 1 : 3
// Please enter the element of row : 2 , column 2 : 4
// Sum Of Diagnols is : 10