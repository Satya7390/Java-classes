public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printSpiral(matrix);
    }

    public static void printSpiral(int matrix[][]) {

        int startRow = 0, endRow = matrix[0].length - 1, startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // here j for cols and i for rows
            // for top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // for right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // for bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                // for special cases when matrix in odd formates
                if (startRow == endRow)
                    break;
                System.out.print(matrix[endRow][j] + " ");
            }
            // for left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                // for special cases when matrix in odd formates
                if (startCol == endCol)
                    break;
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}


// output : 

// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10