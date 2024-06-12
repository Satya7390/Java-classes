package Array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Traversal
        int i = 0;
        while (i < arr.length) {

            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;

            }
            System.out.println();
            i++;

        }
    }

}

// Output :
// 1 2 3
// 4 5 6
// 7 8 9
