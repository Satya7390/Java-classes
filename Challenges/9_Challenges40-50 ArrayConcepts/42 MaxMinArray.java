
// 42. Create a program to find the maximum and minimum element in an array.

class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Max and Min!!");

        int[] numArray = ArrayUtility.inputArray();

        // if (numArray.length == 0 ) {
        // System.out.println("Please enter Valid Array Input, This is empty array size
        // you have entered!!");
        // }

        int max = Max(numArray);
        int min = Min(numArray);

        System.out.println("Max of Array is : " + max);
        System.out.println("Min of Array is : " + min);
    }

    public static int Max(int[] numArray) {

        int max = numArray[0];
        int i = 1;
        while (i < numArray.length) {
            if (max < numArray[i]) {
                max = numArray[i];
            }
            i++;

        }
        return max;
    }

    public static int Min(int[] numArray) {
        int min = numArray[0];
        int i = 1;
        while (i < numArray.length) {
            if (min > numArray[i]) {
                min = numArray[i];
            }
            i++;

        }
        return min;
    }

}

// Outputs :

// Welcome to Max and Min!!
// Please enter the number of elements : 5
// Please enter element number 1: 1
// Please enter element number 2: 0
// Please enter element number 3: 9
// Please enter element number 4: 88
// Please enter element number 5: 98
// Max of Array is : 98
// Min of Array is : 0