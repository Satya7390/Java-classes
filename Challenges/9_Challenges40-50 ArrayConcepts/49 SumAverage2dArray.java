
// 49. Create a program to do sum and average of all elements in a 2-D array.

class SumAverage2dArray {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D array Sum and Average !!");
        int[][] numArray = ArrayUtility.input2DArray();

        long sum = Sum(numArray);
        double avg = avg(numArray);
        System.out.println("sum is : " + sum);
        System.out.println("avg is : " + avg);
    }

    public static long Sum(int[][] numArray) {

        long sum = 0;
        int i = 0;

        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                sum += numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double avg(int[][] numArray) {
        if (numArray.length == 0) {
            return 0;
        }
        int rows = numArray.length;
        int cols = numArray[0].length;
        double size = rows * cols;
        return Sum(numArray) / size;
    }
}


// Welcome to 2D array Sum and Average !!
// Please enter the number of rows : 2
// Please enter the number of columns : 2
// Please enter the element of row : 1 , column 1 : 1
// Please enter the element of row : 1 , column 2 : 2
// Please enter the element of row : 2 , column 1 : 3
// Please enter the element of row : 2 , column 2 : 4
// sum is : 10
// avg is : 2.5

// Welcome to 2D array Sum and Average !!
// Please enter the number of rows : 1
// Please enter the number of columns : 4
// Please enter the element of row : 1 , column 1 : -50
// Please enter the element of row : 1 , column 2 : 25
// Please enter the element of row : 1 , column 3 : -25
// Please enter the element of row : 1 , column 4 : 50
// sum is : 0
// avg is : 0.0
