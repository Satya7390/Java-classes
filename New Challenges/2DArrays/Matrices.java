// package 2DArrays;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Matrix_print(arr);
        printArr(arr);
        pos(arr, 5);

    }

    public static void Matrix_print(int arr[][]) {
        Scanner sc = new Scanner(System.in);
        int m = arr.length; // for row length
        int n = arr[0].length; // for colomn length

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // output

    public static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Boolean pos(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Found at index : " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }
}
